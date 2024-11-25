import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 5;
        final double PI = 3.14; // variable declaration
        String z = "Hello";
        System.out.println(x + PI);
        String customerFirstName = "John";
        String customerLastName = "Smith";

        // 呼叫其他function
        printString();
        stringExample();
        printName(customerFirstName, customerLastName);
        stringIndex();
        checkName();
        ifCase();
        //bmiCalculator();
        arrayTest();
        arrayListTest();
        forLoopTest();
    }

    // add new function
    public static void printString(){
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
    }

    public static void stringExample(){
        String text = "Hello World";
        System.out.println("String Length: " + text.length());
        System.out.println("Upper Case: " + text.toUpperCase());
        System.out.println("Lower Case: " + text.toLowerCase());
    }

    public static void printName(String firstName, String lastName){
        System.out.println("Full Name :" + firstName + " " + lastName);
    }

    public static void stringIndex(){
        // for any String, index 0, 1, 2, 3, ..., n-1, where n = string.length()
        String name = "Wiwynn";
        String age = "26";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() - 1));
        System.out.println(name.indexOf('w'));
        System.out.println(Integer.parseInt(age));
    }

    public static void checkName(){
        // 模擬資料庫中儲存的帳戶名稱
        String databaseName = "Jason";

        // 模擬用戶輸入的名稱
        String userInput1 = "Jason";
        String userInput2 = "jason"; // 注意大小寫
        String userInput3 = "Jason ";  // 注意多了一個空格

        // 檢查不同情況
        System.out.println(databaseName.equals(userInput1));
        System.out.println(databaseName.equals(userInput2));
        System.out.println(databaseName.equals(userInput3));
    }

    public static void ifCase(){
        int age = 20;
        // below 14 : 無刑責
        // 14-18 or 80 up : prolly 減刑
        // else
        if (age < 14 && age >= 0){
            System.out.println("Belong to 無刑責");
        } else if (age >= 14 && age < 18 || age >= 80){
            System.out.println("Probably 減刑");
        } else {
            System.out.println("完全行為能力人");
        }
    }

    private static final DecimalFormat DF = new DecimalFormat("0.00");
    public static void bmiCalculator(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble() / 100;
        System.out.print("Enter weight in meters: ");
        double weight = input.nextDouble();

        double bmi = Double.parseDouble(DF.format(weight / (height * height)));
        System.out.println("BMI: " + bmi);

        if (bmi < 18.5){
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25){
            System.out.println("Normal");
        } else if (bmi >= 25){
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

    public static void arrayTest(){
        //array of Strings (indexing rules)
        String[] friends = {"Mike", "Grace", "Spencer", "Jason", "Abigail"};
        System.out.println(friends[friends.length - 1]);
        for (int i = 0; i < friends.length; i++){
            System.out.println(friends[i]);
        }
        for (String friend : friends){
            System.out.println(friend);
        }
    }

    public static void arrayListTest(){
        ArrayList<String> friends = new ArrayList<>();
        // ArrayList 有關的functions, add(), size(), get(), Collection.sort()
        friends.add("Mike");
        friends.add("Grace");
        friends.add("Spencer");
        friends.add("Jason");
        friends.add("Abigail");
        System.out.println(friends);
        System.out.println(friends.size());
    }

    public static void forLoopTest(){
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++){
            for (int j = 3; j > 0; j--){
                System.out.println(i + "," + j);
            }
        }
        // break, continue => loop
        int i = 0;
        while (i < 10){
            if (i == 5) {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}