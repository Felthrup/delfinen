import java.time.*;

public class Person
{
   private String name;
   private String address;
   private static LocalDate birthdate;
   
   //constructor
   public Person(String name, String address, int year, int month, int date)
   {
      this.name = name;
      this.address = address;
      
      this.birthdate = LocalDate.of(year, month, date);
   }

   public void setName(String name)
   {
      this.name = name;
   }
   
   public void setAddress(String address)
   {
      this.address = address;
   }
   
   public void setBirthdate(int year, int month, int date)
   {
      this.birthdate = LocalDate.of(year, month, date);
   }
   
   public String getName()
   {
      return this.name;
   }
   
   public String getAddress()
   {
      return this.address;
   }
   
   public LocalDate getBirthdate()
   {
      return this.birthdate;
   }
   
   public String toString()
   {
      return("Name: " + name + "\nAddress: " + address + "\nBirthdate: " 
      + birthdate.getDayOfMonth() + " " + birthdate.getMonthValue() + " " + birthdate.getYear()); //SKal måske rykkes over i et interface
   }
   
   //public objectEquals()

   
}