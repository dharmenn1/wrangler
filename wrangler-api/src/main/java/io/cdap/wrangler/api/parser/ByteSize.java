package io.cdap.wrangler.api.parser;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class ByteSize implements Token {
  private final long bytes;
  private final String value;

  public ByteSize(String value) {
    this.value = value;
    this.bytes = parseBytes(value);
  }

  private long parseBytes(String input) {
    input = input.trim().toUpperCase();
    long multiplier;

    if (input.endsWith("KB")) {
      multiplier = 1024L;
      input = input.substring(0, input.length() - 2);
    } else if (input.endsWith("MB")) {
      multiplier = 1024L * 1024L;
      input = input.substring(0, input.length() - 2);
    } else if (input.endsWith("GB")) {
      multiplier = 1024L * 1024L * 1024L;
      input = input.substring(0, input.length() - 2);
    } else if (input.endsWith("TB")) {
      multiplier = 1024L * 1024L * 1024L * 1024L;
      input = input.substring(0, input.length() - 2);
    } else {
      throw new IllegalArgumentException("Invalid byte size format: " + input);
    }

    return Long.parseLong(input.trim()) * multiplier;
  }

  @Override
  public Object value() {
    return bytes;
  }

  @Override
  public TokenType type() {
    return TokenType.BYTE_SIZE;
  }

  @Override
  public JsonElement toJson() {
    return new JsonPrimitive(value);
  }

  public long getBytes() {
    return bytes;
  }
}
