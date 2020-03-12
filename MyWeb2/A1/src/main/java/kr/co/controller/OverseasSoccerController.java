package kr.co.controller;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.Dto.EplDTO;
import kr.co.Service.EplService;

@Controller
public class OverseasSoccerController {

	@Inject
	EplService eplservice;
	
	//OverseasSoccer
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String OverseasSoccer(Model model)throws Exception{
		
		List<EplDTO> test = eplservice.test();
		model.addAttribute("test",test);
		return "/home";
		
	}
}
