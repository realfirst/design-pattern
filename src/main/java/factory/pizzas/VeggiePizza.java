/**
 * @file VeggiePizza.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Mon Apr 16 00:20:15 2012
 */

package factory.pizzas;

public class VeggiePizza extends Pizza {

  public VeggiePizza() {
    name = "Veggie Pizza";
    dough = "Crust";
    sauce = "Marinara sauce";
    toppings.add("shredded mozzarella");
    toppings.add("Grated parmesan");
    toppings.add("Diced onion");
    toppings.add("Sliced mushrooms");
    toppings.add("Sliced red pepper");
    toppings.add("Sliced black olives");
  }
}
