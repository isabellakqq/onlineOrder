package com.laioffer.onlineOrder.controller;
import com.laioffer.onlineOrder.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class SignUpController {
    //Use the @RequestMapping annotation to define REST API, such as HTTP URL, method, etc
    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void signUp(@RequestBody Customer customer) {
        //handle signup resquest

    }
}
