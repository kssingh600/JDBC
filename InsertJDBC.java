import java.sql.* ;

class InsertJDBC{
    public static void main(String[] args) {
        try{
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver") ;
            //create a connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "MySQL") ;
            //create a query
            String q = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))" ;
            //create a statement
            Statement stmt = con.createStatement() ;
            stmt.executeUpdate(q) ;
            System.out.println("Table created in database...");
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}