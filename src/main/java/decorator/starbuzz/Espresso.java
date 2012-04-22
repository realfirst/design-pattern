/**
 * @file Espresso.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Sat Apr 14 22:45:24 2012
 */

package decorator.starbuzz;

public class Espresso extends Beverage {

  public Espresso() {
    description = "espresso";
  }

  public double cost() {
    return 1.99;
  }
}
