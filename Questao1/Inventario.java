package br.unipe.mt3.modelo;


import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Inventario extends Item {

	
	

	


	public Inventario(){
		
	}

	public void Ordenar()
	{
		
	
	List<String> codigoproduto = new ArrayList<>();
 
	codigoproduto.add("5560");
	codigoproduto.add("5559");
	codigoproduto.add("5558");
	
	System.out.println(codigoproduto);
	Collections.sort(codigoproduto);
	System.out.println("Codigos em ordem crescente	"+ codigoproduto);
	 // Verifica se a ArrayList está vazia
  
	if(codigoproduto.isEmpty())
      System.out.println("A ArrayList não contém elementos."); 
    else
    
      System.out.println("A ArrayList não está vazia.");

    System.exit(0);
 
	}
	
	
	
		 
		}

	
		 
	
	
	




