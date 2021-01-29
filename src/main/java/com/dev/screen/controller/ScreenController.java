package com.dev.screen.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.screen.model.Output;
import com.dev.screen.model.Response;
import com.dev.screen.service.ScreenService;

@RestController
@RequestMapping(value = "/api")
public class ScreenController {

	@Autowired
	ScreenService service;

	@PostMapping(value = "/process")
	public ResponseEntity<?> processStateData(@RequestBody Map<String, String> map) {
		Response resp = new Response();
		try {
			String input = map.get("input");
			System.out.println(input);
			if (input.length() == 28) {
				List<Output> list = null;

				list = service.processAState(input);

				resp.setList(list);
				resp.setStatus("Success");
				resp.setMsg("");
				return new ResponseEntity<>(resp, HttpStatus.OK);
			} else {
				resp.setStatus("Failed");
				resp.setMsg("Invalid Length.");
				return new ResponseEntity<>(resp, HttpStatus.NOT_ACCEPTABLE);
			}
		} catch (Exception e) {
			resp.setStatus("Failed");
			resp.setMsg("Error Occurred");
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
