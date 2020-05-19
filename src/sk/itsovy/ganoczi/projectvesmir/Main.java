package sk.itsovy.ganoczi.projectvesmir;

public class Main {
    public static void main(String[] args) {

        Sun sun=Sun.getInstance();

        sun.addPlanet(new Planet("Earth"));
        sun.addPlanet(new Planet("Venus"));
        sun.addPlanet(new Planet("Jupiter"));
        sun.addPlanet(new Planet("Mars"));

        sun.printPlanets();


    }
}
