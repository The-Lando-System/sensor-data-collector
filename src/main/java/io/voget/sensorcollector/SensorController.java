package io.voget.sensorcollector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SensorController {

	@Autowired SimpMessagingTemplate websocketMsg;

	@RequestMapping(path="/sensor-data",method=RequestMethod.POST)
	@ResponseBody
    public SensorData testGreeting(@RequestBody SensorData sensorData) {
		websocketMsg.convertAndSend("/topic/sensor",sensorData);
		return sensorData;
    }

	
}
