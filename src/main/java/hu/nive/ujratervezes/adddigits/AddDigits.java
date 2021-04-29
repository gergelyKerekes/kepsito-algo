package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits (String input) {
        int sum = 0;

        if (input.length() == 0 || input == null ) {
            return -1;
        } else {
            for (int i = 0; i < input.length(); i++) {
                if (Character.isDigit(input.charAt(i))) {
                    sum += Integer.parseInt(String.valueOf(input.charAt(i)));
                }
            }
        }

        return sum;
    }
}