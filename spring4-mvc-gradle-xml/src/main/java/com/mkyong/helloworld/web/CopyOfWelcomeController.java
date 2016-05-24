package com.mkyong.helloworld.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.StudentDao;
import com.dao.impl.StudentDaoImpl;
import com.mkyong.helloworld.service.HelloWorldService;

@Controller
@RequestMapping("/test")
public class CopyOfWelcomeController {

	private final Logger logger = LoggerFactory.getLogger(CopyOfWelcomeController.class);
	private final HelloWorldService helloWorldService;
	
	@Resource(name="StudentDaoImpl")
	private StudentDaoImpl studentDao;
	

	@Autowired
	public CopyOfWelcomeController(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String index(Map<String, Object> model) {
		List student = this.studentDao.selectAll();
		logger.debug("index() is executed!");

		model.put("title", "~~~~~~~~~~~~~");
		model.put("msg", helloWorldService.getDesc());
		
		return "index";
	}

	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {

		logger.debug("hello() is executed - $name {}", name);

		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		
		model.addObject("title", helloWorldService.getTitle(name));
		model.addObject("msg", helloWorldService.getDesc());
		
		return model;

	}

}