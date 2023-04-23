//program for jdbc; 1st program

import java.sql.*;

class FirstJDBC{
    public static void main(String[] args) {
        try{
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver") ;

            //creating a connection
            String url = "jdbc:mysql://localhost:3306/youtube" ;
            String userName = "root" ;
            String password = "MySQL" ;
            Connection con = DriverManager.getConnection(url, userName, password) ;

            //check for connection
            if(con.isClosed()){
                System.out.println("connection is close");
            }else{
                System.out.println("Connection created...");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

