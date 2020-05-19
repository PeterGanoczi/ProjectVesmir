package sk.itsovy.ganoczi.projectvesmir;

import java.util.ArrayList;

public class Sun {

    private ArrayList<Planet> planets=new ArrayList<>();

    private static Sun instance=new Sun();

    private Sun(){

    }

    public static Sun getInstance(){
        return instance;
    }

    public void addPlanet(Planet planet){
        planets.add(planet);
    };

    public void printPlanets(){
        for (Planet planet : planets){
            System.out.println(planet.getName());
        }
    }
}
