package org.mocking;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.spring.config.JavaConfig;
import org.spring.service.CalculatorService;
import org.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JavaConfig.class)
public class MockitoTest {

	@Before
	public void setUp() throws Exception {
		 MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Autowired
	private PersonService personService;
	
	@Mock
	private CalculatorService calculatorService;

	@Test
	public void test() {
		
		Assert.assertNotNull(personService);
		
		Assert.assertNotNull(calculatorService);
		
	}

}
