package week8;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import week8.beans.Owner;
import week8.controller.BeanConfiguration;
import week8.repository.OwnerRepository;


@SpringBootApplication
public class JewelryInventoryTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JewelryInventoryTwoApplication.class, args);
		
		ApplicationContext appContext = new
				AnnotationConfigApplicationContext(BeanConfiguration.class);
				Owner c = appContext.getBean("owner", Owner.class);
				System.out.println(c.toString());
	}
	@Autowired
	OwnerRepository repo;
	public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		//Using an existing bean
		Owner c = appContext.getBean("owner",Owner.class);
		c.setPieceDescription("Diamond Wedding Band");
		repo.save(c);
		//Creating a bean to use – not managed by Spring
	
		Owner d = new Owner("Lillian", "Sapphire Necklace", "Kohl's - 2020");
	
		repo.save(d);
		List<Owner> allMyOwners = repo.findAll();
		for(Owner people: allMyOwners) {
			System.out.println(people.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
	}



