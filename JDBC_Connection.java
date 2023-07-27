import java.sql.*;
public class JDBC_Connection{
    public static void main(String[] args) {
        try{
            // Creating a Connection
            String url="jdbc:mysql://localhost:3306";
            String username="root";
            String password="dev@singh7465";
            Connection con=DriverManager.getConnection(url,username,password); 
            if(con.isClosed()){
                System.out.println("Connection failed !");
            }
            else{
                System.out.println("Connection Created successfuly.");
            }
            // SQL COMMANDS...
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

