package observerPattern;

import java.util.ArrayList;

public class WeatherData implements Subject{
	
	private ArrayList observers;
	float temperature = 0;
	float humidity = 0;
	float pressure = 0;
	
	
	public WeatherData() {
		observers = new ArrayList();
	}
	
	
	
	
	
	@Override
	public void registerObserver(Observer o) {            // ����� ����������� ������������ � ����� ������ 
		// TODO Auto-generated method stub        
		observers.add(o);                          
	}
	
	@Override                                             //���� ����������� ����� �������� ����������� �� ������� ������� ��� �� ������
       	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}
	}
	
	
	@Override
	public void notifyObservers() {                      //���������� ������������ �� ��������� ��������� ����� ����� update()
		                                                 //����������� ����� ������������
		// TODO Auto-generated method stub
		
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);		
		}
		
		
	}
	
	public void measurementsChanged() {                  //���������� ������������ � ��������� ����� �����
		notifyObservers();
	}

     public void setMeasurements(float temperature, float humidity, float pressure) {
    	 this.temperature = temperature;                                               // �������� � ������� ���������� ����� ��� �� ���������,
    	 this.humidity = humidity;                                                     // ������� ������ ������ ������ � ���������� �� ������������� 
    	 this.pressure = pressure;                                                     // �������� �������. ��� ������� �� ������ �������� ��� 
     }                                                                                 //��� �������� ������ �� ��������� 
	
	
	
	
	
}
