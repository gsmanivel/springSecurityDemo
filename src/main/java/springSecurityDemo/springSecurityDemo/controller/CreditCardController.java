package springSecurityDemo.springSecurityDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardController {

    @GetMapping("/myCards")
    public String myCards() {
        return "Hi Welcome to Credit Card Section";
    }
}
