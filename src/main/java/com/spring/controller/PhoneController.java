package com.spring.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.ModelPhone;
import com.spring.service.IServicePhone;

public class PhoneController {
	
	private static final Logger logger = LoggerFactory.getLogger(PhoneController.class);
	
    @Autowired
    @Qualifier("phoneService")
    private IServicePhone phonesrv;

    
    @RequestMapping(value = "phone/writeone", method = RequestMethod.GET)
    public String writeone(Locale locale, Model model) {
        logger.info("writeone :: get", locale);
        
        return "phone/writeOneForm";
        
        
    }
    
    @RequestMapping(value = "phone/writeonelist", method = RequestMethod.GET)
    public String writeonelist(Model model) {
        logger.info("writeonelist");
        
        List<ModelPhone> phone = phonesrv.getPhoneList();
        
        model.addAttribute("phone", phone);
        
        return "phone/writeOneResult";
    }
    
}
