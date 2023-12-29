//this class represent date

//creates a class called Date
//this class contains date informations
public class Date{
  
  //defines a private integer field called day
  //day field keeps the day of the birth date
  private int day;
  
  //defines a private integer field called month
  //month field keeps the month of the birth date
  private int month;
  
  //defines a private int field called year
  //year field keeps the year of the birth date
  private int year;
  
  /* makes a constructor and it takes 3 parameters
   * a integer parameter called day
   * a integer parameter called month
   * a integer parameter called year
   * it assigns the parameters to the fields
   */
  public Date(int day, int month, int year){
    this.day=day;
    this.month=month;
    this.year=year;
  }
  
  //defines a method called getDay
  //it is not takes a parameters and it returns day field as a integer
  public int getDay(){
    return this.day;
  }
  
  //defines a method called getMonth
  //it is not takes a parameters and it retun month field as a integer
  public int getMonth(){
    return this.month;
  }
  
  //defines a method called getYear
  //it is not takes a parameters and it returns year field as a integer
  public int getYear(){
    return  this.year;
  }
  
  /* makes an override
   * override the toString method in the object class
   * it is not takes a parameter
   * it returns day, month and year field as a string value
   */
  @Override
  public String toString(){
    return this.getDay() + "/" + this.getMonth() + "/" + this.getYear();
  }
  
}