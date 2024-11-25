public class Method {
    public Method() {}

    public void sayHello() {
        System.out.println("Hello");
    }

    // parameter list (formal parameter)
    public int multiply(int a, int b) {
        return a * b;
    }

    public void addition(int a, int b){
        System.out.println(a + b);
    }

    public void addition(String a, String b){
        System.out.println(a + b);
    }

    public static void main(String[] arg) {
        Method m = new Method();
        m.sayHello();
        System.out.println(m.multiply(2, 3));
        m.addition(2,3);
    }
}
