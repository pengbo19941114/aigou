package com.example.aigou.web.controller;

import com.example.aigou.AjaxResult;
import com.example.aigou.domain.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    //RequsetBody: accept the params from request body
    public AjaxResult login(@RequestBody Employee employee){
        if (employee.getUsername().equals("admin") && employee.getPassword().equals("admin")){
            return AjaxResult.me().setMsg("Login Success");
        }else {
            return AjaxResult.me().setSuccess(false).setMsg("Login Error");
        }
    }
}
