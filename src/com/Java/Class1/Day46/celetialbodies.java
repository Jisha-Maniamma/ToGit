package com.Java.Class1.Day46;

import java.util.HashSet;
import java.util.Set;

final public class celetialbodies {
    private final String name;
    private final double orbitalPeriod;
    private final Set<celetialbodies> satellites;
    celetialbodies(String name,double orbitalPeriod){
        this.name=name;
        this.orbitalPeriod=orbitalPeriod;
        satellites=new HashSet<>();
    }
    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }



}
