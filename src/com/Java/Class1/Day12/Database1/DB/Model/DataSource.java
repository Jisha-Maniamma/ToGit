package com.Java.Class1.Day12.Database1.DB.Model;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/25 14:52
 */
public class DataSource {
    private static final LocalDateTime TODAYS_DATE=LocalDateTime.now();
    private static final LocalDate TODAYS_DATE_ONLY=LocalDate.now();
    DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");

    //    public static  String FirstName;
//public static  String LastName="maniammaPillai";
//    public static  String departmentName="IT";
//    public static final String DATABASE_NAME=setDatabaseName();
//
//
//
//    public static String setDatabaseName() {
//     getFirstName();
//        return "Master_Project_Info_"+FirstName+"_"+LastName+"_"+departmentName+".db";
//        //set(DATABASE_NAME,fileName);
//    }
//    public static String getFirstName() {
//       return FirstName="Jisha";
//    }
//
//
//    //="Master_Project_Info_v8.db";
    private String CONNECTION = getCONNECTION();

    public void setCONNECTION(String First_Name, String Last_Name, String Department_Name) {
        CONNECTION = "jdbc:sqlite:" + First_Name + "_" + Last_Name + "_" + Department_Name + ".db";
    }

    public String getCONNECTION() {
        return CONNECTION;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //CREATE TABLE IF NOT EXISTS company( _id INTEGER, name TEXT)
    private static final String TABLE_COMPANY = "company_info";
    private static final String COLUMN_COMPANY_ID = "_idCompany";
    private static final String COLUMN_COMPANY_NAME = "name";
    private static final String CREATE = "CREATE TABLE IF NOT EXISTS ";
    private static final String CREATE_TABLE_COMPANY = CREATE + TABLE_COMPANY +
            "(" + COLUMN_COMPANY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_COMPANY_NAME + " TEXT NOT NULL UNIQUE)";



    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    //CREATE TABLE DEPARTMENT HOLIDAY DATABASE

    private static final String TABLE="";




    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create department table
    private static final String TABLE_DEPARTMENT = "department_info";
    private static final String COLUMN_DEPARTMENT_ID = "_idDepartment";
    private static final String COLUMN_DEPARTMENT_NAME = "name";
    private static final String CREATE_TABLE_DEPARTMENT = CREATE + TABLE_DEPARTMENT +
            "(" + COLUMN_DEPARTMENT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_DEPARTMENT_NAME + " TEXT NOT NULL UNIQUE)";

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create userLoginInfoTable
    private static final String TABLE_USER_LOGIN_INFO = "user_login_info";
    private static final String COLUMN_USER_LOGIN_INFO_ID = "_id";
    private static final String COLUMN_USER_LOGIN_INFO_FIRST_NAME = "firstName";
    private static final String COLUMN_USER_LOGIN_INFO_LAST_NAME = "lastName";
    private static final String COLUMN_USER_LOGIN_INFO_EMAIL = "emailId";
    private static final String COLUMN_USER_LOGIN_INFO_GENDER = "gender";
    private static final String COLUMN_USER_LOGIN_INFO_COMPANY = "company";
    private static final String COLUMN_USER_LOGIN_INFO_LAST_LOGIN="last_login";
    private static final String COLUMN_USER_LOGIN_INFO_LAST_WEIGHT_UPDATE="last_weight_update";
    private static final String COLUMN_USER_LOGIN_INFO_LAST_PROJECT_DATA_CHANGED="last_project_data_change";


    //"FOREIGN KEY ( "+COLUMN_PROJECT_INFO_COMPANY+" ) REFERENCES "+
    ////            TABLE_COMPANY+" ( "+COLUMN_COMPANY_ID+" ), "+"
    //           +COLUMN_USER_LOGIN_INFO_COMPANY+" INTEGER NOT NULL)";
    // /////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create login credentials table
    // private static final String TABLE_LOGIN_CREDENTIALS_INFO="login_credentials";
    //  private static final String COLUMN_LOGIN_CREDENTIALS_INFO_ID ="_id";
    private static final String COLUMN_USER_LOGIN_INFO_UserId = "userId";
    private static final String COLUMN_USER_LOGIN_INFO_Password = "password";
    public static final String COLUMN_USER_LOGIN_INFO_DOB = "dob";
//    private static final String CREATE_TABLE_LOGIN_CREDENTIALS_INFO=CREATE+TABLE_LOGIN_CREDENTIALS_INFO+
//            "("+ COLUMN_LOGIN_CREDENTIALS_INFO_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "+
//            COLUMN_LOGIN_CREDENTIALS_INFO_UserId +" TEXT NOT NULL UNIQUE ,"+
//            COLUMN_LOGIN_CREDENTIALS_INFO_Password +" TEXT,"+
//
//            "FOREIGN KEY ( "+COLUMN_LOGIN_CREDENTIALS_INFO_ID+" ) REFERENCES "+
//            TABLE_USER_LOGIN_INFO+" ( "+COLUMN_USER_LOGIN_INFO_ID+") ) ";

    private static final String CREATE_TABLE_USER_LOGIN_INFO = CREATE + TABLE_USER_LOGIN_INFO +
            "(" + COLUMN_USER_LOGIN_INFO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_USER_LOGIN_INFO_FIRST_NAME + " TEXT NOT NULL," +
            COLUMN_USER_LOGIN_INFO_LAST_NAME + " TEXT NOT NULL," + COLUMN_USER_LOGIN_INFO_EMAIL + " TEXT NOT NULL UNIQUE ," + COLUMN_USER_LOGIN_INFO_GENDER
            + " TEXT NOT NULL," + COLUMN_USER_LOGIN_INFO_COMPANY + " INTEGER NOT NULL," + COLUMN_USER_LOGIN_INFO_DOB + " TEXT NOT NULL," +
            COLUMN_USER_LOGIN_INFO_UserId + " TEXT NOT NULL  ," +
            COLUMN_USER_LOGIN_INFO_LAST_LOGIN + " TEXT   ," +

            COLUMN_USER_LOGIN_INFO_LAST_WEIGHT_UPDATE + " TEXT  ,"+

            COLUMN_USER_LOGIN_INFO_Password + " TEXT, FOREIGN KEY (" + COLUMN_USER_LOGIN_INFO_COMPANY + ") REFERENCES " +
            TABLE_COMPANY + " ( " + COLUMN_COMPANY_ID + " )) ";
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create leader_table
    public static final String TABLE_LEADERS = "Project_Leaders";
    public static final String COLUMN_TABLE_LEADERS_ID = "_id";
    public static final String COLUMN_TABLE_LEADERS_NAME = "leaders_name";

    public static final String CREATE_TABLE_LEADERS = CREATE + TABLE_LEADERS + " (" + COLUMN_TABLE_LEADERS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            COLUMN_TABLE_LEADERS_NAME + " TEXT NOT NULL UNIQUE)";

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create project_info
    private static final String TABLE_PROJECT_INFO = "project_info";
    private static final String COLUMN_PROJECT_INFO_ID = "_id";
    private static final String COLUMN_PROJECT_INFO_PROJECT_NAME = "project_Name";
    private static final String COLUMN_PROJECT_INFO_LEADER_NAME = "_id_leader_Name";
    private static final String COLUMN_PROJECT_INFO_COMPANY = "_idCompany";
    private static final String COLUMN_PROJECT_INFO_DEPARTMENT = "_idDepartment";
    private static final String COLUMN_PROJECT_INFO_MILESTONE_DATE = "milestone_date";
    private static final String COLUMN_PROJECT_INFO_END_DATE = "end_date";
    private static final String COLUMN_PROJECT_INFO_ACTUAL_START_DATE = "actualStart_date";
    private static final String COLUMN_PROJECT_INFO_CHECK_DATE = "check_date";
    public static final String COLUMN_PROJECT_INFO_ABOUT_PROJECT = "about_Project";

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


    private static final String CREATE_TABLE_PROJECT_INFO = CREATE + TABLE_PROJECT_INFO +
            "(" + COLUMN_PROJECT_INFO_ID + " TEXT PRIMARY KEY, " + COLUMN_PROJECT_INFO_PROJECT_NAME + " TEXT NOT NULL UNIQUE, " +
            COLUMN_PROJECT_INFO_LEADER_NAME + " INTEGER NOT NULL, " +

            COLUMN_PROJECT_INFO_COMPANY + " INTEGER NOT NULL," +
            COLUMN_PROJECT_INFO_DEPARTMENT + " INTEGER NOT NULL, "  +
            COLUMN_USER_LOGIN_INFO_LAST_PROJECT_DATA_CHANGED + " TEXT  ," +

            COLUMN_PROJECT_INFO_MILESTONE_DATE + " TEXT , "
            + COLUMN_PROJECT_INFO_END_DATE + " TEXT , " + COLUMN_PROJECT_INFO_ACTUAL_START_DATE + " TEXT , " +
            COLUMN_PROJECT_INFO_CHECK_DATE + " TEXT , " +
            COLUMN_PROJECT_INFO_ABOUT_PROJECT + " TEXT , " +

            "FOREIGN KEY ( " + COLUMN_PROJECT_INFO_COMPANY + " ) REFERENCES " + TABLE_COMPANY + " ( " + COLUMN_COMPANY_ID + " ), " +
            "FOREIGN KEY ( " + COLUMN_PROJECT_INFO_LEADER_NAME + " ) REFERENCES " + TABLE_LEADERS + " ( " + COLUMN_TABLE_LEADERS_ID + " ), " +
            " FOREIGN KEY ( " + COLUMN_PROJECT_INFO_DEPARTMENT + " ) REFERENCES " + TABLE_DEPARTMENT + " ( " + COLUMN_DEPARTMENT_ID + ")) ";
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create project_planning_info

    private static final String TABLE_PROJECT_PLANNING_INFO = "planning_phase_info";
    public static final String COLUMN_PROJECT_PlANNING_INFO_ID = "_id";
    public static final String COLUMN_PROJECT_PlANNING_INFO_WAIT_CRITERIA = "wait_criteria";
    public static final String COLUMN_PROJECT_PlANNING_INFO_TASK_CRITERIA = "task_criteria";
    public static final String COLUMN_PROJECT_PlANNING_INFO_TASK1 = "Task_planning1";
    public static final String COLUMN_PROJECT_PlANNING_INFO_TASK2 = "Task_planning2";
    public static final String COLUMN_PROJECT_PlANNING_INFO_TASK3 = "Task_planning3";
    public static final String COLUMN_PROJECT_PlANNING_INFO_TASK4 = "Task_planning4";
    public static final String COLUMN_PROJECT_PlANNING_INFO_TASK5 = "Task_planning5";
    public static final String COLUMN_PROJECT_PlANNING_INFO_TASK6 = "Task_planning6";
    public static final String COLUMN_PROJECT_PlANNING_INFO_TASK7 = "Task_planning7";
    public static final String COLUMN_PROJECT_PlANNING_INFO_TASK8 = "Task_planning8";
    public static final String COLUMN_PROJECT_PlANNING_INFO_TASK9 = "Task_planning9";
    public static final String COLUMN_PROJECT_PlANNING_INFO_TASK10 = "Task_planning10";
    public static final String COLUMN_PROJECT_PlANNING_INFO_TASK11 = "Task_planning11";
    public static final String COLUMN_PROJECT_PlANNING_INFO_TASK12 = "Task_planning12";
    public static final String COLUMN_PROJECT_PlANNING_INFO_WAIT1 = "Wait_planning1";
    public static final String COLUMN_PROJECT_PlANNING_INFO_WAIT2 = "Wait_planning2";
    public static final String COLUMN_PROJECT_PlANNING_INFO_WAIT3 = "Wait_planning3";
    public static final String COLUMN_PROJECT_PlANNING_INFO_WAIT4 = "Wait_planning4";
    public static final String COLUMN_PROJECT_PlANNING_INFO_WAIT5 = "Wait_planning5";
    public static final String COLUMN_PROJECT_PlANNING_INFO_WAIT6 = "Wait_planning6";
    public static final String COLUMN_PROJECT_PlANNING_INFO_WAIT7 = "Wait_planning7";
    public static final String COLUMN_PROJECT_PlANNING_INFO_WAIT8 = "Wait_planning8";
    public static final String COLUMN_PROJECT_PlANNING_INFO_WAIT9 = "Wait_planning9";
    public static final String COLUMN_PROJECT_PlANNING_INFO_WAIT10 = "Wait_planning10";
    public static final String COLUMN_PROJECT_PlANNING_INFO_WAIT11 = "Wait_planning11";
    public static final String COLUMN_PROJECT_PlANNING_INFO_WAIT12 = "Wait_planning12";
    public static final String COLUMN_PROJECT_PlANNING_INFO_RESOURCE1 = "Resource_planning1";
    public static final String COLUMN_PROJECT_PlANNING_INFO_RESOURCE2 = "Resource_planning2";
    public static final String COLUMN_PROJECT_PlANNING_INFO_RESOURCE3 = "Resource_planning3";
    public static final String COLUMN_PROJECT_PlANNING_INFO_RESOURCE4 = "Resource_planning4";
    public static final String COLUMN_PROJECT_PlANNING_INFO_RESOURCE5 = "Resource_planning5";
    public static final String COLUMN_PROJECT_PlANNING_INFO_RESOURCE6 = "Resource_planning6";
    public static final String COLUMN_PROJECT_PlANNING_INFO_RESOURCE7 = "Resource_planning7";
    public static final String COLUMN_PROJECT_PlANNING_INFO_RESOURCE8 = "Resource_planning8";
    public static final String COLUMN_PROJECT_PlANNING_INFO_RESOURCE9 = "Resource_planning9";
    public static final String COLUMN_PROJECT_PlANNING_INFO_RESOURCE10 = "Resource_planning10";
    public static final String COLUMN_PROJECT_PlANNING_INFO_RESOURCE11 = "Resource_planning11";
    public static final String COLUMN_PROJECT_PlANNING_INFO_RESOURCE12 = "Resource_planning12";
    public static final String COLUMN_PROJECT_PlANNING_INFO_BUFFER_SIZE = "planning_buffer_Size";
    public static final String COLUMN_PROJECT_PlANNING_INFO_CC_WITH_WEIGHT = "planned_cc_without_weight";
    public static final String COLUMN_PROJECT_PlANNING_INFO_CC_WITHOUT_WEIGHT = "planned_cc_with_weight";

// private static final String CREATE_TABLE_PROJECT_INFO=CREATE+TABLE_PROJECT_INFO+
//            "("+COLUMN_PROJECT_INFO_ID+" INTEGER PRIMARY KEY, "+COLUMN_PROJECT_INFO_PROJECT_NAME+" TEXT NOT NULL UNIQUE, "+
//            COLUMN_PROJECT_INFO_LEADER_NAME+" TEXT NOT NULL, " +
//
//            COLUMN_PROJECT_INFO_COMPANY+" INTEGER NOT NULL,"+
//            COLUMN_PROJECT_INFO_DEPARTMENT+" INTEGER NOT NULL, "+
//
//            COLUMN_PROJECT_INFO_MILESTONE_DATE+" TEXT NOT NULL, "
//            +COLUMN_PROJECT_INFO_END_DATE+" TEXT NOT NULL, "+COLUMN_PROJECT_INFO_ACTUAL_START_DATE+" TEXT NOT NULL, "+
//            COLUMN_PROJECT_INFO_CHECK_DATE+" TEXT NOT NULL, "+
//
//            "FOREIGN KEY ( "+COLUMN_PROJECT_INFO_COMPANY+" ) REFERENCES "+
//            TABLE_COMPANY+" ( "+COLUMN_COMPANY_ID+" ), "+" FOREIGN KEY ( "+COLUMN_PROJECT_INFO_DEPARTMENT+" ) REFERENCES "+
//            TABLE_DEPARTMENT+" ( "+COLUMN_DEPARTMENT_ID+")) ";

    public static final String CREATE_TABLE_PLANNING_PHASE = CREATE + TABLE_PROJECT_PLANNING_INFO + "(" + COLUMN_PROJECT_PlANNING_INFO_ID + " TEXT NOT NULL UNIQUE ," + COLUMN_PROJECT_PlANNING_INFO_WAIT_CRITERIA + " TEXT ," +
            COLUMN_PROJECT_PlANNING_INFO_TASK_CRITERIA + " TEXT ," + COLUMN_PROJECT_PlANNING_INFO_TASK1 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_TASK2 + " REAL," +
            COLUMN_PROJECT_PlANNING_INFO_TASK3 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_TASK4 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_TASK5 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_TASK6 + " REAL," +
            COLUMN_PROJECT_PlANNING_INFO_TASK7 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_TASK8 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_TASK9 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_TASK10 + " REAL,"
            + COLUMN_PROJECT_PlANNING_INFO_TASK11 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_TASK12 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_WAIT1 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_WAIT2 + " REAL," +
            COLUMN_PROJECT_PlANNING_INFO_WAIT3 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_WAIT4 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_WAIT5 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_WAIT6 +
            " REAL," + COLUMN_PROJECT_PlANNING_INFO_WAIT7 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_WAIT8 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_WAIT9 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_WAIT10 + " REAL," +
            COLUMN_PROJECT_PlANNING_INFO_WAIT11 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_WAIT12 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE1 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE2 + " REAL," +
            COLUMN_PROJECT_PlANNING_INFO_RESOURCE3 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE4 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE5 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE6
            + " REAL," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE7 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE8 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE9 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE10 + " REAL," +
            COLUMN_PROJECT_PlANNING_INFO_RESOURCE11 + " REAL," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE12 + " REAL," + " FOREIGN KEY (" + COLUMN_PROJECT_PlANNING_INFO_ID + ") REFERENCES " + TABLE_PROJECT_INFO + " (" + COLUMN_PROJECT_INFO_ID + "))";

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create project_execution_info
    private static final String TABLE_PROJECT_EXECUTION_INFO = "execution_phase_info";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_ID = "_id";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_CURRENT_TASK = "current_task";

    public static final String COLUMN_PROJECT_EXECUTION_INFO_TASK1 = "Task_Execution1";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_TASK2 = "Task_Execution2";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_TASK3 = "Task_Execution3";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_TASK4 = "Task_Execution4";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_TASK5 = "Task_Execution5";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_TASK6 = "Task_Execution6";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_TASK7 = "Task_Execution7";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_TASK8 = "Task_Execution8";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_TASK9 = "Task_Execution9";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_TASK10 = "Task_Execution10";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_TASK11 = "Task_Execution11";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_TASK12 = "Task_Execution12";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_WAIT1 = "Wait_Execution1";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_WAIT2 = "Wait_Execution2";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_WAIT3 = "Wait_Execution3";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_WAIT4 = "Wait_Execution4";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_WAIT5 = "Wait_Execution5";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_WAIT6 = "Wait_Execution6";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_WAIT7 = "Wait_Execution7";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_WAIT8 = "Wait_Execution8";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_WAIT9 = "Wait_Execution9";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_WAIT10 = "Wait_Execution10";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_WAIT11 = "Wait_Execution11";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_WAIT12 = "Wait_Execution12";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_RESOURCE1 = "Resource_Execution1";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_RESOURCE2 = "Resource_Execution2";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_RESOURCE3 = "Resource_Execution3";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_RESOURCE4 = "Resource_Execution4";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_RESOURCE5 = "Resource_Execution5";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_RESOURCE6 = "Resource_Execution6";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_RESOURCE7 = "Resource_Execution7";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_RESOURCE8 = "Resource_Execution8";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_RESOURCE9 = "Resource_Execution9";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_RESOURCE10 = "Resource_Execution10";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_RESOURCE11 = "Resource_Execution11";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_RESOURCE12 = "Resource_Execution12";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK1 = "Input_availability_Task1";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK2 = "Input_availability_Task2";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK3 = "Input_availability_Task3";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK4 = "Input_availability_Task4";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK5 = "Input_availability_Task5";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK6 = "Input_availability_Task6";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK7 = "Input_availability_Task7";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK8 = "Input_availability_Task8";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK9 = "Input_availability_Task9";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK10 = "Input_availability_Task10";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK11 = "Input_availability_Task11";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK12 = "Input_availability_Task12";

    public static final String COLUMN_PROJECT_EXECUTION_INFO_CC_WITH_WEIGHT = "execution_cc_with_weight";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_CC_WITHOUT_WEIGHT = "execution_cc_without_weight";
    public static final String COLUMN_PROJECT_EXECUTION_INFO_BUFFER_CONSUMPTION_DAYS = "execution_buffer_days";


    public static final String CREATE_TABLE_EXECUTION_PHASE = CREATE + TABLE_PROJECT_EXECUTION_INFO + "(" + COLUMN_PROJECT_EXECUTION_INFO_ID + " TEXT NOT NULL UNIQUE," + COLUMN_PROJECT_EXECUTION_INFO_CURRENT_TASK + " TEXT ," +
            COLUMN_PROJECT_EXECUTION_INFO_TASK1 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_TASK2 + " REAL," +
            COLUMN_PROJECT_EXECUTION_INFO_TASK3 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_TASK4 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_TASK5 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_TASK6 + " REAL," +
            COLUMN_PROJECT_EXECUTION_INFO_TASK7 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_TASK8 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_TASK9 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_TASK10 + " REAL,"
            + COLUMN_PROJECT_EXECUTION_INFO_TASK11 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_TASK12 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_WAIT1 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_WAIT2 + " REAL," +
            COLUMN_PROJECT_EXECUTION_INFO_WAIT3 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_WAIT4 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_WAIT5 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_WAIT6 +
            " REAL," + COLUMN_PROJECT_EXECUTION_INFO_WAIT7 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_WAIT8 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_WAIT9 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_WAIT10 + " REAL," +
            COLUMN_PROJECT_EXECUTION_INFO_WAIT11 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_WAIT12 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE1 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE2 + " REAL," +
            COLUMN_PROJECT_EXECUTION_INFO_RESOURCE3 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE4 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE5 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE6
            + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE7 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE8 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE9 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE10 + " REAL," +
            COLUMN_PROJECT_EXECUTION_INFO_RESOURCE11 + " REAL," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE12 + " REAL,"
            + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK1 + " TEXT,"
            + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK2 + " TEXT,"
            + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK3 + " TEXT,"
            + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK4 + " TEXT,"
            + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK5 + " TEXT,"
            + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK6 + " TEXT,"
            + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK7 + " TEXT,"
            + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK8 + " TEXT,"
            + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK9 + " TEXT,"
            + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK10 + " TEXT,"
            + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK11 + " TEXT,"
            + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK12 + " TEXT,"
            + " FOREIGN KEY (" + COLUMN_PROJECT_EXECUTION_INFO_ID + ") REFERENCES " + TABLE_PROJECT_INFO + " (" + COLUMN_PROJECT_INFO_ID + "))";


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    //to create project_analysis_info
    private static final String TABLE_PROJECT_ANALYSIS_INFO = "analysis_info";
    private static final String COLUMN_PROJECT_ANALYSIS_INFO_ID = "_id";
    private static final String COLUMN_PROJECT_ANALYSIS_INFO_CC = "cc";
    private static final String COLUMN_PROJECT_ANALYSIS_INFO_PB = "pb";
    private static final String COLUMN_PROJECT_ANALYSIS_INFO_PRIORITY = "priority";
    private static final String COLUMN_PROJECT_ANALYSIS_INFO_REMAINING_WAIT = "remaining_wait";
    private static final String COLUMN_PROJECT_ANALYSIS_INFO_STATUS = "status";
    private static final String COLUMN_PROJECT_ANALYSIS_INFO_SCHEDULED_START_DATE = "scheduled_start";

    public static final String CREATE_TABLE_PROJECT_ANALYSIS_INFO = CREATE + TABLE_PROJECT_ANALYSIS_INFO +
            "(" + COLUMN_PROJECT_ANALYSIS_INFO_ID + " TEXT NOT NULL UNIQUE, " + COLUMN_PROJECT_ANALYSIS_INFO_CC + " REAL , "
            + COLUMN_PROJECT_ANALYSIS_INFO_PB + " REAL , " + COLUMN_PROJECT_ANALYSIS_INFO_PRIORITY + " REAL , " +
            COLUMN_PROJECT_ANALYSIS_INFO_REMAINING_WAIT + " REAL , " + COLUMN_PROJECT_ANALYSIS_INFO_STATUS + " TEXT , " +
            COLUMN_PROJECT_ANALYSIS_INFO_SCHEDULED_START_DATE + " TEXT ,"
            + COLUMN_PROJECT_EXECUTION_INFO_CC_WITH_WEIGHT + " REAL ," +
            COLUMN_PROJECT_EXECUTION_INFO_CC_WITHOUT_WEIGHT + " REAL ," +
            COLUMN_PROJECT_EXECUTION_INFO_BUFFER_CONSUMPTION_DAYS + " REAL ," +
            COLUMN_PROJECT_PlANNING_INFO_BUFFER_SIZE + " REAL ," +
            COLUMN_PROJECT_PlANNING_INFO_CC_WITHOUT_WEIGHT + " REAL ," +
            COLUMN_PROJECT_PlANNING_INFO_CC_WITH_WEIGHT + " REAL ,"
            + " FOREIGN KEY (" + COLUMN_PROJECT_ANALYSIS_INFO_ID + ") REFERENCES " +
            TABLE_PROJECT_INFO + " (" + COLUMN_PROJECT_INFO_ID + "))";

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    //CREATE VIEW All_Project_View AS SELECT project_info.project_Name,analysis_info.priority,execution_phase_info.current_task,
    // planning_phase_info.task_criteria,project_info.milestone_date,analysis_info.cc,analysis_info.pb,analysis_info.remaining_wait FROM
    // project_info INNER JOIN analysis_info ON project_info._id=analysis_info._id INNER JOIN planning_phase_info ON project_info._id=planning_phase_info._id
    // INNER JOIN execution_phase_info ON project_info._id=execution_phase_info._id INNER JOIN analysis_info ON project_info._id=analysis_info._id
    // ORDER BY project_info._id

    public static final String ALL_PROJECT_VIEW = "All_Project_View";
    public static final String CREATE_TABLE_VIEW_ALL_PROJECT_VIEW = "CREATE VIEW IF NOT EXISTS " + ALL_PROJECT_VIEW + " AS " +
            "SELECT " + TABLE_PROJECT_INFO + "." + COLUMN_PROJECT_INFO_PROJECT_NAME + "," + TABLE_PROJECT_ANALYSIS_INFO + "." + COLUMN_PROJECT_ANALYSIS_INFO_PRIORITY + "," +
            TABLE_PROJECT_EXECUTION_INFO + "." + COLUMN_PROJECT_EXECUTION_INFO_CURRENT_TASK + "," + TABLE_PROJECT_PLANNING_INFO + "." + COLUMN_PROJECT_PlANNING_INFO_TASK_CRITERIA + "," +
            TABLE_PROJECT_INFO + "." + COLUMN_PROJECT_INFO_MILESTONE_DATE + "," + TABLE_PROJECT_ANALYSIS_INFO + "." + COLUMN_PROJECT_ANALYSIS_INFO_CC + "," +
            TABLE_PROJECT_ANALYSIS_INFO + "." + COLUMN_PROJECT_ANALYSIS_INFO_PB + "," + TABLE_PROJECT_ANALYSIS_INFO + "." + COLUMN_PROJECT_ANALYSIS_INFO_REMAINING_WAIT +
            " FROM " + TABLE_PROJECT_INFO +
            " INNER JOIN " + TABLE_PROJECT_ANALYSIS_INFO + " ON " + TABLE_PROJECT_INFO + "." + COLUMN_PROJECT_INFO_ID + "=" + TABLE_PROJECT_ANALYSIS_INFO + "." +
            COLUMN_PROJECT_ANALYSIS_INFO_ID + " INNER JOIN " + TABLE_PROJECT_PLANNING_INFO + " ON " + TABLE_PROJECT_INFO + "." + COLUMN_PROJECT_INFO_ID + "=" +
            TABLE_PROJECT_PLANNING_INFO + "." + COLUMN_PROJECT_PlANNING_INFO_ID + " INNER JOIN " + TABLE_PROJECT_EXECUTION_INFO + " ON " + TABLE_PROJECT_INFO +
            "." + COLUMN_PROJECT_INFO_ID + "=" + TABLE_PROJECT_EXECUTION_INFO + "." + COLUMN_PROJECT_EXECUTION_INFO_ID
            + " ORDER BY " + TABLE_PROJECT_INFO + "." +
            COLUMN_PROJECT_INFO_ID;


    //select companynme from companytable where compnaytable.name=?
    public static final String QUERY_ID_OF_COMPANY = "SELECT " + COLUMN_COMPANY_ID + " FROM " +
            TABLE_COMPANY + " WHERE " + COLUMN_COMPANY_NAME + " LIKE ?";

    public static final String QUERY_ID_OF_DEPARTMENT = "SELECT " + COLUMN_DEPARTMENT_ID + " FROM " +
            TABLE_DEPARTMENT + " WHERE " + COLUMN_DEPARTMENT_NAME + " LIKE ?";

    public static final String QUERY_USER_LOGIN_INFO = "SELECT " + COLUMN_USER_LOGIN_INFO_ID + " FROM " +
            TABLE_USER_LOGIN_INFO + " WHERE " + COLUMN_USER_LOGIN_INFO_EMAIL + "=?";
    public static final String QUERY_USER_LOGIN_INFO1 = "SELECT " + COLUMN_USER_LOGIN_INFO_ID + " FROM " +
            TABLE_USER_LOGIN_INFO + " WHERE " + COLUMN_USER_LOGIN_INFO_UserId + "=?";

    private static final String QUERY_PASSWORD = "SELECT " + COLUMN_USER_LOGIN_INFO_Password +
            " FROM " + TABLE_USER_LOGIN_INFO + " WHERE " + COLUMN_USER_LOGIN_INFO_EMAIL + "=?";

    public static final String QUERY_LEADER = "SELECT " + COLUMN_TABLE_LEADERS_ID + " FROM " + TABLE_LEADERS + " WHERE " + COLUMN_TABLE_LEADERS_NAME + " LIKE ?";

    public static final String QUERY_PROJECT_INFO = "SELECT " + COLUMN_PROJECT_INFO_ID + " FROM " + TABLE_PROJECT_INFO + " WHERE " + COLUMN_PROJECT_INFO_ID +
            " LIKE ? or " + COLUMN_PROJECT_INFO_PROJECT_NAME + " LIKE ?";
    //public static final String QUERY_PROJECT_INFO="SELECT "+COLUMN_PROJECT_INFO_ID+" FROM "+TABLE_PROJECT_INFO+" WHERE "+COLUMN_PROJECT_INFO_ID+
    // " LIKE ? or "+COLUMN_PROJECT_INFO_PROJECT_NAME+" LIKE ?";

    //insert into company_info(name) values("aa");
    public static final String INSERT_INTO_COMPANY_TABLE = "INSERT INTO " + TABLE_COMPANY + " (" + COLUMN_COMPANY_NAME + ") VALUES (?)";
    public static final String INSERT_INTO_DEPARTMENT_TABLE = "INSERT INTO " + TABLE_DEPARTMENT + " (" + COLUMN_DEPARTMENT_NAME + ") VALUES (?)";

    public static final String INSERT_INTO_USER_LOGIN_TABLE = "INSERT INTO " + TABLE_USER_LOGIN_INFO + " (" + COLUMN_USER_LOGIN_INFO_FIRST_NAME + "," +
            COLUMN_USER_LOGIN_INFO_LAST_NAME + "," + COLUMN_USER_LOGIN_INFO_EMAIL + "," + COLUMN_USER_LOGIN_INFO_GENDER + "," + COLUMN_USER_LOGIN_INFO_COMPANY + "," +
            COLUMN_USER_LOGIN_INFO_DOB + "," + COLUMN_USER_LOGIN_INFO_UserId + "," + COLUMN_USER_LOGIN_INFO_Password + "," + COLUMN_USER_LOGIN_INFO_LAST_LOGIN+ ") VALUES  (?,?,?,?,?,?,?,?,?)";

    public static final String INSERT_INTO_PROJECT_INFO_TABLE = "INSERT INTO " + TABLE_PROJECT_INFO + "(" + COLUMN_PROJECT_INFO_ID + "," +
            COLUMN_PROJECT_INFO_PROJECT_NAME + "," + COLUMN_PROJECT_INFO_LEADER_NAME + "," +
            COLUMN_PROJECT_INFO_COMPANY + "," + COLUMN_PROJECT_INFO_DEPARTMENT + "," + COLUMN_PROJECT_INFO_MILESTONE_DATE + "," +
            COLUMN_PROJECT_INFO_END_DATE + "," + COLUMN_PROJECT_INFO_ACTUAL_START_DATE + "," +
            COLUMN_PROJECT_INFO_CHECK_DATE + "," + COLUMN_PROJECT_INFO_ABOUT_PROJECT + ") VALUES (?,?,?,?,?,?,?,?,?,?)";


    // public static final String CREATE_TABLE_PLANNING_PHASE=CREATE+TABLE_PROJECT_PLANNING_INFO+
    // "("+COLUMN_PROJECT_PlANNING_INFO_ID+" TEXT NOT NULL UNIQUE,"+
    // COLUMN_PROJECT_PlANNING_INFO_WAIT_CRITERIA+" TEXT NOT NULL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_TASK_CRITERIA+" TEXT NOT NULL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_TASK1+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_TASK2+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_TASK3+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_TASK4+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_TASK5+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_TASK6+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_TASK7+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_TASK8+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_TASK9+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_TASK10+" REAL,"
    //            +COLUMN_PROJECT_PlANNING_INFO_TASK11+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_TASK12+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_WAIT1+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_WAIT2+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_WAIT3+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_WAIT4+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_WAIT5+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_WAIT6+ " REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_WAIT7+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_WAIT8+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_WAIT9+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_WAIT10+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_WAIT11+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_WAIT12+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_RESOURCE1+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_RESOURCE2+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_RESOURCE3+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_RESOURCE4+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_RESOURCE5+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_RESOURCE6+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_RESOURCE7+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_RESOURCE8+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_RESOURCE9+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_RESOURCE10+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_RESOURCE11+" REAL,"+
    //            COLUMN_PROJECT_PlANNING_INFO_RESOURCE12+" REAL,"+
    //            " FOREIGN KEY ("+COLUMN_PROJECT_PlANNING_INFO_ID+") REFERENCES "+TABLE_PROJECT_INFO+ " ("+COLUMN_PROJECT_INFO_ID+"))";
    public static final String INSERT_INTO_PlANNING_INFO_TABLE = "INSERT INTO " +
            TABLE_PROJECT_PLANNING_INFO + " (" +
            COLUMN_PROJECT_PlANNING_INFO_ID + "," +
            COLUMN_PROJECT_PlANNING_INFO_WAIT_CRITERIA + "," +
            COLUMN_PROJECT_PlANNING_INFO_TASK_CRITERIA + "," +
            COLUMN_PROJECT_PlANNING_INFO_TASK1 + "," +
            COLUMN_PROJECT_PlANNING_INFO_TASK2 + "," + COLUMN_PROJECT_PlANNING_INFO_TASK3 + "," +
            COLUMN_PROJECT_PlANNING_INFO_TASK4 + "," + COLUMN_PROJECT_PlANNING_INFO_TASK5 + "," +
            COLUMN_PROJECT_PlANNING_INFO_TASK6 + "," + COLUMN_PROJECT_PlANNING_INFO_TASK7 + "," +
            COLUMN_PROJECT_PlANNING_INFO_TASK8 + "," + COLUMN_PROJECT_PlANNING_INFO_TASK9 + "," +
            COLUMN_PROJECT_PlANNING_INFO_TASK10 + "," + COLUMN_PROJECT_PlANNING_INFO_TASK11 + "," +
            COLUMN_PROJECT_PlANNING_INFO_TASK12 + "," +

            COLUMN_PROJECT_PlANNING_INFO_WAIT1 + "," +
            COLUMN_PROJECT_PlANNING_INFO_WAIT2 + "," + COLUMN_PROJECT_PlANNING_INFO_WAIT3 + "," +
            COLUMN_PROJECT_PlANNING_INFO_WAIT4 + "," + COLUMN_PROJECT_PlANNING_INFO_WAIT5 + "," +
            COLUMN_PROJECT_PlANNING_INFO_WAIT6 + "," + COLUMN_PROJECT_PlANNING_INFO_WAIT7 + "," +
            COLUMN_PROJECT_PlANNING_INFO_WAIT8 + "," + COLUMN_PROJECT_PlANNING_INFO_WAIT9 + "," +
            COLUMN_PROJECT_PlANNING_INFO_WAIT10 + "," + COLUMN_PROJECT_PlANNING_INFO_WAIT11 + "," +
            COLUMN_PROJECT_PlANNING_INFO_WAIT12 + "," +

            COLUMN_PROJECT_PlANNING_INFO_RESOURCE1 + "," +
            COLUMN_PROJECT_PlANNING_INFO_RESOURCE2 + "," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE3 + "," +
            COLUMN_PROJECT_PlANNING_INFO_RESOURCE4 + "," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE5 + "," +
            COLUMN_PROJECT_PlANNING_INFO_RESOURCE6 + "," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE7 + "," +
            COLUMN_PROJECT_PlANNING_INFO_RESOURCE8 + "," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE9 + "," +
            COLUMN_PROJECT_PlANNING_INFO_RESOURCE10 + "," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE11 + "," +
            COLUMN_PROJECT_PlANNING_INFO_RESOURCE12 + ") " +
            "VALUES (?,?,?," +

            "?,?,?,?,?,?," +
            "?,?,?,?,?,?," +

            "?,?,?,?,?,?," +
            "?,?,?,?,?,?," +

            "?,?,?,?,?,?," +
            "?,?,?,?,?,?)";


    public static final String INSERT_INTO_EXECUTION_INFO_TABLE = "INSERT INTO " +
            TABLE_PROJECT_EXECUTION_INFO + " (" +
            COLUMN_PROJECT_EXECUTION_INFO_ID + "," +
            COLUMN_PROJECT_EXECUTION_INFO_CURRENT_TASK + "," +

            COLUMN_PROJECT_EXECUTION_INFO_TASK1 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_TASK2 + "," + COLUMN_PROJECT_EXECUTION_INFO_TASK3 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_TASK4 + "," + COLUMN_PROJECT_EXECUTION_INFO_TASK5 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_TASK6 + "," + COLUMN_PROJECT_EXECUTION_INFO_TASK7 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_TASK8 + "," + COLUMN_PROJECT_EXECUTION_INFO_TASK9 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_TASK10 + "," + COLUMN_PROJECT_EXECUTION_INFO_TASK11 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_TASK12 + "," +

            COLUMN_PROJECT_EXECUTION_INFO_WAIT1 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_WAIT2 + "," + COLUMN_PROJECT_EXECUTION_INFO_WAIT3 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_WAIT4 + "," + COLUMN_PROJECT_EXECUTION_INFO_WAIT5 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_WAIT6 + "," + COLUMN_PROJECT_EXECUTION_INFO_WAIT7 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_WAIT8 + "," + COLUMN_PROJECT_EXECUTION_INFO_WAIT9 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_WAIT10 + "," + COLUMN_PROJECT_EXECUTION_INFO_WAIT11 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_WAIT12 + "," +

            COLUMN_PROJECT_EXECUTION_INFO_RESOURCE1 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_RESOURCE2 + "," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE3 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_RESOURCE4 + "," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE5 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_RESOURCE6 + "," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE7 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_RESOURCE8 + "," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE9 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_RESOURCE10 + "," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE11 + "," +
            COLUMN_PROJECT_EXECUTION_INFO_RESOURCE12

            + "," + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK1
            + "," + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK2
            + "," + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK3
            + "," + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK4
            + "," + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK5
            + "," + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK6
            + "," + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK7
            + "," + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK8
            + "," + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK9
            + "," + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK10
            + "," + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK11
            + "," + COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK12


            + ") VALUES (?,?," +

            "?,?,?,?,?,?," +
            "?,?,?,?,?,?," +

            "?,?,?,?,?,?," +
            "?,?,?,?,?,?,"
            +

            "?,?,?,?,?,?," +
            "?,?,?,?,?,?,"
            +

            "?,?,?,?,?,?," +
            "?,?,?,?,?,?)";

    //+ COLUMN_PROJECT_EXECUTION_INFO_CC_WITH_WEIGHT +" REAL NOT NULL,"+
//            COLUMN_PROJECT_EXECUTION_INFO_CC_WITHOUT_WEIGHT+" REAL NOT NULL,"+
//            COLUMN_PROJECT_EXECUTION_INFO_BUFFER_CONSUMPTION_DAYS+" REAL NOT NULL," +
//            COLUMN_PROJECT_PlANNING_INFO_BUFFER_SIZE+" REAL NOT NULL,"+
//            COLUMN_PROJECT_PlANNING_INFO_CC_WITHOUT_WEIGHT+" REAL NOT NULL,"+
//            COLUMN_PROJECT_PlANNING_INFO_CC_WITH_WEIGHT+" REAL NOT NULL,"
    public static final String INSERT_INTO_ANALYSIS_INFO = "INSERT INTO " + TABLE_PROJECT_ANALYSIS_INFO + "(" + COLUMN_PROJECT_PlANNING_INFO_ID +
            "," + COLUMN_PROJECT_ANALYSIS_INFO_CC + "," + COLUMN_PROJECT_ANALYSIS_INFO_PB + "," + COLUMN_PROJECT_ANALYSIS_INFO_PRIORITY +
            "," + COLUMN_PROJECT_ANALYSIS_INFO_REMAINING_WAIT + "," + COLUMN_PROJECT_ANALYSIS_INFO_STATUS + "," + COLUMN_PROJECT_ANALYSIS_INFO_SCHEDULED_START_DATE +
            "," + COLUMN_PROJECT_EXECUTION_INFO_CC_WITH_WEIGHT + "," + COLUMN_PROJECT_EXECUTION_INFO_CC_WITHOUT_WEIGHT + "," +
            COLUMN_PROJECT_EXECUTION_INFO_BUFFER_CONSUMPTION_DAYS + "," + COLUMN_PROJECT_PlANNING_INFO_BUFFER_SIZE + "," +
            COLUMN_PROJECT_PlANNING_INFO_CC_WITHOUT_WEIGHT + "," + COLUMN_PROJECT_PlANNING_INFO_CC_WITH_WEIGHT + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String INSERT_INTO_LEADER_TABLE = "INSERT INTO " + TABLE_LEADERS + "(" + COLUMN_TABLE_LEADERS_NAME + ") VALUES (?)";
    public static final String INSERT_INTO_EXECUTION_PHASE_TABLE = "";
    public static final String INSERT_INTO_PlANNING_PHASE_TABLE = "";
    public static final String INSERT_INTO_PROJECT_ANALYSIS_TABLE = "";

    public static final String DELETE_ENTRY_PROJECT_INFO = "DELETE FROM " + TABLE_PROJECT_INFO + " WHERE " + TABLE_PROJECT_INFO + "." + COLUMN_PROJECT_INFO_ID + "= ?";
    public static final String DELETE_ENTRY_PROJECT_PLANNING_INFO = "DELETE FROM " + TABLE_PROJECT_PLANNING_INFO + " WHERE " + TABLE_PROJECT_PLANNING_INFO + "." +
            COLUMN_PROJECT_PlANNING_INFO_ID + "= ?";
    public static final String DELETE_ENTRY_PROJECT_EXECUTION_INFO = "DELETE FROM " + TABLE_PROJECT_EXECUTION_INFO + " WHERE " + TABLE_PROJECT_EXECUTION_INFO + "." +
            COLUMN_PROJECT_EXECUTION_INFO_ID + "= ?";
    public static final String DELETE_ENTRY_PROJECT_ANALYSIS_INFO = "DELETE FROM " + TABLE_PROJECT_ANALYSIS_INFO + " WHERE " + TABLE_PROJECT_ANALYSIS_INFO + "." +
            COLUMN_PROJECT_ANALYSIS_INFO_ID + "= ?";


    public static final String UPDATE_PROJECT_INFO = "UPDATE " + TABLE_PROJECT_INFO + " SET " +
            COLUMN_PROJECT_INFO_MILESTONE_DATE + "= ? ," + COLUMN_PROJECT_INFO_END_DATE + "= ? ," + COLUMN_PROJECT_INFO_ACTUAL_START_DATE +
            "= ? ," + COLUMN_PROJECT_INFO_CHECK_DATE + "= ?, " + COLUMN_PROJECT_INFO_ABOUT_PROJECT + "=? " + " WHERE " + COLUMN_PROJECT_INFO_PROJECT_NAME +
            "= ? ";


    /////////////////////////////////////////////////////////////////////////////
    PreparedStatement queryCompany;
    PreparedStatement queryDepartment;
    PreparedStatement queryUserLogin, queryUserLogin1;
    private PreparedStatement queryPassword;
    PreparedStatement queryLeader;
    PreparedStatement queryProjectInfo;

    PreparedStatement InsertIntoCompany;
    PreparedStatement InsertIntoDepartment;
    PreparedStatement InsertIntoLoginDetails;
    PreparedStatement InsertLeader;
    PreparedStatement InsertProjectInfo;
    PreparedStatement InsertIntoPlanningInfo;
    PreparedStatement InsertIntoExecutionInfo;
    PreparedStatement InsertIntoAnalysisInfo;

    PreparedStatement updateProjectInfo;

    PreparedStatement DeleteProjectInfo, DeleteProjectPlanning, DeleteProjectExecution, DeleteProjectAnalysis;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    private Connection conn;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION);


