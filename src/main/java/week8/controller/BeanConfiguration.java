/**
 * ajwinters@dmacc.edu - ajwinters
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */
package week8.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import week8.beans.Owner;

@Configuration
public class BeanConfiguration {
	@Bean
	public Owner owner() {
		Owner bean = new Owner( );
		bean.setName("Miranda");
		bean.setPieceDescription("Wedding Band");
		bean.setPieceNotes("Kay Jewelers 2003");
		return bean;
	}
}
