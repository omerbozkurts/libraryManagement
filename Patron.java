//this class represent patron

//creates a class called Patron
//Patron Class extends Person Class
//Patron Class contain patron informations
public class Patron extends Person{
  
  //defines a private int field called libraryCardNumber
  //libraryCardNumber field keeps the unique number of the library card
  private int libraryCardNumber;
  
  //defines a private string field called emailAdress
  //emailAdress field keeps the email of the patron
  private String emailAdress;
  
  //defines a private static integer field called lastLibraryCardNumber
  //lastLibraryCardNumber field keeps the last unique card number
  //starts from -1
  private static int lastLibraryCardNumber=-1;
  
  /* make a constructor and it takes 4 parameters
   * a string parameter called name
   * a string parameter called surname
   * a Date object called dateOfBirth
   * a string parameter called emailAdress
   * sends the name, surname and dateOfBirht parameters to upper class with super method
   * increments the lastLibraryCardNumber
   * assigns the parameters to the fields
   */
  public Patron(String name, String surname, Date dateOfBirth, String emailAdress){
    super(name, surname, dateOfBirth);
    this.emailAdress=emailAdress;
    this.lastLibraryCardNumber++;
    this.libraryCardNumber=lastLibraryCardNumber;
  }
  
  //defines a method called getLibraryCardNumber
  //it is not takes a parameters and returns libraryCardNumber field as an integer value
  public int getLibraryCardNumber(){
    return this.libraryCardNumber;
  }
  
  //defines a method called getEmailAdress
  //it is not takes a parameters and return emeailAdress filed as an string value
  public String getEmailAdress(){
    return this.emailAdress;
  }
  
  /* makes an override
   * override the toString method in the object class
   * is not takes a parameter
   * returns firstName, lastName, dateOfBirth field from upper class with super method 
   * also adds to  libraryCardNumber and emailAdress to return value
   * and returns all values as a string value
   */
  @Override
  public String toString(){
    return super.toString()+ " " + this.getLibraryCardNumber() + " " + this.getEmailAdress();
  }
  
}