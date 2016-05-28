package com.epss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/")
@SessionAttributes("roles")
public class LectorController {
    @RequestMapping(value = { "/registrationLector"}, method = RequestMethod.GET)
    public String listUsers(ModelMap model) {

        return "registrationLector";
    }
    @RequestMapping(value = { "/lector", "/lector/cabinet" }, method = RequestMethod.GET)
    public String lector(ModelMap model) {

        return "lector/cabinet";
    }
}