package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.EmployeeEntity;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService esr;
	
	@PostMapping("addemp")
	public EmployeeEntity add(@RequestBody EmployeeEntity ee )
	{
		return esr.saveinfo(ee);
	}
	
	@GetMapping("show")
	public List<EmployeeEntity> show()
	{
		return esr.showinfo();
	}
}
