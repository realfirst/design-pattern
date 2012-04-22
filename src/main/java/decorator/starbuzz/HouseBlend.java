/**
 * @file HouseBlend.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Sat Apr 14 22:22:35 2012
 */

package decorator.starbuzz;

public class HouseBlend extends Beverage {

  public HouseBlend() {
    description = "Espresso";
  }
  
  public double cost() {
    return .89;
  }
}
