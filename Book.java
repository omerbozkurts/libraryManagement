//this class represent books

//creates a class called Book
//Book Class extends LibraryItem Class
//this class contains books informations
public class Book extends LibraryItem{

  //defines a private Person object field called author
  //author filed keeps author's name, surname and date of birth information
  private Person author;
  
  //defines a private String field called isbn
  //isbn field keeps international standart book number of the book
  private String isbn;
  
  /* makes a constuctor and it takes 3 parameters
   * a string parameters called name
   * a Person object called author
   * a string parameters called isbn
   * it sends the name parameters to upper class with super method
   * it assigns the parameters to the fields
   */
  public Book(String name,Person author, String isbn){
    super(name);
    this.isbn=isbn;
    this.author=author;
  }
  
  //defines a method called getAuthor
  //it is not takes a parameter and it returns author field as a Person object
  public Person getAuthor(){
    return this.author;
  }
  
  //defines a method called getISBN
  //it is not takes a parameter and it returns isbn field as a string
  public String getISBN(){
    return this.isbn;
  }
  
   /* makes an override
   * override the toString method in the object class
   * it is not takes a parameter
   * it returns itemID, title, isAvailable field from upper class with super method 
   * also adds to  author and isbn to return value
   * and returns all values as a string value
   */
  @Override
  public String toString(){
    return super.toString() + " " + this.getAuthor() + " " + this.getISBN();
  }
  
}