package com.projeto.atribuicaoreferencia;

public class mainObj {

	public static void main(String[] args) {
		
		MeuObj obj1 = new MeuObj();
		if (obj1.num == null) {
			System.out.println("Erro");
			obj1.SetNum(10);
			System.out.println(obj1.toString());
		}
		//else 
		//System.out.println(obj1.toString());
	}
}
