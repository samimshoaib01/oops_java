class Employee {
 
 String name;
 int employeeID;
 double salary;
 
 Employee(String name, int employeeID, double salary)
 {
 	this.name=name;
 	this.employeeID = employeeID;
 	this.salary = salary;
 
 }
 
 displayDetails()
	{
          System.out.println("Name :"+name);
          System.out.println("Employee Id :"+employeeID);
          System.out.println("Salary :"+salary);
          
	}

 }
 
 
 class Manager extends Employee
{
	
	int teamSize;

Manager(String name,int employeeID, double salary,int teamSize)
{
	super(name,employeeID,salary);
	this.teamSize = teamSize;
}

@Override
displayDetails()
	{
          super.displayDetails();
          System.out.println("Team size :"+teamSize);
          
	}

	

}


class Director extends Manager
{
	double budget;
	Director(String name,int employeeID, double salary,int teamSize,double budget)
{
	super(name,employeeID,salary,teamSize);
	this.budget = budget;
}

displayDetails()
	{
          super.displayDetails();
          System.out.println("Budget :"+budget);
          
	}

}

public class Main{

}



