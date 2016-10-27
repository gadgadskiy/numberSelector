package com.company.util;

import java.util.ArrayList;
import java.util.List;

public class Util {
	private Util() {}

	public static List<Double> listStringToDouble(List<String> numberStrings) {
		List<Double> numbers = new ArrayList<>();
		numberStrings.forEach(s -> numbers.add(Double.parseDouble(s)));
		return numbers;
	}
}