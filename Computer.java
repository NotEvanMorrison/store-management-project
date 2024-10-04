/*
 * Represents a Computer class which can be bought from the store.
 */
public class Computer {

  /* 
   * The manufacturer
   * Price of the Computer
   * Amount of Storage space
   */
  private String brand;   
  private double price;
  private double storage; 

  /*
   * Sets computer brand to "Apple", price to 199.99, and amount of storage to 2 Terabytes
   */
  public Computer() {
    this("Apple", 199.99, 2);
  }

  /* 
   * Sets brand to the specified brand
   * Sets price to the specified price
   * Sets storage to the specified storage amount
   */
  public Computer(String brand, double price, double storage) {
    this.brand = brand;
    this.price = price;
    this.storage = storage;
  }

  /*
   * Returns the value assigned to the brand
   */
  public String getBrand() {
    return brand;
  }

  /*
   * Returns the value assigned to the price
   */
  public double getPrice() {
    return price;
  }

   /*
    * Returns the value assigned to the storage
    */  
  public double getStorage() {
    return storage;
  }

  /*
   * Sets flavor to newFlavor
   */
  public void setBrand(String newBrand) {
    brand = newBrand;
  }

  /*
   * Sets the price to newPrice
   */
  public void setPrice(double newPrice) {
    if (newPrice < 0) {
      price = 0;
    }
    else {
      price = newPrice;
    }
  }
  
  /*
   * Sets the storage to newStorage
   */
    public void setStorage(double newStorage) {
    if (newStorage < 0) {
      storage = 0;
    }
    else {
      storage = newStorage;
    }
  }

  /*
   * Adds a toString method in order to return the current brand, price, and storage of the computer.
   */
  public String toString () {
return "Brand: " + brand + "\nPrice: " + price + "\nStorage: " + storage;  
  }
    
  }