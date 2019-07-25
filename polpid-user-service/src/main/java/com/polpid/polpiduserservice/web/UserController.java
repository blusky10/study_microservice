package com.polpid.polpiduserservice.web;

import com.polpid.polpiduserservice.properties.ServiceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private ServiceProperties serviceProperties;

    @GetMapping(value = "/name")
    public ResponseEntity<String> getName(){
        return new ResponseEntity<>( serviceProperties.getName(), HttpStatus.OK);
    }

}
