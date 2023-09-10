package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiBilli {
    @Autowired
    Billi obj;

    @GetMapping("billi1")
    public Billi getdata(){
        return obj;
    }
    @GetMapping("billi2")

    public Billi getnew(){
        return obj;
    }

}