package com.mycompany.saludo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SaludoApp {

	public static void main(String[] args) {

		//fabrica de beans a partir del archivo resources
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("saludo.xml"));

	
		
		SaludoService saludo=(SaludoService) factory.getBean("saludo");
		saludo.saludar();
	}
	
			
	}


