import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SignFiller {
	private List<String> signs = Arrays.asList("", "+", "-", "*", "/");
	private List<String> numbers;

	public List<String> fillWithSimpleSigns(String input) {
		numbers = Arrays.asList(input.split("(?!^)"));
		List<String> result = new ArrayList<>(Collections.singletonList(numbers.get(0)));
		for (int i = 1; i < numbers.size(); i++) {
			result = appendSign(result, i);
		}
		return result;
	}

	private List<String> appendSign(List<String> list, final int index) {
		List<String> source = new ArrayList<>(list);
		list = new ArrayList<>();
		for (String sourceElement : source) {
			for (String sign : signs) {
				String expression = sourceElement + sign + numbers.get(index);
				if (!expression.matches(".*0\\d.*")) {
					list.add(expression);
				}
			}
		}
		return list;
	}
}