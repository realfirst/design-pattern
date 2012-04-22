/**
 * @file Soy.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Sat Apr 14 22:53:11 2012
 */

package decorator.starbuzz;

public class Soy extends CondimentDecorator {

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }

  public double cost() {
    return .15 + beverage.cost();
  }
}
