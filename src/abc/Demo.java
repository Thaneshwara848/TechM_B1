package abc;
import java.sql.*;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		
	
				try
				{
					Scanner sc=new Scanner(System.in);
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localHost:1521:xe","system","tiger");

				PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?)");
					
				
					
					System.out.println("Enter ID  : ");
					int id=sc.nextInt();
					
					System.out.println("Enter Name : ");
					String name=sc.next();

					System.out.println("Enter AGE : ");
					int age=sc.nextInt();
					
					pstmt.setInt(1,id);
					pstmt.setString(2,name);
					pstmt.setInt(3,age);
					
					pstmt.execute();
										
					pstmt.close();
					con.close();
				}
				catch(Exception e){
					System.out.println(e);
					}	
		
		
	}

}
