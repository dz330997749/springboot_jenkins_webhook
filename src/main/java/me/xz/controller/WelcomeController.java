package me.xz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: XZ
 * @Date: 2020/7/15 20:38
 */
@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String index() {
		return "redirect:login.html";
	}

}
