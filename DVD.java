//this class represent dvd

//creates a class called DVD
//DVD class extends LibraryItem Class
//this class contains dvd informations
public class DVD extends LibraryItem{
  
  //define a private Person object called director
  //director field keeps director's name, surname and date of birth information
  private Person director;
  
  //define a private integer called runtimeMinutes
  //runtimeMinutes field keeps runtime of the dvd as minute
  private int runtimeMinutes;
  
  /* makes a constructor and it takes 3 parameters
   * a string parameters called title
   * a Person object called director
   * a integer parameter called runtimeMinutes
   * sends the title parameters to upper class with super method
   * assigns the parameters to the fields
   */
  public DVD(String title, Person director, int runtimeMinutes){
    super(title);
    this.director=director;
    this.runtimeMinutes=runtimeMinutes;
  }
  
  
  //defines a method called getDirector
  //is not takes a parameter and it returns director field as a Person object
  public Person getDirector(){
    return this.director;
  }
  
  //defines a method called getRuntimeMinutes
  //is not takes a parameter and it returns runtimeMinutes field as a integer value
  public int getRuntimeMinutes(){
    return this.runtimeMinutes;
  }
  
   /* makes an override
   * override the toString method in the object class
   * is not takes a parameter
   * returns itemID, title, isAvailable field from upper class with super method 
   * also adds to  director and runtimeMinutes to return value
   * and returns all values as a string value
   */
  @Override
  public String toString(){
    return super.toString() + " " + this.getDirector() + " " + this.getRuntimeMinutes();
  }
  
}