package io.github.aevalo.Test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by avalo on 5/28/15.
 */
public class CalculatorTest {
  @Test
  public void evaluatesExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }
}