import java.util.List;

/**
 * TODO list:
 * user API for input (input max 11 symbols, result - ?)
 * optimize solutions 4520004 => 4*5*20/004, 4+5*20+00-4 etc
 * processing ()
 * unit tests
 * fix -1*2*3
 * fix -1*-2*-3
 */
public class Main {
    private final Calculator calculator = new Calculator();
    private final SignFiller signFiller = new SignFiller();

    public static void main(String[] args) {
	    Main main = new Main();
        main.doSelection("7", 7);
        main.doSelection("7", 5);
        main.doSelection("12", 3);
        main.doSelection("12", 4);
        main.doSelection("123", 5);
        main.doSelection("1199", 10);
        main.doSelection("9999", 10);
        main.doSelection("230123", 100);
        main.doSelection("93463465", 100);
        main.doSelection("325235891", 100);
        main.doSelection("345676235", 100);
        main.doSelection("3456762351", 100);
        main.doSelection("29385723045", 100);
        main.doSelection("4520004", 100);
        System.out.println("---------------------------------");
    }

    private void doSelection(String inputString, long expectedResult) {
        System.out.println("---------------------------------");
        System.out.println("try find solutions for: " + inputString + " => " + expectedResult);
        List<String> variants = signFiller.fillWithSimpleSigns(inputString);
        int[] successNumber = {0};
        variants.forEach(variant -> {
            if (calculator.calculate(variant) == expectedResult) {
                System.out.println(++successNumber[0] + ") " + variant + " = " + expectedResult);
            }
        });
        if (successNumber[0] == 0) {
            System.out.println("sorry, we didn't find solutions");
        }
    }
}