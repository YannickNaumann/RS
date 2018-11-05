public class FloatingPointCalc {
    //Floats in Bitschreibweise nach IEEE 754 mit Prefix 0b
    private static final int a = 0b01000010111111010000000000000000;
    private static final int b = 0b11000001101111000000000000000000;

    //Anzahl der ausgegebenen Nachkommastellen
    private static final int precision = 50;

    public static void main(String[] args) {
        prepare(a, b, precision);
    }

    private static void prepare(int first, int second, int prec) {
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
        System.out.println();

        //Rechnen
        addition(aFloat, bFloat);
        subtraction(aFloat, bFloat);
        multiplication(aFloat, bFloat);
        division(aFloat, bFloat);
    }

    private static void subtraction(float first, float second){
        //Berechnung Differenz
        float finalFloat = first - second;
        System.out.print("Die Differenz ist: ");
        System.out.printf("%." + precision + "f", finalFloat);
        System.out.println();
    }

    private static void addition(float first, float second){
        //Berechnung Addition
        float finalFloat = first + second;
        System.out.print("Die Summe ist: ");
        System.out.printf("%." + precision + "f", finalFloat);
        System.out.println();
    }

    private static void multiplication(float first, float second){
        //Berechnung Multiplikation
        float finalFloat = first * second;
        System.out.print("Das Produkt ist: ");
        System.out.printf("%." + precision + "f", finalFloat);
        System.out.println();
    }

    private static void division(float first, float second){
        //Berechnung Division
        float finalFloat = first / second;
        System.out.print("Der Quotient ist: ");
        System.out.printf("%." + precision + "f", finalFloat);
        System.out.println();
    }
}