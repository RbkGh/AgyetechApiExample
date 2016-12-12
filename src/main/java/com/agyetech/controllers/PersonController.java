package com.agyetech.controllers;

import com.agyetech.model.PersonObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ace Programmer Rbk
 *         <Rodney Kwabena Boachie at [rodney@swiftpot.com,rbk.unlimited@gmail.com]> on
 *         12-Dec-16 @ 2:01 PM
 */
@RestController
@RequestMapping(path="/agyetech/person")
public class PersonController {

    @RequestMapping(method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean submitPersonData(@RequestBody PersonObject personObject){
        System.out.println("firstName = "+personObject.getFirstName());
        System.out.println("lastName = "+personObject.getLastName());
        System.out.println("age = "+personObject.getAge());

        return true;
    }

}
