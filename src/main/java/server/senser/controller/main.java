package server.senser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import server.senser.json.SensorData;

@Controller
public class main {
    @GetMapping("/json")
    public String home(@RequestBody SensorData data, Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://175.113.68.69:2222/json";
        String json = restTemplate.getForObject(url, String.class);
        model.addAttribute("sensor", json);
        System.out.println("json = " + json);
        return "index";
    }
}
