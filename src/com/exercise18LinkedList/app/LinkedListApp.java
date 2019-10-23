package com.exercise18LinkedList.app;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Stack;
import java.util.HashMap;
import java.util.Random;
import java.util.Iterator;
public class LinkedListApp {

	public static void main(String[] args) {
//Constants------------------------------------------------------------------------------------------------------
		final int elements = 100;
		
		LinkedList<Byte> miLista = new LinkedList<Byte>(); //for add and remove, set is way slower than arraylst
		ArrayList<Short> miArray = new ArrayList<Short>();
		Stack<Integer> miPila = new Stack<Integer>();
		PriorityQueue<Double> miCola = new PriorityQueue<Double>();
		HashMap<Integer,String> miDiccionario = new HashMap<Integer,String>();
		
		Random numbers = new Random();
		
//LINKED LIST----------------------------------------------------------------------------------------------------
		miLista.add((byte) 5);
		miLista.add((byte) 10);
		miLista.add((byte) 20);
		miLista.add((byte) 30);
		miLista.add((byte) 40);
		miLista.add((byte) 50);
		miLista.set(0, (byte) 2);
		System.out.println(miLista);
		System.out.println(miLista.get(1));
		/*System.out.println(miLista.remove());
		System.out.println(miLista.remove());
		System.out.println(miLista.remove());
		System.out.println(miLista.remove());
		System.out.println(miLista.remove());
		System.out.println(miLista.remove());
		System.out.println(miLista);*/
		
		Byte n=2;
		System.out.println(miLista.size());
		System.out.println(miLista.isEmpty());
		System.out.println(miLista.contains(n));
		miLista.clear();
		System.out.println(miLista);
		for(int i=0; i<elements; i++) {
			miLista.add((byte) numbers.nextInt(100));
		}
		System.out.println("\n");
		System.out.println(miLista);
		Iterator miIterator = miLista.iterator();
		while (miIterator.hasNext()) {
			System.out.println("Iterador: " +miIterator.next());
		}
		System.out.println("\n");
		for(Byte miNumber : miLista) { //for each / ":" means _in_ this part.
			System.out.println("miNumber: "+miNumber);
		}

//ARRAY LIST-----------------------------------------------------------------------------------------------------
		miArray.add((short) 5);
		miArray.add((short) 10);
		miArray.add((short) 20);
		miArray.add((short) 30);
		miArray.add((short) 40);
		miArray.add((short) 50);
		miArray.set(0, (short) 2);
	System.out.println(miLista);
	
	miArray.set(0, (short) 2);
	System.out.println(miArray.get(2));
	System.out.println(miArray);
	System.out.println(miArray.remove(2));
	System.out.println(miArray);
	
	miIterator = miArray.iterator();
	while(miIterator.hasNext()) {
		System.out.println(miIterator.next());
	}
	for(short miShort:miArray) {
		System.out.println(miShort);
	}
	
	}
}
