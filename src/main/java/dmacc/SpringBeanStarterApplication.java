package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Pet;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PetsRepository;

@SpringBootApplication
public class SpringBeanStarterApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanStarterApplication.class, args);
		
	}

	@Autowired
	PetsRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Pet c = appContext.getBean("pet", Pet.class);
		c.setType("Dog");
		repo.save(c);
		
		//Creating an object to use – not managed by Spring
		Pet d = new Pet("Dog", "Guiness", "Jeffery", false, true);
		repo.save(d);
		
		List<Pet> allPets = repo.findAll();
		for(Pet pet: allPets) {
			System.out.println(pet.toString());	
		}
		
		((AnnotationConfigApplicationContext) appContext).close();
	}
}