            return true;
        } catch (SQLException e) {
            System.out.println("The error while opening the database is- " + e.getMessage());
            return false;
        }
    }

    public boolean startTableDataModification() {
        try {
            queryCompany = conn.prepareStatement(QUERY_ID_OF_COMPANY);
            queryDepartment = conn.prepareStatement(QUERY_ID_OF_DEPARTMENT);
            queryUserLogin = conn.prepareStatement(QUERY_USER_LOGIN_INFO);
            queryUserLogin1 = conn.prepareStatement(QUERY_USER_LOGIN_INFO1);
            queryPassword = conn.prepareStatement(QUERY_PASSWORD);
            queryLeader = conn.prepareStatement(QUERY_LEADER);
            queryProjectInfo = conn.prepareStatement(QUERY_PROJECT_INFO);
            InsertIntoCompany = conn.prepareStatement(INSERT_INTO_COMPANY_TABLE, Statement.RETURN_GENERATED_KEYS);
            InsertIntoDepartment = conn.prepareStatement(INSERT_INTO_DEPARTMENT_TABLE, Statement.RETURN_GENERATED_KEYS);
            InsertIntoLoginDetails = conn.prepareStatement(INSERT_INTO_USER_LOGIN_TABLE, Statement.RETURN_GENERATED_KEYS);
            InsertLeader = conn.prepareStatement(INSERT_INTO_LEADER_TABLE, Statement.RETURN_GENERATED_KEYS);
            InsertProjectInfo = conn.prepareStatement(INSERT_INTO_PROJECT_INFO_TABLE);
            InsertIntoPlanningInfo = conn.prepareStatement(INSERT_INTO_PlANNING_INFO_TABLE);
            InsertIntoExecutionInfo = conn.prepareStatement(INSERT_INTO_EXECUTION_INFO_TABLE);
            InsertIntoAnalysisInfo = conn.prepareStatement(INSERT_INTO_ANALYSIS_INFO);
            DeleteProjectExecution = conn.prepareStatement(DELETE_ENTRY_PROJECT_EXECUTION_INFO);
            DeleteProjectInfo = conn.prepareStatement(DELETE_ENTRY_PROJECT_INFO);
            DeleteProjectPlanning = conn.prepareStatement(DELETE_ENTRY_PROJECT_PLANNING_INFO);
            DeleteProjectAnalysis = conn.prepareStatement(DELETE_ENTRY_PROJECT_ANALYSIS_INFO);

            updateProjectInfo = conn.prepareStatement(UPDATE_PROJECT_INFO);
            return true;
        } catch (SQLException e) {
            System.out.println("The error while starting to edit the table is- " + e.getMessage());
            return false;
        }

    }

    public void close() {
        try {
            if (DeleteProjectExecution != null) {
                DeleteProjectExecution.close();
            }
            if (DeleteProjectInfo != null) {
                DeleteProjectInfo.close();
            }
            if (DeleteProjectPlanning != null) {
                DeleteProjectPlanning.close();
            }
            if (DeleteProjectAnalysis != null) {
                DeleteProjectAnalysis.close();
            }
            if (updateProjectInfo != null) {
                updateProjectInfo.close();
            }


            if (queryCompany != null) {
                queryCompany.close();
            }
            if (InsertIntoCompany != null) {
                InsertIntoCompany.close();
            }
            if (queryDepartment != null) {
                queryDepartment.close();
            }
            if (InsertIntoDepartment != null) {
                InsertIntoDepartment.close();
            }
            if (queryUserLogin != null) {
                queryUserLogin.close();
            }
            if (queryUserLogin1 != null) {
                queryUserLogin1.close();
            }
            if (InsertIntoLoginDetails != null) {
                InsertIntoLoginDetails.close();
            }

            if (InsertIntoPlanningInfo != null) {
                InsertIntoPlanningInfo.close();
            }
            if (InsertProjectInfo != null) {
                InsertProjectInfo.close();
            }
            if (queryPassword != null) {
                queryPassword.close();
            }
            if (InsertLeader != null) {
                InsertLeader.close();
            }
            if (queryLeader != null) {
                queryLeader.close();
            }
            if (queryProjectInfo != null) {
                queryProjectInfo.close();
            }
            if (InsertIntoAnalysisInfo != null) {
                InsertIntoAnalysisInfo.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("The error while closing the database is- " + e.getMessage());

        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean createTable() {
        try (Statement statement = conn.createStatement()) {

            statement.execute(CREATE_TABLE_COMPANY);
            statement.execute(CREATE_TABLE_DEPARTMENT);
            statement.execute(CREATE_TABLE_USER_LOGIN_INFO);
            //statement.execute(CREATE_TABLE_LOGIN_CREDENTIALS_INFO);
            statement.execute(CREATE_TABLE_PROJECT_INFO);
            statement.execute(CREATE_TABLE_PROJECT_ANALYSIS_INFO);
            statement.execute(CREATE_TABLE_PLANNING_PHASE);
            statement.execute(CREATE_TABLE_EXECUTION_PHASE);
            statement.execute(CREATE_TABLE_VIEW_ALL_PROJECT_VIEW);
            statement.execute(CREATE_TABLE_LEADERS);
            //statement.execute("PRAGMA foreign_keys = ON;");
            System.out.println(" sql to create database -");
            System.out.println("---> " + CREATE_TABLE_COMPANY);
            System.out.println("---> " + CREATE_TABLE_DEPARTMENT);
            System.out.println("---> " + CREATE_TABLE_USER_LOGIN_INFO);
            // System.out.println("---> "+CREATE_TABLE_LOGIN_CREDENTIALS_INFO);
            System.out.println("---> " + CREATE_TABLE_PROJECT_INFO);
            System.out.println("---> " + CREATE_TABLE_PROJECT_ANALYSIS_INFO);
            System.out.println("---> " + CREATE_TABLE_PLANNING_PHASE);
            System.out.println("---> " + CREATE_TABLE_EXECUTION_PHASE);
            System.out.println("---> " + CREATE_TABLE_VIEW_ALL_PROJECT_VIEW);
            System.out.println("---> " + CREATE_TABLE_LEADERS);
            return true;
        } catch (SQLException e) {
            System.out.println("Error while creating a nw table is- " + e.getMessage());
            return false;
        }


    }


    //crete a view for table in ll projects window
    //must happen when ever logged in
    //first nme,
//    public void addAllDataIntoTable(String projectName,
//                                    String leaderName,String companyName,String departmentName,String milestoneDate, String endDate,String actualstartDate,String CheckingDate,
//                                    String currentTask, String waitCriteria, String taskCriteria,
//                                    double T1,double T2,double T3,double T4,double T5,double T6,double T7,double T8,double T9,double T10,double T11,double T12,
//                                    double R1,double R2,double R3,double R4, double R5,double R6, double R7,double R8, double R9,double R10, double R11,double R12,
//                                    double Te1, double Te2, double Te3, double Te4, double Te5, double Te6, double Te7, double Te8, double Te9, double Te10, double Te11, double Te12,
//                                    double Re1,double Re2, double Re3,double Re4, double Re5,double Re6, double Re7,double Re8, double Re9,double Re10, double Re11,double Re12,
//                                    double planning_weight,
//                                    double W1,double W2, double W3,double W4, double W5,double W6, double W7,double W8, double W9,double W10, double W11,double W12,
//                                    double cc,double pb, double priority,double remaining_wait,String status,String scheduledDate){
//        //1. add all data
//                /*
//                check if project name exists (if yes...waning...if ok...update...if not ok...exit, if no...create,)
//                 check if project number exists (if yes...waning...if ok...update...if not ok...exit, if no...create,)
//                 */
//        try {
//            int Company_id = insertCompany(companyName);
//            int Department_id = insertDepartment(departmentName);
//
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//
//    }

    public int insertDepartment(String departmentName) throws SQLException {

        queryDepartment.setString(1, "%" + departmentName + "%");
        ResultSet resultSet = queryDepartment.executeQuery();
        if (resultSet.next()) {
            return resultSet.getInt(1);
        }
        InsertIntoDepartment.setString(1, departmentName);
        int modifiedColumn = InsertIntoDepartment.executeUpdate();

        if (modifiedColumn != 1) {
            throw new SQLException("Sorry couldnot update the filed into the Department table");
        }

        ResultSet resultSet1 = InsertIntoDepartment.getGeneratedKeys();
        if (resultSet1.next()) {
            return resultSet1.getInt(1);
        } else {
            throw new SQLException("Sorry couldnot fetch the value from the Department table");
        }

    }

    public int insertCompany(String companyName) throws SQLException {
        queryCompany.setString(1,  companyName );
        ResultSet resultSet = queryCompany.executeQuery();
        if (resultSet.next()) {
            return resultSet.getInt(1);
        }
        InsertIntoCompany.setString(1, companyName);
        int modifiedCell = InsertIntoCompany.executeUpdate();
        if (modifiedCell != 1) {
            throw new SQLException("sorry not able to insert the value into company table");
        }

        ResultSet resultSet1 = InsertIntoCompany.getGeneratedKeys();
        if (resultSet1.next()) {
            return resultSet1.getInt(1);
        } else {
            throw new SQLException("Sorry cannot fetch the company id value");
        }


    }

    public void insetUserLoginInfo(String fName, String lName, String email, String gender, String companyName, String dob, String userID, String password,String loginDate) throws SQLException {
//        //public static final String INSERT_INTO_USER_LOGIN_TABLE="INSERT INTO "+TABLE_USER_LOGIN_INFO+"
//        // ("+COLUMN_USER_LOGIN_INFO_FIRST_NAME+","+COLUMN_USER_LOGIN_INFO_LAST_NAME+","+
//        //            COLUMN_USER_LOGIN_INFO_EMAIL+","+COLUMN_USER_LOGIN_INFO_GENDER+","+
//        //            COLUMN_USER_LOGIN_INFO_COMPANY+","+COLUMN_USER_LOGIN_INFO_DOB+","
//        //            +COLUMN_USER_LOGIN_INFO_UserId+","+COLUMN_USER_LOGIN_INFO_Password+")
//        //            VALUES  (?,?,?,?,?,?,?,?)";
//        //

        try {
            conn.setAutoCommit(false);
            if (FindUserUsingEmailID(email) == -1 && FindUserUsingUserID(userID) == -1) {
                int companyID = insertCompany(companyName);
                InsertIntoLoginDetails.setString(1, fName);
                InsertIntoLoginDetails.setString(2, lName);
                InsertIntoLoginDetails.setString(3, email);
                InsertIntoLoginDetails.setString(4, gender);
                InsertIntoLoginDetails.setInt(5, companyID);
                InsertIntoLoginDetails.setString(6, dob);
                InsertIntoLoginDetails.setString(7, userID);
                InsertIntoLoginDetails.setString(8, password);
                InsertIntoLoginDetails.setString(9, loginDate);
                int modifiedColumn = InsertIntoLoginDetails.executeUpdate();
                if (modifiedColumn != 1) {
                    throw new SQLException("sorry!");
                }
                conn.commit();
                ResultSet resultSet = InsertIntoLoginDetails.getGeneratedKeys();
                if (resultSet.next()) {
                    resultSet.getInt(1);
                    System.out.println("login ID: " + userID + " is ....................... successfully added");
                } else {
                    throw new SQLException("sorry");
                }
            } else if (FindUserUsingEmailID(email) != -1) {
                System.out.println("WARNING: email " + email + " is ....................... already existing !!!!!");
            } else if (FindUserUsingUserID(userID) != -1) {
                System.out.println("WARNING: userID " + userID + " is ....................... already existing !!!!!");
            } else if (FindUserUsingEmailID(email) != -1 && FindUserUsingUserID(userID) != -1) {
                System.out.println("WARNING: " + userID + " and " + email + " is ....................... already existing !!!!!");

            }
        } catch (Exception e) {

            conn.rollback();


        } finally {

            conn.setAutoCommit(true);


        }


    }

    private int FindUserUsingUserID(String userID) throws SQLException {
        queryUserLogin1.setString(1, userID);
        ResultSet resultSet = queryUserLogin1.executeQuery();
        if (resultSet.next()) {
            // System.out.println("hai1");
            return resultSet.getInt(1);

        }
        //  System.out.println("hai2");
        return -1;
    }

    public String getPassword(String emailId) throws SQLException {
        //get the password from the database by giving input-fname,lname,emailid,dob,gender
        if (FindUserUsingEmailID(emailId) != -1) {

            queryPassword.setString(1, emailId);
            // System.out.println(queryPassword.toString());
            ResultSet resultSet = queryPassword.executeQuery();
            //System.out.println(QUERY_PASSWORD.toString());
            if (resultSet.next()) {
                //System.out.println("hai");
                return "Password for emailID: " + emailId + " is: " + resultSet.getString(1);
            } else {
                throw new SQLException("Sorry cannot fetch at this moment");
            }


        } else {

            return "WARNING: Sorry this email id:" + emailId + " is not registered with us! ";
        }
    }

    public int FindUserUsingEmailID(String emailId) throws SQLException {
        queryUserLogin.setString(1, emailId);
        ResultSet resultSet = queryUserLogin.executeQuery();
        if (resultSet.next()) {
            // System.out.println("hai1");
            // System.out.println(emailId+ " ..............exists in our database ");
            return resultSet.getInt(1);

        }
        //  System.out.println("hai2");
        //System.out.println("sorry!!............... "+emailId+".............. is not registered");
        return -1;


    }


    public int AddLeader(String leaderName) throws SQLException {

        queryLeader.setString(1, "%" + leaderName + "%");
        ResultSet resultSet = queryLeader.executeQuery();
        if (resultSet.next()) {
            return resultSet.getInt(1);
        }
        InsertLeader.setString(1, leaderName);
        int modifiedColumn = InsertLeader.executeUpdate();
        if (modifiedColumn != 1) {
            throw new SQLException("Sorry!");
        }
        ResultSet resultSet1 = InsertLeader.getGeneratedKeys();
        if (resultSet1.next()) {
            return resultSet1.getInt(1);
        } else {
            throw new SQLException("Sorry!");
        }


    }

    public void deleteFromTable() {

    }

    /**
     * Insrt new project into the database but checking if already the project name of number is existing
     *
     * @param ProjectNumber
     * @param Projectname
     * @param LeaderName
     * @param Companyname
     * @param Departmentname
     * @param MileStonedate
     * @param CompletionDate
     * @param Actualdate
     * @param checkdate
     * @throws SQLException
     */
    public void InsertProjectDetails(String ProjectNumber, String Projectname, String LeaderName, String Companyname, String Departmentname,
                                     String MileStonedate, String CompletionDate, String Actualdate, String checkdate, String about_this_Project) throws SQLException {
        try {
            conn.setAutoCommit(false);
            int LeaderID = AddLeader(LeaderName);
            int CompanyID = insertCompany(Companyname);
            int DepartmentID = insertDepartment(Departmentname);


            queryProjectInfo.setString(1,  ProjectNumber);
            queryProjectInfo.setString(2, Projectname);
            ResultSet resultSet = queryProjectInfo.executeQuery();
            if (resultSet.next()) {
                System.out.println("This project already exists with project Number :" + resultSet.getString(1));
                ;
                return;
            }
            InsertProjectInfo.setString(1, ProjectNumber);
            InsertProjectInfo.setString(2, Projectname);
            InsertProjectInfo.setInt(3, LeaderID);
            InsertProjectInfo.setInt(4, CompanyID);
            InsertProjectInfo.setInt(5, DepartmentID);
            InsertProjectInfo.setString(6, MileStonedate);
            InsertProjectInfo.setString(7, CompletionDate);
            InsertProjectInfo.setString(8, Actualdate);
            InsertProjectInfo.setString(9, checkdate);
            InsertProjectInfo.setString(10, about_this_Project);
            int modifiedColumn = InsertProjectInfo.executeUpdate();
            if (modifiedColumn != 1) {
                throw new SQLException("sorry!!!");
            }
            ResultSet resultSet1 = queryProjectInfo.executeQuery();
            if (resultSet1.next()) {
                projectUpdateChangeDateTime(ProjectNumber);
                System.out.println("This project added into project Info with project Number :" + resultSet1.getString(1));
            }
        } catch (Exception e) {

            conn.rollback();


        } finally {

            conn.setAutoCommit(true);


        }


//        System.out.println("donot exist");


    }

    /**
     * query for th existance of a project by its project name
     *
     * @param ProjectName
     * @return tru if the project exists already and false if it doesnot exists
     * @throws SQLException
     */
    public String queryForProjectNumber(String ProjectName) throws SQLException {
        //  queryProjectInfo.setString(1,"%"+ProjectNumber+"%");
        queryProjectInfo = conn.prepareStatement(QUERY_PROJECT_INFO);
        queryProjectInfo.setString(2, ProjectName);
        // System.out.println(QUERY_PROJECT_INFO.toString());
        ResultSet resultSet = queryProjectInfo.executeQuery();
        if (resultSet.next()) {
            return resultSet.getString(1);
        }
        return null;
    }


    public void updateTable() {

    }

    /**
     * add only th project name into th execution table
     *
     * @param projName
     */
    private void addExecutionDetails(String projName) {

        try {

            conn.setAutoCommit(false);
            String ProjectNumber = queryForProjectNumber(projName);
            Statement statement = conn.createStatement();
            ResultSet resultSetNew = statement.executeQuery("SELECT " + TABLE_PROJECT_EXECUTION_INFO + "." + COLUMN_PROJECT_EXECUTION_INFO_ID + " FROM "
                    + TABLE_PROJECT_EXECUTION_INFO + " WHERE " + TABLE_PROJECT_EXECUTION_INFO + "." + COLUMN_PROJECT_EXECUTION_INFO_ID + "= \"" + ProjectNumber + "\"");
            if (resultSetNew.next()) {
                System.out.println("The project: " + projName + ", already exists in the Execution-info table with project Number: " + ProjectNumber);
                return;
            }
            if (ProjectNumber == null) {
                System.out.println("WARNING: Sorry there is no information about: " + projName + ", project in the project-info table!! ");
                return;
            }
            InsertIntoExecutionInfo.setString(1, ProjectNumber);

            // System.out.println(INSERT_INTO_EXECUTION_INFO_TABLE.toString());
            int modifiedColumn = InsertIntoExecutionInfo.executeUpdate();
            //System.out.println(modifiedColumn);
            if (modifiedColumn != 1) {
                System.out.println("sorry the values already exists");
                throw new SQLException("Sorry!");
            }
            projectUpdateChangeDateTime(ProjectNumber);
            System.out.println("Successfully Added into Execution table! ");


        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                conn.rollback();
            } catch (SQLException e1) {
                System.out.println(e1.getMessage());
            }


        } finally {

            try {
                conn.setAutoCommit(true);
            } catch (SQLException e2) {
                System.out.println(e2.getMessage());
            }
        }
    }

    /**
     * add only the project name into th planning table
     *
     * @param ProjectName
     */
    private void addplanningDetails(String ProjectName) {
        try {
            conn.setAutoCommit(false);
            String ProjectNumber = queryForProjectNumber(ProjectName);

            Statement statement = conn.createStatement();
            ResultSet resultSetNew = statement.executeQuery("SELECT " + TABLE_PROJECT_PLANNING_INFO + "." + COLUMN_PROJECT_PlANNING_INFO_ID + " FROM "
                    + TABLE_PROJECT_PLANNING_INFO + " WHERE " + TABLE_PROJECT_PLANNING_INFO + "." + COLUMN_PROJECT_PlANNING_INFO_ID + "= \"" + ProjectNumber + "\"");
            if (resultSetNew.next()) {
                System.out.println("The project: " + ProjectName + ", already exists in the planning-info table with project Number: " + ProjectNumber);
                return;
            }
            if (ProjectNumber == null) {
                System.out.println("WARNING: Sorry there is no information about: " + ProjectName + ", project in the project-info table!! ");
                return;
            }

            InsertIntoPlanningInfo.setString(1, ProjectNumber);


            int resultSet = InsertIntoPlanningInfo.executeUpdate();
            if (resultSet != 1) {
                System.out.println("sorry it already exists");
                throw new SQLException("sorry!!");
            }
            projectUpdateChangeDateTime(ProjectNumber);
            System.out.println("Successfully Added into Planning Table!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                conn.rollback();
            } catch (SQLException e11) {
                System.out.println(e11.getMessage());
            }
        } finally {
            try {
                conn.setAutoCommit(true);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * adding ino th planning window
     *
     * @param ProjectName
     * @param waitCriteria * @param taskCriteria
     * @param Task1        * @param Task2
     * @param Task3        * @param Task4
     * @param Task5        * @param Task6
     * @param Task7        * @param Task8
     * @param Task9        * @param Task10
     * @param Task11       * @param Task12
     * @param Wait1        * @param Wait2
     * @param Wait3        * @param Wait4
     * @param Wait5        * @param Wait6
     * @param Wait7        * @param Wait8
     * @param Wait9        * @param Wait10
     * @param Wait11       * @param Wait12
     * @param Resource1    * @param Resource2
     * @param Resource3    * @param Resource4
     * @param Resource5    * @param Resource6
     * @param Resource7    * @param Resource8
     * @param Resource9    * @param Resource10
     * @param Resource11   * @param Resource12
     * @throws SQLException
     */
    public void addplanningDetails(String ProjectName, String waitCriteria, String taskCriteria, double Task1, double Task2, double Task3, double Task4, double Task5, double Task6, double Task7, double Task8, double Task9, double Task10, double Task11, double Task12
            , double Wait1, double Wait2, double Wait3, double Wait4, double Wait5, double Wait6, double Wait7, double Wait8, double Wait9, double Wait10, double Wait11, double Wait12
            , int Resource1, int Resource2, int Resource3, int Resource4, int Resource5, int Resource6, int Resource7, int Resource8, int Resource9, int Resource10, int Resource11, int Resource12) throws SQLException {

        try {
            conn.setAutoCommit(false);
            String ProjectNumber = queryForProjectNumber(ProjectName);

            Statement statement = conn.createStatement();
            ResultSet resultSetNew = statement.executeQuery("SELECT " + TABLE_PROJECT_PLANNING_INFO + "." + COLUMN_PROJECT_PlANNING_INFO_ID + " FROM "
                    + TABLE_PROJECT_PLANNING_INFO + " WHERE " + TABLE_PROJECT_PLANNING_INFO + "." + COLUMN_PROJECT_PlANNING_INFO_ID + "= \"" + ProjectNumber + "\"");
            if (resultSetNew.next()) {
                System.out.println("The project: " + ProjectName + ", already exists in the planning-info table with project Number: " + ProjectNumber);
                return;
            }
            if (ProjectNumber == null) {
                System.out.println("Planning WARNING: Sorry there is no information about: " + ProjectName + ", project in the project-info table!! ");
                return;
            }

            InsertIntoPlanningInfo.setString(1, ProjectNumber);
            InsertIntoPlanningInfo.setString(2, waitCriteria);
            InsertIntoPlanningInfo.setString(3, taskCriteria);

            InsertIntoPlanningInfo.setDouble(4, Task1);
            InsertIntoPlanningInfo.setDouble(5, Task2);
            InsertIntoPlanningInfo.setDouble(6, Task3);
            InsertIntoPlanningInfo.setDouble(7, Task4);
            InsertIntoPlanningInfo.setDouble(8, Task5);
            InsertIntoPlanningInfo.setDouble(9, Task6);
            InsertIntoPlanningInfo.setDouble(10, Task7);
            InsertIntoPlanningInfo.setDouble(11, Task8);
            InsertIntoPlanningInfo.setDouble(12, Task9);
            InsertIntoPlanningInfo.setDouble(13, Task10);
            InsertIntoPlanningInfo.setDouble(14, Task11);
            InsertIntoPlanningInfo.setDouble(15, Task12);

            InsertIntoPlanningInfo.setDouble(16, Wait1);
            InsertIntoPlanningInfo.setDouble(17, Wait2);
            InsertIntoPlanningInfo.setDouble(18, Wait3);
            InsertIntoPlanningInfo.setDouble(19, Wait4);
            InsertIntoPlanningInfo.setDouble(20, Wait5);
            InsertIntoPlanningInfo.setDouble(21, Wait6);
            InsertIntoPlanningInfo.setDouble(22, Wait7);
            InsertIntoPlanningInfo.setDouble(23, Wait8);
            InsertIntoPlanningInfo.setDouble(24, Wait9);
            InsertIntoPlanningInfo.setDouble(25, Wait10);
            InsertIntoPlanningInfo.setDouble(26, Wait11);
            InsertIntoPlanningInfo.setDouble(27, Wait12);

            InsertIntoPlanningInfo.setInt(28, Resource1);
            InsertIntoPlanningInfo.setInt(29, Resource2);
            InsertIntoPlanningInfo.setInt(30, Resource3);
            InsertIntoPlanningInfo.setInt(31, Resource4);
            InsertIntoPlanningInfo.setInt(32, Resource5);
            InsertIntoPlanningInfo.setInt(33, Resource6);
            InsertIntoPlanningInfo.setInt(34, Resource7);
            InsertIntoPlanningInfo.setInt(35, Resource8);
            InsertIntoPlanningInfo.setInt(36, Resource9);
            InsertIntoPlanningInfo.setInt(37, Resource10);
            InsertIntoPlanningInfo.setInt(38, Resource11);
            InsertIntoPlanningInfo.setInt(39, Resource12);

            int resultSet = InsertIntoPlanningInfo.executeUpdate();
            if (resultSet != 1) {
                System.out.println("sorry it already exists");
                throw new SQLException("");
            }
            projectUpdateChangeDateTime(ProjectNumber);System.out.println("Successfully Added into Planning Table! ");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                conn.rollback();
            } catch (SQLException e1) {
                System.out.println(e1.getMessage());
            }


        } finally {

            try {
                conn.setAutoCommit(true);
            } catch (SQLException e2) {
                System.out.println(e2.getMessage());
            }
        }


        // System.out.println(INSERT_INTO_PlANNING_INFO_TABLE.toString());


    }

    /**
     * adding into the execution table
     *
     * @param projName              * @param currentTask
     * @param Task1                 * @param Task2
     * @param Task3                 * @param Task4
     * @param Task5                 * @param Task6
     * @param Task7                 * @param Task8
     * @param Task9                 * @param Task10
     * @param Task11                * @param Task12
     * @param Wait1                 * @param Wait2
     * @param Wait3                 * @param Wait4
     * @param Wait5                 * @param Wait6
     * @param Wait7                 * @param Wait8
     * @param Wait9                 * @param Wait10
     * @param Wait11                * @param Wait12
     * @param Resource1             * @param Resource2
     * @param Resource3             * @param Resource4
     * @param Resource5             * @param Resource6
     * @param Resource7             * @param Resource8
     * @param Resource9             * @param Resource10
     * @param Resource11            * @param Resource12
     * @param InputAvailable_Task1  * @param InputAvailable_Task2
     * @param InputAvailable_Task3  * @param InputAvailable_Task4
     * @param InputAvailable_Task5  * @param InputAvailable_Task6
     * @param InputAvailable_Task7  * @param InputAvailable_Task8
     * @param InputAvailable_Task9  * @param InputAvailable_Task10
     * @param InputAvailable_Task11 * @param InputAvailable_Task12
     */
    public void addExecutionDetails(String projName, String currentTask, double Task1, double Task2, double Task3, double Task4, double Task5, double Task6,
                                    double Task7, double Task8, double Task9, double Task10, double Task11, double Task12, double Wait1, double Wait2,
                                    double Wait3, double Wait4, double Wait5, double Wait6, double Wait7, double Wait8, double Wait9, double Wait10,
                                    double Wait11, double Wait12, int Resource1, int Resource2, int Resource3, int Resource4, int Resource5, int Resource6,
                                    int Resource7, int Resource8, int Resource9, int Resource10, int Resource11, int Resource12, String InputAvailable_Task1,
                                    String InputAvailable_Task2, String InputAvailable_Task3, String InputAvailable_Task4, String InputAvailable_Task5,
                                    String InputAvailable_Task6, String InputAvailable_Task7, String InputAvailable_Task8, String InputAvailable_Task9,
                                    String InputAvailable_Task10, String InputAvailable_Task11, String InputAvailable_Task12) {

        try {
            //INSERT INTO execution_phase_info (_id,current_task,Task_Execution1,Task_Execution2,Task_Execution3,Task_Execution4,Task_Execution5,Task_Execution6,Task_Execution7,Task_Execution8,Task_Execution9,
            //Task_Execution10,Task_Execution11,Task_Execution12,Wait_Execution1,Wait_Execution2,Wait_Execution3,Wait_Execution4,Wait_Execution5,Wait_Execution6,Wait_Execution7,Wait_Execution8,Wait_Execution9,
            //Wait_Execution10,Wait_Execution11,Wait_Execution12,Resource_Execution1,Resource_Execution2,Resource_Execution3,Resource_Execution4,Resource_Execution5,Resource_Execution6,Resource_Execution7,
            //Resource_Execution8,Resource_Execution9,Resource_Execution10,Resource_Execution11,Resource_Execution12,Input_availability_Task1,Input_availability_Task2,Input_availability_Task3,Input_availability_Task4,
            //Input_availability_Task5,Input_availability_Task6,Input_availability_Task7,Input_availability_Task8,Input_availability_Task9,Input_availability_Task10,Input_availability_Task11,Input_availability_Task12)
            // VALUES ("ABC1","Task1",0,5,2,5,5,5,5,5,5,
            //                5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,
            //                5,5,5,5,5,5,5,5,5,5,5,
            //                "yes","no","no","no","no","no",
            //                "no","no","no","no","no","no");


            conn.setAutoCommit(false);
            String ProjectNumber = queryForProjectNumber(projName);
            Statement statement = conn.createStatement();
            ResultSet resultSetNew = statement.executeQuery("SELECT " + TABLE_PROJECT_EXECUTION_INFO + "." + COLUMN_PROJECT_EXECUTION_INFO_ID + " FROM "
                    + TABLE_PROJECT_EXECUTION_INFO + " WHERE " + TABLE_PROJECT_EXECUTION_INFO + "." + COLUMN_PROJECT_EXECUTION_INFO_ID + "= \"" + ProjectNumber + "\"");
            if (resultSetNew.next()) {
                System.out.println("The project: " + projName + ", already exists in the Execution-info table with project Number: " + ProjectNumber);
                return;
            }
            if (ProjectNumber == null) {
                System.out.println("execution WARNING: Sorry there is no information about: " + projName + ", project in the project-info table!! ");
                return;
            }
            InsertIntoExecutionInfo.setString(1, ProjectNumber);
            InsertIntoExecutionInfo.setString(2, currentTask);

            InsertIntoExecutionInfo.setDouble(3, Task1);
            InsertIntoExecutionInfo.setDouble(4, Task2);
            InsertIntoExecutionInfo.setDouble(5, Task3);
            InsertIntoExecutionInfo.setDouble(6, Task4);
            InsertIntoExecutionInfo.setDouble(7, Task5);
            InsertIntoExecutionInfo.setDouble(8, Task6);
            InsertIntoExecutionInfo.setDouble(9, Task7);
            InsertIntoExecutionInfo.setDouble(10, Task8);
            InsertIntoExecutionInfo.setDouble(11, Task9);
            InsertIntoExecutionInfo.setDouble(12, Task10);
            InsertIntoExecutionInfo.setDouble(13, Task11);
            InsertIntoExecutionInfo.setDouble(14, Task12);


            InsertIntoExecutionInfo.setDouble(15, Wait1);
            InsertIntoExecutionInfo.setDouble(16, Wait2);
            InsertIntoExecutionInfo.setDouble(17, Wait3);
            InsertIntoExecutionInfo.setDouble(18, Wait4);
            InsertIntoExecutionInfo.setDouble(19, Wait5);
            InsertIntoExecutionInfo.setDouble(20, Wait6);
            InsertIntoExecutionInfo.setDouble(21, Wait7);
            InsertIntoExecutionInfo.setDouble(22, Wait8);
            InsertIntoExecutionInfo.setDouble(23, Wait9);
            InsertIntoExecutionInfo.setDouble(24, Wait10);
            InsertIntoExecutionInfo.setDouble(25, Wait11);
            InsertIntoExecutionInfo.setDouble(26, Wait12);


            InsertIntoExecutionInfo.setInt(27, Resource1);
            InsertIntoExecutionInfo.setInt(28, Resource2);
            InsertIntoExecutionInfo.setInt(29, Resource3);
            InsertIntoExecutionInfo.setInt(30, Resource4);
            InsertIntoExecutionInfo.setInt(31, Resource5);
            InsertIntoExecutionInfo.setInt(32, Resource6);
            InsertIntoExecutionInfo.setInt(33, Resource7);
            InsertIntoExecutionInfo.setInt(34, Resource8);
            InsertIntoExecutionInfo.setInt(35, Resource9);
            InsertIntoExecutionInfo.setInt(36, Resource10);
            InsertIntoExecutionInfo.setInt(37, Resource11);
            InsertIntoExecutionInfo.setInt(38, Resource12);


            InsertIntoExecutionInfo.setString(39, InputAvailable_Task1);
            InsertIntoExecutionInfo.setString(40, InputAvailable_Task2);
            InsertIntoExecutionInfo.setString(41, InputAvailable_Task3);
            InsertIntoExecutionInfo.setString(42, InputAvailable_Task4);
            InsertIntoExecutionInfo.setString(43, InputAvailable_Task5);
            InsertIntoExecutionInfo.setString(44, InputAvailable_Task6);
            InsertIntoExecutionInfo.setString(45, InputAvailable_Task7);
            InsertIntoExecutionInfo.setString(46, InputAvailable_Task8);
            InsertIntoExecutionInfo.setString(47, InputAvailable_Task9);
            InsertIntoExecutionInfo.setString(48, InputAvailable_Task10);
            InsertIntoExecutionInfo.setString(49, InputAvailable_Task11);
            InsertIntoExecutionInfo.setString(50, InputAvailable_Task12);
            // System.out.println(INSERT_INTO_EXECUTION_INFO_TABLE.toString());
            int modifiedColumn = InsertIntoExecutionInfo.executeUpdate();
            System.out.println(modifiedColumn);
            if (modifiedColumn != 1) {
                System.out.println("sorry th values already exists");
                throw new SQLException("");
            }
            projectUpdateChangeDateTime(ProjectNumber);System.out.println("Successfully Added into Execution Table! ");

            //System.out.println("Adding the project to the execution table. with project number: "+ProjectNumber);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                conn.rollback();
            } catch (SQLException e1) {
                System.out.println(e1.getMessage());
            }


        } finally {

            try {
                conn.setAutoCommit(true);
            } catch (SQLException e2) {
                System.out.println(e2.getMessage());
            }
        }

    }

    /**
     * add into the analysis table only the project name and the project status from the project info update
     * will add to analysis table only if the project number exists in execution table
     *
     * @param ProjectName
     * @param ProjectStatus
     */
    private void addAnalysisDetails(String ProjectName, String ProjectStatus) {
        try {
            conn.setAutoCommit(false);

            Statement statement = conn.createStatement();
            String ProjectNumber = queryForProjectNumber(ProjectName);
            ResultSet resultSet = statement.executeQuery("SELECT " + TABLE_PROJECT_ANALYSIS_INFO + "." + COLUMN_PROJECT_PlANNING_INFO_ID + " FROM "
                    + TABLE_PROJECT_ANALYSIS_INFO + " WHERE " + TABLE_PROJECT_ANALYSIS_INFO + "." + COLUMN_PROJECT_PlANNING_INFO_ID + "= \"" + ProjectNumber + "\"");
            if (resultSet.next()) {
                System.out.println("The project: " + ProjectName + ", already exists in the Execution-info table with project Number: " + ProjectNumber);
                return;
            }
            if (ProjectNumber == null) {
                System.out.println("WARNING: Sorry there is no information about: " + ProjectName + ", project in the project-info table!! ");
                return;
            }

            ResultSet resultSetNew = statement.executeQuery("SELECT " + TABLE_PROJECT_EXECUTION_INFO + "." + COLUMN_PROJECT_EXECUTION_INFO_ID + " FROM "
                    + TABLE_PROJECT_EXECUTION_INFO + " WHERE " + TABLE_PROJECT_EXECUTION_INFO + "." + COLUMN_PROJECT_EXECUTION_INFO_ID + "= \"" + ProjectNumber + "\"");
            if (resultSetNew.next()) {

                InsertIntoAnalysisInfo.setString(1, ProjectNumber);
                InsertIntoAnalysisInfo.setString(6, ProjectStatus);
                int modifiedColumn = InsertIntoAnalysisInfo.executeUpdate();
                if (modifiedColumn != 1) {
                    throw new SQLException("sorry!");
                }
                projectUpdateChangeDateTime(ProjectNumber);
                System.out.println("Successfully Added into Analysis Table!");
            } else {
                System.out.println("WARNING: this entity has no execution info!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                conn.rollback();
            } catch (SQLException e1) {
                System.out.println(e1.getMessage());

            }
        } finally {

            try {
                conn.setAutoCommit(true);
            } catch (SQLException e1) {
                System.out.println(e1.getMessage());

            }

        }


    }

    /**
     * dd into the analysis table only the project name and the project status
     * * will add to analysis table only if the project number exists in execution table
     *
     * @param ProjectName
     * @param cc
     * @param pb
     * @param priority
     * @param remaining_wait
     * @param ProjectStatus
     * @param sheduledStar_Date
     * @param execution_cc_wait
     * @param execution_cc_Without_wait
     * @param execution_buffer_days
     * @param planning_buffer_size
     * @param planned_cc_wait
     * @param planned_cc_without_wait
     */

    public void addAnalysisDetails(String ProjectName, double cc, double pb, double priority, double remaining_wait,
                                   String ProjectStatus, String sheduledStar_Date, double execution_cc_wait,
                                   double execution_cc_Without_wait, double execution_buffer_days, double planning_buffer_size,
                                   double planned_cc_wait, double planned_cc_without_wait) {

        try {
            conn.setAutoCommit(false);

            Statement statement = conn.createStatement();
            String ProjectNumber = queryForProjectNumber(ProjectName);
            ResultSet resultSet = statement.executeQuery("SELECT " + TABLE_PROJECT_ANALYSIS_INFO + "." + COLUMN_PROJECT_PlANNING_INFO_ID + " FROM "
                    + TABLE_PROJECT_ANALYSIS_INFO + " WHERE " + TABLE_PROJECT_ANALYSIS_INFO + "." + COLUMN_PROJECT_PlANNING_INFO_ID + "= \"" + ProjectNumber + "\"");
            if (resultSet.next()) {
                System.out.println("The project: " + ProjectName + ", already exists in the Execution-info table with project Number: " + ProjectNumber);
                return;
            }
            if (ProjectNumber == null) {
                System.out.println("WARNING: Sorry there is no information about: " + ProjectName + ", project in the project-info table!! ");
                return;
            }

            ResultSet resultSetNew = statement.executeQuery("SELECT " + TABLE_PROJECT_EXECUTION_INFO + "." + COLUMN_PROJECT_EXECUTION_INFO_ID + " FROM "
                    + TABLE_PROJECT_EXECUTION_INFO + " WHERE " + TABLE_PROJECT_EXECUTION_INFO + "." + COLUMN_PROJECT_EXECUTION_INFO_ID + "= \"" + ProjectNumber + "\"");
            if (resultSetNew.next()) {

                InsertIntoAnalysisInfo.setString(1, ProjectNumber);
                InsertIntoAnalysisInfo.setDouble(2, cc);
                InsertIntoAnalysisInfo.setDouble(3, pb);
                InsertIntoAnalysisInfo.setDouble(4, priority);
                InsertIntoAnalysisInfo.setDouble(5, remaining_wait);
                InsertIntoAnalysisInfo.setString(6, ProjectStatus);
                InsertIntoAnalysisInfo.setString(7, sheduledStar_Date);
                InsertIntoAnalysisInfo.setDouble(8, execution_cc_wait);
                InsertIntoAnalysisInfo.setDouble(9, execution_cc_Without_wait);
                InsertIntoAnalysisInfo.setDouble(10, execution_buffer_days);
                InsertIntoAnalysisInfo.setDouble(11, planning_buffer_size);
                InsertIntoAnalysisInfo.setDouble(12, planned_cc_wait);
                InsertIntoAnalysisInfo.setDouble(13, planned_cc_without_wait);

                int modifiedColumn = InsertIntoAnalysisInfo.executeUpdate();
                if (modifiedColumn != 1) {
                    throw new SQLException("sorry!");
                }
                projectUpdateChangeDateTime(ProjectNumber);System.out.println("Successfully updated");
            } else {
                System.out.println("WARNING: this entity has no execution info!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                conn.rollback();
            } catch (SQLException e1) {
                System.out.println(e1.getMessage());

            }
        } finally {

            try {
                conn.setAutoCommit(true);
            } catch (SQLException e1) {
                System.out.println(e1.getMessage());

            }

        }

    }


    //add data-completely done


    //delete data-
    //from selected project Name


    //update data-
    //from selected project Name


    ///////////////////////////////////


    //add in AllProjectInfo

    /**
     * In the ll projects window adding a new project
     * This will also update the planning, analysis and execution window
     *
     * @param projName
     * @param projNumber
     * @param Companyname
     * @param DepartmentName
     * @param leaderName
     * @throws SQLException
     */
    public void AddNewProject_allProjectWindow(String projName, String projNumber, String Companyname, String DepartmentName, String leaderName, String about_this_project) throws SQLException {
        // projectUpdateChangeDateTime(projNumber);
        if (projNumber == null) {
            System.out.println("WARNING: Sorry there is no information about: " + projName + ", project in the project-info table!! ");
            return;
        } // projName,OrgName,ProjNumber,DepName,LeaderName
        InsertProjectDetails(projNumber, projName, leaderName, Companyname, DepartmentName, null, null, null, null, about_this_project);
        addplanningDetails(projName);
        addExecutionDetails(projName);
        addAnalysisDetails(projName, null);


    }

    /**
     * After finishing thepoject dtails window
     * This will also update the planning, analysis and execution window
     *
     * @param Projectname
     * @param ProjectNumber
     * @param Companyname
     * @param Departmentname
     * @param LeaderName
     * @param MileStonedate
     * @param CompletionDate
     * @param Actualdate
     * @param checkdate
     * @param ProjectStatus
     * @param about_this_project
     * @throws SQLException
     */

    public void AddNewProject_ProjectInformation_finish(String Projectname, String ProjectNumber, String Companyname, String Departmentname, String LeaderName,
                                                        String MileStonedate, String CompletionDate, String Actualdate, String checkdate, String ProjectStatus,
                                                        String about_this_project) throws SQLException {



        //   projectUpdateChangeDateTime(ProjectNumber);
        if (ProjectNumber == null) {
            System.out.println("WARNING: Sorry there is no information about: " + Projectname + ", project in the project-info table!! ");
            return;
        }// ProjectName,companyName,Project Number,
        // DepartmentName,LeaderName,Milestone,
        // ScheduledStart,ActualStart,completionDate,
        // CheckingDate,About the project

        // planing table
        // execution table
        // analysis table
        InsertProjectDetails(ProjectNumber, Projectname, LeaderName, Companyname, Departmentname, MileStonedate, CompletionDate, Actualdate, checkdate, about_this_project);
        addplanningDetails(Projectname);
        addExecutionDetails(Projectname);
        addAnalysisDetails(Projectname, ProjectStatus);
    }

    private boolean ProjectExists(String ProjectNumber) throws SQLException {
        Statement statement = conn.createStatement();


        ResultSet resultSet = statement.executeQuery("SELECT " + TABLE_PROJECT_INFO + "." + COLUMN_PROJECT_ANALYSIS_INFO_ID + " FROM "
                + TABLE_PROJECT_INFO + " WHERE " + TABLE_PROJECT_INFO + "." + COLUMN_PROJECT_ANALYSIS_INFO_ID + "= \"" + ProjectNumber + "\"");
        if (resultSet.next()) {
            System.out.println("The project can be modifies...since its exists");
            return true;
        }
        return false;
    }

    /**
     * In theProject planning window
     * after clicking finish saving all the values ino the database
     * <p>
     * This will also update the planning, analysis and execution window
     *
     * @param ProjectNumber
     * @param Projectname
     * @param LeaderName
     * @param Companyname
     * @param Departmentname
     * @param MileStonedate
     * @param CompletionDate
     * @param Actualdate
     * @param checkdate
     * @param waitCriteria
     * @param taskCriteria
     * @param About_this_project
     * @param Task1
     * @param Task2
     * @param Task3
     * @param Task4
     * @param Task5
     * @param Task6
     * @param Task7
     * @param Task8
     * @param Task9
     * @param Task10
     * @param Task11
     * @param Task12
     * @param Wait1
     * @param Wait2
     * @param Wait3
     * @param Wait4
     * @param Wait5
     * @param Wait6
     * @param Wait7
     * @param Wait8
     * @param Wait9
     * @param Wait10
     * @param Wait11
     * @param Wait12
     * @param Resource1
     * @param Resource2
     * @param Resource3
     * @param Resource4
     * @param Resource5
     * @param Resource6
     * @param Resource7
     * @param Resource8
     * @param Resource9
     * @param Resource10
     * @param Resource11
     * @param Resource12
     * @param sheduledStar_Date
     * @param planning_buffer_size
     * @param planned_cc_wait
     * @param planned_cc_without_wait
     * @throws SQLException
     */

    public void AddNewProject_PlanningWindow_finish(String ProjectNumber, String Projectname, String LeaderName, String Companyname, String Departmentname,
                                                    String MileStonedate, String CompletionDate, String Actualdate, String checkdate, String About_this_project, String waitCriteria,
                                                    String taskCriteria, double Task1, double Task2, double Task3, double Task4, double Task5, double Task6,
                                                    double Task7, double Task8, double Task9, double Task10, double Task11, double Task12,
                                                    double Wait1, double Wait2, double Wait3, double Wait4, double Wait5, double Wait6, double Wait7,
                                                    double Wait8, double Wait9, double Wait10, double Wait11, double Wait12, int Resource1, int Resource2,
                                                    int Resource3, int Resource4, int Resource5, int Resource6, int Resource7, int Resource8, int Resource9,
                                                    int Resource10, int Resource11, int Resource12,

                                                    String sheduledStar_Date,
                                                    double planning_buffer_size, double planned_cc_wait, double planned_cc_without_wait) throws SQLException {

        // ProjectName,companyName,Project Number,
        // DepartmentName,LeaderName,Milestone,
        // ScheduledStart,ActualStart,completionDate,
        // CheckingDate,About the project
        //
        // projectName[Number],wait_criteria_task_criteria_t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11,w12,R1,R2
        // R3,R4,R5,R6,R7,R8,R9,R10,R11,R12,,
        //

        // execution table
        // analysis table
        InsertProjectDetails(ProjectNumber, Projectname, LeaderName, Companyname, Departmentname, MileStonedate, CompletionDate, Actualdate, checkdate, About_this_project);
        addplanningDetails(Projectname, waitCriteria,
                taskCriteria, Task1, Task2, Task3, Task4, Task5, Task6,
                Task7, Task8, Task9, Task10, Task11, Task12,
                Wait1, Wait2, Wait3, Wait4, Wait5, Wait6, Wait7,
                Wait8, Wait9, Wait10, Wait11, Wait12, Resource1, Resource2,
                Resource3, Resource4, Resource5, Resource6, Resource7, Resource8, Resource9,
                Resource10, Resource11, Resource12);
        addExecutionDetails(Projectname);
//double priority, double remaining_wait, String sheduledStar_Date,
// double planning_buffer_size,double planned_cc_wait, double planned_cc_without_wait


        //InsertIntoAnalysisInfo
        //
        // public static final String INSERT_INTO_ANALYSIS_INFO="INSERT INTO "+TABLE_PROJECT_ANALYSIS_INFO+"("+
        // COLUMN_PROJECT_PlANNING_INFO_ID+
        //            ","+COLUMN_PROJECT_ANALYSIS_INFO_CC+","+
        //            COLUMN_PROJECT_ANALYSIS_INFO_PB+","+
        //            COLUMN_PROJECT_ANALYSIS_INFO_PRIORITY+
        //            ","+COLUMN_PROJECT_ANALYSIS_INFO_REMAINING_WAIT+","+
        //            COLUMN_PROJECT_ANALYSIS_INFO_STATUS+","+
        //            COLUMN_PROJECT_ANALYSIS_INFO_SCHEDULED_START_DATE+
        //            ","+COLUMN_PROJECT_EXECUTION_INFO_CC_WITH_WEIGHT+","+
        //            COLUMN_PROJECT_EXECUTION_INFO_CC_WITHOUT_WEIGHT+","+
        //            COLUMN_PROJECT_EXECUTION_INFO_BUFFER_CONSUMPTION_DAYS+","+
        //            COLUMN_PROJECT_PlANNING_INFO_BUFFER_SIZE+","+
        //            COLUMN_PROJECT_PlANNING_INFO_CC_WITHOUT_WEIGHT+","+
        //            COLUMN_PROJECT_PlANNING_INFO_CC_WITH_WEIGHT+") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        ///
        // addAnalysisDetails(Projectname ,  remaining_wait, sheduledStar_Date, planning_buffer_size, planned_cc_wait,  planned_cc_without_wait);
        try {
//            Statement statement=conn.createStatement();
//
//
//            ResultSet resultSet=statement.executeQuery("SELECT "+TABLE_PROJECT_ANALYSIS_INFO+"."+COLUMN_PROJECT_ANALYSIS_INFO_ID+" FROM "
//                    +TABLE_PROJECT_ANALYSIS_INFO+" WHERE "+TABLE_PROJECT_ANALYSIS_INFO+"."+COLUMN_PROJECT_ANALYSIS_INFO_ID+"= \""+ProjectNumber+"\"");
//            if(resultSet.next()){
//                System.out.println("The project: "+Projectname+", already exists in the Execution-info table with project Number: "+ProjectNumber);
//                return;
//            }
//            if(ProjectNumber==null){
//                System.out.println("WARNING: Sorry there is no information about: "+Projectname+", project in the project-info table!! ");
//                return;
//            }
            InsertIntoAnalysisInfo.setString(1, ProjectNumber);

            InsertIntoAnalysisInfo.setString(7, sheduledStar_Date);
            InsertIntoAnalysisInfo.setDouble(10, planning_buffer_size);
            InsertIntoAnalysisInfo.setDouble(12, planned_cc_wait);
            InsertIntoAnalysisInfo.setDouble(11, planned_cc_without_wait);

            int modifiedColumn = InsertIntoAnalysisInfo.executeUpdate();
            if (modifiedColumn != 1) {
                throw new SQLException("sorry!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        Statement statement= conn.createStatement();
//        String UPDATE_ANALYSIS_PROJECT_PLANNING="UPDATE "+TABLE_PROJECT_ANALYSIS_INFO+" SET "
//                +COLUMN_PROJECT_ANALYSIS_INFO_REMAINING_WAIT+"="+remaining_wait+","+
//                COLUMN_PROJECT_ANALYSIS_INFO_SCHEDULED_START_DATE+"= \""+sheduledStar_Date+"\" "+","+
//                COLUMN_PROJECT_PlANNING_INFO_BUFFER_SIZE+"="+planning_buffer_size+","+
//                COLUMN_PROJECT_PlANNING_INFO_CC_WITH_WEIGHT+"="+planned_cc_wait+","+
//                COLUMN_PROJECT_PlANNING_INFO_CC_WITHOUT_WEIGHT+"="+planned_cc_without_wait +
//                " WHERE "+COLUMN_PROJECT_PlANNING_INFO_ID+"= \""+ProjectID+"\"";
//
//        statement.execute(UPDATE_ANALYSIS_PROJECT_PLANNING);


    }

    /**
     * In the project execeution window
     * click finish to save all the informations to the database
     * <p>
     * This will also update the planning, analysis and execution window
     *
     * @param Projectname
     * @param ProjectNumber
     * @param Companyname
     * @param Departmentname
     * @param LeaderName
     * @param MileStonedate
     * @param CompletionDate
     * @param Actualdate
     * @param checkdate
     * @param waitCriteria
     * @param taskCriteria
     * @param Task1
     * @param Task2
     * @param Task3
     * @param Task4
     * @param Task5
     * @param Task6
     * @param Task7
     * @param Task8
     * @param Task9
     * @param Task10
     * @param Task11
     * @param Task12
     * @param Wait1
     * @param Wait2
     * @param Wait3
     * @param Wait4
     * @param Wait5
     * @param Wait6
     * @param Wait7
     * @param Wait8
     * @param Wait9
     * @param Wait10
     * @param Wait11
     * @param Wait12
     * @param Resource1
     * @param Resource2
     * @param Resource3
     * @param Resource4
     * @param Resource5
     * @param Resource6
     * @param Resource7
     * @param Resource8
     * @param Resource9
     * @param Resource10
     * @param Resource11
     * @param Resource12
     * @param currentTask
     * @param Task_exce_1
     * @param Task_exce_2
     * @param Task_exce_3
     * @param Task_exce_4
     * @param Task_exce_5
     * @param Task_exce_6
     * @param Task_exce_7
     * @param Task_exce_8
     * @param Task_exce_9
     * @param Task_exce_10
     * @param Task_exce_11
     * @param Task_exce_12
     * @param Wait_exce_1
     * @param Wait_exce_2
     * @param Wait_exce_3
     * @param Wait_exce_4
     * @param Wait_exce_5
     * @param Wait_exce_6
     * @param Wait_exce_7
     * @param Wait_exce_8
     * @param Wait_exce_9
     * @param Wait_exce_10
     * @param Wait_exce_11
     * @param Wait_exce_12
     * @param Resource_exce_1
     * @param Resource_exce_2
     * @param Resource_exce_3
     * @param Resource_exce_4
     * @param Resource_exce_5
     * @param Resource_exce_6
     * @param Resource_exce_7
     * @param Resource_exce_8
     * @param Resource_exce_9
     * @param Resource_exce_10
     * @param Resource_exce_11
     * @param Resource_exce_12
     * @param InputAvailable_Task_exce_1
     * @param InputAvailable_Task_exce_2
     * @param InputAvailable_Task_exce_3
     * @param InputAvailable_Task_exce_4
     * @param InputAvailable_Task_exce_5
     * @param InputAvailable_Task_exce_6
     * @param InputAvailable_Task_exce_7
     * @param InputAvailable_Task_exce_8
     * @param InputAvailable_Task_exce_9
     * @param InputAvailable_Task_exce_10
     * @param InputAvailable_Task_exce_11
     * @param InputAvailable_Task_exce_12
     * @param cc
     * @param pb
     * @param priority
     * @param remaining_wait
     * @param ProjectStatus
     * @param sheduledStar_Date
     * @param execution_cc_wait
     * @param execution_cc_Without_wait
     * @param execution_buffer_days
     * @param planning_buffer_size
     * @param planned_cc_wait
     * @param planned_cc_without_wait
     * @throws SQLException
     */
    public void AddNewProject_Execution_finish(String Projectname, String ProjectNumber, String Companyname, String Departmentname, String LeaderName,
                                               String MileStonedate, String CompletionDate, String Actualdate, String checkdate, String about_this_project, String waitCriteria,
                                               String taskCriteria, double Task1, double Task2, double Task3, double Task4, double Task5, double Task6,
                                               double Task7, double Task8, double Task9, double Task10, double Task11, double Task12,
                                               double Wait1, double Wait2, double Wait3, double Wait4, double Wait5, double Wait6, double Wait7,
                                               double Wait8, double Wait9, double Wait10, double Wait11, double Wait12, int Resource1, int Resource2,
                                               int Resource3, int Resource4, int Resource5, int Resource6, int Resource7, int Resource8, int Resource9,
                                               int Resource10, int Resource11, int Resource12, String currentTask, double Task_exce_1, double Task_exce_2, double Task_exce_3, double Task_exce_4, double Task_exce_5, double Task_exce_6,
                                               double Task_exce_7, double Task_exce_8, double Task_exce_9, double Task_exce_10, double Task_exce_11, double Task_exce_12, double Wait_exce_1, double Wait_exce_2,
                                               double Wait_exce_3, double Wait_exce_4, double Wait_exce_5, double Wait_exce_6, double Wait_exce_7, double Wait_exce_8, double Wait_exce_9, double Wait_exce_10,
                                               double Wait_exce_11, double Wait_exce_12, int Resource_exce_1, int Resource_exce_2, int Resource_exce_3, int Resource_exce_4, int Resource_exce_5, int Resource_exce_6,
                                               int Resource_exce_7, int Resource_exce_8, int Resource_exce_9, int Resource_exce_10, int Resource_exce_11, int Resource_exce_12, String InputAvailable_Task_exce_1,
                                               String InputAvailable_Task_exce_2, String InputAvailable_Task_exce_3, String InputAvailable_Task_exce_4, String InputAvailable_Task_exce_5,
                                               String InputAvailable_Task_exce_6, String InputAvailable_Task_exce_7, String InputAvailable_Task_exce_8, String InputAvailable_Task_exce_9,
                                               String InputAvailable_Task_exce_10, String InputAvailable_Task_exce_11, String InputAvailable_Task_exce_12,
                                               double cc, double pb, double priority, double remaining_wait,
                                               String ProjectStatus, String sheduledStar_Date, double execution_cc_wait,
                                               double execution_cc_Without_wait, double execution_buffer_days, double planning_buffer_size,
                                               double planned_cc_wait, double planned_cc_without_wait) throws SQLException {

        // ProjectName,companyName,Project Number,
        // DepartmentName,LeaderName,Milestone,
        // ScheduledStart,ActualStart,completionDate,
        // CheckingDate,About the project
        //
        // projectName[Number],wait_criteria_task_criteria_t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11,w12,R1,R2
        // R3,R4,R5,R6,R7,R8,R9,R10,R11,R12,,
        //
        // projectName[Number],currentTask,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11,w12,R1,R2
        // R3,R4,R5,R6,R7,R8,R9,R10,R11,R12,ipa1,ipa2,ipa3,ipa4,ipa5,ipa6,ipa7,ipa8,ipa9,ipa10,ipa11,ipa12
        //
        // projectname[Number],cc,pb,priority,remaining_wait,status,scheduled_start,execution_cc_wight,execution_cc_without_wight,
        // execution_buffer_days,planning_buffer_size,planned_cc_with_weight,planned_cc_without_weight
        InsertProjectDetails(ProjectNumber, Projectname, LeaderName, Companyname, Departmentname, MileStonedate, CompletionDate, Actualdate, checkdate, about_this_project);
        addplanningDetails(Projectname, waitCriteria,
                taskCriteria, Task1, Task2, Task3, Task4, Task5, Task6,
                Task7, Task8, Task9, Task10, Task11, Task12,
                Wait1, Wait2, Wait3, Wait4, Wait5, Wait6, Wait7,
                Wait8, Wait9, Wait10, Wait11, Wait12, Resource1, Resource2,
                Resource3, Resource4, Resource5, Resource6, Resource7, Resource8, Resource9,
                Resource10, Resource11, Resource12);
        addExecutionDetails(Projectname, currentTask, Task_exce_1, Task_exce_2, Task_exce_3, Task_exce_4, Task_exce_5, Task_exce_6,
                Task_exce_7, Task_exce_8, Task_exce_9, Task_exce_10, Task_exce_11, Task_exce_12, Wait_exce_1, Wait_exce_2,
                Wait_exce_3, Wait_exce_4, Wait_exce_5, Wait_exce_6, Wait_exce_7, Wait_exce_8, Wait_exce_9, Wait_exce_10,
                Wait_exce_11, Wait_exce_12, Resource_exce_1, Resource_exce_2, Resource_exce_3, Resource_exce_4, Resource_exce_5, Resource_exce_6,
                Resource_exce_7, Resource_exce_8, Resource_exce_9, Resource_exce_10, Resource_exce_11, Resource_exce_12, InputAvailable_Task_exce_1,
                InputAvailable_Task_exce_2, InputAvailable_Task_exce_3, InputAvailable_Task_exce_4, InputAvailable_Task_exce_5,
                InputAvailable_Task_exce_6, InputAvailable_Task_exce_7, InputAvailable_Task_exce_8, InputAvailable_Task_exce_9,
                InputAvailable_Task_exce_10, InputAvailable_Task_exce_11, InputAvailable_Task_exce_12);

        addAnalysisDetails(Projectname, cc, pb, priority, remaining_wait,
                ProjectStatus, sheduledStar_Date, execution_cc_wait,
                execution_cc_Without_wait, execution_buffer_days, planning_buffer_size,
                planned_cc_wait, planned_cc_without_wait);
    }

    /**
     * In the all projects window
     * updating the planning phase information
     *
     * @param Projectname
     * @param waitCriteria
     * @param taskCriteria
     * @param Task1
     * @param Task2
     * @param Task3
     * @param Task4
     * @param Task5
     * @param Task6
     * @param Task7
     * @param Task8
     * @param Task9
     * @param Task10
     * @param Task11
     * @param Task12
     * @param Wait1
     * @param Wait2
     * @param Wait3
     * @param Wait4
     * @param Wait5
     * @param Wait6
     * @param Wait7
     * @param Wait8
     * @param Wait9
     * @param Wait10
     * @param Wait11
     * @param Wait12
     * @param Resource1
     * @param Resource2
     * @param Resource3
     * @param Resource4
     * @param Resource5
     * @param Resource6
     * @param Resource7
     * @param Resource8
     * @param Resource9
     * @param Resource10
     * @param Resource11
     * @param Resource12
     * @param sheduledStar_Date
     * @param planning_buffer_size
     * @param planned_cc_wait
     * @param planned_cc_without_wait
     * @throws SQLException
     */
    public void Update_a_Project_allProjectWindow(String Projectname,
                                                  String waitCriteria,
                                                  String taskCriteria, double Task1, double Task2, double Task3, double Task4, double Task5, double Task6,
                                                  double Task7, double Task8, double Task9, double Task10, double Task11, double Task12,
                                                  double Wait1, double Wait2, double Wait3, double Wait4, double Wait5, double Wait6, double Wait7,
                                                  double Wait8, double Wait9, double Wait10, double Wait11, double Wait12, int Resource1, int Resource2,
                                                  int Resource3, int Resource4, int Resource5, int Resource6, int Resource7, int Resource8, int Resource9,
                                                  int Resource10, int Resource11, int Resource12,

                                                  String sheduledStar_Date,
                                                  double planning_buffer_size, double planned_cc_wait, double planned_cc_without_wait) throws SQLException {
        System.out.println("updating planning...... ");
        try {


            conn.setAutoCommit(false);
            String ProjectID = queryForProjectNumber(Projectname);

            if (!ProjectExists(ProjectID)) {
                System.out.println("Sorry project dsnt exist...Please change to the correct Project Name and Try again");
                return;
            }
            String UPDATE_PROJECT_PLANNING = "UPDATE " + TABLE_PROJECT_PLANNING_INFO + " SET " +
                    COLUMN_PROJECT_PlANNING_INFO_WAIT_CRITERIA + "= \"" + waitCriteria + "\" ," + COLUMN_PROJECT_PlANNING_INFO_TASK_CRITERIA + "= \"" + taskCriteria + "\" ," +
                    COLUMN_PROJECT_PlANNING_INFO_TASK1 + "= " + Task1 + " ," + COLUMN_PROJECT_PlANNING_INFO_TASK2 + "= " + Task2 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_TASK3 + "= " + Task3 + " ," + COLUMN_PROJECT_PlANNING_INFO_TASK4 + "= " + Task4 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_TASK5 + "= " + Task5 + " ," + COLUMN_PROJECT_PlANNING_INFO_TASK6 + "= " + Task6 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_TASK7 + "= " + Task7 + " ," + COLUMN_PROJECT_PlANNING_INFO_TASK8 + "= " + Task8 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_TASK9 + "= " + Task9 + " ," + COLUMN_PROJECT_PlANNING_INFO_TASK10 + "= " + Task10 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_TASK11 + "= " + Task11 + " ," + COLUMN_PROJECT_PlANNING_INFO_TASK12 + "= " + Task12 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_WAIT1 + "= " + Wait1 + " ," + COLUMN_PROJECT_PlANNING_INFO_WAIT2 + "= " + Wait2 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_WAIT3 + "= " + Wait3 + " ," + COLUMN_PROJECT_PlANNING_INFO_WAIT4 + "= " + Wait4 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_WAIT5 + "= " + Wait5 + " ," + COLUMN_PROJECT_PlANNING_INFO_WAIT6 + "= " + Wait6 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_WAIT7 + "= " + Wait7 + " ," + COLUMN_PROJECT_PlANNING_INFO_WAIT8 + "= " + Wait8 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_WAIT9 + "= " + Wait9 + " ," + COLUMN_PROJECT_PlANNING_INFO_WAIT10 + "= " + Wait10 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_WAIT11 + "= " + Wait11 + " ," + COLUMN_PROJECT_PlANNING_INFO_WAIT12 + "= " + Wait12 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_RESOURCE1 + "= " + Resource1 + " ," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE2 + "= " + Resource2 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_RESOURCE3 + "= " + Resource3 + " ," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE4 + "= " + Resource4 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_RESOURCE5 + "= " + Resource5 + " ," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE6 + "= " + Resource6 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_RESOURCE7 + "= " + Resource7 + " ," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE8 + "= " + Resource8 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_RESOURCE9 + "= " + Resource9 + " ," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE10 + "= " + Resource10 + " ," +
                    COLUMN_PROJECT_PlANNING_INFO_RESOURCE11 + "= " + Resource11 + " ," + COLUMN_PROJECT_PlANNING_INFO_RESOURCE12 + "= " + Resource12 + " " +
                    " WHERE " + COLUMN_PROJECT_PlANNING_INFO_ID + "= \"" + ProjectID + "\" ";
            // System.out.println(UPDATE_PROJECT_PLANNING.toString());
            Statement statement = conn.createStatement();
            statement.execute(UPDATE_PROJECT_PLANNING);
            // double priority,
            // double remaining_wait,
            // String sheduledStar_Date,
            // double planning_buffer_size,
            // double planned_cc_wait,
            // double planned_cc_without_wait
            String UPDATE_ANALYSIS_PROJECT_PLANNING = "UPDATE " + TABLE_PROJECT_ANALYSIS_INFO + " SET "
                    +
                    COLUMN_PROJECT_ANALYSIS_INFO_SCHEDULED_START_DATE + "= \"" + sheduledStar_Date + "\" " + "," +
                    COLUMN_PROJECT_PlANNING_INFO_BUFFER_SIZE + "=" + planning_buffer_size + "," +
                    COLUMN_PROJECT_PlANNING_INFO_CC_WITH_WEIGHT + "=" + planned_cc_wait + "," +
                    COLUMN_PROJECT_PlANNING_INFO_CC_WITHOUT_WEIGHT + "=" + planned_cc_without_wait +
                    " WHERE " + COLUMN_PROJECT_PlANNING_INFO_ID + "= \"" + ProjectID + "\"";

            statement.execute(UPDATE_ANALYSIS_PROJECT_PLANNING);  projectUpdateChangeDateTime(ProjectID);

        } catch (Exception e) {
            System.out.println("Sorry couldnot update!!!" + e.getMessage());
            try {
                System.out.println("Performing rollback");
                conn.rollback();
            } catch (SQLException e1) {
                System.out.println("Sorry couldnot update!!!" + e1.getMessage());
            }

        } finally {
            try {
                System.out.println("Resetting auto commit behaviour");
                conn.setAutoCommit(true);
            } catch (SQLException e) {
                System.out.println("Sorry couldnot update!!!" + e.getMessage());
            }

        }


    }

    /**
     * In the all project window
     * updating the execution phase information
     *
     * @param Projectname
     * @param currentTask
     * @param Task_exce_1
     * @param Task_exce_2
     * @param Task_exce_3
     * @param Task_exce_4
     * @param Task_exce_5
     * @param Task_exce_6
     * @param Task_exce_7
     * @param Task_exce_8
     * @param Task_exce_9
     * @param Task_exce_10
     * @param Task_exce_11
     * @param Task_exce_12
     * @param Wait_exce_1
     * @param Wait_exce_2
     * @param Wait_exce_3
     * @param Wait_exce_4
     * @param Wait_exce_5
     * @param Wait_exce_6
     * @param Wait_exce_7
     * @param Wait_exce_8
     * @param Wait_exce_9
     * @param Wait_exce_10
     * @param Wait_exce_11
     * @param Wait_exce_12
     * @param Resource_exce_1
     * @param Resource_exce_2
     * @param Resource_exce_3
     * @param Resource_exce_4
     * @param Resource_exce_5
     * @param Resource_exce_6
     * @param Resource_exce_7
     * @param Resource_exce_8
     * @param Resource_exce_9
     * @param Resource_exce_10
     * @param Resource_exce_11
     * @param Resource_exce_12
     * @param InputAvailable_Task_exce_1
     * @param InputAvailable_Task_exce_2
     * @param InputAvailable_Task_exce_3
     * @param InputAvailable_Task_exce_4
     * @param InputAvailable_Task_exce_5
     * @param InputAvailable_Task_exce_6
     * @param InputAvailable_Task_exce_7
     * @param InputAvailable_Task_exce_8
     * @param InputAvailable_Task_exce_9
     * @param InputAvailable_Task_exce_10
     * @param InputAvailable_Task_exce_11
     * @param InputAvailable_Task_exce_12
     * @param cc
     * @param pb
     * @param priority
     * @param execution_cc_wait
     * @param execution_cc_Without_wait
     * @param execution_buffer_days
     * @param remaining_wait
     * @throws SQLException
     */
    public void Update_a_Project_allProjectWindow(String Projectname, String currentTask, double Task_exce_1, double Task_exce_2, double Task_exce_3,
                                                  double Task_exce_4, double Task_exce_5, double Task_exce_6,
                                                  double Task_exce_7, double Task_exce_8, double Task_exce_9,
                                                  double Task_exce_10, double Task_exce_11, double Task_exce_12,
                                                  double Wait_exce_1, double Wait_exce_2, double Wait_exce_3, double Wait_exce_4,
                                                  double Wait_exce_5, double Wait_exce_6, double Wait_exce_7, double Wait_exce_8,
                                                  double Wait_exce_9, double Wait_exce_10, double Wait_exce_11, double Wait_exce_12,
                                                  int Resource_exce_1, int Resource_exce_2, int Resource_exce_3, int Resource_exce_4,
                                                  int Resource_exce_5, int Resource_exce_6, int Resource_exce_7, int Resource_exce_8,
                                                  int Resource_exce_9, int Resource_exce_10, int Resource_exce_11, int Resource_exce_12,
                                                  String InputAvailable_Task_exce_1, String InputAvailable_Task_exce_2,
                                                  String InputAvailable_Task_exce_3, String InputAvailable_Task_exce_4,
                                                  String InputAvailable_Task_exce_5, String InputAvailable_Task_exce_6,
                                                  String InputAvailable_Task_exce_7, String InputAvailable_Task_exce_8,
                                                  String InputAvailable_Task_exce_9, String InputAvailable_Task_exce_10,
                                                  String InputAvailable_Task_exce_11, String InputAvailable_Task_exce_12,
                                                  double cc, double pb, double priority, double execution_cc_wait,
                                                  double execution_cc_Without_wait, double execution_buffer_days, double remaining_wait)
            throws SQLException {

        try {

            System.out.println("updating Execution...");

            conn.setAutoCommit(false);
            String ProjectID = queryForProjectNumber(Projectname);

//            projectUpdateChangeDateTime(ProjectID);
            if (!ProjectExists(ProjectID)) {
                System.out.println("Sorry project dsnt exist...Please change to the correct Project Name and Try again");
                return;
            }
            String UPDATE_PROJECT_PLANNING = "UPDATE " + TABLE_PROJECT_EXECUTION_INFO + " SET " +
                    COLUMN_PROJECT_EXECUTION_INFO_CURRENT_TASK + "= \"" + currentTask + "\" ," +
                    COLUMN_PROJECT_EXECUTION_INFO_TASK1 + "= " + Task_exce_1 + " ," + COLUMN_PROJECT_EXECUTION_INFO_TASK2 + "= " + Task_exce_2 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_TASK3 + "= " + Task_exce_3 + " ," + COLUMN_PROJECT_EXECUTION_INFO_TASK4 + "= " + Task_exce_4 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_TASK5 + "= " + Task_exce_5 + " ," + COLUMN_PROJECT_EXECUTION_INFO_TASK6 + "= " + Task_exce_6 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_TASK7 + "= " + Task_exce_7 + " ," + COLUMN_PROJECT_EXECUTION_INFO_TASK8 + "= " + Task_exce_8 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_TASK9 + "= " + Task_exce_9 + " ," + COLUMN_PROJECT_EXECUTION_INFO_TASK10 + "= " + Task_exce_10 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_TASK11 + "= " + Task_exce_11 + " ," + COLUMN_PROJECT_EXECUTION_INFO_TASK12 + "= " + Task_exce_12 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_WAIT1 + "= " + Wait_exce_1 + " ," + COLUMN_PROJECT_EXECUTION_INFO_WAIT2 + "= " + Wait_exce_2 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_WAIT3 + "= " + Wait_exce_3 + " ," + COLUMN_PROJECT_EXECUTION_INFO_WAIT4 + "= " + Wait_exce_4 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_WAIT5 + "= " + Wait_exce_5 + " ," + COLUMN_PROJECT_EXECUTION_INFO_WAIT6 + "= " + Wait_exce_6 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_WAIT7 + "= " + Wait_exce_7 + " ," + COLUMN_PROJECT_EXECUTION_INFO_WAIT8 + "= " + Wait_exce_8 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_WAIT9 + "= " + Wait_exce_9 + " ," + COLUMN_PROJECT_EXECUTION_INFO_WAIT10 + "= " + Wait_exce_10 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_WAIT11 + "= " + Wait_exce_11 + " ," + COLUMN_PROJECT_EXECUTION_INFO_WAIT12 + "= " + Wait_exce_12 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_RESOURCE1 + "= " + Resource_exce_1 + " ," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE2 + "= " + Resource_exce_2 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_RESOURCE3 + "= " + Resource_exce_3 + " ," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE4 + "= " + Resource_exce_4 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_RESOURCE5 + "= " + Resource_exce_5 + " ," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE6 + "= " + Resource_exce_6 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_RESOURCE7 + "= " + Resource_exce_7 + " ," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE8 + "= " + Resource_exce_8 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_RESOURCE9 + "= " + Resource_exce_9 + " ," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE10 + "= " + Resource_exce_10 + " ," +
                    COLUMN_PROJECT_EXECUTION_INFO_RESOURCE11 + "= " + Resource_exce_11 + " ," + COLUMN_PROJECT_EXECUTION_INFO_RESOURCE12 + "= " + Resource_exce_12 + " , " +

                    COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK1 + "= \"" + InputAvailable_Task_exce_1 + "\" ," +
                    COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK2 + "= \"" + InputAvailable_Task_exce_2 + "\" ," +
                    COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK3 + "= \"" + InputAvailable_Task_exce_3 + "\" ," +
                    COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK4 + "= \"" + InputAvailable_Task_exce_4 + "\" ," +
                    COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK5 + "= \"" + InputAvailable_Task_exce_5 + "\" ," +
                    COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK6 + "= \"" + InputAvailable_Task_exce_6 + "\" ," +
                    COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK7 + "= \"" + InputAvailable_Task_exce_7 + "\" ," +
                    COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK8 + "= \"" + InputAvailable_Task_exce_8 + "\" ," +
                    COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK9 + "= \"" + InputAvailable_Task_exce_9 + "\" ," +
                    COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK10 + "= \"" + InputAvailable_Task_exce_10 + "\" ," +
                    COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK11 + "= \"" + InputAvailable_Task_exce_11 + "\" ," +
                    COLUMN_PROJECT_EXECUTION_INFO_INPUT_AVAILABILITY_TASK12 + "= \"" + InputAvailable_Task_exce_12 + "\" " +


                    " WHERE " + COLUMN_PROJECT_EXECUTION_INFO_ID + "= \"" + ProjectID + "\" ";
            // System.out.println(UPDATE_PROJECT_PLANNING.toString());
            Statement statement = conn.createStatement();
            statement.execute(UPDATE_PROJECT_PLANNING);


            String UPDATE_ANALYSIS_PROJECT_PLANNING = "UPDATE " + TABLE_PROJECT_ANALYSIS_INFO + " SET " +
                    COLUMN_PROJECT_ANALYSIS_INFO_REMAINING_WAIT + "=" + remaining_wait + "," +
                    COLUMN_PROJECT_ANALYSIS_INFO_CC + "=" + cc + ","
                    + COLUMN_PROJECT_ANALYSIS_INFO_PB + "=" + pb + "," +
                    COLUMN_PROJECT_ANALYSIS_INFO_PRIORITY + "=" + priority + "," +
                    COLUMN_PROJECT_EXECUTION_INFO_CC_WITHOUT_WEIGHT + "= " + execution_cc_Without_wait + "," +
                    COLUMN_PROJECT_EXECUTION_INFO_CC_WITH_WEIGHT + "=" + execution_cc_wait + "," +
                    COLUMN_PROJECT_EXECUTION_INFO_BUFFER_CONSUMPTION_DAYS + "=" + execution_buffer_days + " " +

                    " WHERE " + COLUMN_PROJECT_PlANNING_INFO_ID + "= \"" + ProjectID + "\"";

            statement.execute(UPDATE_ANALYSIS_PROJECT_PLANNING); projectUpdateChangeDateTime(ProjectID);
        } catch (Exception e) {
            System.out.println("Sorry couldnot update!!!" + e.getMessage());
            try {
                System.out.println("Performing rollback");
                conn.rollback();
            } catch (SQLException e1) {
                System.out.println("Sorry couldnot update!!!" + e1.getMessage());
            }

        } finally {
            try {
                System.out.println("Resetting auto commit behaviour");
                conn.setAutoCommit(true);
            } catch (SQLException e) {
                System.out.println("Sorry couldnot update!!!" + e.getMessage());
            }

        }


    }

    /**
     * From all projects window update th project information with the following parrameters
     *
     * @param Projectname
     * @param MileStonedate
     * @param CompletionDate
     * @param Actualdate
     * @param checkdate
     * @param ProjectStatus
     * @throws SQLException
     */
    public void Update_a_Project_allProjectWindow(String Projectname,
                                                  String MileStonedate,
                                                  String CompletionDate,
                                                  String Actualdate,
                                                  String checkdate, String ProjectStatus, String about_this_project) throws SQLException {
        try {
            conn.setAutoCommit(false);
            String ProjectID = queryForProjectNumber(Projectname);


            if (!ProjectExists(ProjectID) || ProjectID == null) {
                System.out.println("Sorry project dsnt exist...Please change to the correct Project Name and Try again");
                return;
            }
            updateProjectInfo.setString(1, MileStonedate);
            updateProjectInfo.setString(2, CompletionDate);
            updateProjectInfo.setString(3, Actualdate);
            updateProjectInfo.setString(4, checkdate);
            updateProjectInfo.setString(6, Projectname);
            updateProjectInfo.setString(5, about_this_project);
            // System.out.println(UPDATE_PROJECT_INFO.toString());
            int resultSet = updateProjectInfo.executeUpdate();

            //UPDATE project_info SET milestone_date="30-30-30", end_date="20-20-20" where project_Name="MAA Airport";
            System.out.println("****");
            if (resultSet == 1) {
                String PojectID = queryForProjectNumber(Projectname);
                String UPDATE_ANALYSIS_PROJECT_INFO = "UPDATE " + TABLE_PROJECT_ANALYSIS_INFO + " SET " + COLUMN_PROJECT_ANALYSIS_INFO_STATUS + "= \"" + ProjectStatus + "\" WHERE " +
                        COLUMN_PROJECT_PlANNING_INFO_ID + "= \"" + PojectID + "\"";
                Statement statement = conn.createStatement();
                ;
                statement.execute(UPDATE_ANALYSIS_PROJECT_INFO);  projectUpdateChangeDateTime(ProjectID);


                conn.commit();

                System.out.println("Successfully updated project Information about dates !!!! ");
                return;
            }
            System.out.println("Sorry couldnot update!!!");
        } catch (Exception e) {
            System.out.println("Sorry couldnot update!!!" + e.getMessage());
            try {
                System.out.println("Performing rollback");
                conn.rollback();
            } catch (SQLException e1) {
                System.out.println("Sorry couldnot update!!!" + e1.getMessage());
            }

        } finally {
            try {
                System.out.println("Resetting auto commit behaviour");
                conn.setAutoCommit(true);
            } catch (SQLException e) {
                System.out.println("Sorry couldnot update!!!" + e.getMessage());
            }

        }

    }


    public static final String DELETE_ENTRY_PROJECT_VIEW_INFO = "";

    /**
     * From all projects window
     * To delete a selected project
     *
     * @param Projectname
     * @throws SQLException or
     * @throws Exception
     */

    public void Delete_a_Project_allProjectWindow(String Projectname) {
        try {
            conn.setAutoCommit(false);
            String ProjectID = queryForProjectNumber(Projectname);


            DeleteProjectAnalysis.setString(1, ProjectID);

            DeleteProjectPlanning.setString(1, ProjectID);
            DeleteProjectExecution.setString(1, ProjectID);
            DeleteProjectInfo.setString(1, ProjectID);

            int modifiedAnalaysis = DeleteProjectAnalysis.executeUpdate();
            int modifiedPlanning = DeleteProjectPlanning.executeUpdate();
            int modifiedExecution = DeleteProjectExecution.executeUpdate();
            int modifiedInfo = DeleteProjectInfo.executeUpdate();
            if (modifiedAnalaysis != 1 || modifiedPlanning != 1 || modifiedExecution != 1 || modifiedInfo != 1) {
                throw new SQLException("sorry");

            }
            conn.commit(); projectUpdateChangeDateTime(ProjectID);
            System.out.println(Projectname + " ======> Deleted Successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                conn.rollback();
            } catch (SQLException e1) {
                System.out.println(e1.getMessage());
            }
        } finally {
            try {
                conn.setAutoCommit(true);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }


    //////////////////////////////////////////////////////////
    ////////////////REFRESH////////////////////////////////
    ///////////////////////////////////////////////////////

    public List<ProjectCurrentTask> refreshWeight() {
        List<ProjectCurrentTask> ProjectCurrentTask = null;
        try {
            conn.setAutoCommit(false);
            System.out.println("get the current task and the project name");
            //select project_info.project_Name,project_info.about_Project FROM project_info

            //SELECT execution_phase_info.current_task,project_info.project_Name
            //FROM execution_phase_info INNER JOIN project_info
            //ON project_info._id=execution_phase_info._id
            //WHERE  execution_phase_info.current_task like "%wait%"

            String getCurrentTask = "SELECT " + TABLE_PROJECT_EXECUTION_INFO + "." + COLUMN_PROJECT_EXECUTION_INFO_CURRENT_TASK + "," +
                    TABLE_PROJECT_INFO + "." + COLUMN_PROJECT_INFO_PROJECT_NAME + " FROM " + TABLE_PROJECT_EXECUTION_INFO + " INNER JOIN " +
                    TABLE_PROJECT_INFO + " ON " + TABLE_PROJECT_INFO + "." + COLUMN_PROJECT_INFO_ID + "=" +
                    TABLE_PROJECT_EXECUTION_INFO + "." + COLUMN_PROJECT_EXECUTION_INFO_ID +
                    " WHERE " + TABLE_PROJECT_EXECUTION_INFO + "." + COLUMN_PROJECT_EXECUTION_INFO_CURRENT_TASK + " like " + "\"%wait%\"";
            //  System.out.println(getCurrentTask.toString());
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(getCurrentTask);
            ProjectCurrentTask = new ArrayList<>();
            while (resultSet.next()) {
                ProjectCurrentTask p1 = new ProjectCurrentTask();
                p1.setCurrentTask(resultSet.getString(1));
                p1.setProjectName(resultSet.getString(2));
                //System.out.println("Current task is:"+resultSet.getString(1)+", for project Name: "+resultSet.getString(2));

                // System.out.println(resultSet.getString(1)=="wait5");
                ProjectCurrentTask.add(p1);
            }

        } catch (Exception e2) {

            System.out.println(e2.getMessage());
            try {
                conn.rollback();
            } catch (SQLException e1) {
                System.out.println(e1.getMessage());
            }
        } finally {
            try {
                conn.setAutoCommit(true);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return ProjectCurrentTask;
    }

    public void update() throws SQLException {
        int a=1;

        LocalDate Date1=LocalDate.now();
        LocalDate WeightChangeDate=getWaitChangeDate();//LocalDate.of(2021,04,8);//getWaitChangeDate(userID,password);
        final int count=1;
        if( (!Date1.equals(WeightChangeDate) ||WeightChangeDate==null)  ){

            System.out.println("Refreshing the values...................................");


            List<ProjectCurrentTask> p1 = refreshWeight();
            for (ProjectCurrentTask p : p1) {
                //a++;
                System.out.println(p.getCurrentTask() + " for: " + p.getProjectName());

//    if(p.getCurrentTask().equals("wait2")){
//        System.out.println("wait is 2 so decrease wait2");
//    }
                String GET_WEIGHT;
                String REFRESH_WAIT;
                double weight = 0;
                String ProjectID;
                ResultSet resultSet;
                Statement statement=conn.createStatement();
                switch(p.getCurrentTask()){
                    case "wait1":
                        System.out.println("wait is 1 so decrease wait1");
                        ProjectID=queryForProjectNumber(p.getProjectName());

                        GET_WEIGHT="SELECT "+TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_WAIT1+" FROM "+TABLE_PROJECT_EXECUTION_INFO+" WHERE "
                                + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";;
                        // System.out.println(GET_WEIGHT);
                        resultSet= statement.executeQuery(GET_WEIGHT);

                        if(resultSet.next()){
                            System.out.println(resultSet.getDouble(1));

                            weight=resultSet.getDouble(1)-1;
                        }
                        if(weight>=0){
                            REFRESH_WAIT="UPDATE "+TABLE_PROJECT_EXECUTION_INFO+" SET "+COLUMN_PROJECT_EXECUTION_INFO_WAIT1+"="+weight+" WHERE "
                                    + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";
                            projectUpdateChangeDateTime(ProjectID);weightUpdateChangeDateTime();
                            statement.execute(REFRESH_WAIT); System.out.println("updated the value to "+weight);
                        }
                        else System.out.println("remains the old value "+(weight+1));
                        System.out.println("........................................"); //update
                        break;
                    case "wait2":
                        System.out.println("wait is 2 so decrease wait2");
                        ProjectID=queryForProjectNumber(p.getProjectName());
                        GET_WEIGHT="SELECT "+TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_WAIT2+" FROM "+TABLE_PROJECT_EXECUTION_INFO+" WHERE "
                                + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";;
                        // System.out.println(GET_WEIGHT);
                        resultSet= statement.executeQuery(GET_WEIGHT);
                        if(resultSet.next()){
                            System.out.println(resultSet.getDouble(1));
                            weight=resultSet.getDouble(1)-1;
                        }
                        if(weight>=0){
                            REFRESH_WAIT="UPDATE "+TABLE_PROJECT_EXECUTION_INFO+" SET "+COLUMN_PROJECT_EXECUTION_INFO_WAIT2+"="+weight+" WHERE "
                                    + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";
                            statement.execute(REFRESH_WAIT);  projectUpdateChangeDateTime(ProjectID);weightUpdateChangeDateTime();

                            System.out.println("updated the value to "+weight);
                        }
                        else System.out.println("remains the old value "+(weight+1));
                        System.out.println("........................................");
                        //update
                        break;
                    case "wait3":
                        System.out.println("wait is 3 so decrease wait3");
                        ProjectID=queryForProjectNumber(p.getProjectName());
                        GET_WEIGHT="SELECT "+TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_WAIT3+" FROM "+TABLE_PROJECT_EXECUTION_INFO+" WHERE "
                                + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";;
                        // System.out.println(GET_WEIGHT);
                        resultSet= statement.executeQuery(GET_WEIGHT);

                        if(resultSet.next()){
                            System.out.println(resultSet.getDouble(1));

                            weight=resultSet.getDouble(1)-1;
                        }
                        if(weight>=0){
                            REFRESH_WAIT="UPDATE "+TABLE_PROJECT_EXECUTION_INFO+" SET "+COLUMN_PROJECT_EXECUTION_INFO_WAIT3+"="+weight+" WHERE "
                                    + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";
                            projectUpdateChangeDateTime(ProjectID);
                            statement.execute(REFRESH_WAIT);weightUpdateChangeDateTime();
                            System.out.println("updated the value to "+weight);
                        }
                        else System.out.println("remains the old value "+(weight+1));
                        System.out.println("........................................"); //update
                        break;
                    case "wait4":
                        System.out.println("wait is 4 so decrease wait4");
                        ProjectID=queryForProjectNumber(p.getProjectName());
                        GET_WEIGHT="SELECT "+TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_WAIT4+" FROM "+TABLE_PROJECT_EXECUTION_INFO+" WHERE "
                                + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";;
                        // System.out.println(GET_WEIGHT);
                        resultSet= statement.executeQuery(GET_WEIGHT);

                        if(resultSet.next()){
                            System.out.println(resultSet.getDouble(1));

                            weight=resultSet.getDouble(1)-1;
                        }
                        if(weight>=0){
                            REFRESH_WAIT="UPDATE "+TABLE_PROJECT_EXECUTION_INFO+" SET "+COLUMN_PROJECT_EXECUTION_INFO_WAIT4+"="+weight+" WHERE "
                                    + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";  projectUpdateChangeDateTime(ProjectID);
                            statement.execute(REFRESH_WAIT);weightUpdateChangeDateTime();
                            System.out.println("updated the value to "+weight);
                        }
                        else System.out.println("remains the old value "+(weight+1));
                        System.out.println("........................................"); //update
                        break;
                    case "wait5":
                        System.out.println("wait is 5 so decrease wait5");
                        ProjectID=queryForProjectNumber(p.getProjectName());
                        GET_WEIGHT="SELECT "+TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_WAIT5+" FROM "+TABLE_PROJECT_EXECUTION_INFO+" WHERE "
                                + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";;
                        // System.out.println(GET_WEIGHT);
                        resultSet= statement.executeQuery(GET_WEIGHT);

                        if(resultSet.next()){
                            System.out.println(resultSet.getDouble(1));

                            weight=resultSet.getDouble(1)-1;
                        }
                        if(weight>=0){
                            REFRESH_WAIT="UPDATE "+TABLE_PROJECT_EXECUTION_INFO+" SET "+COLUMN_PROJECT_EXECUTION_INFO_WAIT5+"="+weight+" WHERE "
                                    + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";  projectUpdateChangeDateTime(ProjectID);
                            statement.execute(REFRESH_WAIT);weightUpdateChangeDateTime();
                            System.out.println("updated the value to "+weight);
                        }
                        else System.out.println("remains the old value "+(weight+1));
                        System.out.println("........................................"); //update
                        break;
                    case "wait6":
                        System.out.println("wait is 6 so decrease wait6");
                        ProjectID=queryForProjectNumber(p.getProjectName());
                        GET_WEIGHT="SELECT "+TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_WAIT6+" FROM "+TABLE_PROJECT_EXECUTION_INFO+" WHERE "
                                + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";;
                        // System.out.println(GET_WEIGHT);
                        resultSet= statement.executeQuery(GET_WEIGHT);

                        if(resultSet.next()){
                            System.out.println(resultSet.getDouble(1));

                            weight=resultSet.getDouble(1)-1;
                        }
                        if(weight>=0){
                            REFRESH_WAIT="UPDATE "+TABLE_PROJECT_EXECUTION_INFO+" SET "+COLUMN_PROJECT_EXECUTION_INFO_WAIT6+"="+weight+" WHERE "
                                    + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";  projectUpdateChangeDateTime(ProjectID);
                            statement.execute(REFRESH_WAIT);weightUpdateChangeDateTime();
                            System.out.println("updated the value to "+weight);
                        }
                        else System.out.println("remains the old value "+(weight+1));
                        System.out.println("........................................"); //update
                        break;
                    case "wait7":
                        System.out.println("wait is 7 so decrease wait7");
                        ProjectID=queryForProjectNumber(p.getProjectName());
                        GET_WEIGHT="SELECT "+TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_WAIT7+" FROM "+TABLE_PROJECT_EXECUTION_INFO+" WHERE "
                                + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";;
                        // System.out.println(GET_WEIGHT);
                        resultSet= statement.executeQuery(GET_WEIGHT);

                        if(resultSet.next()){
                            System.out.println(resultSet.getDouble(1));

                            weight=resultSet.getDouble(1)-1;
                        }
                        if(weight>=0){
                            REFRESH_WAIT="UPDATE "+TABLE_PROJECT_EXECUTION_INFO+" SET "+COLUMN_PROJECT_EXECUTION_INFO_WAIT7+"="+weight+" WHERE "
                                    + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";
                            statement.execute(REFRESH_WAIT);weightUpdateChangeDateTime();
                            System.out.println("updated the value to "+weight);  projectUpdateChangeDateTime(ProjectID);
                        }
                        else System.out.println("remains the old value "+(weight+1));
                        System.out.println("........................................"); //update
                        break;
                    case "wait8":
                        System.out.println("wait is 8 so decrease wait8");
                        ProjectID=queryForProjectNumber(p.getProjectName());
                        GET_WEIGHT="SELECT "+TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_WAIT8+" FROM "+TABLE_PROJECT_EXECUTION_INFO+" WHERE "
                                + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";;
                        // System.out.println(GET_WEIGHT);
                        resultSet= statement.executeQuery(GET_WEIGHT);

                        if(resultSet.next()){
                            System.out.println(resultSet.getDouble(1));

                            weight=resultSet.getDouble(1)-1;
                        }
                        if(weight>=0){
                            REFRESH_WAIT="UPDATE "+TABLE_PROJECT_EXECUTION_INFO+" SET "+COLUMN_PROJECT_EXECUTION_INFO_WAIT8+"="+weight+" WHERE "
                                    + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";
                            statement.execute(REFRESH_WAIT);weightUpdateChangeDateTime();
                            System.out.println("updated the value to "+weight);  projectUpdateChangeDateTime(ProjectID);
                        }
                        else System.out.println("remains the old value "+(weight+1));
                        System.out.println("........................................"); //update
                        break;
                    case "wait9":
                        System.out.println("wait is 9 so decrease wait9");
                        ProjectID=queryForProjectNumber(p.getProjectName());
                        GET_WEIGHT="SELECT "+TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_WAIT9+" FROM "+TABLE_PROJECT_EXECUTION_INFO+" WHERE "
                                + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";;
                        // System.out.println(GET_WEIGHT);
                        resultSet= statement.executeQuery(GET_WEIGHT);

                        if(resultSet.next()){
                            System.out.println(resultSet.getDouble(1));

                            weight=resultSet.getDouble(1)-1;
                        }
                        if(weight>=0){
                            REFRESH_WAIT="UPDATE "+TABLE_PROJECT_EXECUTION_INFO+" SET "+COLUMN_PROJECT_EXECUTION_INFO_WAIT9+"="+weight+" WHERE "
                                    + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";  projectUpdateChangeDateTime(ProjectID);
                            statement.execute(REFRESH_WAIT);weightUpdateChangeDateTime();
                            System.out.println("updated the value to "+weight);
                        }
                        else System.out.println("remains the old value "+(weight+1));
                        System.out.println("........................................"); //update
                        break;

                    case "wait10":
                        System.out.println("wait is 10 so decrease wait10");
                        ProjectID=queryForProjectNumber(p.getProjectName());
                        GET_WEIGHT="SELECT "+TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_WAIT10+" FROM "+TABLE_PROJECT_EXECUTION_INFO+" WHERE "
                                + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";;
                        // System.out.println(GET_WEIGHT);
                        resultSet= statement.executeQuery(GET_WEIGHT);

                        if(resultSet.next()){
                            System.out.println(resultSet.getDouble(1));

                            weight=resultSet.getDouble(1)-1;
                        }
                        if(weight>=0){
                            REFRESH_WAIT="UPDATE "+TABLE_PROJECT_EXECUTION_INFO+" SET "+COLUMN_PROJECT_EXECUTION_INFO_WAIT10+"="+weight+" WHERE "
                                    + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";  projectUpdateChangeDateTime(ProjectID);
                            statement.execute(REFRESH_WAIT);weightUpdateChangeDateTime();
                            System.out.println("updated the value to "+weight);
                        }
                        else System.out.println("remains the old value "+(weight+1));
                        System.out.println("........................................"); //update
                        //System.out.println("wait is 10 so decrease wait10");
                        //update
                        break;
                    case "wait11":
                        System.out.println("wait is 11 so decrease wait11");
                        ProjectID=queryForProjectNumber(p.getProjectName());
                        GET_WEIGHT="SELECT "+TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_WAIT11+" FROM "+TABLE_PROJECT_EXECUTION_INFO+" WHERE "
                                + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";;
                        // System.out.println(GET_WEIGHT);
                        resultSet= statement.executeQuery(GET_WEIGHT);

                        if(resultSet.next()){
                            System.out.println(resultSet.getDouble(1));

                            weight=resultSet.getDouble(1)-1;
                        }
                        if(weight>=0){
                            REFRESH_WAIT="UPDATE "+TABLE_PROJECT_EXECUTION_INFO+" SET "+COLUMN_PROJECT_EXECUTION_INFO_WAIT11+"="+weight+" WHERE "
                                    + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";
                            statement.execute(REFRESH_WAIT);
                            weightUpdateChangeDateTime();
                            projectUpdateChangeDateTime(ProjectID);
                            System.out.println("updated the value to "+weight);
                        }
                        else System.out.println("remains the old value "+(weight+1));
                        System.out.println("........................................"); //update
                        // System.out.println("wait is 10 so decrease wait10");
                        //update
                        break;
                    case "wait12":
                        System.out.println("wait is 12 so decrease wait12");
                        ProjectID=queryForProjectNumber(p.getProjectName());
                        GET_WEIGHT="SELECT "+TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_WAIT12+" FROM "+TABLE_PROJECT_EXECUTION_INFO+" WHERE "
                                + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";;
                        // System.out.println(GET_WEIGHT);
                        resultSet= statement.executeQuery(GET_WEIGHT);

                        if(resultSet.next()){
                            System.out.println(resultSet.getDouble(1));

                            weight=resultSet.getDouble(1)-1;
                        }
                        if(weight>=0){
                            REFRESH_WAIT="UPDATE "+TABLE_PROJECT_EXECUTION_INFO+" SET "+COLUMN_PROJECT_EXECUTION_INFO_WAIT12+"="+weight+" WHERE "
                                    + TABLE_PROJECT_EXECUTION_INFO+"."+COLUMN_PROJECT_EXECUTION_INFO_ID+"=\""+ProjectID+"\"";
                            statement.execute(REFRESH_WAIT);
                            weightUpdateChangeDateTime();
                            projectUpdateChangeDateTime(ProjectID);System.out.println("updated the value to "+weight);
                        }
                        else System.out.println("remains the old value "+(weight+1));
                        System.out.println("........................................"); //update
                        // System.out.println("wait is 10 so decrease wait10");
                        //update
                        break;
                }


            }


//            System.out.println(".............a is "+a);
        }
//        else if(WeightChangeDate==null){
//            System.out.println("WARNING: you can only refresh one time !!!! ");
//        }
        else if(Date1.equals(WeightChangeDate)){
            System.out.println("WARNING: you can only refresh one time !!!! ");
        }
    }



    public boolean login(String userID, String Password) throws SQLException {

        String GetEmailID="SELECT "+COLUMN_USER_LOGIN_INFO_Password+" FROM "+TABLE_USER_LOGIN_INFO+
                " WHERE "+TABLE_USER_LOGIN_INFO+"."+COLUMN_USER_LOGIN_INFO_UserId+"=\""+userID+"\" AND "+
                TABLE_USER_LOGIN_INFO+"."+COLUMN_USER_LOGIN_INFO_Password+"=\""+Password+"\"";

        String UPDATE_LAST_LOGIN_DATE="UPDATE "+TABLE_USER_LOGIN_INFO+" SET "+COLUMN_USER_LOGIN_INFO_LAST_LOGIN+
                "=\""+df.format(TODAYS_DATE)+"\""+" WHERE "+TABLE_USER_LOGIN_INFO+"."+COLUMN_USER_LOGIN_INFO_UserId+"=\""+userID+"\" AND "+
                TABLE_USER_LOGIN_INFO+"."+COLUMN_USER_LOGIN_INFO_Password+"=\""+Password+"\"";

        Statement statement=conn.createStatement();
        ResultSet resultSet=statement.executeQuery(GetEmailID);
        if(resultSet.next()){
            if(resultSet.getString(1)!=null){





                statement.execute(UPDATE_LAST_LOGIN_DATE);

                return true;
            }
        }
        //SELECT password FROM user_login_info WHERE userId="jisha" AND password="134";
        return false;
    }
    private LocalDate getWaitChangeDate() throws SQLException {
        String GetWaitChangeDate="SELECT "+COLUMN_USER_LOGIN_INFO_LAST_WEIGHT_UPDATE+" FROM "+TABLE_USER_LOGIN_INFO;


        Statement statement=conn.createStatement();
        ResultSet resultSet=statement.executeQuery(GetWaitChangeDate);
        if(resultSet.next()){
            if(resultSet.getString(1)!=null){





                return LocalDate.parse(resultSet.getString(1));
            }
        }
        //SELECT password FROM user_login_info WHERE userId="jisha" AND password="134";


        return null;
    }
    public void projectUpdateChangeDateTime(String ProjectNumber) throws SQLException {
        String UPDATE_LAST_LOGIN_DATE="UPDATE "+TABLE_PROJECT_INFO+" SET "+COLUMN_USER_LOGIN_INFO_LAST_PROJECT_DATA_CHANGED+
                "=\""+df.format(TODAYS_DATE)+"\""+" WHERE "+
                TABLE_PROJECT_INFO+"."+COLUMN_PROJECT_INFO_ID+"=\""+ProjectNumber+"\"";
        Statement statement=conn.createStatement();
        statement.execute(UPDATE_LAST_LOGIN_DATE);
    }

    /**
     *

     * @throws SQLException
     */
    public void weightUpdateChangeDateTime() throws SQLException {
        String UPDATE_LAST_LOGIN_DATE="UPDATE "+TABLE_USER_LOGIN_INFO+" SET "+COLUMN_USER_LOGIN_INFO_LAST_WEIGHT_UPDATE+
                "=\""+TODAYS_DATE_ONLY+"\"";
        //System.out.println(UPDATE_LAST_LOGIN_DATE.toString());
        Statement statement=conn.createStatement();
        statement.execute(UPDATE_LAST_LOGIN_DATE);
    }
    static String choice = null;
    public double remainingWait(String ProjectName) throws SQLException {
        //get the current task
        double Task1 = 0,Task2=0,Task3=0,Task4=0,Task5=0,Task6=0,Task7=0,Task8=0,Task9=0,Task10=0,Task11=0,Task12=0;
        double wait1=0,wait2=0,wait3=0,wait4=0,wait5=0,wait6=0,wait7=0,wait8=0,wait9=0,wait10=0,wait11=0,wait12=0;
        double remainingWait=-1;
        String projectNumber=queryForProjectNumber(ProjectName);
        System.out.println("Project number is "+projectNumber);
        String GET_CURRENT_TASK=" SELECT "+COLUMN_PROJECT_EXECUTION_INFO_CURRENT_TASK
                +","+COLUMN_PROJECT_EXECUTION_INFO_TASK1
                +","+COLUMN_PROJECT_EXECUTION_INFO_TASK2
                +","+COLUMN_PROJECT_EXECUTION_INFO_TASK3
                +","+COLUMN_PROJECT_EXECUTION_INFO_TASK4
                +","+COLUMN_PROJECT_EXECUTION_INFO_TASK5
                +","+COLUMN_PROJECT_EXECUTION_INFO_TASK6
                +","+COLUMN_PROJECT_EXECUTION_INFO_TASK7
                +","+COLUMN_PROJECT_EXECUTION_INFO_TASK8
                +","+COLUMN_PROJECT_EXECUTION_INFO_TASK9
                +","+COLUMN_PROJECT_EXECUTION_INFO_TASK10
                +","+COLUMN_PROJECT_EXECUTION_INFO_TASK11
                +","+COLUMN_PROJECT_EXECUTION_INFO_TASK12

                +","+COLUMN_PROJECT_EXECUTION_INFO_WAIT1
                +","+COLUMN_PROJECT_EXECUTION_INFO_WAIT2
                +","+COLUMN_PROJECT_EXECUTION_INFO_WAIT3
                +","+COLUMN_PROJECT_EXECUTION_INFO_WAIT4
                +","+COLUMN_PROJECT_EXECUTION_INFO_WAIT5
                +","+COLUMN_PROJECT_EXECUTION_INFO_WAIT6
                +","+COLUMN_PROJECT_EXECUTION_INFO_WAIT7
                +","+COLUMN_PROJECT_EXECUTION_INFO_WAIT8
                +","+COLUMN_PROJECT_EXECUTION_INFO_WAIT9
                +","+COLUMN_PROJECT_EXECUTION_INFO_WAIT10
                +","+COLUMN_PROJECT_EXECUTION_INFO_WAIT11
                +","+COLUMN_PROJECT_EXECUTION_INFO_WAIT12

                +" FROM "+
                TABLE_PROJECT_EXECUTION_INFO+" WHERE "+
                TABLE_PROJECT_EXECUTION_INFO+"."+
                COLUMN_PROJECT_EXECUTION_INFO_ID+" = \""+projectNumber+"\"";
      //  System.out.println(GET_CURRENT_TASK.toString());
        Statement statement=conn.createStatement();
        ResultSet resultSet=statement.executeQuery(GET_CURRENT_TASK);
        if(resultSet.next()){
           // System.out.println(resultSet.getString(1));
            choice=resultSet.getString(1);

            Task1=resultSet.getInt(2);
            Task2=resultSet.getInt(3);
            Task3=resultSet.getInt(4);
            Task4=resultSet.getInt(5);
            Task5=resultSet.getInt(6);
            Task6=resultSet.getInt(7);
            Task7=resultSet.getInt(8);
            Task8=resultSet.getInt(9);
            Task9=resultSet.getInt(10);
            Task10=resultSet.getInt(11);
            Task11=resultSet.getInt(12);
            Task12=resultSet.getInt(13);

            wait1=resultSet.getInt(14);
            wait2=resultSet.getInt(15);
            wait3=resultSet.getInt(16);
            wait4=resultSet.getInt(17);
            wait5=resultSet.getInt(18);
            wait6=resultSet.getInt(19);
            wait7=resultSet.getInt(20);
            wait8=resultSet.getInt(21);
            wait9=resultSet.getInt(22);
            wait10=resultSet.getInt(23);
            wait11=resultSet.getInt(24);
            wait12=resultSet.getInt(25);


            System.out.println("current task is "+choice);
            System.out.println("wait value is ");
            System.out.println(wait1+" "+wait2+" "+wait3+" "+wait4+" "+wait5+" "+wait6+" "+wait7+" "+wait8+" "+wait9+" "+wait10+" "+wait11+" "+wait12);
            System.out.println("Task value is ");
            System.out.println(Task1+" "+Task2+" "+Task3+" "+Task4+" "+Task5+" "+Task6+" "+Task7+" "+Task8+" "+Task9+" "+Task10+" "+Task11+" "+Task12);

        }

        switch(choice){

            case "wait1":
                remainingWait=(wait1-1)+Task1+Task2+Task3+Task4+Task5+Task6+Task7+Task8+Task9+Task10+Task11+Task12+
                wait2+wait3+wait4+wait5+wait6+wait7+wait8+wait9+wait10+wait11+wait12;

                return remainingWait;

            case "Task1":
                remainingWait=Task1+Task2+Task3+Task4+Task5+Task6+Task7+Task8+Task9+Task10+Task11+Task12+
                        wait2+wait3+wait4+wait5+wait6+wait7+wait8+wait9+wait10+wait11+wait12;
                return remainingWait;
            case "wait2":

                remainingWait=
                        (wait2)+wait3+wait4+wait5+wait6+wait7+wait8+wait9+wait10+wait11+wait12;
                return remainingWait;
            case "Task2":
                remainingWait=Task2+Task3+Task4+Task5+Task6+Task7+Task8+Task9+Task10+Task11+Task12+
                        wait3+wait4+wait5+wait6+wait7+wait8+wait9+wait10+wait11+wait12;
                return remainingWait;

            case "wait3":remainingWait=Task3+Task4+Task5+Task6+Task7+Task8+Task9+Task10+Task11+Task12+
                    wait3-1+wait4+wait5+wait6+wait7+wait8+wait9+wait10+wait11+wait12;
                return remainingWait;

            case "Task3":remainingWait=Task3+Task4+Task5+Task6+Task7+Task8+Task9+Task10+Task11+Task12+
                    +wait4+wait5+wait6+wait7+wait8+wait9+wait10+wait11+wait12;
                return remainingWait;


            case "wait4":remainingWait=Task4+Task5+Task6+Task7+Task8+Task9+Task10+Task11+Task12+
                    wait4-1+wait5+wait6+wait7+wait8+wait9+wait10+wait11+wait12;
                return remainingWait;

            case "Task4":
                remainingWait=Task4+Task5+Task6+Task7+Task8+Task9+Task10+Task11+Task12+
                        wait5+wait6+wait7+wait8+wait9+wait10+wait11+wait12;
                return remainingWait;
            case "wait5":
                remainingWait=Task5+Task6+Task7+Task8+Task9+Task10+Task11+Task12+
                        wait5-1+wait6+wait7+wait8+wait9+wait10+wait11+wait12;
                return remainingWait;
            case "Task5":
                remainingWait=Task5+Task6+Task7+Task8+Task9+Task10+Task11+Task12+
                        +wait6+wait7+wait8+wait9+wait10+wait11+wait12;
                return remainingWait;
            case "wait6":
                remainingWait=Task6+Task7+Task8+Task9+Task10+Task11+Task12+
                        wait6-1+wait7+wait8+wait9+wait10+wait11+wait12;
                return remainingWait;
            case "Task6":
                remainingWait=Task6+Task7+Task8+Task9+Task10+Task11+Task12+
                        +wait7+wait8+wait9+wait10+wait11+wait12;
                return remainingWait;
            case "wait7":
                remainingWait=Task7+Task8+Task9+Task10+Task11+Task12+
                        wait7-1+wait8+wait9+wait10+wait11+wait12;
                return remainingWait;
            case "Task7":
                break;
            case "wait8":
                break;
            case "Task8":
                break;
            case "wait9":
                break;
            case "Task9":
                break;
            case "wait10":
                break;
            case "Task10":
                break;
            case "wait11":
                break;
            case "Task11":
                break;
            case "wait12":
                break;
            case "Task12":
                break;

            default:
                System.out.println("WARNING! cannot find thi project info");
                break;
        }

        return remainingWait;
    }







    public List<ProjectCurrentTask> queryViewFor_based_on_department_for_Table(String DepartmentName){
        try{
            int departmentID=insertDepartment(DepartmentName);

            String QUERY_VIEW_NEW="SELECT "+ALL_PROJECT_VIEW+"."+COLUMN_PROJECT_INFO_PROJECT_NAME+
                    ","+ALL_PROJECT_VIEW+"."+COLUMN_PROJECT_PlANNING_INFO_TASK_CRITERIA+
                    ","+ALL_PROJECT_VIEW+"."+COLUMN_PROJECT_INFO_MILESTONE_DATE+
                    ","+ALL_PROJECT_VIEW+"."+COLUMN_PROJECT_ANALYSIS_INFO_CC+
                    ","+ALL_PROJECT_VIEW+"."+COLUMN_PROJECT_ANALYSIS_INFO_PB+
                    ","+ALL_PROJECT_VIEW+"."+COLUMN_PROJECT_ANALYSIS_INFO_REMAINING_WAIT+","+TABLE_PROJECT_INFO+"."+COLUMN_DEPARTMENT_ID+


                    " FROM "+ALL_PROJECT_VIEW+" INNER JOIN "+TABLE_PROJECT_INFO+" ON "+
                    TABLE_PROJECT_INFO+"."+COLUMN_PROJECT_INFO_PROJECT_NAME+"="+ALL_PROJECT_VIEW+"."+COLUMN_PROJECT_INFO_PROJECT_NAME+


                    " WHERE "+COLUMN_PROJECT_INFO_DEPARTMENT+" = "+departmentID;
            System.out.println(QUERY_VIEW_NEW.toString());
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY_VIEW_NEW);
            //System.out.println(QUERY_VIEW_NEW.toString());
            List<ProjectCurrentTask> projects=new ArrayList<>();
            while(resultSet.next()){

                ProjectCurrentTask All=new ProjectCurrentTask();


                All.setCurrentTask(resultSet.getString(2));
                All.setProjectName(resultSet.getString(1));


                //System.out.println(All.getProjectName());
                projects.add(All);

            }
            return projects;
        }

        catch(Exception e){
            System.out.println("querying view error is -");
            e.printStackTrace();
            return null;
        }

    }




    public void Save_Department(){

    }
}
