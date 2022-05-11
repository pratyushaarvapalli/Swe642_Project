package com.example.hw4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200") // allow CORS from angular app
public class FormController {

    @Autowired
    private FormRepository formRepository;

    // get all form REST API
    @GetMapping("/forms")
    public List<Form> getAllForms(){
        return formRepository.findAll();
    }

    // create new form REST API
    @PostMapping("/forms")
    public Form createForm(@RequestBody Form form){
        return formRepository.save(form);
    }

    // get form by id REST API
    @GetMapping("/forms/{id}")
	public ResponseEntity<Form> getFormById(@PathVariable Long id) {
		Form form = formRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No form w/ id :" + id));
		return ResponseEntity.ok(form);
	}
    
}
