//this class represent magazine

//creates a class called Magazine
//Magazine Class extends LibraryItem Class
//this class contains magazine informations
public class Magazine extends LibraryItem{
  
  //defines a private string field called issueNumber
  //issueNumber field keeps the issue number of the magazine
  private String issueNumber;
  
  //defines a private Date object field called publicationDate
  //publicatonDate field keeps the publication date of the magazine as day, month and year
  private Date publicationDate;
  
  /*make a consturctor and it takes 3 parameters
   * a string parameter called title
   * a string parameter called issueNumber
   * a Date object called publicationDate
   * sends the title parameter to upper class with super method
   * assigns the parameters to the fields
   */
  public Magazine(String title, String issueNumber, Date publicationDate){
    super(title);
    this.issueNumber=issueNumber;
    this.publicationDate=publicationDate;
  }
  
  //defines a method called getIssueNumber
  //not takes a parameter and returns issueNumber field as a string value 
  public String getIssueNumber(){
    return this.issueNumber;
  }
  
  //defines a method called gtPublicationDate
  //not takes a parameter and returns publicationDate field as a Date object
  public Date getPublicationDate(){
    return this.publicationDate;
  }
  
  /* makes an override
   * override the toString method in the object class
   * is not takes a parameter
   * returns itemID, title, isAvailable field from upper class with super method 
   * also adds to  publicationDate and issueNumber to return value
   * and returns all values as a string value
   */
  @Override
  public String toString(){
    return super.toString() + " " + this.getPublicationDate() + " " + this.getIssueNumber();
  }
  
}