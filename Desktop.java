/*
 * Represents a Desktop class that can be bought at the Computer Store
 * Desktop is a type of Computer
 */
public class Desktop extends Computer {
  /*
   * Whether or not the a desktop needs to be plugged in
   */
  private boolean needsPlug;

  /*
   * Sets needsPlug to true
   */
  public Desktop() {
    needsPlug = true;
  }

 /*
   * Sets the brand to the specified brand 
   * Sets the price to the specified price
   * Sets the storage to the specified storage
   * Sets needsPlug to the specified status
   */
   public Desktop(String brand, double price, double storage, boolean needsPlug) {
    super(brand, price, storage);
    this.needsPlug = needsPlug;
  }

  /*
   * Returns the value assigned to needsPlug
   */
  public boolean getNeedsPlug() {
    return needsPlug;
  }

  /*
   * Sets needsPlug to newNeedsPlug
   */
  public void setNeedsPlug(boolean newNeedsPlug) {
    needsPlug = newNeedsPlug;
  }

  /*
   * Adds a super.toString method in order to return the current brand, price, and storage from the Superclass
   * As well as the needsPlug subclass method
   */
  public String toString() {
return super.toString() + "\nNeeds Plug? " + needsPlug;
    
  }
}