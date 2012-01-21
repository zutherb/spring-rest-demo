package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zuther
 */
@Controller
public class MyRestController {

    private MyService myService;

    @Autowired
    public MyRestController(MyService myService){
        this.myService = myService;
    }
    
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public @ResponseBody String helloWorld(){
        return myService.getHelloWord();
    }
}
