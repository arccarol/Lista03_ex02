package view;

import java.util.LinkedList;
import java.util.List;

import model.ILista;
import model.Lista;

public class Principal {
	public static void main(String[] args) {
		
		 ILista lista1 = new Lista();
		 ILista lista2 = new Lista();
		 List<Integer> lista3 = new LinkedList<Integer>();
		 int valor;
		 try {
			 lista1.addFirst(1);
			 lista1.addLast(7);
			 System.out.print("Lista 1 = ");
			 for(int i=0; i<2; i++) {
			 valor = lista1.get(i);
			 System.out.print(valor + " ");
			 } 
			 System.out.println(" ");
			 System.out.print("Lista 2 = ");
			 lista2.addFirst(3);
			 lista2.add(4,1);
			 lista2.addLast(8);
			 
			 for(int i=0; i<3;i++) {
			 valor = lista2.get(i);
			 System.out.print(valor + " "); 
			 }
			 System.out.println(" ");
			 System.out.print("Lista 3 = ");
			 lista3.add(1);
			 lista3.add(7);
			 lista3.add(3);
			 lista3.add(4);
			 lista3.add(8);
			 for(int i=0; i<5;i++) {
				 valor = lista3.get(i);
				 System.out.print(valor + " "); 
				 }
			 System.out.println(" ");
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }  ordenacaoBubleSort(lista3);
	 }
		 public static  void ordenacaoBubleSort(List<Integer> lista3) {

		     for(int i = 0; i < lista3.size(); i++) {
		         for(int j = 0; j < (lista3.size() - 1 - i); j++) {
		             if(lista3.get(j) > lista3.get(j + 1)) {
		                 Integer aux = lista3.get(j);
		                 lista3.set(j, lista3.get(j + 1));
		                 lista3.set(j + 1, aux);
		             }
		             

		         }
		     }

		     System.out.println("Lista 3 ordenada = " +lista3);
		 }

	}

