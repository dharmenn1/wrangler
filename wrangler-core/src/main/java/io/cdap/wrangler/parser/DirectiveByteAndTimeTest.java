package io.cdap.wrangler.plugin;

import io.cdap.wrangler.api.Row;
import io.cdap.wrangler.api.parser.ColumnName;
import io.cdap.wrangler.api.parser.Text;
import io.cdap.wrangler.api.parser.Token;
import io.cdap.wrangler.api.ExecutorContext;
import io.cdap.wrangler.test.TestingRig;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DirectiveByteAndTimeTest {

  @Test
  public void testAggregateBytesAndTime() throws Exception {
    List<Row> rows = new ArrayList<>();
    rows.add(new Row("data_transfer_size", "1024KB").add("response_time", "2s"));
    rows.add(new Row("data_transfer_size", "1MB").add("response_time", "1s"));

    String[] recipe = new String[] {
      "aggregate-byte-time :data_transfer_size :response_time total_size_mb total_time_sec MB s total"
    };

    List<Row> result = TestingRig.execute(recipe, rows);
    Assert.assertEquals(1, result.size());

    Row output = result.get(0);
    double expectedMB = (1024 * 1024 + 1 * 1024 * 1024) / (1024.0 * 1024.0); // 2MB
    double expectedSeconds = (2000 + 1000) / 1000.0;

    Assert.assertEquals(expectedMB, ((Number) output.getValue("total_size_mb")).doubleValue(), 0.001);
    Assert.assertEquals(expectedSeconds, ((Number) output.getValue("total_time_sec")).doubleValue(), 0.001);
  }
}
