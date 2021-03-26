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

    public static final String DATABASE_NAME="Master_Project_Info.db";
    public static final String CONNECTION="jdbc:sqlite:"+DATABASE_NAME;

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
    public static final String TABLE_COMPANY="company_info";
    public static final String COLUMN_COMPANY_ID="_id";
    public static final String COLUMN_COMPANY_NAME="name";
    public static final String CREATE="CREATE TABLE IF NOT EXISTS ";
    public static final String QUERY_CREATE_TABLE_COMPANY=CREATE+TABLE_COMPANY+
            "("+COLUMN_COMPANY_ID+" INTEGER PRIMARY KEY, "+COLUMN_COMPANY_NAME+" TEXT NOT NULL)";
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create department table
    public static final String TABLE_DEPARTMENT="department_info";
    public static final String COLUMN_DEPARTMENT_ID="_id";
    public static final String COLUMN_DEPARTMENT_NAME="name";
    public static final String QUERY_CREATE_TABLE_DEPARTMENT=CREATE+TABLE_DEPARTMENT+
            "("+COLUMN_DEPARTMENT_ID+" INTEGER PRIMARY KEY, "+COLUMN_DEPARTMENT_NAME+" TEXT NOT NULL)";
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create userLoginInfoTable
    public static final String TABLE_USER_LOGIN_INFO="user_login_info";
    public static final String COLUMN_USER_LOGIN_INFO_ID="_id";
    public static final String COLUMN_USER_LOGIN_INFO_FIRST_NAME="firstName";
    public static final String COLUMN_USER_LOGIN_INFO_LAST_NAME="lastName";
    public static final String COLUMN_USER_LOGIN_INFO_EMAIL="emailId";
    public static final String COLUMN_USER_LOGIN_INFO_GENDER="gender";
    public static final String COLUMN_USER_LOGIN_INFO_COMPANY="company";
    public static final String QUERY_CREATE_TABLE_USER_LOGIN_INFO=CREATE+TABLE_USER_LOGIN_INFO+
            "("+COLUMN_USER_LOGIN_INFO_ID+" INTEGER PRIMARY KEY, "+COLUMN_USER_LOGIN_INFO_FIRST_NAME+" TEXT NOT NULL,"+
            COLUMN_USER_LOGIN_INFO_LAST_NAME+" TEXT NOT NULL,"+COLUMN_USER_LOGIN_INFO_EMAIL+" TEXT NOT NULL UNIQUE ,"+COLUMN_USER_LOGIN_INFO_GENDER
            +" TEXT NOT NULL,"+COLUMN_USER_LOGIN_INFO_COMPANY+" INTEGER NOT NULL)";
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create login credentials table
    public static final String TABLE_LOGIN_CREDENTIALS_INFO="login_credentials";
    public static final String COLUMN_LOGIN_CREDENTIALS_INFO_ID ="_id";
    public static final String COLUMN_LOGIN_CREDENTIALS_INFO_UserId ="useId";
    public static final String COLUMN_LOGIN_CREDENTIALS_INFO_Password ="password";
    public static final String QUERY_CREATE_TABLE_LOGIN_CREDENTIALS_INFO=CREATE+TABLE_LOGIN_CREDENTIALS_INFO+
            "("+ COLUMN_LOGIN_CREDENTIALS_INFO_ID +" INTEGER PRIMARY KEY, "+ COLUMN_LOGIN_CREDENTIALS_INFO_UserId +" TEXT NOT NULL UNIQUE ,"+
            COLUMN_LOGIN_CREDENTIALS_INFO_Password +" TEXT)";
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create project_info
    public static final String TABLE_PROJECT_INFO="project_info";
    public static final String COLUMN_PROJECT_INFO_ID="_id";
    public static final String COLUMN_PROJECT_INFO_PROJECT_NAME="project_Name";
    public static final String COLUMN_PROJECT_INFO_LEADER_NAME="leader_Name";
    public static final String COLUMN_PROJECT_INFO_COMPANY="company";
    public static final String COLUMN_PROJECT_INFO_DEPARTMENT="department";
    public static final String COLUMN_PROJECT_INFO_MILESTONE_DATE="milestone_date";
    public static final String COLUMN_PROJECT_INFO_END_DATE="end_date";
    public static final String COLUMN_PROJECT_INFO_ACTUAL_START_DATE="actualStart_date";
    public static final String COLUMN_PROJECT_INFO_CHECK_DATE="check_date";
    public static final String QUERY_CREATE_TABLE_PROJECT_INFO=CREATE+TABLE_PROJECT_INFO+
            "("+COLUMN_PROJECT_INFO_ID+" INTEGER PRIMARY KEY, "+COLUMN_PROJECT_INFO_PROJECT_NAME+" TEXT NOT NULL UNIQUE, "+
            COLUMN_PROJECT_INFO_LEADER_NAME+" TEXT NOT NULL, " +COLUMN_PROJECT_INFO_COMPANY+" INTEGER NOT NULL, "+
            COLUMN_PROJECT_INFO_DEPARTMENT+" INTEGER NOT NULL, "+COLUMN_PROJECT_INFO_MILESTONE_DATE+" TEXT NOT NULL, "
            +COLUMN_PROJECT_INFO_END_DATE+" TEXT NOT NULL, "+COLUMN_PROJECT_INFO_ACTUAL_START_DATE+" TEXT NOT NULL, "+
            COLUMN_PROJECT_INFO_CHECK_DATE+" TEXT NOT NULL)";
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create project_planning_info
    public static final String TABLE_PROJECT_PLANING_INFO="planing_phase_info";

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create project_execution_info
    public static final String TABLE_PROJECT_EXECUTION_INFO="execution_phase_info";
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create project_analysis_info
    public static final String TABLE_PROJECT_ANALYSIS_INFO="analysis_info";
    public static final String COLUMN_PROJECT_ANALYSIS_INFO_ID="";
    public static final String COLUMN_PROJECT_ANALYSIS_INFO_CC="";
    public static final String COLUMN_PROJECT_ANALYSIS_INFO_PB="";
    public static final String COLUMN_PROJECT_ANALYSIS_INFO_PRIORITY="";
    public static final String COLUMN_PROJECT_ANALYSIS_INFO_REMAINING_WAIT="";
    public static final String COLUMN_PROJECT_ANALYSIS_INFO_STATUS="";
    public static final String COLUMN_PROJECT_ANALYSIS_INFO_SCHEDULED_START_DATE="";


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////


    public boolean createTable(){
        try(Statement statement= conn.createStatement();){

            statement.execute(QUERY_CREATE_TABLE_COMPANY);
            statement.execute(QUERY_CREATE_TABLE_DEPARTMENT);
            statement.execute(QUERY_CREATE_TABLE_USER_LOGIN_INFO);
            statement.execute(QUERY_CREATE_TABLE_LOGIN_CREDENTIALS_INFO);
            statement.execute(QUERY_CREATE_TABLE_PROJECT_INFO);
            System.out.println(" sql to create database -");
            System.out.println("---> "+QUERY_CREATE_TABLE_COMPANY);
            System.out.println("---> "+QUERY_CREATE_TABLE_DEPARTMENT);
            System.out.println("---> "+QUERY_CREATE_TABLE_USER_LOGIN_INFO);
            System.out.println("---> "+QUERY_CREATE_TABLE_LOGIN_CREDENTIALS_INFO);
            System.out.println("---> "+QUERY_CREATE_TABLE_PROJECT_INFO);
            return true;
        }catch(SQLException e){
            System.out.println("Error while creating a nw table is- "+e.getMessage());
            return false;
        }


    }

    //add data
    //delete data
    //update data
    //
}
