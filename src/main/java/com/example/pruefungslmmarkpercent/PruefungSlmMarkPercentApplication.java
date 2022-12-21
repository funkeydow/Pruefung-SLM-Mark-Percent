package com.example.pruefungslmmarkpercent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PruefungSlmMarkPercentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PruefungSlmMarkPercentApplication.class, args);
    }

    @GetMapping("api/mark")
    public String GetMarkFromPercentage(@RequestParam(name="percentage") String msg){
        int percentage = Integer.valueOf(msg);
        if(percentage >= 88){
            return "1";
        }
        else if (percentage >= 75 && percentage < 88){
            return "2";
        }
        else if (percentage >= 63 && percentage < 75){
            return "3";
        }
        else if (percentage >= 50 && percentage < 63){
            return "4";
        }
        else if (percentage < 50){
            return "5";
        }
        else{
            return "Your value wasn´t in the allowed range";
        }
    }
}
