/**
 * @file PizzaStore.java<pizzas>
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Sun Apr 15 23:32:29 2012
 */

package factory.pizzas;

public class PizzaStore {

  SimplePizzaFactory factory;

  public PizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  public Pizza orderPizza(String type) {
    Pizza pizza;

    pizza = factory.createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
