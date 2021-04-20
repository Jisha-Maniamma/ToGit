package com.Java.Class1.Day16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/20 8:43
 */
public class main {
    public static void main(String[] args) {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date=LocalDate.now();
        System.out.println(date);
        String date1=date.format(df);
        System.out.println(date1+1);
        LocalDate date3=LocalDate.parse(date1);
        System.out.println(date3);
        //System.out.println(date1);
        Project project =new Project("okinawa");
        System.out.println(project.getProjectName());
        changeProjectName1(project);
        System.out.println(project.getProjectName());
        changeProjectName(project);
        System.out.println(project.getProjectName());
        System.out.println("........polymorphism........");
        Project itProject=new ITprojct("software");
        System.out.println(itProject.getProjectName());
        System.out.println(itProject.getProjectName());
        changeProjectName(itProject);
        System.out.println(itProject.getProjectName());
        itProject.ProjectsatrtDate();
        itProject.ProjectEnddate();
        System.out.println("................");
        ITprojct itProject1=new ITprojct("software");
        System.out.println(itProject1.getProjectName());
        System.out.println(itProject1.getProjectName());
        changeProjectName(itProject1);
        System.out.println(itProject1.getProjectName());
        itProject1.ProjectsatrtDate();
        itProject1.ProjectEnddate();

    }

    private  static void changeProjectName(Project p1){
        p1.setProjectName("tokyo");
    }
    private static void changeProjectName1(Project p1){
        p1=new Project("osaka");
        System.out.println("new object created "+p1.getProjectName());
    }
}
class Project{
    private String projectName;

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void ProjectsatrtDate(){
        System.out.println("project started one year back");
    }

    public void ProjectEnddate(){
        System.out.println("project must end within one year");
    }

}
class ITprojct extends Project{

    public ITprojct(String projectName) {
        super(projectName);
    }
    public void ProjectsatrtDate(){
        System.out.println("project started one month back");
    }
}