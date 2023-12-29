//this class represent librarian

//creates a class called Librarian
//Librarian class extends Person Class
//this class contains librarian information
public class Librarian extends Person{
  
  //defines a private integer field called employeeID
  //employeeID field keeps unique id of the employee
  private int employeeID;
  
  //defines a private static integer field called lastEmployeeID
  //lastEmployeeID field keeps the last employee's unique id
  //starts from -1
  private static int lastEmployeeID=-1;
  
  /* makes a consturctor and it takes 3 parameters
   * a string parameter called name
   * a string parameter called surname
   * a Date object called birthOfDate
   * sends the name,surname and birthOfDate parameters to upper class with super method
   * increments the lastEmployeeID
   * assigns the parameters to the fields
   */
  public Librarian(String name, String surname, Date birthOfDate){
    super(name, surname, birthOfDate);
    this.lastEmployeeID++;
    this.employeeID=lastEmployeeID;
  }
  
  //defines a method called getEmployeeID
  // not takes a parameters and it return employeeID field as an integer value
  public int getEmployeeID(){
    return this.employeeID;
  }
  
  /*makes an override
   *override the toString method in the object class
   * is not takes a parameter
   * returns firstName, lastName, dateOfBirth field from upper class with super method 
   * also adds to  employeeID to return value
   * and returns all values as a string value
   */
  @Override
  public String toString(){
    return super.toString() + " " + this.getEmployeeID();
  }
  
}