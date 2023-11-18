public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner();
        Calculator calc = new Calculator();

        print("Enter a value to store:");
        calc.setData1(scan.getDouble());

        print("Enter a second value to store");
        calc.setData2(scan.getDouble())

        printf("%f plus %f equals %f", calc.getData1(), calc.getData2(), calc.add());
    }
}