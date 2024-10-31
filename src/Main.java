import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception { 
        Scanner scanner = new Scanner(System.in); 
        String input = scanner.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) throws Exception {
        String[] parts = input.split(""); 
        int a = Integer.parseInt(parts[0]);
        String symbol = parts[1];
        int b = Integer.parseInt(parts[2]);
        if (parts.length > 3) {
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один операнд");
        }
        if (a > 100 || b > 100 || a <= 0 || b <= 0) {
            throw new Exception("Превышен лимит допустимых значений");
        }
        int c = 0;
        if (symbol.equals("+")) {
            c = a + b;
        } else if (symbol.equals("-")) {
            c = a - b;
        } else if (symbol.equals("*")) {
            c = a * b;
        } else if (symbol.equals("/")) {
            c = a / b;
        }
        return String.valueOf(c);

    }
}

