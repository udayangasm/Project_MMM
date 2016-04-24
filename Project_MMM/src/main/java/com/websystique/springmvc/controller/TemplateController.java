package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {//Serves Templates.

    @RequestMapping(value="/category")
    public String getMainTemplate() {
    	return "all_categories";	
    }

    @RequestMapping(value="/category/Computers")
    public String getComputersTemplate() {
    	return "Admin";	
    }

    @RequestMapping(value="/login")
    public String getLoginTemplate() {
    	return "UserManagement";	
    }
    
    @RequestMapping(value="/admin")
    public String getAdminTemplate() {
    	return "Admin";	
    }
    
    @RequestMapping(value="/createAccount")
    public String getCreateAccountTemplate() {
    	return "createAccount";	
    }


}

