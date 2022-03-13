import java.util.Scanner;

public class Employee {
	int employeeId;
	String employeeName;
	int salary;
	String city;
	String emailid;
	String mobileno;
	String address;
	int departmentid;
	
	public String toString()
	{
		return "Employee ID:"+employeeId+" Employee Name:"+employeeName+" Salary:"+salary+" City:"+city+" Email Id:"+emailid+" Mobile No:"+mobileno+" Address:"+address+" Department Id:"+departmentid;
	}
	
	public Employee() {}
	
	public void initialize()
	{
		Scanner scannerObj=new Scanner(System.in);
		System.out.println("Enter the Employee ID:");
		employeeId=scannerObj.nextInt();
		System.out.println("Enter the Employee Name:");
		employeeName=scannerObj.next();
		System.out.println("Enter the Employee Salary:");
		salary=scannerObj.nextInt();
		System.out.println("Enter the Employee City:");
		city=scannerObj.next();
		System.out.println("Enter the Employee Email Id:");
		emailid=scannerObj.next();
		System.out.println("Enter the Employee Mobile No:");
		mobileno=scannerObj.next();
		System.out.println("Enter the Employee Address:");
		address=scannerObj.next();
		System.out.println("Enter the Employee Department:");
		departmentid=scannerObj.nextInt();
		
	}
	
	public void readFile()
	{
		
	}

	public Employee(int empId, String empName, int salary, String city, String emailid, String mobileno, String addr,
			int deptid) {
		this.employeeId = empId;
		this.employeeName = empName;
		this.salary = salary;
		this.city = city;
		this.emailid = emailid;
		this.mobileno = mobileno;
		this.address = addr;
		this.departmentid = deptid;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}

}