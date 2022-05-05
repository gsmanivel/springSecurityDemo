package springSecurityDemo.springSecurityDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/myBalance")
    public String myBalance() {
        return "Hi Welcome to My Balance Section";
    }
}
