/**
 * ajwinters@dmacc.edu - ajwinters
 * CIS175 - Spring 2022
 * Mar 29, 2022
 */
package week8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import week8.beans.Owner;
import week8.repository.OwnerRepository;

@Controller
public class WebController {
	@Autowired
	OwnerRepository repo;
	
	@GetMapping("/viewAll")
	public String viewAllOwners(Model model) {
		
		if(repo.findAll().isEmpty()) {
			return addNewOwner(model);
		}
		model.addAttribute("owners", repo.findAll());
	
		return "results";
	}
	
	@GetMapping("/inputOwner")
	public String addNewOwner(Model model) {
	 Owner o = new Owner();
	 model.addAttribute("newOwner", o);
	 return "input";
	}
	
	@PostMapping("/inputOwner")
	public String addNewOwner(@ModelAttribute Owner o, Model model) {
	repo.save(o);
	return viewAllOwners(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateOwner(@PathVariable("id") long id, Model model) {
	Owner o = repo.findById(id).orElse(null);
	model.addAttribute("newOwner", o);
	return "input";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteOwner(@PathVariable("id") long id, Model model) {
		Owner o = repo.findById(id).orElse(null);
		repo.delete(o);
		return viewAllOwners(model);
	}
}
