package io.cdap.wrangler.api.parser;

import org.junit.Assert;
import org.junit.Test;

public class TimeDurationTest {

  @Test
  public void testTimeParsing() {
    Assert.assertEquals(5L, new TimeDuration("5ms").getMilliseconds());
    Assert.assertEquals(2100L, new TimeDuration("2.1s").getMilliseconds()); // 2.1 * 1000
    Assert.assertEquals(3600000L, new TimeDuration("1h").getMilliseconds()); // 60 * 60 * 1000
    Assert.assertEquals(0L, new TimeDuration("0ms").getMilliseconds());
  }
}
