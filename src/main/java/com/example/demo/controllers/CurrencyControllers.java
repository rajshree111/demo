package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Currency;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
//@RequestMapping("/gsp")
public class CurrencyControllers {
	
	 @PostMapping("/add-currency")
	    public ResponseEntity<?> addCurrency(@Valid @RequestBody Currency currency) {
		 System.out.println(".........."+ currency.getConversionRate()+"#####"+currency.getDate() );
		  return new ResponseEntity<Currency>(currency, HttpStatus.OK);
	 }

}
