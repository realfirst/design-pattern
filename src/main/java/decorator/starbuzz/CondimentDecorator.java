/**
 * @file CondimentDecorator.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Sat Apr 14 22:19:39 2012
 */

package decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
  Beverage beverage;
  
  // 所有的调料装饰者都必须重新实现该方法
  public abstract String getDescription();
}
