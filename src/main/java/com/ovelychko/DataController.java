package com.ovelychko;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class DataController {

    @RequestMapping(value = "/user")
    public Principal user(Principal principal) {
        return principal;
    }

}
