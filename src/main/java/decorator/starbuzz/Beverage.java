/**
 * @file Beverage.java
 * @brief 类型基类，装饰者抽象类将继承该类
 * @author dingje <dingje.gm@gmail.com>
 * @date Sat Apr 14 22:14:58 2012
 */

package decorator.starbuzz;

public abstract  class Beverage {
  protected String description = "Unknow Beverage";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
