package com.Java.Class1.Day34_DB.Datasource;

import java.sql.*;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/24 7:16
 */
public class Datasource {


    String url = "jdbc:postgresql://localhost/postgres";
    String user = "postgres";
    String password = "juntos";
    Connection conn=null;
    Statement statement=null;


    public static void main(String[] args) throws SQLException {
        Datasource d=new Datasource();
        d.connect();
        System.out.println("****************************\n\n");
        d.open();
        System.out.println("****************************\n\n");
           d.InsertData(1,"krishna","fukuoka,Japan",30,200);
        d.selectFromTable();
        System.out.println("****************************\n\n");
        d.Update_table_salary(1,10000);;
        d.selectFromTable();
        System.out.println("****************************\n\n");
        d.delete_companyEntry(1);
        System.out.println("****************************\n\n");
        d.selectFromTable();
        System.out.println("****************************\n\n");
        d.close();
    }

    public Connection connect(){
        try{
            conn= DriverManager.getConnection(url,user,password);
            System.out.println("Connected to postgreSQL server successfully");
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return conn;
    }

    public static final String CREATE="CREATE TABLE IF NOT EXISTS ";

    public static String CREATE_COMPANY_TABLE=CREATE+"COMPANY  " +
            "(ID INT PRIMARY KEY     NOT NULL," +
            " NAME           TEXT    NOT NULL, " +
            " AGE            INT     NOT NULL, " +
            " ADDRESS        CHAR(50), " +
            " SALARY         REAL)";

//            "CREATE TABLE COMPANY "+"(ID INT PRIMARY KEY NOT NULL,"+"NAME TEXT NOT NULL,"+
//            "AGE INT NOT NULL,"+"ADDRESS  CHAR(50),"+"SALARY REAL)";

    private void open() {
        try{
            conn.setAutoCommit(false);
            statement=conn.createStatement();
            updatesalary= conn.prepareCall(UPDATE_SALARY);
            statement.executeUpdate(CREATE_COMPANY_TABLE);
            System.out.println("table created...");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void close(){
        try{
            if(statement!=null){
                statement.close();
            }
            if(updatesalary!=null){
                updatesalary.close();
            }
            if(conn!=null){
                conn.close();
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void InsertData(int id,String name,String address,int age,float salary){

        String  insert=
//                "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) VALUES "+ (3, 'Teddy', 23, 'Norway', 20000.00 );";
                "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) VALUES ("+id+",\'"+name+"\',"+age+",\'"+address+"\',"+salary+")";

        try{
            conn.setAutoCommit(false);
            statement=conn.createStatement();
            statement.executeUpdate(insert);
            conn.commit();
            System.out.println("value inserted..");
            ResultSet resultSet=statement.executeQuery("SELECT * from COMPANY");
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3)+" "+
                        resultSet.getString(4)+" "+resultSet.getFloat(5));
                System.out.println();
            }

        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
    public void selectFromTable(){
        try{
            // conn.setAutoCommit(false);
            statement=conn.createStatement();
            //  statement.executeUpdate(insert);
            //  conn.commit();
            //  System.out.println("value inserted..");
            ResultSet resultSet=statement.executeQuery("SELECT * from COMPANY");
            while(resultSet.next()){
                System.out.println("ID:"+resultSet.getInt(1)+" NAME: "+resultSet.getString(2)+" AGE: "+resultSet.getInt(3)+" ADDRESS: "+
                        resultSet.getString(4)+" SALARY: "+resultSet.getFloat(5));
                System.out.println();
            }
            resultSet=statement.executeQuery("SELECT count(*) from COMPANY");
            if(resultSet.next()){
                System.out.println("****************************");
                System.out.println("Total entries in the table: "+resultSet.getInt(1));
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    private static final String UPDATE_SALARY = "UPDATE COMPANY set SALARY = ? where Id= ?";


    private PreparedStatement updatesalary;
    public int Update_table_salary(int ID,float salary)  {


        try {
            conn.setAutoCommit(false);
            updatesalary.setInt(2, ID);
            updatesalary.setFloat(1, salary);
            System.out.println(updatesalary.toString());
            int moficication = updatesalary.executeUpdate();
            //    ResultSet resultSet=updatesalary.getGeneratedKeys();
            if (moficication == 1) {
                conn.commit();
                System.out.println("Updated successfully");
                return moficication;
                //  return resultSet.getInt(1);
            } else {
                //insert into ablu
                return -1;
            }

        }
        catch (Exception e){
            try{
                conn.rollback();
            }catch (Exception ee){
                System.out.println(ee.getMessage());
            }
            return -1;
        }finally{
            try{
                conn.setAutoCommit(true);
            }catch (Exception e1){
                System.out.println(e1.getMessage());
            }
        }

    }
    public static String DELETE="DELETE FROM COMPANY WHERE ID=";
    public void delete_companyEntry(int ID){

        try{
            statement= conn.createStatement();
            statement.execute(DELETE+ID);
          //  conn.commit();
            System.out.println("****************************");
            System.out.println("Deleted ID-"+ID);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}
