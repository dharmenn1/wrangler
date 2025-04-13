package io.cdap.wrangler.api.parser;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class TimeDuration implements Token {
  private final long milliseconds;
  private final String value;

  public TimeDuration(String value) {
    this.value = value;
    this.milliseconds = parseTime(value);
  }

  private long parseTime(String input) {
    input = input.trim().toLowerCase();
    long multiplier;

    if (input.endsWith("ms")) {
      multiplier = 1L;
      input = input.substring(0, input.length() - 2);
    } else if (input.endsWith("s")) {
      multiplier = 1000L;
      input = input.substring(0, input.length() - 1);
    } else if (input.endsWith("min")) {
      multiplier = 60L * 1000L;
      input = input.substring(0, input.length() - 3);
    } else if (input.endsWith("h")) {
      multiplier = 60L * 60L * 1000L;
      input = input.substring(0, input.length() - 1);
    } else if (input.endsWith("d")) {
      multiplier = 24L * 60L * 60L * 1000L;
      input = input.substring(0, input.length() - 1);
    } else {
      throw new IllegalArgumentException("Invalid time duration format: " + input);
    }

    return Long.parseLong(input.trim()) * multiplier;
  }

  @Override
  public Object value() {
    return milliseconds;
  }

  @Override
  public TokenType type() {
    return TokenType.TIME_DURATION;
  }

  @Override
  public JsonElement toJson() {
    return new JsonPrimitive(value);
  }

  public long getMilliseconds() {
    return milliseconds;
  }
}
