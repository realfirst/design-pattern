/**
 * @file ClamPizza.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Mon Apr 16 00:15:21 2012
 */

package factory.pizzas;

public class ClamPizza extends Pizza {

  public ClamPizza() {
    name = "Clam Pizza";
    dough = "Thin crust";
    sauce = "White garlic sauce";
    toppings.add("Clams");
    toppings.add("Grated parmesan cheese");
  }
  
}
