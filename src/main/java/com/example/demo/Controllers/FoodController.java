package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.FoodDelivery;

import com.example.demo.Repositories.FoodRepo;
import com.example.demo.Services.FoodService;

@RestController
@CrossOrigin
public class FoodController {
	@Autowired
    FoodRepo serviceRepository;
	@Autowired
	FoodService service;
	
	@GetMapping("/get")
	List<FoodDelivery> getList()
	{
		return serviceRepository.findAll();
		
	}
	
	@GetMapping("{id}")
	public Optional<FoodDelivery>getbyid(@PathVariable int id)
	{
		return service.getFoodDelivery(id);
	}
	
	@PostMapping("/post")
	public FoodDelivery create(@RequestBody FoodDelivery boo)
	{
		return serviceRepository.save(boo);
	}
	
	@PutMapping("/put")

	public String update(@RequestBody FoodDelivery boo)
	{
		return service.updateDetails(boo);
	}
	
	@DeleteMapping("/del")

	public String delete(@RequestParam int id)
	{
	   return service.deleteDetails(id);
	}

}
