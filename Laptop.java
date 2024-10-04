/*
 * Represents a Laptop class that can be bought at the Computer Store
 * Laptop is a type of Computer
 */
public class Laptop extends Computer {
 /*
  * Whether or not a Laptop is foldable
  */
  private boolean foldable;

 /*
  * Sets foldable to true
  */
  public Laptop() {
    foldable = true;
  }

  /*
   * Sets the brand to the specified brand 
   * Sets the price to the specified price
   * Sets the storage to the specified storage
   * Sets foldable to the specified status
   */
  public Laptop(String brand, double price, double storage, boolean foldable) {
    super(brand, price, storage);
    this.foldable = foldable;
  }

  /*
   * Returns the value assigned to foldable
   */
  public boolean getFoldable() {
    return foldable;
  }

  /*
   * Sets foldable to newFoldable
   */
  public void setFoldable(boolean newFoldable) {
    foldable = newFoldable;
  }

    /*
   * Adds a super.toString method in order to return the current brand, price, and storage from the Superclass
   * As well as the Foldable subclass method
   */
  public String toString() {
return super.toString() + "\nFoldable? " + foldable;
    
  }
}