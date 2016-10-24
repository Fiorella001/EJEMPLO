package com.mycompany.saludo;

public class SaludoServiceImpl implements SaludoService {

	
	private String saludo;
	
	
	public SaludoServiceImpl(String saludo){
		this.saludo=saludo;
	}
	public void saludar() {
   
    System.out.println(saludo);
	}


}
