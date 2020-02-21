import java.math.BigInteger;

public class DataTypes {
    public static void main(String[] args) {
        //целые:
        byte b; // 1b = 8bit 2 ^ 8 = 256 -> [-128; 128)
        //01111111 = 127
        int dif = 5;
        short s;  // 65000 2b = 16 bit 2 ^ 16
        int i; // 10 ^ 9, 4b = 32 bit 2 ^ 32 [-2^31; 2^31)
        long l;// 10 ^ 19, 8b = 64 bit 2 ^ 64
        BigInteger v; // infinity length
        // арифметика
        // + - * / % >> <<
        // ++, --, +=, -=, *=, /=, %= ...
        // / - деление нацело
        // % - остаток от деления
        int a = 7;
        System.out.println(--a);
        System.out.println(a);
        a = a++ + ++a;
        System.out.println(a);
        a *= 2; //a = a * 2
        System.out.println(a);
        //RValue = expr++ + ++expr
        //r = expr1 + expr2 + 2
        //r = expr1 - expr2 -(-2) =
        // = expr1 - expr2 + 2
        //val = sum(post(expr1),
        //             prev(expr2))
        a = a-- - --a + a++ - --a + ++a;
        System.out.println(a);
        System.out.println(5 / 3); // 5 / 3 = 1 2/3
        System.out.println(5 % 3);
        //дробные
        float f; //4b
        double d = 1 / 3.; //8b 10 ^ 16 точность + 10 ^ 30 0
        double e = 2 / 3.;
        System.out.printf("%.25f\n", d);
        System.out.println(d);
        System.out.println(e);
        System.out.println(d / e);
        boolean b1 = false && false;//0 0
        boolean b2 = false && true;//0 1
        boolean b3 = true && false; //1 0
        boolean b4 = true && true; // 1 1
        System.out.println(b1 + " " + b2 + " " + b3
         + " " + b4);
        // || - или , && - и
        char ch = 'a';
    }
}
