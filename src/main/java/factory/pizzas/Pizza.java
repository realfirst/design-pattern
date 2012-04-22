/**
 * @file Pizza.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Sun Apr 15 23:36:17 2012
 */

package factory.pizzas;

import java.util.ArrayList;

abstract public class Pizza {

  String name;
  String dough;
  String sauce;
  ArrayList<String> toppings = new ArrayList<>();

  public String getName() {
    return name;
  }

  public void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Tossing dough...");
    System.out.println("Adding sauce...");
    System.out.println("Adding toppings: ");
    for (int i = 0; i < toppings.size(); i++) {
      System.out.println(" " + toppings.get(i));
    }
  }

  public void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("cutting " + name);
  }

  public void box() {
    System.out.println("Boxing " + name);
  }

  @Override
  public String toString() {
    // code to display pizza name and ingredients
    StringBuilder display = new StringBuilder();
    display.append("--- " + name + " ----\n");
    display.append(dough + "\n");
    display.append(sauce + "\n");
    for (int i = 0; i < toppings.size(); i++) {
      display.append(toppings.get(i) + "\n");
    }
    return display.toString();
  }
  
}
