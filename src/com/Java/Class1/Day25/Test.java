package com.Java.Class1.Day25;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/28 8:08
 */
public class Test {

    public static void main(String[] args) {

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
}