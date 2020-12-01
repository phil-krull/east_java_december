

public class HelloWorldTest {
    public static void main(String[] args) {

        for(int x = 0; x < args.length; x++){
            System.out.println(args[x]);
        }

        HelloWorld HW = new HelloWorld();
        String result = HW.printHelloWorld();
        System.out.println(result);

    }
}