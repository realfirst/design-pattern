/**
 * @file PizzaTestDrive.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Mon Apr 16 00:23:43 2012
 */

package factory.pizzas;

public class PizzaTestDrive {
  public static void main(String[] args) {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);

    Pizza pizza = store.orderPizza("cheese");
    System.out.println("We ordered a " + pizza.getName() + "\n");

    pizza = store.orderPizza("veggie");
    System.out.println("We ordered a " + pizza.getName() + "\n");
  }
}
