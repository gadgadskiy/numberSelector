import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SignFiller {
	private List<String> sings = Arrays.asList("_", "+", "-", "*", "/");

	public List<String> fillWithSimpleSigns(String input) {
		List<String> numbers = Arrays.asList(input.split("(?!^)"));
		List<String> result = new ArrayList<>(Collections.singletonList(numbers.get(0)));

		for (int i = 0; i < numbers.size() - 1; i++) {
			result = appendSign(result);
		}
		return result;
	}

	private List<String> appendSign(List<String> list) {
		int size = sings.size();
		List<String> source = new ArrayList<>(list);
		list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < source.size(); j++) {
				list.add(source.get(j) + sings.get(i));
			}
		}
		return list;
	}
}