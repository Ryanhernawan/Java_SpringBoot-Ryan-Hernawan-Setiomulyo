package Task2_DataAbstraction;

import java.util.Scanner;


public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = 0;
        int value2 = 0;
        operationfunc CalcuFunction = new operationfunc();


        // First Step
        System.out.println("+++++++++++++++CALCULATOR+++++++++++++++");
        System.out.println("1. Open Calculator");
        System.out.println("99. Exit");
        System.out.print("Masukan Pilihan Anda : ");
        int choose = scanner.nextInt();
        if (choose == 1){
            System.out.println("+++++++++++++++CALCULATOR+++++++++++++++");
            System.out.print("Masukan Value 1 : ");
            value1 = scanner.nextInt();
            System.out.print("Masukan Value 2 : ");
            value2 = scanner.nextInt();
        }
        else if( choose == 99){
            return;
        }

        //Third Step
        System.out.println("+++++++++++++++CALCULATOR+++++++++++++++");
        System.out.println("1. Add Value");
        System.out.println("2. Sub Value");
        System.out.println("3. Multiply Value");
        System.out.println("4. Divide Value");
        System.out.println("+++++++++++++++CALCULATOR+++++++++++++++");
        System.out.print("Masukan Pilihan Anda : ");
        int chooseOperation = scanner.nextInt();




        if (chooseOperation == 1){
            int result = CalcuFunction.add(value1, value2);
            System.out.println(result);
        }
        else if (chooseOperation == 2){
           int result = CalcuFunction.sub(value1, value2);
           System.out.println(result);
        }
        else if (chooseOperation == 3){
            int result = CalcuFunction.multiply(value1, value2);
            System.out.println(result);
        }
        else if (chooseOperation == 4){
            int result = CalcuFunction.devide(value1, value2);
            System.out.println(result);
        }
    }
}
