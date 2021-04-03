/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.archteam.sitiopublico.controller.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author marcos
 */
@Controller
public class base {
    
    @GetMapping("/")
    public String Home(){
        return "index";
    }
    
    @GetMapping("/about")
    public String pageAbout(){
        return "base/about";
    }
    
    @GetMapping("/ContactUs")
    public String pageContact(){
        return "base/contact";
    }
}
