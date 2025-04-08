package com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Controller {

	public void pariDispari(int a) {

		if (a % 2 == 0) {
			System.out.println("Il valore inserito " + a + " è pari.");
		} else {
			System.out.println("Il valore inserito " + a + " è dispari.");
		}
	}

	public void maggioreMinore(int a, int b) {
		if (a == b) {
			System.out.println("I valori inseriti " + a + " " + b + "sono uguali");
		} else if (a > b) {
			System.out.println("Il valore maggiore e " + a);
		} else {
			System.out.println("Il valore maggiore e " + b);
		}
	}

	public void conatoreVerticale(int contaFino) {
		for (int i = 0; 0 <= contaFino; i++) {
			System.out.println(i);
		}

	}

	public void conatoreOrizzontale(int contaFino) {
		for (int i = 0; 0 <= contaFino; i++) {
			System.out.print(i + "; ");
		}

	}

	public void semaforo(String colore) {
		if (colore.toLowerCase().equals("rosso")) {
			System.out.println("ALT");
		} else if (colore.toLowerCase().equals("verde")) {
			System.out.println("VAI");
		} else if (colore.toLowerCase().equals("arancione")) {
			System.out.println("ATTENZIONE");
		} else {
			System.out.println("NON SEI AL SEMAFORO");
		}
	}

	public void totalizzatiore() {
		Scanner input = new Scanner(System.in);
		boolean done = false;
		int totale = 0;
		float media = 0;
		int[] array = new int[0];
		while (done == false) {
			System.out.println("Inserisci un numero...");
			int valore = input.nextInt();
			int[] temp = new int[array.length + 1];
			if (array.length > 0) {
				for (int i = 0; i < array.length; i++) {
					temp[i] = array[i];
				}
			}
			temp[temp.length - 1] = valore;

			array = temp;
			System.out.println("Vuoi inserire un altro numero ? S se vuoi continuare N se hai finito");
			String vuoiContinuare = input.next();

			if (vuoiContinuare.toLowerCase().contains("n")) {
				done = true;
			}
		}

		for (int i = 0; i < array.length; i++) {
			totale += array[i];
		}

		media = (float) totale / array.length;

		System.out.println("Il totale dei numeri inseriti è " + totale + "\nLa media dei numeri inseriti è " + media);
		input.close();

	}

	public void stampaVettore() {
		int[] vettore = new int[10];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < vettore.length; i++) {
			System.out.println("Inserisci il valore del numero " + (i + 1));
			int numero = input.nextInt();
			vettore[i] = numero;
		}

		boolean riga = true;

		System.out.println(
				"Scegli come visualizzare il vettore, digita C per vederlo in colonna oppure R per vederlo in riga");
		String scelta = input.next();

		if (scelta.toLowerCase().equals("c")) {
			riga = false;
		} else if (scelta.toLowerCase().equals("r")) {
			riga = true;
		} else {
			System.out.println("La scelta non è corretta, il vettore verra visualizzato come riga");
			riga = true;
		}

		if (riga == true) {
			for (int i = 0; i < vettore.length; i++) {
				System.out.print(vettore[i] + "; ");
			}
		} else if (riga == false) {
			for (int i = 0; i < vettore.length; i++) {
				System.out.println(vettore[i]);
			}
			;
		}

		System.out.println();
		input.close();
	}

	public void nominativi() {
		String[] vettore = new String[10];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < vettore.length; i++) {
			System.out.println("Inserisci il nominativo numero " + (i + 1));
			String nominativo = input.next();
			vettore[i] = nominativo;
		}

		for (int i = 0; i < vettore.length; i++) {
			System.out.println("Il nominativo numero " + (i + 1) + " è " + vettore[i]);
		}

		System.out.println();
		input.close();
	}

	public void ordinamento() {
		String[] vettore = new String[10];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < vettore.length; i++) {
			System.out.println("Inserisci il nominativo numero " + (i + 1));
			String nominativo = input.next();
			vettore[i] = nominativo;
		}

		Arrays.sort(vettore);

		for (int i = 0; i < vettore.length; i++) {
			System.out.println(vettore[i]);
		}

		System.out.println();
		input.close();
	}

	public void cercaNelVettore() {
		String[] vettore = { "Mario", "Giacomo", "Giuseppe", "Mariangelo", "Luca", "Moggi", "Federico", "Valentino",
				"Mirco", "Maria" };
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il nome che desideri cercare");
		String ricerca = input.next();
		input.close();
		for (int i = 0; i < vettore.length; i++) {
			if (vettore[i].toLowerCase().equals(ricerca.toLowerCase())) {
				System.out.println(vettore[i] + " esiste e si trova in posizione " + (i + 1));
				return;
			}
		}

		if (!vettore[vettore.length - 1].toLowerCase().equals(ricerca.toLowerCase())) {
			System.out.println("Il nome ricercato non esiste");
		}
		
		System.out.println();
		
	}

	public void stampaTabellina() {

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero per vedere la sua tabellina");
		int ricerca = input.nextInt();

		for (int i = 0; i <= 10; i++) {
			int risultato = i * ricerca;
			System.out.println(ricerca + "X" + i + "=" + risultato);

		}

		System.out.println();
		input.close();
	}

	public void meteo() {
		
        double[][] temperature = new double[7][4];

        
        String[] giorni = {"Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato", "Domenica"};

      
        Random rand = new Random();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                temperature[i][j] = Math.round((rand.nextDouble() * 40 - 5) * 10.0) / 10.0;  // Genera valori tra -5 e 35 gradi
            }
        }
        
        System.out.println("Temperatura settimanale (°C):");
        System.out.println("------------------------------------------------");
        System.out.println("Giorno       | 00:00  | 06:00  | 12:00  | 18:00  ");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < 7; i++) {
            System.out.printf("%-11s |", giorni[i]);
            for (int j = 0; j < 4; j++) {
                System.out.printf(" %5.1f  |", temperature[i][j]);
            }
            System.out.println();
        }
		

		System.out.println();
		
	}
	
}
