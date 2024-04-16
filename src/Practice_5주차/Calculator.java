package Practice_5주차;
import java.util.Scanner;

public class Calculator {

    Calc cal;
    Scanner scanner = new Scanner(System.in);

    public void setCalculator(Calc cal) {
        this.cal = cal;
    }

    public void run() {
        System.out.println("Write two integers >> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        cal.setValue(a, b);
        int result = cal.calculate();
        System.out.println(result);
    }
}
