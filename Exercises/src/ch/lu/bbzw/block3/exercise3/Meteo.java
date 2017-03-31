package ch.lu.bbzw.block3.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Meteo {
	private static String weather = "";
	private static List<WheaterChangeListener> weatherChangeListeners = new ArrayList<>();

	private Meteo() {
		// nobody should create an instance of this method
	}

	public static void addWheaterChangeListener(WheaterChangeListener listener) {
		weatherChangeListeners.add(listener);
	}

	public static void setWeather(String weather) {
		String oldWeather = Meteo.weather;
		Meteo.weather = weather;
		fireWeatherChangeListeners(oldWeather);
	}

	private static void fireWeatherChangeListeners(String oldWeather) {
		for (WheaterChangeListener wheaterChangeListener : weatherChangeListeners) {
			wheaterChangeListener.onChange(weather, oldWeather);
		}
	}

	@FunctionalInterface
	public interface WheaterChangeListener {
		void onChange(String newWeather, String oldWeather);
	}
}
