package com.company;

import com.company.util.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
	public double calculate(String input) {
		List<String> numberStrings = Arrays.asList(input.split("[+\\-*\\/]"));
		List<Double> numbers = Util.listStringToDouble(numberStrings);
		ArrayList<String> signs = new ArrayList<>(Arrays.asList(input.split("\\d+")));
		signs.remove(0);
		int length = signs.size();
		for (int i = 0; i < length; i++) {
			if ("*/".contains(signs.get(i))) {
				numbers.set(i, doHighMath(numbers.get(i), numbers.get(i + 1), signs.remove(i)));
				numbers.remove(i + 1);
				length--;
				i--;
			}
		}
		length = signs.size();
		for (int i = 0; i < length; i++) {
			if ("+-".contains(signs.get(i))) {
				numbers.set(i, doLowMath(numbers.get(i), numbers.get(i + 1), signs.remove(i)));
				numbers.remove(i + 1);
				length--;
				i--;
			}
		}
		return numbers.get(0);
	}

	private double doHighMath(double first, double second, String sign) {
		switch (sign) {
			case "*": return first * second;
			case "/": return first / second;
			default: throw new IllegalArgumentException("Unknown sign " + sign);
		}
	}

	private double doLowMath(double first, double second, String sign) {
		switch (sign) {
			case "+": return first + second;
			case "-": return first - second;
			default: throw new IllegalArgumentException("Unknown sign " + sign);
		}
	}
}
