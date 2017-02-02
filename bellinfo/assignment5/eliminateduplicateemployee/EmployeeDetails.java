package bellinfo.assignment5.eliminateduplicateemployee;

import java.lang.reflect.Array;
import java.util.Scanner;

public class EmployeeDetails {
	Employee emp;
	Employee emp1;

	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		Employee[] originalEmployeeArray=emp.receiveInputs();
		emp.eliminateDuplicateEmpRecords(originalEmployeeArray);
		emp.displayResults(originalEmployeeArray);

	}
	Employee[] receiveInputs(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of employee in Company");
		int empCount=scan.nextInt();
		Employee[] originalEmpArray=new Employee[empCount];
		//Employee[] uniqueEmpArray=new Employee[empCount];
		//System.out.println(" ");
		for(int i=0;i<=empCount-1;i++){
			System.out.println("Employee Details" +i+" :" );
			System.out.println("Employee Id: ");
			int eId=scan.nextInt();
			System.out.println("Employee Name:");
			String eName=scan.next();
			System.out.println("Employee Salary");
			double eSalary=scan.nextDouble();
			System.out.println(" Department Id");
			int dId=scan.nextInt();
			System.out.println("Department Name:");
			String dName=scan.next();
			System.out.println("Department Location:");
			String dLocation=scan.next();
			
			Employee emp=populateEmpDetails(eId, eName, eSalary, dId,dName, dLocation);
			originalEmpArray[i]=emp;
			
		}
		//uniqueEmpArray=eliminateDuplicateEmpRecords(originalEmpArray);
		return originalEmpArray;
		
	}
	Employee populateEmpDetails(int eId, String eName, Double eSalary, int dId, String dName, String dLocation){
		Department d=new Department();
		d.setDeptId(dId);
		d.setDeptName(dName);
		d.setLocation(dLocation);
		
		Employee emp=new Employee();
		emp.setId(eId);
		emp.setName(eName);
		emp.setSalary(eId);
		emp.setDept(d);
		//System.out.println(emp);
		return emp;
	}
	
	
	
	Employee[] eliminateDuplicateEmpRecords(Employee[] originalEmpArray){
		Employee[] filteredArray=new Employee[originalEmpArray.length];
		filteredArray=originalEmpArray.clone();
		System.out.println("Filtered Array:");
		for(int i=0;i<=originalEmpArray.length-1;i++){
			Employee e1=originalEmpArray[i];
			
			for(int j=i+1;j<=originalEmpArray.length-1;j++){
				Employee e2=originalEmpArray[j];
				System.out.println(e1);
				
				System.out.println(e2);
				if(e1.equals(e2)){
					filteredArray[j]=null;
					System.out.println("Filtered Array");
				}
			}
		}
		
		return filteredArray;
	}
	
	
	void displayResults(Employee[] array) {
		System.out.println("**** Unique Employee Details ****");
		System.out.println("Id" + "Name" + "Salary" + "dId" + "dName"
				+ "dLocation");
				
					for (int i = 0; i <= Array.getLength(array) - 1; i++) {
						if(array[i]!=null){
							Employee emp=array[i];
							System.out.println(emp);
							}
			
			
						}
					}
					
				// System.out.println(emp.toString());
				
				
				
			
	}
	


class Employee{
	int id;
	String name;
	Department dept;
	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double
				.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept
				+ ", salary=" + salary + "]";
	}
	
	
	
}

class Department{
	int deptId;
	String deptName;
	String location;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptId;
		result = prime * result
				+ ((deptName == null) ? 0 : deptName.hashCode());
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (deptId != other.deptId)
			return false;
		if (deptName == null) {
			if (other.deptName != null)
				return false;
		} else if (!deptName.equals(other.deptName))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName
				+ ", location=" + location + "]";
	}
	
}
