package services;

import java.util.List;

public class CalculationService {
	
	public static Integer max(List<Integer> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		Integer max = list.get(0);
		for (Integer item : list) {
			//compareTo (devolve inteiros se for maior q 0 é maior se for negativo menor se for 0 igual)
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
	
}
