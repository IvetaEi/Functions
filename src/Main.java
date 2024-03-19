public class Main {
    public static void main(String[] args) {
        sayHi();
        sayHiTo("Inga");
        String vardas = "Iveta";
        sayHiTo(vardas);
        printRndIntChoice(14,30);
        double result = returnPI();
        System.out.println(result);
        System.out.println( returnPI() );

        System.out.println(formatNameCase("iVETA"));
    }

    public static String formatNameCase(String name) {//priima ir grazina
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static void sayHi() {
        System.out.println("Hii");

    }
public static double returnPI(){
        return 3.14;
}
    public static void printRndIntChoice(int a, int b) {
        if (Math.random() > 0.5){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public static void sayHiTo(String name) {
        System.out.println("Hi " + name);
    }
}