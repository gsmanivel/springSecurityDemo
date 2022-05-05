package springSecurityDemo.springSecurityDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/myContact")
    public String myCards() {
        return "Hi Welcome to My Contact Section";
    }


}
