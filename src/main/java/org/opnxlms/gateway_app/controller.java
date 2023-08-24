package org.opnxlms.gateway_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class controller {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/home")
    public String home() {
        return "Home Page"+ " <a href=\"/logout\">Logout</a>";
    }
}
