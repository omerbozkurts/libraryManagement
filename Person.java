//this class represent person

//creates a class called Person
//this class contains person information
public class Person{
  
  //defines a private string field called firstName
  //firstName field keeps the first name of the person
  private String firstName;
  
  //defines a private string field called lastName
  //lastName field keeps the last name of the person
  private String lastName;
  
  //defines a private Date object field called dateOfBirth
  //dateOfBirth field keeps the person's date of birth
  private Date dateOfBirth;
  
  /* makes a constructor and it takes 3 parameters
   * a string parameter called firstName
   * a string parameter called lastName
   * a Date object called dateOfBirth
   * assigns the parameters to the values
   */
  public Person(String firstName, String lastName, Date dateOfBirth){
    this.firstName=firstName;
    this.lastName=lastName;
    this.dateOfBirth=dateOfBirth;
  }

  /* makes a method overloading for constructor for using different parameters
   * make a constructor and it takes 5 parameters
   * a string parameter called firstName
   * a string parameter called lastName
   * a integer parameter called day
   * a integer parameter called month
   * a integer parameter called year
   * assigns the parameters to the fields
   * assigns day, month and year parameters to dateOfBirth object with using new
   */
  public Person(String firstName, String lastName, int day, int month, int year){
    this.firstName=firstName;
    this.lastName=lastName;
    this.dateOfBirth=new Date(day,month,year);
  }
  
  //defines a method called getFirstName
  //it is not takes parameters and returns firstName field as a string value
  public String getFirstName(){
    return this.firstName;
  }
  
  
  //defines a method called getLastName
  //it is not takes parameters and returns lastName field as a string value
  public String getLastName(){
    return this.lastName;
  }
  
  //defines a method called getDateOfBirth
  //it is not takes parameters and returns dateOfBirth object field as a Date object
  public Date getDateOfBirth(){
    return this.dateOfBirth;
  }
  
  /* makes an override
   * override the toString method in the object class
   * is not takes a parameter
   * returns firstName, lastName, dateOfBirth field as a string value
   */
  @Override
  public String toString(){
    return this.getFirstName() + " " + this.getLastName() + " " + this.getDateOfBirth();
  }
  
}