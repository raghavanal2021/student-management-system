package com.bnym.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnym.to.StudentInformationTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@Service
@RequestMapping("/")
public class StudentInformationController {
	@RequestMapping("/healthStatus")
	public String healthStatus() {
		return "UP";
	}
}
