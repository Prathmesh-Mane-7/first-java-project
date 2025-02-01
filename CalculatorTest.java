class Calculator{
    // public int add(int a,int b){
    //     return a+b;
    // }

    public int sub(int a,int b){
        return a-b;
    }
}

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // System.out.println("result : " + calc.add(10,20));    remove kela so git hub red

        System.out.println("result : " + calc.sub(10,20));

    }
}