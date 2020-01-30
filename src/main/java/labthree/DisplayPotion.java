package labthree;

/** Renders one of G. Wiz's potions in a digital display.
 *
 * @author {YOUR NAME HERE}
 */
public class DisplayPotion {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Potion title
    String title = "Thumb Acquisition Potion";
    // Ingredient names
    String binding = "mashed beetle";
    String liquid = "distilled water";
    String material = "crushed alligator plant";
    // Ingredient amounts
    int yieldAmt = 1;
    int bindingAmt = 1;
    int liquidAmt = 4;
    int materialAmt = 3;
    // Display
    System.out.println(title);
    System.out.print("Yields: " + yieldAmt + " bottle ");
    System.out.println("(" + (bindingAmt + liquidAmt + materialAmt) + " ounces)");
    System.out.println();
    System.out.println("\t" + liquidAmt + " ounces\t" + liquid);
    System.out.println("\t" + materialAmt + " ounces\t" + material);
    System.out.println("\t" + bindingAmt + " ounces\t" + binding);
  }
}