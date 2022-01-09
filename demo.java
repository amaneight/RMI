import java.sql.*;

public class demo
{
	public static void main(String args[]) throws Exception
	    {
            Connection conn=null;
            String url="jdbc:mysql://localhost:3306/rmi";
            String driver="com.mysql.jdbc.Driver";
            String username="root";
            String pwd="";
            Class.forName(driver);
            conn=DriverManager.getConnection(url,username,pwd);
            if(conn.isClosed()!=true)
            	System.out.println("Connection open");
            conn.close();
                        
        }
}