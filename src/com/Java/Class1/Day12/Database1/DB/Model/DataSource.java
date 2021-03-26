package com.Java.Class1.Day12.Database1.DB.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/25 14:52
 */
public class DataSource {

    public static final String DATABASE_NAME="Master_Project_Info_v4.db";
    private static final String CONNECTION="jdbc:sqlite:"+DATABASE_NAME;

    private Connection conn;
    public boolean open(){
        try{
            conn= DriverManager.getConnection(CONNECTION);
            return  true;
        }catch(SQLException e){
            System.out.println("The error while opening the database is- "+e.getMessage());
            return false;
        }
    }

    public void close(){
        try{
            if(conn!=null){
                conn.close();
            }
        }catch (SQLException e){
            System.out.println("The error while closing the database is- "+e.getMessage());

        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //CREATE TABLE IF NOT EXISTS company( _id INTEGER, name TEXT)
    private static final String TABLE_COMPANY="company_info";
    private static final String COLUMN_COMPANY_ID="_idCompany";
    private static final String COLUMN_COMPANY_NAME="name";
    private static final String CREATE="CREATE TABLE IF NOT EXISTS ";
    private static final String QUERY_CREATE_TABLE_COMPANY=CREATE+TABLE_COMPANY+
            "("+COLUMN_COMPANY_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+COLUMN_COMPANY_NAME+" TEXT NOT NULL)";
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create department table
    private static final String TABLE_DEPARTMENT="department_info";
    private static final String COLUMN_DEPARTMENT_ID="_idDepartment";
    private static final String COLUMN_DEPARTMENT_NAME="name";
    private static final String QUERY_CREATE_TABLE_DEPARTMENT=CREATE+TABLE_DEPARTMENT+
            "("+COLUMN_DEPARTMENT_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+COLUMN_DEPARTMENT_NAME+" TEXT NOT NULL)";
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create userLoginInfoTable
    private static final String TABLE_USER_LOGIN_INFO="user_login_info";
    private static final String COLUMN_USER_LOGIN_INFO_ID="_id";
    private static final String COLUMN_USER_LOGIN_INFO_FIRST_NAME="firstName";
    private static final String COLUMN_USER_LOGIN_INFO_LAST_NAME="lastName";
    private static final String COLUMN_USER_LOGIN_INFO_EMAIL="emailId";
    private static final String COLUMN_USER_LOGIN_INFO_GENDER="gender";
    private static final String COLUMN_USER_LOGIN_INFO_COMPANY="company";
    private static final String QUERY_CREATE_TABLE_USER_LOGIN_INFO=CREATE+TABLE_USER_LOGIN_INFO+
            "("+COLUMN_USER_LOGIN_INFO_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+COLUMN_USER_LOGIN_INFO_FIRST_NAME+" TEXT NOT NULL,"+
            COLUMN_USER_LOGIN_INFO_LAST_NAME+" TEXT NOT NULL,"+COLUMN_USER_LOGIN_INFO_EMAIL+" TEXT NOT NULL UNIQUE ,"+COLUMN_USER_LOGIN_INFO_GENDER
            +" TEXT NOT NULL,"+COLUMN_USER_LOGIN_INFO_COMPANY+" INTEGER NOT NULL)";
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create login credentials table
    private static final String TABLE_LOGIN_CREDENTIALS_INFO="login_credentials";
    private static final String COLUMN_LOGIN_CREDENTIALS_INFO_ID ="_id";
    private static final String COLUMN_LOGIN_CREDENTIALS_INFO_UserId ="useId";
    private static final String COLUMN_LOGIN_CREDENTIALS_INFO_Password ="password";
    private static final String QUERY_CREATE_TABLE_LOGIN_CREDENTIALS_INFO=CREATE+TABLE_LOGIN_CREDENTIALS_INFO+
            "("+ COLUMN_LOGIN_CREDENTIALS_INFO_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "+ COLUMN_LOGIN_CREDENTIALS_INFO_UserId +" TEXT NOT NULL UNIQUE ,"+
            COLUMN_LOGIN_CREDENTIALS_INFO_Password +" TEXT)";
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create project_info
    private static final String TABLE_PROJECT_INFO="project_info";
    private static final String COLUMN_PROJECT_INFO_ID="_id";
    private static final String COLUMN_PROJECT_INFO_PROJECT_NAME="project_Name";
    private static final String COLUMN_PROJECT_INFO_LEADER_NAME="leader_Name";
    private static final String COLUMN_PROJECT_INFO_COMPANY="_idCompany";
    private static final String COLUMN_PROJECT_INFO_DEPARTMENT="_idDepartment";
    private static final String COLUMN_PROJECT_INFO_MILESTONE_DATE="milestone_date";
    private static final String COLUMN_PROJECT_INFO_END_DATE="end_date";
    private static final String COLUMN_PROJECT_INFO_ACTUAL_START_DATE="actualStart_date";
    private static final String COLUMN_PROJECT_INFO_CHECK_DATE="check_date";

    /*


CREATE TABLE project_info5 (
    _id   INTEGER PRIMARY KEY,
    supplier_name TEXT    NOT NULL,
    _idCompany  INTEGER NOT NULL,
	 _idDepartment  INTEGER NOT NULL,
    FOREIGN KEY (_idCompany) REFERENCES company_info (_idCompany),
	  FOREIGN KEY (_idDepartment) REFERENCES department_info (_idCompany)
);

     */


    private static final String QUERY_CREATE_TABLE_PROJECT_INFO=CREATE+TABLE_PROJECT_INFO+
            "("+COLUMN_PROJECT_INFO_ID+" INTEGER PRIMARY KEY, "+COLUMN_PROJECT_INFO_PROJECT_NAME+" TEXT NOT NULL UNIQUE, "+
            COLUMN_PROJECT_INFO_LEADER_NAME+" TEXT NOT NULL, " +

            COLUMN_PROJECT_INFO_COMPANY+" INTEGER NOT NULL,"+
            COLUMN_PROJECT_INFO_DEPARTMENT+" INTEGER NOT NULL, "+

            COLUMN_PROJECT_INFO_MILESTONE_DATE+" TEXT NOT NULL, "
            +COLUMN_PROJECT_INFO_END_DATE+" TEXT NOT NULL, "+COLUMN_PROJECT_INFO_ACTUAL_START_DATE+" TEXT NOT NULL, "+
            COLUMN_PROJECT_INFO_CHECK_DATE+" TEXT NOT NULL, "+"FOREIGN KEY ( "+COLUMN_PROJECT_INFO_COMPANY+" ) REFERENCES "+
    TABLE_COMPANY+" ( "+COLUMN_COMPANY_ID+" ), "+" FOREIGN KEY ( "+COLUMN_PROJECT_INFO_DEPARTMENT+" ) REFERENCES "+
    TABLE_DEPARTMENT+" ( "+COLUMN_DEPARTMENT_ID+")) ";
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create project_planning_info
    private static final String TABLE_PROJECT_PLANING_INFO="planing_phase_info";

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create project_execution_info
    private static final String TABLE_PROJECT_EXECUTION_INFO="execution_phase_info";
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create project_analysis_info
    private static final String TABLE_PROJECT_ANALYSIS_INFO="analysis_info";
    private static final String COLUMN_PROJECT_ANALYSIS_INFO_ID="_id";
    private static final String COLUMN_PROJECT_ANALYSIS_INFO_CC="cc";
    private static final String COLUMN_PROJECT_ANALYSIS_INFO_PB="pb";
    private static final String COLUMN_PROJECT_ANALYSIS_INFO_PRIORITY="priority";
    private static final String COLUMN_PROJECT_ANALYSIS_INFO_REMAINING_WAIT="remaining_wait";
    private static final String COLUMN_PROJECT_ANALYSIS_INFO_STATUS="status";
    private static final String COLUMN_PROJECT_ANALYSIS_INFO_SCHEDULED_START_DATE="scheduled_start";

    public static final String QUERY_CREATE_TABLE_PROJECT_ANALYSIS_INFO=CREATE+TABLE_PROJECT_ANALYSIS_INFO+
            "("+COLUMN_PROJECT_ANALYSIS_INFO_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+COLUMN_PROJECT_ANALYSIS_INFO_CC+" INTEGER NOT NULL, "
            +COLUMN_PROJECT_ANALYSIS_INFO_PB+" INTEGER NOT NULL, "+COLUMN_PROJECT_ANALYSIS_INFO_PRIORITY+" INTEGER NOT NULL, "+
            COLUMN_PROJECT_ANALYSIS_INFO_REMAINING_WAIT+" INTEGER NOT NULL, "+COLUMN_PROJECT_ANALYSIS_INFO_STATUS+" TEXT NOT NULL, "+
            COLUMN_PROJECT_ANALYSIS_INFO_SCHEDULED_START_DATE+" TEXT NOT NULL)";

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////


    public boolean createTable(){
        try(Statement statement= conn.createStatement();){

            statement.execute(QUERY_CREATE_TABLE_COMPANY);
            statement.execute(QUERY_CREATE_TABLE_DEPARTMENT);
            statement.execute(QUERY_CREATE_TABLE_USER_LOGIN_INFO);
            statement.execute(QUERY_CREATE_TABLE_LOGIN_CREDENTIALS_INFO);
            statement.execute(QUERY_CREATE_TABLE_PROJECT_INFO);
            statement.execute(QUERY_CREATE_TABLE_PROJECT_ANALYSIS_INFO);
//statement.execute("PRAGMA foreign_keys = ON;");
            System.out.println(" sql to create database -");
            System.out.println("---> "+QUERY_CREATE_TABLE_COMPANY);
            System.out.println("---> "+QUERY_CREATE_TABLE_DEPARTMENT);
            System.out.println("---> "+QUERY_CREATE_TABLE_USER_LOGIN_INFO);
            System.out.println("---> "+QUERY_CREATE_TABLE_LOGIN_CREDENTIALS_INFO);
            System.out.println("---> "+QUERY_CREATE_TABLE_PROJECT_INFO);
            System.out.println("---> "+QUERY_CREATE_TABLE_PROJECT_ANALYSIS_INFO);
            return true;
        }catch(SQLException e){
            System.out.println("Error while creating a nw table is- "+e.getMessage());
            return false;
        }


    }
//must happen when ever logged in

    public void addDataIntoTable(){

    }

    public void deleteFromTable(){

    }

    public void updateTable(){

    }
    //add data
    //delete data
    //update data
    //
}
