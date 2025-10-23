package com.nyg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nyg.service.ExService;

@RestController
public class ExController {

	ExService exService;

	public ExController(ExService exService) {
		this.exService = exService;
	}

	@GetMapping("/exInt")
	public Integer getExInt() {
		return exService.exInt();
	}

	@GetMapping("/ex321")
	public String getEx321() {
		return exService.ex321();
	}

	@GetMapping("/ex322")
	public String getEx322() {
		return exService.ex322();
	}

	@GetMapping("/ex323")
	public String getEx323() {
		return exService.ex323();
	}

	@GetMapping("/ex324")
	public String getEx324() {
		return exService.ex324();
	}

}
