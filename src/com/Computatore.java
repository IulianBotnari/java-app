package com;

import java.util.Scanner;

public class Computatore {

	public static void main(String[] args) throws Exception {

		Controller nuovoController = new Controller();
		Scanner input = new Scanner(System.in);
		boolean programmaOn = true;
		boolean continuo = true;

		while (programmaOn == true) {
			System.out.println("Inserisci il numero del algoritmo da eseguire: "
					+ "\n1 per per verificare se un numero e pari o dispari "
					+ "\n2 per verificare quale di due numeri inseriti e maggiore "
					+ "\n3 per contare in verticale fino a un numero a tua scelta"
					+ "\n4 per contare in orizzontale fino a un numero a tua scelta"
					+ "\n5 per giocare con un semaforo"
					+ "\n6 per calcolare la media di una lista di valori a tua scelta"
					+ "\n7 per creare un vettore di 10 interi a tua scelta e poi decidere come visualizzarlo"
					+ "\n8 per creare un vettore di 10 nominativi e poi visualizzarlo"
					+ "\n9 per creare un vettore di 10 nominativi e poi ordinarlo con un algoritmo sort"
					+ "\n10 per cercare dentro un vettore un nominativo specifico"
					+ "\n11 visualizzare la tabellina di un numero a scelta"
					+ "\n12 per creare una matriche che contiene le temperature di tutti i giorni della settimana, rilevate ogni 6 ore"
					+ "\n13 per TERMINARE IL PROGRAMMA");
			int inputInserito = input.nextInt();
			switch (inputInserito) {
				case 1:
					continuo = true;
					System.out.println(
							"Hai scelto l'opzione 1 che ti consente di verificare se un numero e pari o dispari");

					do {
						System.out.println("Inserisci numero da verificare se pari o dispari");
						int numeroInEntrata = input.nextInt();
						nuovoController.pariDispari(numeroInEntrata);
						System.out.println(
								"Vuoi inserire un altro numero ? inserisci S se vuoi proseguire oppure N se vuoi tornare al menu principale");
						String vuoiContinuare = input.next();

						if (vuoiContinuare.toLowerCase().equals("n")) {
							continuo = false;
						}

					} while (continuo == true);
					break;
				case 2:
					continuo = true;
					System.out.println(
							"Hai scelto l'opzione 2 che ti consente di verificare il numero maggiore tra i due inseriti");
					do {
						System.out.println(
								"Inserisci due numeri e verifica se sono uguali oppure quali dei due e maggiore");
						System.out.println("Inserisci primo numero...");
						int primoNumeroInEntrata = input.nextInt();
						System.out.println("Inserisci secondo numero...");
						int secondoNumeroInEntrata = input.nextInt();
						nuovoController.maggioreMinore(primoNumeroInEntrata, secondoNumeroInEntrata);
						System.out.println(
								"Vuoi verificare altri numeri ? inserisci S se vuoi proseguire oppure N se vuoi tornare al menu principale");
						String vuoiContinuare = input.next();

						if (vuoiContinuare.toLowerCase().equals("n")) {
							continuo = false;
						}
					} while (continuo == true);
					break;
				case 3:
					continuo = true;
					System.out
							.println("Hai scelto l'opzione 3 che ti consente di contare fino a un numero a tua scelta");

					do {
						System.out.println("Inserisci il numero fino al quale desidiri contare...");
						int numeroInEntrata = input.nextInt();
						nuovoController.conatoreVerticale(numeroInEntrata);
						System.out.println(
								"Vuoi contare ancora ? inserisci S se vuoi proseguire oppure N se vuoi tornare al menu principale");
						String vuoiContinuare = input.next();

						if (vuoiContinuare.toLowerCase().equals("n")) {
							continuo = false;
						}
					} while (continuo == true);
					break;
				case 4:
					continuo = true;
					System.out.println(
							"Hai scelto l'opzione 4 che ti consente di contare fino a un numero a tua scelta e visualizzarlo in orizzontale");

					do {
						System.out.println("Inserisci il numero fino al quale desidiri contare...");
						int numeroInEntrata = input.nextInt();
						nuovoController.contatoreOrizzontale(numeroInEntrata);
						System.out.println(
								"Vuoi contare ancora ? inserisci S se vuoi proseguire oppure N se vuoi tornare al menu principale");
						String vuoiContinuare = input.next();

						if (vuoiContinuare.toLowerCase().equals("n")) {
							continuo = false;
						}
					} while (continuo == true);
					break;
				case 5:
					continuo = true;
					System.out.println("Hai scelto l'opzione 5 che ti consente di giocare con un semaforo");

					do {
						System.out.println("Inserisci il colore del semaforo, rosso, verde, arancione");
						String coloreSemaforo = input.next();
						nuovoController.semaforo(coloreSemaforo);
						System.out.println(
								"Vuoi giocare ancora ? inserisci S se vuoi proseguire oppure N se vuoi tornare al menu principale");
						String vuoiContinuare = input.next();

						if (vuoiContinuare.toLowerCase().equals("n")) {
							continuo = false;
						}
					} while (continuo == true);
					break;

				case 6:
					continuo = true;
					System.out.println(
							"Hai scelto l'opzione 6 che ti consente di trovare il totale e la media di una lista di numeri a scelta");

					do {

						nuovoController.totalizzatiore();

						System.out.println(
								"Vuoi giocare ancora ? inserisci S se vuoi proseguire oppure N se vuoi tornare al menu principale");

						String vuoiContinuare = input.next();

						if (vuoiContinuare.toLowerCase().equals("n")) {
							continuo = false;
						}
					} while (continuo == true);
					break;

				case 7:
					continuo = true;
					System.out.println("Hai scelto l'opzione 7 che ti consente di creare un vettore di 10 numeri");

					do {

						nuovoController.stampaVettore();

						System.out.println(
								"Vuoi creare un altro vettore ? inserisci S se vuoi proseguire oppure N se vuoi tornare al menu principale");

						String vuoiContinuare = input.next();

						if (vuoiContinuare.toLowerCase().equals("n")) {
							continuo = false;
						}
					} while (continuo == true);
					break;

				case 8:
					continuo = true;
					System.out.println(
							"Hai scelto l'opzione 8 che ti consente di creare un vettore di 10 nominativi e visualizzarlo");

					do {

						nuovoController.nominativi();

						System.out.println(
								"Vuoi creare un altro vettore ? inserisci S se vuoi proseguire oppure N se vuoi tornare al menu principale");

						String vuoiContinuare = input.nextLine();

						if (vuoiContinuare.toLowerCase().equals("n")) {
							continuo = false;
						}
					} while (continuo == true);
					break;

				case 9:
					continuo = true;
					System.out.println(
							"Hai scelto l'opzione 9 che ti consente di creare un vettore di 10 nominativi e ordinarlo in ordine alfabetico");

					do {

						nuovoController.ordinamento();

						System.out.println(
								"Vuoi creare un altro vettore ? inserisci S se vuoi proseguire oppure N se vuoi tornare al menu principale");

						String vuoiContinuare = input.next();

						if (vuoiContinuare.toLowerCase().equals("n")) {
							continuo = false;
						}
					} while (continuo == true);
					break;

				case 10:
					continuo = true;
					System.out.println("Hai scelto l'opzione 10 che ti consente di cercare un nome dentro una lista");

					do {

						nuovoController.cercaNelVettore();

						System.out.println(
								"Vuoi fare un altra ricerca ? inserisci S se vuoi proseguire oppure N se vuoi tornare al menu principale");

						String vuoiContinuare = input.next();

						if (vuoiContinuare.toLowerCase().equals("n")) {
							continuo = false;
						}
					} while (continuo == true);
					break;

				case 11:
					continuo = true;
					System.out.println(
							"Hai scelto l'opzione 11 che ti consente di stampare la tabellina di un numero a scelta");

					do {

						nuovoController.stampaTabellina();

						System.out.println(
								"Vuoi la tabellina di un altro numero ? inserisci S se vuoi proseguire oppure N se vuoi tornare al menu principale");

						String vuoiContinuare = input.next();

						if (vuoiContinuare.toLowerCase().equals("n")) {
							continuo = false;
						}
					} while (continuo == true);
					break;

				case 12:
					continuo = true;
					System.out.println(
							"Hai scelto l'opzione 12 che ti consente di stampare le temperature della settimana");

					do {

						nuovoController.meteo();

						System.out.println(
								"Vuoi la tabellina di un altro numero ? inserisci S se vuoi proseguire oppure N se vuoi tornare al menu principale");

						String vuoiContinuare = input.next();

						if (vuoiContinuare.toLowerCase().equals("n")) {
							continuo = false;
						}
					} while (continuo == true);
					break;

				case 13:

					programmaOn = false;
					System.out.println("Hai scelto l'opzione 13 il programma e chiuso");

					break;
			}

		}
		input.close();

	}
}
