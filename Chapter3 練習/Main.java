import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

    // 入門 1-1 編寫一個名為“printEvery3()”的函數，它打印出等差數列 1, 4, 7, …, 88。
    public static void printEvery3() {
        int x = 1;
        while (x <= 88) {
            System.out.println(x);
            x += 3;
        }
    }

    // 入門 1-2 編寫一個名為“ninetable()”的函數，它打印出九九乘法表的內容。
    public static void ninetable() {
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.println(i +" * "+j +" = "+i*j + " ");
            }
        }
    }

    // 入門 1-3 編寫一個名為"findMax()”的函數，參數為一個array of Integers，return type為int，返回的值為array當中所有元素當中，最大的那個。
    public static int findMax(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    // 入門 1-4 編寫一個名為"reverseArray()”的函數，參數為一個array of Integers，return type為int[]，返回的值為將array of Integers全部反轉後的新array。
    public static int[] reverseArray(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--){
            newArr[arr.length - i - 1] = arr[i];
        }
        return newArr;
    }

    // 入門 1-5 編寫一個名為"addUpTo()”的函數，參數為一個整數n，return type為int，return應為 1 + 2 + 3 + … + (n - 1) + n的值。
    // while loop 時間複雜度 O(n)
    public static int addUpToWhile(int n){
        int x = 0;
        int sum = 0;
        while (x < n) {
            x += 1;
            sum += x;
        }
        return sum;
    }
    // 用 for loop 解 時間複雜度 O(n)
    public static int addUpToFor(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    // 用Gauss 解 (最佳效能) 時間複雜度 O(1)
    public static int addUpToGauss(int n) {
        return n * (n + 1) / 2;
    }

    // 入門1-6 編寫一個名為“position()”的函數，input為String。函數沒有任何return type，但需要打印出第一個大寫字母及其index位置。 如果未找到，則打印 -1。
    public static void position(String s){
        if (s == null || s.isEmpty()){
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < s.length(); i++){
            if (Character.isUpperCase(s.charAt(i))){
                System.out.println(s.charAt(i) + " " + i);
                return;
            }
        }
        System.out.println(-1);
    }

    // 1-7 編寫一個名為“confirmEnding”的函數，它將 2 個String作為input，並返回一個boolean，該boolean指示第一個input是否以第二個input結束。
    // substring method
    public static boolean confirmEnding(String x, String y) {
        // 這個method只專注在檢查字串結尾
        if (y.length() > x.length() || x.isEmpty() || y.isEmpty()) {
            return false;
        }
        return x.substring(x.length() - y.length()).equals(y);
    }
    // endWith method
    public static boolean confirmEnd(String x, String y) {
        if (y.length() > x.length() || x.isEmpty() || y.isEmpty()) {
            return false;
        }
        return x.endsWith(y);
    }

    // 1-8 編寫一個名為“findDuplicate()”的函數，將一個整數array作為參數，並檢查array中是否有重複值。如果有，則return true，否則return false。
    // nested loop
    public static boolean findDuplicate(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // HashSet
    public static boolean findDuplicateHash(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr){
            if (!set.add(num)){ // 也可寫作 if (set.add(num) == false) 更readability
                return true;
            }
        }
        return false;
    }

    // 1-9 編寫一個名為"pyramid()”的函數，唯一的參數為一個大於0的整數，功能為打印出如下規律的金字塔:
    public static void pyramid(int n){
        if (n == 0 || n < 0) {
            System.out.println("請輸入大於0的整數");
            return;
        }
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // 1-10 編寫一個名為“findSmallCount()”的函數，它以一個整數array和一個整數n作為參數，並返回一個整數，表示array中有多少元素小於輸入整數n。
    //public static int findSmallCount(int[] arr, int n){}



    public static void main(String[] args) {
        printEvery3();
        ninetable();
        int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
        System.out.println(findMax(array));
        System.out.println();

        int[] array1 = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
        int[] reversedArray = reverseArray(array1);
        for (int i : reversedArray) {
            System.out.println(i);
        }

        System.out.println();
        long startTime = System.nanoTime();
        System.out.println("While loop :" + addUpToWhile(1000));
        long endTime = System.nanoTime();
        System.out.println("While循環耗時: " + (endTime - startTime) + " 納秒");
        startTime = System.nanoTime();
        System.out.println("For Loop:" + addUpToFor(1000));
        endTime = System.nanoTime();
        System.out.println("For循環耗時: " + (endTime - startTime) + " 納秒");
        startTime = System.nanoTime();
        System.out.println("Gauss :" + addUpToGauss(1000));
        endTime = System.nanoTime();
        System.out.println("Gauss耗時: " + (endTime - startTime) + " 納秒");

        System.out.println();
        position("");
        position("abcd");
        position("AbcD");
        position("abCD");

        System.out.println();

        System.out.println(confirmEnding("Bastian", "n"));
        System.out.println(confirmEnding("Connor", "n"));
        System.out.println(confirmEnding("Open sesame", " sesame"));
        // endWith()
        System.out.println(confirmEnd("Bastian", "n"));
        System.out.println(confirmEnd("Connor", "n"));
        System.out.println(confirmEnd("Open sesame", " sesame"));

        System.out.println();
        System.out.println(findDuplicate(new int[] {1, 3, 5, 7, 9, 3}));
        System.out.println(findDuplicate(new int[] {})); // returns false
        System.out.println(findDuplicate(new int[] {3, 4, 5, 6, 7, 10000, 0}));

        System.out.println(findDuplicateHash(new int[] {1, 3, 5, 7, 9, 3}));
        System.out.println(findDuplicateHash(new int[] {})); // returns false
        System.out.println(findDuplicateHash(new int[] {3, 4, 5, 6, 7, 10000, 0}));

        System.out.println();
        pyramid(0);
        System.out.println("====================");
        pyramid(1);
        System.out.println("====================");
        pyramid(3);

        System.out.println();

    }
}
