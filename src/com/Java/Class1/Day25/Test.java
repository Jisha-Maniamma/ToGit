package com.Java.Class1.Day25;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/28 8:08
 */
public class Test {

    public static void main(String[] args) {
        Emp emp1=new Emp("Krishna",6,12300);
        Emp emp2=new Emp("Jisha",1,12300);

        List<Emp> empArrayList=new ArrayList<>();
        empArrayList.add(emp1);
        empArrayList.add(emp2);

        filter(empArrayList,new ValidatePerformanceRating());


        System.out.println();
        System.out.println("//////////////////////////////////////");

        validate validatearray=e -> e.getPerformance()>=5;
        filter(empArrayList,validatearray);
        System.out.println();
        System.out.println("//////////////////////////////////////");
        empArrayList.forEach(n -> System.out.println(n.getName().startsWith("K")));

    }

    private static void filter(List<Emp> empArrayList, validate rule) {
        for(Emp e:empArrayList){
            if(rule.check(e)){
                System.out.println(e);
            }
        }

    }
}

interface  validate{
    boolean check(Emp emp);
}
class ValidatePerformanceRating implements validate {
    public boolean check(Emp emp){
        return emp.getPerformance()>=5;
    }
}
class Emp{
    String name;
    int performance;
    double salary;

    public Emp(String name, int performance, double salary) {
        this.name = name;
        this.performance = performance;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getPerformance() {
        return performance;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name;
    }
}