import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo 
{
	public static void main(String arg[]) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysecond","root","Alphamale@123");
			
			Statement statementObj=conn.createStatement();
			ResultSet rs=statementObj.executeQuery("select * from employee");
			
			//PreparedStatement psmt=conn.prepareStatement("select * from employee where employeeId=?");		
			//psmt.setInt(1, 1002);
			//ResultSet rs=psmt.executeQuery();
			int salary=0;
			while(rs.next())
			{
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getString(5)+"\t");
				System.out.print(rs.getString(6)+"\t");
				System.out.print(rs.getString(7)+"\t");
				//System.out.println(rs.getString(8));
				System.out.println();
				salary = rs.getInt(3);
				System.out.println(salary);
				
			}
			
			statementObj.close();
			conn.close();
		}
		catch(ClassNotFoundException ce){
		System.out.println("Exception Arised:"+ce);
		}
		catch(SQLException se){
		System.out.println("Exception Arised:"+se);
		}
		
	}
}