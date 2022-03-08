package com.Java.Class1.Day46;

import java.util.*;

public class main {
    private static Map<String,celetialbodies> solarSystem=new HashMap<>();
    private static Set<celetialbodies> planets=new HashSet<>();

    private static Set<celetialbodies> planets1=new TreeSet<>();
    public static void main(String[] args) {
        celetialbodies temp=new celetialbodies("Erth",365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        celetialbodies tempMoon = new celetialbodies("Moon", 27);
        temp.addMoon(tempMoon);
        solarSystem.put(tempMoon.getName(), tempMoon);

        temp = new celetialbodies("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new celetialbodies("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new celetialbodies("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars
        for(celetialbodies a:planets){
            System.out.println(a.getName()+" "+a.getOrbitalPeriod()+" "+a.gtSatellites());
        }

        for(celetialbodies a:solarSystem.get("Mars").gtSatellites()){
            System.out.println(a.getName()+" "+a.getOrbitalPeriod()+" "+a.gtSatellites().size());
        }

        Set<celetialbodies> moons = new HashSet<>();
        for(celetialbodies a:planets){
          moons.addAll(a.gtSatellites());
        }
        for(celetialbodies moon : moons) {
            System.out.println("\t" + moon.getName());
        }
    }
}
