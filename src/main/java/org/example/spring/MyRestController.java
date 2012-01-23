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
    private MyProfileService profileService;

    @Autowired
    public MyRestController(MyService myService, MyProfileService profileService){
        this.myService = myService;
        this.profileService = profileService;
    }
    
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public @ResponseBody String helloWorld(){
        return myService.getHelloWord();
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public @ResponseBody String profile(){
        return profileService.getProfileName();
    }
}
