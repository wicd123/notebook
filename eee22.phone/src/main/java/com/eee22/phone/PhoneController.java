package com.eee22.phone;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eee22.model.ModelPhone;
import com.eee22.service.IServicePhone;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PhoneController {
	
	private static final Logger logger = LoggerFactory.getLogger(PhoneController.class);
	
	@Autowired
	IServicePhone svrphone;
	
	@RequestMapping(value = "/phone/writeone", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	    logger.info("writeone :: get", locale);
        
        return "phone/writeOneForm";
	    
	    
	}
	
	
	@RequestMapping(value = "/phone/writeonelist", method = RequestMethod.POST)
	public String writeone1(Locale locale, Model model, HttpServletRequest request) {
		logger.info("writeone1 :: post", locale);
		String phname = request.getParameter("phname");
		String phfactory = request.getParameter("phfactory");
		Integer phprice = Integer.valueOf(request.getParameter("phprice"));
		
		ModelPhone phone = new ModelPhone(phname, phfactory, phprice);
		
		int result = svrphone.insertPhone(phone);
		
		
		List<ModelPhone> list = svrphone.getPhoneList();
		
		model.addAttribute("list", list);
		
		return "phone/writeListResult";
	}
	
}
