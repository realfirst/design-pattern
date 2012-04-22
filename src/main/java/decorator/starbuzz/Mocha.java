/**
 * @file Mocha.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Sat Apr 14 22:48:42 2012
 */

package decorator.starbuzz;

public class Mocha extends CondimentDecorator {

  // Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }

  public double cost() {
    return .20 + beverage.cost();
  }
}
