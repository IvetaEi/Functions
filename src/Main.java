public class Main {
    public static void main(String[] args) {
//        sayHi();
//        sayHiTo("Inga");
//        String vardas = "Iveta";
//        sayHiTo(vardas);
//        printRndIntChoice(14,30);
//        double result = returnPI();
//        Systeggut.println(result);
//        System.out.println( returnPI() );
//
//        System.out.println(formatNameCase("iVETA"));
//
//    public static String formatNameCase(String name) {//priima ir grazina
//        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
//    }
//
//    public static void sayHi() {
//        System.out.println("Hii");
//
//    }
//public static double returnPI(){
//        return 3.14;
//}
//    public static void printRndIntChoice(int a, int b) {
//        if (Math.random() > 0.5){
//            System.out.println(a);
//        }else{
//            System.out.println(b);
//        }
//    }
//
//    public static void sayHiTo(String name) {
//        System.out.println("Hi " + name);
//    }
//
        System.out.println("---------- Lengvesni ----------");
        System.out.println("--------- 1 uzduotis ----------");
        int variable1 = 10;
        int variable2 = 15;
        sum(variable1, variable2);

        System.out.println("--------- 2 uzduotis ----------");
//        double result = PISq();//pirmas variantas
//        System.out.println(result);
        System.out.println(PISq());//arba antras variantas

        System.out.println("--------- 3 uzduotis ----------");
        int a = 10;
        int b = 15;
//        int res = multiplication(a, b);//pirmas variantas
//        System.out.println(res);
        System.out.println(multiplication(a, b));//arba antras variantas

        System.out.println("--------- 4 uzduotis ----------");
        int[] arr = {3, 5, 7, 9};
        printArray(arr);

        System.out.println("--------- 5 uzduotis ----------");
        System.out.println(randomNr(12,30));

        System.out.println("--------- 6 uzduotis ----------");
        int[] randomArray = randomArray(5,10,5);
        printArray(randomArray);

        System.out.println("--------- 7 uzduotis ----------");
        int sum = arraySum(randomArray);
        System.out.println("6-tos uzduoties skaiciu suma: " + sum);

        System.out.println("--------- 8 uzduotis ----------");
        double average = arrayAverage(randomArray);
        System.out.println("6-tos uzduoties skaiciu vidurkis: " + average);

        System.out.println("--------- 9 uzduotis ----------");
        rectangle(4,8);

        System.out.println("\n" + "--------- 10 uzduotis ---------");
        String sentence = "Šiandien labai graži diena";
        sentenceSymbolsCount(sentence);

        System.out.println("--------- 11 uzduotis ---------");
        String randomName = "Olivia";
        System.out.println(reverseName(randomName));

        System.out.println("---------- Sunkesni -----------");
        System.out.println("--------- 1 uzduotis ----------");
        String text1 = "hello";
        frontNback(text1);

        System.out.println("--------- 2 uzduotis ----------");
        int stringLength = 10;
        String text = generateRndStr(stringLength);
        System.out.println(text);
        printTextInAWeirdWay(text);

        System.out.println("--------- 3 uzduotis ----------");




  }
    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static double PISq() {
        return 9.8596;
    }

    public static int multiplication(int a, int b) {
        return a * b;

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int randomNr(int min, int max) {
        return (int) (min + Math.round(Math.random() * (max - min)) );
    }

    public static int[] randomArray(int min, int max, int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = min + (int) Math.round(Math.random() * (max - min));
            
        }
        return array;
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static double arrayAverage(int[] arr) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            average = sum / arr.length;
        }
        return average;
    }
//    public static void rectangle(int x, int y) {
//        for (int x1 = 0; x1 <= x; x1++) {
//            for (int y2 = 0; y2 <= y; y2++) {
//                if (y2 == y2*4){
//                    System.out.print(System.lineSeparator());
//                } else {
//                    System.out.print("* ");
//                }
//            }
//        }
//    }
    public static void rectangle(int x, int y) {
        for(int i=0; i < x; i++) {
            for(int j=0; j < y; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//for (int x = 0; x < 26; x++) {
//        for (int y = 0; y < 26; y++) {
//            if (y == y*25){
//                System.out.print(System.lineSeparator());
//
//            }else{
//                System.out.print("* ");
//
//            }
//        }
//
//    }
    public static void sentenceSymbolsCount(String sen) {
        int countLetters = 0;
        int countSpaces = 0;
        for (int i = 0; i < sen.length(); i++) {
            if (Character.isLetter(sen.charAt(i))) {
                countLetters++;
            }else{
                countSpaces++;
        }
      }
        System.out.println("Is viso raidziu sakinyje: " + countLetters + ", o tarpu: " + countSpaces);
    }

    public static String reverseName(String name) {
        String reverse = new StringBuilder(name).reverse().toString();
        return reverse;
    }

    public static void frontNback(String name) {
        System.out.println("---" + name + "---");
    }

    public static String generateRndStr(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678901234567890";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random()*symbols.length()));

        }
        return text;
    }

//    public static void printTextInAWeirdWay(String txt){
//        for (int i = 0; i < txt.length(); i++) {
//            int countNumbers = 0;
//            if (txt.charAt(i)+1 == ) {
//                System.out.println("[" + txt.charAt(i) + "]");}
//        if (Character.isDigit(txt.charAt(i))) {
//                System.out.println("[" + txt.charAt(i) + "]");
//            }else{
//                System.out.println(txt.charAt(i));
//            }
//        }
//    }
    public static void printTextInAWeirdWay(String txt) {
        String number = "";
        for (int i = 0; i < txt.length(); i++) {
            char currentChar = txt.charAt(i);
            if (Character.isDigit(currentChar)) {
                number += currentChar;
            }else{
                if (number.length() > 0) {
                    System.out.println("[" + number + "]");
                }
                System.out.println(currentChar);
                number = "";
            }
        }
        if (number.length() > 0) {
        System.out.println("[" + number + "]");}
    }

//    public static int withoutRem(int number) {
//        int countWithoutRem = 0;
//        if (number == 1 || number == number) {
//            continue;
//        } else if (number % ) {
//            countWithoutRem++;
//        }else{
//
//       }
//        return number;
//    }







}

