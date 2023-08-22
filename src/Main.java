public class Main {
    private String mode;

    public Main(String mode) {
        this.mode = mode;
    }

    public int add(int... numbers) {
        if (mode.equals("Normal")) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum;
        } else if (mode.equals("Opposite")) {
            int result = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                result -= numbers[i];
            }
            return result;
        } else {
            throw new IllegalArgumentException("Invalid mode. Use 'Normal' or 'Opposite'.");
        }
    }

    public int subtract(int... numbers) {
        if (mode.equals("Normal")) {
            int result = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                result -= numbers[i];
            }
            return result;
        } else if (mode.equals("Opposite")) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum;
        } else {
            throw new IllegalArgumentException("Invalid mode. Use 'Normal' or 'Opposite'.");
        }
    }

    public static void main(String[] args) {

        Main calculatorNormal = new Main("Normal");
        Main calculatorOpposite = new Main("Opposite");


        int resultAddNormal = calculatorNormal.add(5, 3);
        int resultSubtractNormal = calculatorNormal.subtract(8, 2);
        System.out.println("Normal Mode:");
        System.out.println("Addition: " + resultAddNormal);
        System.out.println("Subtraction: " + resultSubtractNormal);


        int resultAddOpposite = calculatorOpposite.add(5, 3);
        int resultSubtractOpposite = calculatorOpposite.subtract(8, 2);
        System.out.println("\nOpposite Mode:");
        System.out.println("Addition: " + resultAddOpposite);
        System.out.println("Subtraction: " + resultSubtractOpposite);
    }
}