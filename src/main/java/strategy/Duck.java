/**
 * @file Duck.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Tue Apr 10 20:58:35 2012
 */

package strategy;

public abstract class Duck {
  FlyBehavoir flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {}

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
  
}
