package com.gsh.springbootwebexample;

import org.springframework.web.bind.annotation.*;


@RestController
public class HelloRestService {

    @RequestMapping(path = "/hello/{name}", method = RequestMethod.GET)
    public String sayHelloPathParam(@PathVariable(value = "name") String name){
        return "Hello "+name;
    }

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String sayHelloQueryParam(@RequestParam("name") String name){
        return "Hello "+name;
    }
}
