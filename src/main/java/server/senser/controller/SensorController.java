package server.senser.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class SensorController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String mapRequest(@RequestBody HashMap<String, Object> param){
        System.out.println("param : " + param);
        return param.toString();
    }
}