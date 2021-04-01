package com.Java.Class1.Day13.Day2;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/01 8:13
 */
public class main {

    public static void main(String[] args) {
        Project1 project1=new Project1("Software Development");
        Project1 project2=new Project1("Bridge Development");
        System.out.println(project1.projctName);
        System.out.println(project2.projctName);
        swap(project1,project2);
        System.out.println(project1.projctName);
        System.out.println(project2.projctName);

    }

    public static void swap(Project1 p1,Project1 p2){
//will not change avalues
        Project1 temp1=p1;
        p1=p2;
        p2=temp1;
// will change values
        String temp=p1.projctName;
        p1.projctName=p2.projctName;
        p2.projctName=temp;

    }
}
class Project1{
    public String projctName;
    public Project1(String projctName){
        this.projctName=projctName;
    }
    public void setName(String name){
        projctName=name;
    }

    public String getname(){
        return this.projctName;
    }



}
