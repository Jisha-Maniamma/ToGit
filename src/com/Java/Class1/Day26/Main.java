package com.Java.Class1.Day26;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/25 14:52
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Database1 dataSource=new Database1();
        ////////////////////////////////////////////////////
//        DataSource.FirstName="Jishaaaa";
//        System.out.println(DataSource.getFirstName());;
//        dataSource.setDatabaseName("aaasJisha","Maniamma","IT");
//        DataSource.DATABASE_NAME="DATABASE_NAME";
//        System.out.println(DataSource.DATABASE_NAME);
//        System.out.println(DataSource.getDatabaseName());D
        dataSource.setCONNECTION("a","a","a");
        System.out.println("\n");
        System.out.println("***************************************");
        System.out.println(dataSource.getCONNECTION());
        System.out.println("***************************************");
        System.out.println("\n");
        System.out.println("***************************************");
        ////////////////////////////////////////////////////
        if(!dataSource.open()){
            System.out.println("!error cannot open");
            return;
        }


        if(dataSource.createTable()){
            System.out.println("Tables successfully created");
        }
        System.out.println("***************************************");

        ///////////////////////////////////////////////
        if(!dataSource.startTableDataModification()){
            System.out.println("!error with prepare statement ");
            return;
        }


        /*
        login ke time - save company,fnam,lname,email,dob,gender,from which company

         */
        System.out.println("\n");
        System.out.println("***************************************");
        System.out.println("Adding login-in info");
        System.out.println("***************************************");
        dataSource.insetUserLoginInfo("jisha","maniamma","jisha@jp.com","F","Juntos","05/06/2000","jisha","1234","07/04/2021");
        dataSource.insetUserLoginInfo("Kato","Ikeda","jisha@jp.com","M","NTT","05/06/1998","Kato","1234","07/04/2021");
        dataSource.insetUserLoginInfo("Kato","Ikeda","jisha@jp.com","M","NTT","05/06/1998","Kaato","1234","07/04/2021");
        dataSource.insetUserLoginInfo("Kato","Ikeda","kaato@jp.com","M","NTT","05/06/1998","Kato","1234","07/04/2021");
        dataSource.insetUserLoginInfo("Sato","Maeda","Sato@jp.com","M","NTT","05/06/1998","Sato","1234","07/04/2021");
        dataSource.insetUserLoginInfo("Sato","Maeda","Sasto@jp.com","M","juntos","05/06/1998","KSato","1234","07/04/2021");
        System.out.println("***************************************");
