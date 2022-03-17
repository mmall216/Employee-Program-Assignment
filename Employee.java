/**
   An employee has a name and a mechanism for computing weekly pay.
*/
public abstract class Employee
{
   private String fName;
   private String lName;
   private String jobTitle;
   private int id;
   private double hours;

   /**
      Constructs an employee with an empty name.
   */
   public Employee()
   {
 
   }

   /**
      Sets the name of this employee.
      @param employee_name the new name 
   */
   public void setName(String employeefName)
   {
      fName = employeefName;
   }

   /**
      Gets the name of this employee.
      @return the name 
   */
   
   public double getHours() {
	   return hours;
   }
   
   public void setHours(double hours) {
	   this.hours=hours;
   }
   
   public String getfName()
   {
      return fName; 
   }
   
   public void setfName(String fName) {
	   this.fName=fName;
   }
   
   public String getlName() {
	   return lName;
   }
   
   public void setlName(String lName) {
	   this.lName=lName;
   }

   public String getjobTitle() {
	  return jobTitle;
   }
   
   public void setjobTitle(String jobTitle) {
	   this.jobTitle = jobTitle;
   }
   
   public int getId() {
	   return id;
   }

   public void setId(int id) {
	   this.id = id;
   }   
   /**
      Computes the pay for one week of work.
      @param hoursWorked the number of hours worked in the week
      @return the pay for the given number of hours
   */
   
   public abstract double getweeklyPay();

}
