/**
   A manager is a salaried employee who also receives a bonus.
*/
public class Manager extends SalariedEmployee
{
   private double weeklyBonus;
   private double Pay;

   public Manager(String fName, String lName, String jobTitle, int id, double salary, double bonus)
   {
      super(fName, lName, jobTitle, id, salary);
      weeklyBonus = bonus;
   }

   public double getweeklyPay()
   {
	  final int WEEKS_PER_YEAR = 52;
      return super.getweeklyPay() + weeklyBonus/WEEKS_PER_YEAR;
   }
}


