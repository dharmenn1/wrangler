package io.cdap.wrangler.api.parser;

import org.junit.Assert;
import org.junit.Test;

public class ByteSizeTest {

  @Test
  public void testByteParsing() {
    Assert.assertEquals(1024L, new ByteSize("1KB").getBytes());
    Assert.assertEquals(1572864L, new ByteSize("1.5MB").getBytes()); // 1.5 * 1024 * 1024
    Assert.assertEquals(1073741824L, new ByteSize("1GB").getBytes());
    Assert.assertEquals(0L, new ByteSize("0KB").getBytes());
  }
}
