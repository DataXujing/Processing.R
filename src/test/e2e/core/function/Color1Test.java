
// Generated by hack/generate-e2e-test.py
package test.e2e.core.function;

import static org.junit.Assert.fail;
import org.junit.Test;
import test.e2e.core.E2eTestBase;

public class Color1Test extends E2eTestBase {

  public Color1Test() {
    coreCodeTemplate = "c = color(255, 204, 0)  # Define color 'c'\nfill(c)  # Use color variable 'c' as fill color\nnoStroke()  # Don't draw a stroke around shapes\nrect(30, 20, 55, 55)  # Draw rectangle\n\nsaveFrame(\"%s\")\nexit()\n";
    referenceURI = "https://processing.org/reference/images/color_0.png";
  }

  @Test
  public void test() {
    try {
      defaultOperation();
    } catch (Exception exception) {
      System.err.println(exception);
      fail("Should not have thrown any exception");
    }
  }
}