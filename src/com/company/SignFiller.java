package com.company;

import com.company.util.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SignFiller {
	public List<String> fillWithSimpleSigns(String input) {
		List<String> numberStrings = Arrays.asList(input.split("(?!^)"));
		List<Double> numbers = Util.listStringToDouble(numberStrings);
		List<String> sings = Arrays.asList("", "+", "-", "*", "/");
		List<String> result = new ArrayList<>();

		return result;
	}
}
