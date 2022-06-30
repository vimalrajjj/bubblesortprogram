package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.repo.myinterface;

@RestController
public class controller {
@Autowired
private myinterface obj;

@GetMapping("/bsort")
public int[]  bsort(@RequestBody int[] array) {
	obj.bubblesort(array);
	return array;
}


}
