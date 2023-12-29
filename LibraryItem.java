//this class represent library item

//creates a class called LibraryItem
//this class contains library item informations
public class LibraryItem{
 
  //defines a private string field called title
  //title field keeps the name of the LibraryItem object
  private String title;
  
  //defines a private integer field called itemID
  //itemID field keeps the unique id of the LibraryItem object
  private int itemID;
  
  //defines a private boolean field called isAvaible
  //isAvailable field keeps availiblty of the LibraryItem object
  private boolean isAvailable;
  
  //defines a private static int field called lastItemId
  //lasItemId keeps last item's unique id
  //starts from -1
  private static int lastItemId=-1;
  
  
  /* makes a constructor and it takes a string parameters called title
   * increments the lastItemId
   * assigns the parameters to the fields 
   */
  public LibraryItem(String title){
    this.title=title;
    this.isAvailable=true;
    this.lastItemId++;
    this.itemID=lastItemId;
  }
  
  //defines a public method called getTitle
  //is not takes a parameter and it returns title field as a String value
  public String getTitle(){
    return this.title;
  }
  
  //defines a public method called getItemID
  //is not takes a parameter and it returns itemID field as an integer value
  public int getItemID(){
    return this.itemID;
  }
  
  //defines a public method called isAvailable
  //is not takes a parameter and it returns isAvailable field as a boolean value
  public boolean isAvailable(){
    return this.isAvailable;
  }
  
  //defines a public method called borrowItem
  //is not takes a parameter and it is not returns any value
  //changes item's availability
  public void borrowItem(){
    if(this.isAvailable)
      this.isAvailable=false;
  }
  
  //defines a public method called returnItem
  //is not takes a parameter and it is not returns any value
  //changes item's availability
  public void returnItem(){
    this.isAvailable=true;
  }
  
  /* make an override
   * override the toString method in the object class
   * returns itemID, title, isAvailable field as a String value
   */
  @Override
  public String toString(){
    return this.getItemID() + " " + this.getTitle()+ " " + ((this.isAvailable==true) ? "available" : "is not available");
  }
  
}