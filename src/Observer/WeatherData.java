package Observer;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

	private float temprature;
	private float humidity;
	private float pressure;
	
	public WeatherData()
	{
		
	}
	
	public void measurementsChanged()
	{
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure)
	{
		this.temprature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature()
	{
		return temprature;
	}
	
	public float getHumidity()
	{
		return humidity;
	}
	
	public float getPressure()
	{
		return pressure;
	}
}
