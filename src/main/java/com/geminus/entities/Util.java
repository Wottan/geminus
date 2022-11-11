package com.geminus.entities;

public class Util {

	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}

	public static int random(int cantidad) {
		return (int) Math.floor(Math.random() * cantidad);
	}
}
