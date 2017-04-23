package io.voget.sensorcollector;

import java.util.Date;

public class SensorData {
	
	private String sensorName;
	private String sensorValue;
	private Date timestamp;
	
	public String getSensorName() {
		return sensorName;
	}
	
	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}
	
	public String getSensorValue() {
		return sensorValue;
	}
	
	public void setSensorValue(String sensorValue) {
		this.sensorValue = sensorValue;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}