//
//        System.out.println("\n");
//        System.out.println("***************************************");
//        //must be hidden
//        System.out.println("requesting the id of save email address");
//        System.out.println("***************************************");
//        System.out.println("The id of the login user with email id is "+dataSource.FindUserUsingEmailID("abc@a.com"));
//        System.out.println("The id of the login user with email id is "+dataSource.FindUserUsingEmailID("ppfp@y.com"));
//        System.out.println("The id of the login user with email id is "+dataSource.FindUserUsingEmailID("jisha@india.com"));
//        System.out.println("The id of the login user with email id is "+dataSource.FindUserUsingEmailID("jisha@google.com"));
//        System.out.println("***************************************");
//
//        System.out.println("\n");
//        System.out.println("***************************************");
//        System.out.println("Inserting company");
//        System.out.println("***************************************");
//        System.out.println("The location of the company in the Company table is "+dataSource.insertCompany("GAP"));;
//        System.out.println("The location of the company in the Company table is "+dataSource.insertCompany("gaP"));;
//        System.out.println("***************************************");
//
//        System.out.println("\n");
//        System.out.println("***************************************");
//        System.out.println("Insert the department names");
//        System.out.println("***************************************");
//        System.out.println("The location of the department --> "+"Civil"+" --> in the Department table is "+dataSource.insertDepartment("Civil"));
//        System.out.println("The location of the department --> "+"IT"+" --> in the Department table is "+dataSource.insertDepartment("IT"));
//        System.out.println("The location of the department --> "+"Construction"+" --> in the Department table is "+dataSource.insertDepartment("Construction"));
//        System.out.println("The location of the department --> "+"Mechanical"+" --> in the Department table is "+dataSource.insertDepartment("Mechanical"));
//        System.out.println("The location of the department --> "+"mechanical"+" --> in the Department table is "+dataSource.insertDepartment("mechanical"));
//        System.out.println("The location of the department --> "+"construction"+" --> in the Department table is "+dataSource.insertDepartment("construction"));
//        System.out.println("The location of the department --> "+"iT"+" --> in the Department table is "+dataSource.insertDepartment("iT"));
//        System.out.println("The location of the department --> "+"Aerospace"+" --> in the Department table is "+dataSource.insertDepartment("Aerospace"));
//        System.out.println("The location of the department --> "+"mechanical"+" --> in the Department table is "+dataSource.insertDepartment("mechanical"));
//        System.out.println("***************************************");
//
//        System.out.println("\n");
//        System.out.println("***************************************");
//        System.out.println("get password");
//        System.out.println("***************************************");
//        System.out.println("Password for  --> jdnvkjdxa@jp.com: "+dataSource.getPassword("jdnvkjdxa@jp.com"));
//        System.out.println("Password for  --> jisha@jp.com: "+dataSource.getPassword("jisha@jp.com"));
//
//        System.out.println("***************************************");
//
//        System.out.println("\n");
//        System.out.println("***************************************");
//        System.out.println("Adding the leader info");
//        System.out.println("***************************************");
//        ////project details window inputs-
//        /*
//                    Projectname,companyName,Project Number,
//                    DepartmentName,LeaderName,Milestone,
//                    Scheduledstart,Actaulsatrt,completionDate,
//                    Checkingdate,About the project
//         */
//        //  System.out.println(dataSource.AddLeader("jisha"));
//        System.out.println("Adding leader JiSha at :"+dataSource.AddLeader("JiSha"));
//        System.out.println("Adding leader Jishnu at :"+dataSource.AddLeader("Jishnu"));
//        System.out.println("Adding leader JiShNU at :"+dataSource.AddLeader("JiShNU"));
//        System.out.println("Adding leader JiShNUA at :"+dataSource.AddLeader("JiShNUA"));
//        System.out.println("Adding leader JIShaMP at :"+dataSource.AddLeader("JIShaMP"));
//        System.out.println("Adding leader AA at :"+dataSource.AddLeader("AA"));
//        System.out.println("***************************************");
//
//
//
//
//
//        System.out.println("\n");
//        System.out.println("***************************************");
//        System.out.println("Adding the project info");
//        System.out.println("***************************************");
//        System.out.println(dataSource.InsertProjectDetails("ABC1","Tokyo Bridge","Sato","Kyutech","sales","2020/10/12",
//                "2025/10/10","2021/01/03","2021/04/01"));;
//
//        System.out.println(dataSource.InsertProjectDetails("Abc1","ToKYo Bridge","x","Kyutech","sales","2020/10/12",
//                "2025/10/10","2021/01/03","2021/04/01"));;
//
//        System.out.println(dataSource.InsertProjectDetails("Abc1"," Bridge","xyy","Kyutech","sales","2020/10/12",
//                "2025/10/10","2021/01/03","2021/04/01"));;
//        System.out.println(dataSource.InsertProjectDetails("a","ToKYo Bridge","xyy","Kyutech","sales","2020/10/12",
//                "2025/10/10","2021/01/03","2021/04/01"));;
//        System.out.println(dataSource.InsertProjectDetails("Abc123","Bridge","xyy","Kyutech","sales","2020/10/12",
//                "2025/10/10","2021/01/03","2021/04/01"));;
//        System.out.println(dataSource.InsertProjectDetails("12A","Tokyo","xyy","Kyutech","sales","2020/10/12",
//                "2025/10/10","2021/01/03","2021/04/01"));;
//
//
//        System.out.println(dataSource.InsertProjectDetails("1Aplus","Okinawa Bridge","Ram","Juntos","Civil",null,
//                null,null,null));;
//        System.out.println(dataSource.InsertProjectDetails("2Aplus","kyoto Bridge","Ram","Juntos","Civil",null,
//                null,null,null));;
//        System.out.println("***************************************");
//
//        System.out.println("\n");
//        System.out.println("***************************************");
//        System.out.println("Get Project Number from the Project name");
//        System.out.println("***************************************");
//        System.out.println("Project Tokyo BRIdge is at location :"+dataSource.queryForProjectNumber("Tokyo BRIdge"));
//        System.out.println("Project BRIdge is at location :"+dataSource.queryForProjectNumber("BRIdge"));
//        System.out.println("***************************************");
//
//        System.out.println("\n");
//        System.out.println("***************************************");
//        System.out.println("Inserting planning info");
//        System.out.println("***************************************");
///*
//projectName[Number],wait_crieria_task_criteri_t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,w1,w2,w3,w4,w5,
// w6,w7,w8,w9,w10,w11,w12,R1,R2
//R3,R4,R5,R6,R7,R8,R9,R10,R11,R12,,
// */
//        dataSource.addplanningDetails("Tokyo BRIDGE","固定","Task2",0,5,2,5,5,5,5,
//                5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,
//                5,5,5,5,5,5,5,5,5,5,5,5);
//        // dataSource.addplanningDetails("Tokyo bridgE","a","a",0,5,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,
//        5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5);
//        dataSource.addplanningDetails("a","a","a",0,5,2,5,5,5,5,5,5,
//                5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,
//                5,5,5,5,5,5,5,5,5,5,5);
//        dataSource.addplanningDetails("Tokyo ","固定","Task2",0,5,2,5,5,5,5,5,
//                5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,
//                5,5,5,5,5,5,5,5,5,5,5);
//        dataSource.addplanningDetails("Tokyo","固定","Task2",0,5,2,5,5,5,5,5,
//                5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,
//                5,5,5,5,5,5,5,5,5,5,5);
//        dataSource.addplanningDetails("Okinawa Bridge","","",0,0,0,0,0,0,0,0,
//                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
//                0,0,0,0,0,0,0,0,0,0,0,0);
//        dataSource.addplanningDetails("KYOTO Bridge",null,null,0,0,0,0,0,0,0,0,0,0
//                ,0,0,0,0,0,0,0,0,0,0
//                ,0,0,0,0,0,0,0,0
//                ,0,0,0,0,0,0,0,0);
//
//        System.out.println("***************************************");
//
//
//        System.out.println("\n");
//        System.out.println("***************************************");
//        System.out.println("Inserting Execution info");
//        System.out.println("***************************************");
//        /*
//        projectName[Number],currntTask,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11,w12,R1,R2
//        R3,R4,R5,R6,R7,R8,R9,R10,R11,R12,ipa1,ipa2,ipa3,ipa4,ipa5,ipa6,ipa7,ipa8,ipa9,ipa10,ipa11,ipa12
//        */
//        dataSource.addExecutionDetails("Tokyo BRIDGE","Task1",0,5,2,5,5,5,5,5,5,
//                5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,
//                5,5,5,5,5,5,5,5,5,5,5,
//                "yes","no","no","no","no","no",
//                "no","no","no","no","no","no");
//        dataSource.addExecutionDetails("Tokyo","Task1",0,5,2,5,5,5,5,5,5,
//                5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,
//                5,5,5,5,5,5,5,5,5,5,5,
//                "yes","no","no","no","no","no",
//                "no","no","no","no","no","no");
//        dataSource.addExecutionDetails("T","Task1",0,5,2,5,5,5,5,5,5,
//                5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,
//                5,5,5,5,5,5,5,5,5,5,5,
//                "yes","no","no","no","no","no",
//                "no","no","no","no","no","no");
//        dataSource.addExecutionDetails("Okinawa Bridge","",0,0,0,0,0,0,0,0,0,
//                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
//                0,0,0,0,0,0,0,0,0,0,0,
//                "","","","","","",
//                "","","","","","");
//        dataSource.addExecutionDetails("KYOTO Bridge",null,0,0,0,0,0,0,0,0,0,
//                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
//                0,0,0,0,0,0,0,0,0,0,0,
//                null,null,null,null,null,null,
//                null,null,null,null,null,null);
//
//
//        System.out.println("***************************************");


        System.out.println("**********************************************************************************************");
        dataSource.close();
    }
}
