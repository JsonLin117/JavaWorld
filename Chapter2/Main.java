public class Main {

    public static void changeFirstElement(int[] arr){
        arr[0] = 1000;
    }

    public static void changeA(int x){
        x = 20;
    }

    public static void exchangeElements(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int temp = arr[0];
        arr[0] = arr[3];
        arr[3] = temp;

        for (int n : arr){
            System.out.print(n + " ");
        }
    }

    public static void splitString(String[] args) {
        String s = "Hello, how are you doing today?";
        String[] myArr = s.split(" ");
        for (String small : myArr){
            System.out.println(small);
        }
        String l = s.substring(0, 4); // 0 is inclusive, 4 is exclusive
        System.out.println(l);
    }

    public static void Math(String[] args){
        int x = 2;
        int y = 10;
        double z = 3.14;

        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.floor(z));
        System.out.println(Math.ceil(z));
        System.out.println(Math.pow(x, y));
        System.out.println(Math.log10(x));
    }

    // Recursive method
    public static void printHi(int i) {
        if (i == 0) {
            return;
        }
        System.out.println("print enter printHi with i is " + i);
        printHi(i - 1);
        System.out.println("finished running printHi with i is " + i); // call stack
    }

    // mod operator
    public static void modOperator(String[] args) {
        int a = 1001;
        if (a % 2 == 0){
            System.out.println("a is an even number");
        } else {
            System.out.println("a is not an even number");
        }
    }


    public static void main(String[] args) {
        int a = 10;
        changeA(a); // copy by value
        System.out.println(a); // 10 or 20?

        int[] myArray1 = {10, 20, 30};
        int[] myArray2 = myArray1; // copy by reference
        myArray1[0] = 100;

        changeFirstElement(myArray1);

        for (int i : myArray1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : myArray2) {
            System.out.print(i + " ");
        }

        System.out.println();
        exchangeElements(args);

        System.out.println();
        splitString(args);

        System.out.println();
        Math(args);

        printHi(10);

        modOperator(args);
    }
}
