public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        try {
            Integer val1 = Integer.parseInt(a, 2);
            Integer val2 = Integer.parseInt(b, 2);
            Integer result = val1 + val2;
            return Integer.toBinaryString(result);
        } catch (NumberFormatException exception) {
            System.out.println("Invalid arguments");
            return "Проверьте исходные данные: " + a + " и " + b + " - не валидны";
        }
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        try {
            Integer val1 = Integer.parseInt(a, 2);
            Integer val2 = Integer.parseInt(b, 2);
            Integer result = val1 * val2;
            return Integer.toBinaryString(result);
        } catch (NumberFormatException exception) {
            System.out.println("Invalid arguments");
            return "Проверьте исходные данные: " + a + " и " + b + " - не валидны";
        }
    }
}