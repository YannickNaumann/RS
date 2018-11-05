public class FloatingPointCalc {
    //Floats in Bitschreibweise nach IEEE 754 mit Prefix 0b
    private static final int a = 0b01000010111111010000000000000000;
    private static final int b = 0b11000001101111000000000000000000;

    //Anzahl der ausgegebenen Nachkommastellen
    private static final int precision = 50;

    /*0 = addition
    1 = subtraction
    2 = multiplication
    3 = division*/
    private static final int operator = 0;

    public static void main(String[] args) {
        prepare(a, b, precision, operator);
    }

    private static void prepare(int first, int second, int prec, int operator) {
        //Berechnung erste Float
        float aFloat = Float.intBitsToFloat(first);
        System.out.print("Die erste Float ist: ");
        System.out.printf("%." + prec + "f", aFloat);
        System.out.println();

        //Berechnung zweite Float
        float bFloat = Float.intBitsToFloat(second);
        System.out.print("Die zweite Float ist: ");
        System.out.printf("%." + prec +"f", bFloat);
        System.out.println();

        switch(operator){
            case 0:
                addition(aFloat, bFloat, prec);
                break;

            case 1:
                subtraction(aFloat, bFloat, prec);
                break;

            case 2:
                multiplication(aFloat, bFloat, prec);
                break;

            case 3:
                division(aFloat, bFloat, prec);
                break;

            default:
                break;

        }

    }

    private static void subtraction(float first, float second, int prec){
        //Berechnung Differenz
        float finalFloat = first - second;
        System.out.print("Die Differenz ist: ");
        System.out.printf("%." + prec + "f", finalFloat);
        System.out.println();
    }

    private static void addition(float first, float second, int prec){
        //Berechnung Addition
        float finalFloat = first + second;
        System.out.print("Die Summe ist: ");
        System.out.printf("%." + prec + "f", finalFloat);
        System.out.println();
    }

    private static void multiplication(float first, float second, int prec){
        //Berechnung Multiplikation
        float finalFloat = first * second;
        System.out.print("Das Produkt ist: ");
        System.out.printf("%." + prec + "f", finalFloat);
        System.out.println();
    }

    private static void division(float first, float second, int prec){
        //Berechnung Division
        float finalFloat = first / second;
        System.out.print("Der Quotient ist: ");
        System.out.printf("%." + prec + "f", finalFloat);
        System.out.println();
    }
}