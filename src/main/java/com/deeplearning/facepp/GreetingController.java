package com.deeplearning.facepp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  @Autowired
  CounterService counterService;

  @GetMapping(path = "/greeting")
  @ResponseBody
  public ResponseEntity<String> greeting() {
    counterService.increment("method.invoked.greetingController.greeting");
    return new ResponseEntity<String>("hello", HttpStatus.OK);
  }
}
