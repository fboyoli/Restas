package org.fabo.substraction;

import java.util.Random;
import java.util.Scanner;

public class Substraction {

	public static void main(String[] args) {
		Integer minuendo;
		Integer sustraendo;
		Integer incrementos = 5;
		Integer ejercicios_pendientes = incrementos;
		Integer ejercicios_ejecutados = 0;
		Integer ejercicios_correctos = 0;
		Integer ejercicios_equivocados = 0;
		Integer reintentos = 0;
		Random rnd = new Random();
		String minuendo_label;
		String sustraendo_label;
		Integer respuesta;
		Integer respuesta_correcta;
		Scanner in = new Scanner(System.in);
		String[] hoorray = { "Estas que ardes!", "Eres el mejor restando !",
				"Pero que forma de hacerlo!", "No lo puedo creer!",
				"Tu si que sabes como restar!", "Estas imparable!",
				"Sigue asi y te dejo jugar Xbox!", "Muy bien Fabo.",
				"Increible!!!", "Lo mejor de lo mejor!" };
		String[] buuu = { "Casi pareces bebito de dos años.",
				"Eso hasta los de Prefirst lo saben!",
				"Tienes que concentrarte mucho mas !",
				"Animo todavia puedes mi güero !",
				"Intentalo nuevamente champ!", "Todavia puedes hacerlo !!!",
				"Como que te puedes ganar un castigo si sigues asi..., eh??",
				"Ya, en serio, concentrate Fabo...",
				"Deja de pensar en videojuegos y concentrate !",
				"Yo creo en ti, no me decepciones." };
		String[] muymal = {
				"Muy mal Fabo, muy mal!",
				"Lero lero, tienes que hacer " + incrementos
						+ " ejercicios mas, hehehehe",
				"Todos miren y digan: Bebito de dos años!",
				"Le voy a decir a tu miss que no aprendes a restar!",
				"Julieta dice: Ja-Ja-Jaaa-Jaaaa, estoy con charn !",
				"Ya concentrate !",
				"A la proxima te doy 1,000 ejercicios mas !",
				"No lo puedo creer, de verdad no sabes restar?",
				"Es en serio?, debes hacer las cosas bien.",
				"Me rindo !, no quieres aprender a restar !" };

		boolean plural;

		System.out.println("Hola Fabo, vamos a restar.");
		System.out.println("Tienes que completar " + incrementos
				+ " ejercicios de restas, puedes intentar hasta dos veces");
		System.out
				.println("de escribir tu respuesta, pero si esta mal despues de los dos intentos,");
		System.out.println("tendras que hacer " + incrementos
				+ " ejercicios mas !, asi que concentrate por favor.");
		System.out.println("COMENZAMOS !");

		while (ejercicios_ejecutados < ejercicios_pendientes) {
			plural = (ejercicios_pendientes - ejercicios_ejecutados) > 1;

			ejercicios_ejecutados++;
			System.out.println("");
			System.out.println("Ejercicio " + ejercicios_ejecutados + ":");

			minuendo = rnd.nextInt(999);
			sustraendo = rnd.nextInt(minuendo);
			respuesta_correcta = minuendo - sustraendo;

			minuendo_label = String.format("%3s", minuendo);
			sustraendo_label = String.format("%3s", sustraendo);
			System.out.println("");
			System.out.println("   " + minuendo_label);
			System.out.println(" - " + sustraendo_label);
			System.out.println("   ___");
			System.out.print("   ");
			respuesta = in.nextInt();
			System.out.println("");

			if (respuesta.equals(respuesta_correcta)) {
				System.out.println(hoorray[rnd.nextInt(hoorray.length)]);
				System.out.println("Respuesta CORRECTA");
				ejercicios_correctos++;
			} else {
				reintentos++;
				System.out.println(buuu[rnd.nextInt(buuu.length)]);
				System.out.println("Respuesta INCORRECTA, segundo intento:");
				System.out.println("");
				System.out.println("   " + minuendo_label);
				System.out.println(" - " + sustraendo_label);
				System.out.println("   ___");
				System.out.print("   ");
				respuesta = in.nextInt();
				System.out.println("");

				if (respuesta.equals(respuesta_correcta)) {
					System.out.println("Te salvaste!, respuesta CORRECTA");
					ejercicios_correctos++;

				} else {
					reintentos++;
					System.out.println(muymal[rnd.nextInt(muymal.length)]);
					System.out.println("Respuesta INCORRECTA");
					System.out.println("La respuesta correcta es: "
							+ respuesta_correcta);
					System.out.println("");
					System.out.println("Te faltaba" + (plural ? "n " : " ")
							+ (ejercicios_pendientes - ejercicios_ejecutados)
							+ " ejercicio" + (plural ? "s" : "")
							+ ", pero tendrás que hacer " + incrementos
							+ " ejercicios mas");

					ejercicios_pendientes = ejercicios_pendientes + incrementos;
					ejercicios_equivocados++;
				}
			}
			System.out.println("Te falta completar "
					+ (ejercicios_pendientes - ejercicios_ejecutados)
					+ " ejercicio" + (plural ? "s." : "."));

		}
		System.out.println("Hiciste " + ejercicios_ejecutados + " ejercicios");
		System.out.println("Te equivocaste " + ejercicios_equivocados
				+ " veces");
		System.out.println("Tuviste " + reintentos + " reintentos.");

		System.out.println("Felicidades por terminar");
		System.out.println("Te quiero muchisimo Fabo, atentamente: tu papa");
		System.out.println("");
		in.close();
	}
}
