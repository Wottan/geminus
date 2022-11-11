package com.geminus.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.geminus.entities.Jaula;
import com.geminus.entities.Util;

public class Challenge {

	static final Double DGR = 1590d;

	public static void caso1() {
		int number = 8;
		Double result;
		if (Util.esPar(number)) {
			result = (double) (number * 10);
		} else {
			result = (double) (number * 3);
		}
		if (result == 0) {
			throw new ArithmeticException("No se puede dividir por 0");
		}
		System.out.println(DGR / result);

	}

	public static void caso2() {
		Integer[] lista = { 1, 23, 5, 80, 2, 53, 8, 75, 23, 75, 80, 23, 2, 1, 8 };
		List<Integer> noRepetidos = Arrays.asList(lista).stream()
				// agrupar por entero.
				.collect(Collectors.groupingBy(s -> s)).entrySet().stream()
				// filtrar por los que tienen mas de una numero por grupo
				.filter(e -> e.getValue().size() == 1).map(e -> e.getKey()).collect(Collectors.toList());
		// Obtengo el menor valor
		Integer min = noRepetidos.stream().min(Integer::compare).get();
		System.out.println(min);

	}

	public static void caso3() {
		List<Jaula> jaulas = new ArrayList<Jaula>();
		int i = 20;
		while (i != 0) {
			jaulas.add(new Jaula(100 + i, "jaula" + i));
			i--;
		}
		Map grupoJaulas = new HashMap();
		for (int a = 0; a < 60; a++) {
			grupoJaulas.put(a, devolverGrupo4(jaulas));
		}

		System.out.println("-----------------");

		grupoJaulas.entrySet().forEach(entry -> {
			System.out.println(((Entry<Integer, List<Integer>>) entry).getKey() + " = "
					+ ((Entry<Integer, List<Integer>>) entry).getValue());
		});
	}

	private static List<Jaula> devolverGrupo4(List<Jaula> jaulas) {
		List<Jaula> retorno = new ArrayList<Jaula>();
		while (retorno.size() != 4) {
			int valorDado = Util.random(20);
			if (!retorno.contains(jaulas.get(valorDado)))
				retorno.add(jaulas.get(valorDado));
		}
		return retorno;
	}

}
