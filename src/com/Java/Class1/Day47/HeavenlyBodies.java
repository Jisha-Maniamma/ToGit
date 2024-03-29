package com.Java.Class1.Day47;

import java.util.HashSet;
import java.util.Set;

final class HeavenlyBodies {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBodies> satellites;
    HeavenlyBodies(String name,double orbitalPeriod){
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

    public void addMoon(HeavenlyBodies moon){
        this.satellites.add(moon);
    }
    public Set<HeavenlyBodies> getMoon(){
        return new HashSet<>(this.satellites);
    }


    @Override
    public boolean equals(Object HeavenlyBodiess){
        if(HeavenlyBodiess==null){
           return false;
        }
            if(this==HeavenlyBodiess){
            return true;
        }
        System.out.println(((HeavenlyBodies)HeavenlyBodiess).getName().equals(this.name));
            if(HeavenlyBodiess instanceof HeavenlyBodies)
              return ((HeavenlyBodies)HeavenlyBodiess).getName().equals(this.name);
            return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
