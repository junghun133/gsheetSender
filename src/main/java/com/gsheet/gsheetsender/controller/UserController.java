package com.gsheet.gsheetsender.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping("api/user")
public class UserController {

    @RequestMapping(value = "/add", method = {RequestMethod.POST})
    public String userAdditional(HttpServletRequest httpServletRequest, @RequestParam Object object) throws IOException {
        return null;
    }

}
