package entities;

import java.util.ArrayList;
import java.util.List;

import application.Program;

public class TrocaNumero {
	public int numA;
	public int numB;

	List<Integer> list = new ArrayList<>();
	public Program program;
	

	public void trocaPosNumero(int numA, int numB) {
		System.out.println("N�mero A: "+numB);
		System.out.println("N�mero B: "+numA);
		
	}

}

/*
 * System.out.println("###Valores originais###");
 * System.out.println("NumA: "+list.get(0));
 * System.out.println("NumB: "+list.get(1));
 * System.out.println("###Valores trocados");
 * System.out.println("NumA: "+list.get(1));
 * System.out.println("NumB: "+list.get(0));
 */