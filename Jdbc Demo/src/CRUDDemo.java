import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDDemo 
{
	
	public static int insertData(Connection conn,Employee employee)throws SQLException
	{
		PreparedStatement psmt=conn.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?)");
		
		psmt.setInt(1, employee.getEmployeeId());
		psmt.setString(2, employee.getEmployeeName());
		psmt.setInt(3,employee.getSalary());
		psmt.setString(4,employee.getCity());
		psmt.setString(5, employee.getEmailid());
		psmt.setString(6, employee.getMobileno());
		psmt.setString(7, employee.getAddress());
		psmt.setInt(8, employee.getDepartmentid());
		
		int row_eff=psmt.executeUpdate();
		psmt.close();
		
		return row_eff;
		
	}
	
	public static int insertData(Connection conn,int employeeid)throws SQLException
	{
		PreparedStatement psmt=conn.prepareStatement("delete from Employee where employeeid=?");		
		psmt.setInt(1, employeeid);
		int row_eff=psmt.executeUpdate();
		psmt.close();
		return row_eff;
	}
	
	public static void updateData(Connection conn,int employeeid)throws SQLException
	{
		//int salary=80000;
		//Statement statementObj=conn.createStatement();
		//ResultSet rs=statementObj.executeQuery("select * from employee");
		//int salary = rs.getInt(3);
		PreparedStatement psmt=conn.prepareStatement("update employee set salary=salary+? where employeeId=?");
		psmt.setInt(1, 10000);
	    psmt.setInt(2, employeeid);
		//int row_eff=psmt.executeUpdate();
	    psmt.executeUpdate();
		psmt.close();
		//return row_eff;
	}
	
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/forproject","root","Alphamale@123");
		
			//Employee employee=new Employee();
			//employee.initialize();
			
			//int roweff=CRUDDemo.insertData(conn, employee);
			
			//if(roweff>0)
			//	System.out.println("Row Inserted");
			//else
			//	System.out.println("Error Occured");
			
			//System.out.println("enter the employee id to delete");
			//int empid = sc.nextInt();
			//CRUDDemo.insertData(conn, empid);
			
			System.out.println("enter the employee id to to update salary");
			int empid = sc.nextInt();
			CRUDDemo.updateData(conn, empid);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Raised:"+e);
		}
		
	}
}