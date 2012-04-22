/**
 * @file PepperoniPizza.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Mon Apr 16 00:17:55 2012
 */

package factory.pizzas;

public class PepperoniPizza extends Pizza {

  public PepperoniPizza() {
    name = "Pepperoni Pizza";
    dough = "Crust";
    sauce = "Marinara sauce";
    toppings.add("Slice Pepperoni");
    toppings.add("Sliced Onion");
    toppings.add("Grated parmesan cheese");
  }
}
