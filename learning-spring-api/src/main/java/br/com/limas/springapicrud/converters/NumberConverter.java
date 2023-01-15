package br.com.limas.springapicrud.converters;

public class  NumberConverter {

    public static Double converteToDouble(String stringNumber) {

        if (stringNumber == null)
            return 0d;

        String number = stringNumber.replaceAll(",", ".");

        if (isNumeric(number))
            return Double.parseDouble(number);

        return 0d;
    }

    public static boolean isNumeric(String stringNumber) {
        if (stringNumber == null)
            return false;
        String number = stringNumber.replaceAll(",", ".");

        return number.matches("[-+]?[0-9]*\\.?[0-9]+"); // validar se é um numero usando regex.
    }

}
