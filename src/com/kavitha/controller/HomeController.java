package com.kavitha.controller;

import com.kavitha.model.AppUser;
import com.kavitha.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HomeController {

    @Autowired
    AppUserService appUserService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> home() {
        AppUser appUser = appUserService.get(1);
         return ResponseEntity.ok(appUser);
    }
    
    @RequestMapping(value ="/1" ,method = RequestMethod.GET)
    public ResponseEntity<?> manager() {
        
        AppUser appUser1 =appUserService.get(2);
        return ResponseEntity.ok(appUser1);
    }
}