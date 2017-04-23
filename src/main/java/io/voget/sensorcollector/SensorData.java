package io.voget.sensorcollector;

import java.util.Date;

public class SensorData {
	
	private String sensorName;
	
	private Date timestamp;
	private String sensorValue;
	
	public String getSensorName() {
		return sensorName;
	}
	
	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getSensorValue() {
		return sensorValue;
	}
	
	public void setSensorValue(String sensorValue) {
		this.sensorValue = sensorValue;
	}

}
