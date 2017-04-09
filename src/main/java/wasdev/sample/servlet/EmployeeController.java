package wasdev.sample.servlet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employee.entity.Employee;
import employee.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;

	@RequestMapping("/getAll")
	public List<Employee> getAll() {
		return repository.findAll();
	}

}