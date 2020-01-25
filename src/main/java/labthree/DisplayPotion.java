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
    String title = "Wealth Acquisition Potion";
    // Ingredient names
    String binding = "glue";
    String liquid = "water";
    String material = "shredded dollar bills";
    // Ingredient amounts
    int yieldAmt = 1;
    double bindingAmt = 1.0;
    double liquidAmt = 4.2;
    double materialAmt = 3.14;
    // Instructions
    String stepOne = "1. Pour " + liquid + " into a large pot.";
    String stepTwo = "2. Slowly sprinkle " + material + " into pot.";
    String stepThree = "3. Stir " + binding + " slowly into mixture.";
    String stepFour = "4. Chant \"money money money money\" for as many minutes as "
                      + "the amount of money you wish to have.";
    // Display
    System.out.println(title);
    System.out.println("Yields: " + yieldAmt + " bottle(s)");
    System.out.println();
    System.out.println("\t" + liquidAmt + " ounces\t" + liquid);
    System.out.println("\t" + materialAmt + " ounces\t" + material);
    System.out.println("\t" + bindingAmt + " ounces\t" + binding);
    System.out.println();
    System.out.print(stepOne + "\n"
                     + stepTwo + "\n" 
                     + stepThree + "\n" 
                     + stepFour);
  }
}