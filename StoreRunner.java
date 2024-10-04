import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    /*
     * Creates a Scanner object
     */
    Scanner input = new Scanner(System.in);

    /*
     * Creates a computer object
     * Creates a laptop object
     * Creates a desktop object
     */
    Computer computer = new Computer("Mac", 299.99, 2.);
    Laptop laptop = new Laptop("Chromebook", 99.99, .5, true);
    Desktop desktop = new Desktop("Windows", 199.99, 2 , true);
  
    /*
     * Printing the original computer information
     */
    System.out.println("Computer: Original");
    System.out.println(computer);
    System.out.println("--------------------");
  
    /*
     * Printing the original laptop computer information
     */
    System.out.println("Laptop: Original");
    System.out.println(laptop);
    System.out.println("--------------------");
 
    /*
     * Printing the original desktop computer information
     */
    System.out.println("Desktop: Original");
    System.out.println(desktop);
    System.out.println("--------------------");

    /*
     * Get Brand Input with Scanner Object
     */
    System.out.print("Enter a new brand for the Computer: ");
    String newBrand = input.next();
    computer.setBrand(newBrand);

     /*
     * Get Price Input with Scanner Object
     */
    System.out.print("Enter a new price for the Computer: ");
    double newPrice = input.nextDouble();
    computer.setPrice(newPrice);

    /*
     * Get Storage Input with Scanner Object
     */
    System.out.print("Enter a new amount of storage for the Computer in Terabytes: ");
    double newStorage = input.nextDouble();
    computer.setStorage(newStorage);
  
    /*
     *Printing updated Computer information
     */
    System.out.println("--------------------");
    System.out.println("Computer: Updated");
    System.out.println(computer);

     /*
     *Printing weclome message
     */
     System.out.println("--------------------");
    System.out.println("Thank You for coming to the computer store, please come again");
    
    /* 
     * Closes the Scanner object
     */
    input.close();
    
  }
}