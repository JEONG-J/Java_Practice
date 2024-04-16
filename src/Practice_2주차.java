import java.util.Scanner;
public class Practice_2주차 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the nucleic sequences >> ");

        String inputString = scanner.nextLine();
        String[] result = inputString.split(",");

        for(int i = 0; i < result.length; i++) {
            if(result[i].length() < 9) {
                System.out.println("not sufficient length");
            }
            else {
                if(result[i].charAt(0) == 'G' && result[i].substring(3, 9).contains("ATC")) {
                    System.out.println("Genome" + i +": Positive");
                }
                else {
                    System.out.println("Genome" + i + ": Negative");
                }
            }
        }
    scanner.close();
    }
}
