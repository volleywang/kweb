/**
* @author Zhai　Qianfeng
* @date April 17, 2017
* @blog www.zhaiqianfeng.com
*/
package com.kweb.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	private static Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("")
	public String login(HttpServletRequest req) {
		return "home";
	}
}
