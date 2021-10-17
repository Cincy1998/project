public class cinclass2 {
    public static void main(String args[]){

        int num1=20, num2=15,sum,sub,mult,div;
        sum=num1 + num2;
        sub=num1 - num2;
        mult=num1 * num2;
        div=num1 / num2;

        System.out.println("The result is:"+sum + " " +sub + " " +mult + " " +div);

        int a = 70;
        int b = 20;
        int c = 0;
        c = a & b;
        System.out.println("a & b = " + c );
        c = a | b;
        System.out.println("a | b = " + c );
        c = a ^ b;
        System.out.println("a ^ b = " + c );
        c = ~a;
        System.out.println("~a = " + c );

        int A = 15;
        int B = 30;
        System.out.println("A == B = " + (A == B) );
        System.out.println("A != B = " + (A != B) );
        System.out.println("A > B = " + (A > B) );
        System.out.println("A < B = " + (A < B) );
        System.out.println("B >= A = " + (B >= A) );
        System.out.println("B <= A = " + (B <= A) );

        //*unary operator//*

        int i = 2, j;
        j = i++;
        j = ++i;
        j = --i;
        j = i--;
        System.out.println(i);
        System.out.println(j);


    }
}
