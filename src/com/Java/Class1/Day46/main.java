package com.Java.Class1.Day46;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {
    private static Map<String,celetialbodies> solarSystem=new HashMap<>();
    private static Set<celetialbodies> planets=new HashSet<>();


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


    }
}
