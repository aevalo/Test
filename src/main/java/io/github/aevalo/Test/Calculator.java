package io.github.aevalo.Test;

/**
 * Created by avalo on 5/28/15.
 */
public class Calculator {
  public int evaluate(String expression) {
    int sum = 0;
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }
}
