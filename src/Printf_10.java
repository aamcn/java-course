public class Printf_10 {
    public static void main(String[] args) {

        // printf() is a method used to format the output in Java.

        // Pattern: %[flags][width][precision][specifier-character]


        // specifier-character examples : s d f b c
        // Placeholder example (%s, %d, %f, %b, %c)

        // Placeholder example (%s, %d, %f, %b, %c)
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        // %s = String
        System.out.printf("Hello, %s\n", name);
        // %c = Character
        System.out.printf("Your name starts with a %c\n", firstLetter);
        // %d = Decimal Integer
        System.out.printf("You are %d years old\n", age);
        // %f = Floating Point Number
        System.out.printf("You are %f inches talls\n", height);
        // %b = Boolean
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old, \n", name, age, height, isEmployed);
        System.out.println();
        System.out.println();

        // PRECSISION AND FLAGS EXAMPLE
        // .number = number of digits after decimal point for floating point numbers
        // + = output a plus
        // , = comma 1000 separator
        // ( ) = negative number in parenthesis
        // space = display a minus if negative, plus if positive

        double price1 = 9000.99;
        double price2 = 1000.15;
        double price3 = -5400.01;

        System.out.println("Prices with comma separating and plus signs:");
        System.out.printf("Price 1: %,+.2f\n", price1);
        System.out.printf("Price 2: %,+.2f\n", price2);
        System.out.printf("Price 3: %,+.3f\n", price3);
        System.out.println();

        System.out.println("Prices space if positive and - if negtaive:");
        System.out.printf("Price 1: %, .2f\n", price1);
        System.out.printf("Price 2: %, .2f\n", price2);
        System.out.printf("Price 3: %, .3f\n", price3);
        System.out.println();


        // WIDTH EXAMPLE

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        // Zero padding to 4 digits.
        System.out.println("IDs with zero padding to four digits:");
        System.out.printf("ID1: %04d\n", id1);
        System.out.printf("ID2: %04d\n", id2);
        System.out.printf("ID3: %04d\n", id3);
        System.out.printf("ID4: %04d\n", id4);
        System.out.println();

        System.out.println("IDs with left space padding to four digits:");
        System.out.printf("ID1: %4d\n", id1);
        System.out.printf("ID2: %4d\n", id2);
        System.out.printf("ID3: %4d\n", id3);
        System.out.printf("ID4: %4d\n", id4);
        System.out.println();

        System.out.println("IDs with zero padding to four digits:");
        System.out.printf("ID1: %-4d\n", id1);
        System.out.printf("ID2: %-4d\n", id2);
        System.out.printf("ID3: %-4d\n", id3);
        System.out.printf("ID4: %-4d\n", id4);
        System.out.println();

    }

}
