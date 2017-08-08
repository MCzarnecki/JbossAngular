package com.example.ui;

import com.example.buisiness.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(path = "path", method = RequestMethod.GET)
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>(helloService.hello(), HttpStatus.OK);
    }
}
