public class NATOToWordConverter {

    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'B';
        char letter3 = 'C';
        char letter4 = 'D';
        char letter5 = 'E';

        System.out.println(letterConverter('F') + " " + letterConverter(letter2));

    }

    public static String letterConverter (char letter) {

        switch (letter) {
            case 'A':
                return "A is Able";
            case 'B':
                return "B is Baker";
            case  'C':
                return "C is Charlie";
            case 'D':
                return "D is Dog";
            case 'E':
                return "E is Easy";
            default:
                return letter + " is Invalid";
        }
    }

}
