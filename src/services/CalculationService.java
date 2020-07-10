package services;

import java.util.List;

import entities.Product;

public class CalculationService {
	// COLOCA <T> no inicio pq ele vai trablahar com algum tipo T ou qualquer merda
				//assim pode ser o produto ou qualquer super classe do produto caso tivesse
	public static <T extends Comparable<? super T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		//pega o produto e joga no max
		T max = list.get(0);
		for (T item : list) {
			//compareTo (devolve inteiros se for maior q 0 é maior se for negativo menor se for 0 igual)
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		//devolve a classe product
		return max;
	}
	
}
