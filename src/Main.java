public class Main {
    public static void main(String[] args) {
//        sayHi();
//        sayHiTo("Inga");
//        String vardas = "Iveta";
//        sayHiTo(vardas);
//        printRndIntChoice(14,30);
//        double result = returnPI();
//        System.out.println(result);
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

    public static int[] randomArray(int min, int max, int lenght) {
        int[] array = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = min + (int) Math.round(Math.random() * (max - min));
            
        }
        return array;
    }

    public static int sixthArray() {

    }








}

