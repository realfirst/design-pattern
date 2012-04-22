/**
 * @file CheesePizza.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Mon Apr 16 00:11:42 2012
 */

package factory.pizzas;

public class CheesePizza extends Pizza {

  public CheesePizza() {
    name = "Cheese Pizza";
    dough = "Regular Crust";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Fresh Mozzarella");
    toppings.add("Parmesan");
  }
}
