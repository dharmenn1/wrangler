import org.junit.Assert;
import org.junit.Test;
import io.cdap.wrangler.api.parser.RecipeSymbol;

public class RecipeCompilerTest {

  @Test
  public void testByteAndTimeParsing() throws Exception {
    String[] recipe = new String[] {
      "aggregate-stats :size :duration total_bytes total_time"
    };

    RecipeCompiler compiler = new RecipeCompiler();
    RecipeSymbol symbol = compiler.compile(recipe);
    Assert.assertNotNull(symbol);
    Assert.assertEquals(1, symbol.getTokenGroups().size());
  }

  @Test(expected = Exception.class)
  public void testInvalidByteSyntax() throws Exception {
    String[] recipe = new String[] {
      "aggregate-stats :sizeG :duration total total"
    };

    RecipeCompiler compiler = new RecipeCompiler();
    compiler.compile(recipe); // Should throw error due to malformed token
  }
}
