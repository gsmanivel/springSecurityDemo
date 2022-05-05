package springSecurityDemo.springSecurityDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/myNotice")
    public String myNotice() {
        return "Hi Welcome to My Notice Section";
    }
}
