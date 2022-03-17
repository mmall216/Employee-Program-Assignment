import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class SalaryDemo {
   public static void main(String[] args) {
	   
	   ArrayList <Employee> employees = new ArrayList<Employee>();
	   employees.add((new HourlyEmployee("James", "Ronald", "Teller", 9876, "Teacher", 20.00, 10)));
	   
	  
	   Scanner userInput = new Scanner (System.in);
	   int choice = 0; 		
				
		do {
			System.out.println("Student Menu: ");
			System.out.println("1- Add New Employee");
			System.out.println("2- Display All Employee");
			System.out.println("3- Search For Employee (By Id)");
			System.out.println("4- Search for Employee (By Job Title)");
			System.out.println("5- Remove Employee (Id)");
			System.out.println("6- Exit");
			
			System.out.println("Enter your choice: ");
			choice = userInput.nextInt();
			
			switch(choice) {
				case 1: 
					System.out.println("Enter 1 to add hourly employee. Enter 2 to add salary employee. Enter 3 to add manager.");
					int employeeChoice= userInput.nextInt();
					
					if (employeeChoice== 1) {		
						System.out.println("Enter First Name");
						String fName = userInput.next();
						System.out.println("Enter Last Name");
						String lName = userInput.next();
						System.out.println("Enter Employee id: ");
						int id = userInput.nextInt();
						System.out.println("Enter Job Title");
						String jobTitle = userInput.next();
						System.out.println("Enter Employee Wage");
						double wage = userInput.nextDouble();
						System.out.println("Enter Employee Hours Worked");
						double hours = userInput.nextDouble();
						employees.add(new HourlyEmployee(fName, lName, jobTitle, id, jobTitle, wage, hours));
					}
					
					if (employeeChoice == 2) {
						System.out.println("Enter First Name");
						String fName = userInput.next();
						System.out.println("Enter Last Name");
						String lName = userInput.next();
						System.out.println("Enter Job Title");
						String jobTitle = userInput.next();
						System.out.println("Enter Employee id: ");
						int id = userInput.nextInt();
						System.out.println("Enter Amount of Salary");
						double salary = userInput.nextDouble();
						
						employees.add(new SalariedEmployee(fName, lName, jobTitle, id, salary));
					}
					
					if(employeeChoice== 3) {
						System.out.println("Enter First Name");
						String fName = userInput.next();
						System.out.println("Enter Last Name");
						String lName = userInput.next();
						System.out.println("Enter Employee id: ");
						int id = userInput.nextInt();
						System.out.println("Enter Amount of Salary");
						double salary = userInput.nextDouble();
						System.out.println("Enter Amount in Bonus");
						double bonus = userInput.nextDouble();
						
						employees.add(new Manager (fName, lName, "Manager", id, salary, bonus));
					}
					
					else {
						System.out.println("Error please follow the directions!");
					}
					
					break;
					
				case 2:
					for (int i=0; i<employees.size();i++) {
						System.out.println("First Name: " + employees.get(i).getfName());
						System.out.println("Last Name: "+ employees.get(i).getlName());
						System.out.println("ID: " + employees.get(i).getId());
						System.out.println("Job Title: " + employees.get(i).getjobTitle());
						System.out.println("Weekly Pay: " + employees.get(i).getweeklyPay());
					}
					System.out.println("");
					
					break;
					
				case 3:
					//Search Student By Id
					 int searchId;
				     System.out.println("What is the Employee's id that you would like to search for?");
				     searchId = userInput.nextInt();       
				     
				     for (int i = 0; i < employees.size(); i++) {
				            if (searchId == employees.get(i).getId()) {              
								System.out.println("First Name: " + employees.get(i).getfName());
								System.out.println("Last Name: "+ employees.get(i).getlName());
								System.out.println("ID: " + employees.get(i).getId());
								System.out.println("Job Title: " + employees.get(i).getjobTitle());
								System.out.println("Weekly Pay: " + employees.get(i).getweeklyPay());
				            }
				            else {
				            		System.out.println("Incorrect Information");
				            }
				     }
				     System.out.println("");
				     
					break;
				
				case 4:
					String searchjobTitle = userInput.next();
					System.out.println("What is the Employee's last name that you would like to search for?");
				
					for (int i = 0; i < employees.size(); i++) {
			            if (searchjobTitle == employees.get(i).getjobTitle()) {
							System.out.println("First Name: " + employees.get(i).getfName());
							System.out.println("Last Name: "+ employees.get(i).getlName());
							System.out.println("ID: " + employees.get(i).getId());
							System.out.println("Job Title: " + employees.get(i).getjobTitle());
							System.out.println("Weekly Pay: " + employees.get(i).getweeklyPay());
			            }
			            else {
			            		System.out.println("Incorrect Information");
			            		}
			         }
					System.out.println("");
					
					break;
					
				case 5:
					//Remove Student
					System.out.println("REMOVING A EMPLOYEE IS FINAL AND CANNOT BE UNDONE");
					System.out.println("Enter EMPLOYEE id That You Would Like to Remove: ");
					int deleteId = userInput.nextInt();
					
					for (int i = 0; i < employees.size(); i++) {
			            if (deleteId == employees.get(i).getId()) {  
			            		employees.remove(i);			            
			            	}
			            else {
			            		System.out.println("Invalid Information");
			            }
					}
					System.out.println("");
				
					break;
				
				case 6:
					
					break;	
		
			} 
		
		}while (choice != 6);
		userInput.close();
	}
   
}
