package creationalPattern;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


//singleTon Pattern
class Hike{
private static final Hike instance = new Hike(); 

private Hike() 
{ 
 
} 
public static Hike getInstance(){ 
      return instance; 
  } 
public int finalSalaryAfterHike(int salary){
	return ((salary+5000));
}
}
//Builder pattern:immutability concept
final class Employee{
 private final String name;
 private final int salary;
 public Employee(EmployeeBuilder employeeBuilder){
 	this.name=employeeBuilder.name;
 	this.salary=employeeBuilder.salary;
 }
 public String getName() {
    return(name);
 }
 public int getSalary() {
      return(salary);
 }
 @Override
 public String toString() {
     return "name:"+name+","+"salary:"+salary+".";
 }

}

public class EmployeeBuilder {
	public static final Logger LOGGER=LogManager.getLogger(EmployeeBuilder.class);
	final String name;
	int salary;
	public EmployeeBuilder(String name){
		this.name=name;
	}
	public void setSalary(int salary){
		this.salary=salary;
	}
	public Employee buildEmployee(){
		
		this.salary=Hike.getInstance().finalSalaryAfterHike(this.salary);

		return new Employee(this);
	}
	public static void main(String[] args){
		EmployeeBuilder employeeBuilder=new EmployeeBuilder("siva balaji");
		employeeBuilder.setSalary(10000);
		Employee employee=employeeBuilder.buildEmployee();
		LOGGER.info(employee);
	}

}
