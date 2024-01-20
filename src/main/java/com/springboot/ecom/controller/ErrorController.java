package com.springboot.ecom.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
 

public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

	@GetMapping("/error")
    public String handleError(HttpServletRequest request) {
		return "error";          
        
    }
     
}
