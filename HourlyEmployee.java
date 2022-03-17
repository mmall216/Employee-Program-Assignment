/**
   An hourly employee is paid for every hour worked.
*/
public class HourlyEmployee extends Employee
{
   private double hourlyWage;
   private double hoursWorked;
 
   public HourlyEmployee(String fName, String lName, String jobTitle, int id, String Jobtitle, double wage, double hours)
   {
      setfName(fName);
      setlName(lName);
      setjobTitle(Jobtitle);
      setId(id);
      hourlyWage = wage;
      hoursWorked =hours;
   }
 
   public double getweeklyPay()
   {
      double pay = hoursWorked * hourlyWage;
      if (hoursWorked > 40)
      {
         // Add overtime
         pay = pay + ((hoursWorked - 40) * 0.5) * hourlyWage;
      }
      return pay;
   }

}

