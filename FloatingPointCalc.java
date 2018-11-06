public class FloatingPointCalc {
    //Floats in Bitschreibweise nach IEEE 754 mit Prefix 0b
    private static final int a = 0b01000010111111010000000000000000;
    private static final int b = 0b11000001101111000000000000000000;

    //Anzahl der ausgegebenen Nachkommastellen
    private static int precision = 50;

    public static void main(String[] args) {
        //Wenn eine spezielle Nachkommastellenanzahl angegeben wurde
        if(args.length != 0){
            try {
                precision = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        prepare(a, b, precision);
    }

    private static void prepare(int first, int second, int prec) {
        //Berechnung erste Float
        float aFloat = Float.intBitsToFloat(first);
        System.out.print("Die erste Float ist: ");
        System.out.printf("%." + prec + "f", aFloat);
        System.out.println();
        System.out.println(inBinary(aFloat));
        System.out.println();

        //Berechnung zweite Float
        float bFloat = Float.intBitsToFloat(second);
        System.out.print("Die zweite Float ist: ");
        System.out.printf("%." + prec +"f", bFloat);
        System.out.println();
        System.out.println(inBinary(bFloat));
        System.out.println();
        System.out.println("----------------");
        System.out.println();

        //Rechnen
        addition(aFloat, bFloat);
        System.out.println();
        subtraction(aFloat, bFloat);
        System.out.println();
        multiplication(aFloat, bFloat);
        System.out.println();
        division(aFloat, bFloat);
    }

    //Umrechnung von Float in Binary
    private static String inBinary(float floatToBinary){
        System.out.print("In Binary: ");
        int bits = Float.floatToIntBits(floatToBinary);
        String binary = Integer.toBinaryString(bits);
        for(int i = 32 - binary.length(); i > 0 ; i--) {
            binary = "0" + binary;
        }
        return binary;
    }

    //Berechnung Differenz
    private static void subtraction(float first, float second){
        float finalFloat = first - second;
        System.out.print("Die Differenz ist: ");
        System.out.printf("%." + precision + "f", finalFloat);
        System.out.println();
        System.out.println(inBinary(finalFloat));

    }

    //Berechnung Addition
    private static void addition(float first, float second){
        float finalFloat = first + second;
        System.out.print("Die Summe ist: ");
        System.out.printf("%." + precision + "f", finalFloat);
        System.out.println();
        System.out.println(inBinary(finalFloat));
    }

    //Berechnung Multiplikation
    private static void multiplication(float first, float second){
        float finalFloat = first * second;
        System.out.print("Das Produkt ist: ");
        System.out.printf("%." + precision + "f", finalFloat);
        System.out.println();
        System.out.println(inBinary(finalFloat));
    }

    //Berechnung Division
    private static void division(float first, float second){
        float finalFloat = first / second;
        System.out.print("Der Quotient ist: ");
        System.out.printf("%." + precision + "f", finalFloat);
        System.out.println();
        System.out.println(inBinary(finalFloat));
    }
}