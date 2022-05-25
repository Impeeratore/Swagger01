package co.develhope.Swagger01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefControllers {

    @GetMapping
    public String defMsg (){
        return "For more info localhost:1234/swagger-ui/";
    }
}
