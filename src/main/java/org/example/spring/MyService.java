package org.example.spring;

import org.springframework.stereotype.Component;

/**
 * @author zuther
 */
@Component
public class MyService {
    public String getHelloWord(){
        return "helloworld";
    }
}
