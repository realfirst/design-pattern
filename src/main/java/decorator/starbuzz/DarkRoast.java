/**
 * @file DarkRoast.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Sat Apr 14 22:43:17 2012
 */

package decorator.starbuzz;

public class DarkRoast extends Beverage {

  public DarkRoast() {
    description = "DarkRoast";
  }

  @Override
  public double cost() {
    return .99;
  }
  
}
