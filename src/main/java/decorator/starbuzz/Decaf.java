/**
 * @file Decaf.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Sat Apr 14 22:46:57 2012
 */

package decorator.starbuzz;

public class Decaf extends Beverage {

  public Decaf() {
    description = "decaf";
  }

  public double cost() {
    return 1.05;
  }
}
