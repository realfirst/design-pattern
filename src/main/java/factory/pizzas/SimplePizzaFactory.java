/**
 * @file SimplePizzaFactory.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Sun Apr 15 23:22:28 2012
 */

package factory.pizzas;

public class SimplePizzaFactory {
  public Pizza createPizza(String type) {
    Pizza pizza = null;

    if (type.equals("cheese")) {
      pizza = new CheesePizza();
    } else if (type.equals("pepperoni")) {
      pizza = new PepperoniPizza();
    } else if (type.equals("clam")) {
      pizza = new ClamPizza();
    } else if (type.equals("veggie")) {
      pizza = new VeggiePizza();
    }

    return pizza;
  }
  
}
