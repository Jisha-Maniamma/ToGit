package com.Java.Class1.Day47;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBodies> solarSystem=new HashMap<>();
    private static Set<HeavenlyBodies> planets=new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBodies tmp=new HeavenlyBodies("mars",69);
        solarSystem.put(tmp.getName(),tmp);
        planets.add(tmp);

        tmp=new HeavenlyBodies("earth",365);
        solarSystem.put(tmp.getName(),tmp);
        planets.add(tmp);
        HeavenlyBodies moon=new HeavenlyBodies("moon",24);
        HeavenlyBodies moon1=new HeavenlyBodies("moon",124);
        tmp.addMoon(moon);
        tmp.addMoon(moon1);
        solarSystem.put(moon.getName(), moon);
        solarSystem.put(moon1.getName(), moon1);
        tmp=new HeavenlyBodies("venus",39);
       solarSystem.put(tmp.getName(),tmp);
        planets.add(tmp);

        tmp=new HeavenlyBodies("Jupiter",639);
        solarSystem.put(tmp.getName(),tmp);
        planets.add(tmp);

        System.out.println("==========================================");
        for(HeavenlyBodies b:planets){
            System.out.println("   "+b.getName());
        }
        System.out.println("==========================================");

        for(HeavenlyBodies b:solarSystem.get("earth").getMoon()){
            System.out.println("   "+b.getName().hashCode());
        }

        System.out.println("==========================================");
      for (String s:solarSystem.keySet()){
          System.out.println(solarSystem.get(s).getName());
      }

    }

}
