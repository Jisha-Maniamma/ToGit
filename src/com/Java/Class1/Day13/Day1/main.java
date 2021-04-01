package com.Java.Class1.Day13.Day1;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/01 8:13
 */
public class main {
    public static void main(String[] args) {
        Project p=new Project();
/////////////////////////////////////////////////
        System.out.println(p.projectname);
//        printname(p);
//        System.out.println(p.getProjectname());;
//        print(p);
//        System.out.println(p.getProjectname());;
        p.printName(p.projectname);
        System.out.println(p.projectname);
////////////////////////////////////////////////////
        System.out.println("////////////////////");
        System.out.println(p.Age);
        p.modify(p.Age);
        System.out.println(p.Age);
        System.out.println("///////////////////");

    }

    private static void print(Project p) {
        p.projectname="management";
    }

    static void printname(Project p){
        p.setName("construction");
    }
}
////////////////////////////////////////////////////////////////////////////////
class Project{
    String projectname;
    int Age;
    void modify(int age){
        Age+=1;
        System.out.println(Age);
    }

    public String getProjectname() {
        return projectname;
    }


//    public Project(String projectname){
//        this.projectname=projectname;
//    }

    public void setName(String projectname){
        this.projectname=projectname;
    }
    public void printName(String project){
        project=projectname+1111111111;
        System.out.println(project);
    }

}