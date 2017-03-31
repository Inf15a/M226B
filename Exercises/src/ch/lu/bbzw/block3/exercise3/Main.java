package ch.lu.bbzw.block3.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import ch.lu.bbzw.block3.exercise3.athletes.Bicyclist;
import ch.lu.bbzw.block3.exercise3.athletes.Minigolfer;
import ch.lu.bbzw.block3.exercise3.athletes.Surfer;
import ch.lu.bbzw.block3.exercise3.athletes.TennisPlayer;
import ch.lu.bbzw.block3.exercise3.athletes.footballplayers.Center;
import ch.lu.bbzw.block3.exercise3.athletes.footballplayers.FootballPlayer;
import ch.lu.bbzw.block3.exercise3.athletes.footballplayers.Striker;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Person> allePersonen = new ArrayList<>();
        allePersonen.add(new Priest("Tarocci", "Don Camillo"));
        allePersonen.add(new Surfer("Slater", "Kelly"));
        allePersonen.add(new TennisPlayer("Djokovic", "Novak"));
        allePersonen.add(new Bicyclist("Cancellara", "Fabian"));
        allePersonen.add(new FootballPlayer("Derdiyok", "Eren", new Striker()));
        allePersonen.add(new FootballPlayer("Barnetta", "Tranquilo", new Center()));
        allePersonen.add(new FootballPlayer("Philip", "Senderos", new Center()));
        allePersonen.add(new Minigolfer("Franz", "von Hinten"));

        for (Person pe : allePersonen)
            pe.print();

        TimeUnit.SECONDS.sleep(5);
        Meteo.setWeather("Regen");
        TimeUnit.SECONDS.sleep(5); // wartet 5 Sekunden
        Meteo.setWeather("Sonnenschein");

        while (true) {
            TimeUnit.SECONDS.sleep(5); // wartet 5 Sekunden
        }

    }

}
