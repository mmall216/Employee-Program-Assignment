/**
   A salaried employee is paid the same amount independent of the hours worked.
*/
public class SalariedEmployee extends Employee
{
   private double annualSalary;


   public SalariedEmployee(String fName, String lName,String jobTitle, int id, double salary)
   {
      setfName(fName);
      setlName(lName);
      setId(id);
      setjobTitle(jobTitle);
      annualSalary = salary;
   }

   public double getweeklyPay() 
   {
      final int WEEKS_PER_YEAR = 52;
      return annualSalary / WEEKS_PER_YEAR;
   }


}

