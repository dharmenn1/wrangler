package io.cdap.wrangler.parser;



import io.cdap.wrangler.api.AggregateDirective;
import io.cdap.wrangler.api.ExecutorContext;
import io.cdap.wrangler.api.Row;
import io.cdap.wrangler.api.parser.ColumnName;
import io.cdap.wrangler.api.parser.Text;
import io.cdap.wrangler.api.parser.Token;
import io.cdap.wrangler.api.parser.TokenType;

import java.util.ArrayList;
import java.util.List;

/**
 * Directive to aggregate byte size and time duration from input columns.
 */
public class DirectiveByteAndTime implements AggregateDirective {
  private String inputByteCol;
  private String inputTimeCol;
  private String outputByteCol;
  private String outputTimeCol;

  private String outputByteUnit = "B";
  private String outputTimeUnit = "ms";

  private String aggregationType = "total";

  private long totalBytes = 0;
  private long totalTimeMs = 0;
  private int rowCount = 0;

  @Override
  public void initialize(ExecutorContext ctx, List<Token> args) {
    inputByteCol = ((ColumnName) args.get(0)).value();
    inputTimeCol = ((ColumnName) args.get(1)).value();
    outputByteCol = ((ColumnName) args.get(2)).value();
    outputTimeCol = ((ColumnName) args.get(3)).value();

    if (args.size() > 4 && args.get(4).type() == TokenType.STRING) {
      outputByteUnit = ((Text) args.get(4)).value();
    }
    if (args.size() > 5 && args.get(5).type() == TokenType.STRING) {
      outputTimeUnit = ((Text) args.get(5)).value();
    }
    if (args.size() > 6 && args.get(6).type() == TokenType.STRING) {
      aggregationType = ((Text) args.get(6)).value().toLowerCase();
    }
  }

  @Override
  public List<Row> execute(List<Row> rows, ExecutorContext ctx) {
    for (Row row : rows) {
      Object byteVal = row.getValue(inputByteCol);
      Object timeVal = row.getValue(inputTimeCol);

      if (byteVal != null) {
        totalBytes += parseByteSize(byteVal.toString());
      }
      if (timeVal != null) {
        totalTimeMs += parseTimeDuration(timeVal.toString());
      }

      rowCount++;
    }

    // Convert and prepare output
    long finalBytes = convertBytes(totalBytes, outputByteUnit);
    long finalTime = convertTime(totalTimeMs, outputTimeUnit);

    if (aggregationType.equals("average") && rowCount > 0) {
      finalBytes /= rowCount;
      finalTime /= rowCount;
    }

    List<Row> result = new ArrayList<>();
    Row row = new Row();
    row.add(outputByteCol, finalBytes);
    row.add(outputTimeCol, finalTime);
    result.add(row);
    return result;
  }

  private long parseByteSize(String value) {
    value = value.trim().toUpperCase();
    long multiplier = 1;

    if (value.endsWith("KB")) {
      multiplier = 1024L;
      value = value.replace("KB", "");
    } else if (value.endsWith("MB")) {
      multiplier = 1024L * 1024L;
      value = value.replace("MB", "");
    } else if (value.endsWith("GB")) {
      multiplier = 1024L * 1024L * 1024L;
      value = value.replace("GB", "");
    } else if (value.endsWith("TB")) {
      multiplier = 1024L * 1024L * 1024L * 1024L;
      value = value.replace("TB", "");
    }

    return Long.parseLong(value.trim()) * multiplier;
  }

  private long convertBytes(long value, String unit) {
    switch (unit.toUpperCase()) {
      case "KB": return value / 1024L;
      case "MB": return value / (1024L * 1024L);
      case "GB": return value / (1024L * 1024L * 1024L);
      case "TB": return value / (1024L * 1024L * 1024L * 1024L);
      default: return value; // Bytes
    }
  }

  private long parseTimeDuration(String value) {
    value = value.trim().toLowerCase();
    long multiplier = 1;

    if (value.endsWith("ms")) {
      multiplier = 1;
      value = value.replace("ms", "");
    } else if (value.endsWith("s")) {
      multiplier = 1000;
      value = value.replace("s", "");
    } else if (value.endsWith("min")) {
      multiplier = 60 * 1000;
      value = value.replace("min", "");
    } else if (value.endsWith("h")) {
      multiplier = 60 * 60 * 1000;
      value = value.replace("h", "");
    } else if (value.endsWith("d")) {
      multiplier = 24 * 60 * 60 * 1000;
      value = value.replace("d", "");
    }

    return Long.parseLong(value.trim()) * multiplier;
  }

  private long convertTime(long value, String unit) {
    switch (unit.toLowerCase()) {
      case "s": return value / 1000;
      case "min": return value / (60 * 1000);
      case "h": return value / (60 * 60 * 1000);
      case "d": return value / (24 * 60 * 60 * 1000);
      default: return value; // ms
    }
  }
}

