public class Main {
    public static void main(String[] args) {
//1․operations
//The Arithmetic operators
    int a=96,b=8;
        System.out.println("a="+a+" "+"b="+b);
    int c=a+b;
        System.out.println("a+b="+c);
    c=a-b;
        System.out.println("a-b="+c);
    c=b-a;
        System.out.println("b-a="+c);
    c=a/b;
        System.out.println("a/b="+c);
    c=b/a;
        System.out.println("b/a="+c);
    c=a%b;
        System.out.println("a%b="+c);
    c=b%a;
        System.out.println("b%a="+c);
    c=a*b;
        System.out.println("a*b="+c);
    a++;//avelacnwum e 1 tpum
        System.out.println("a++"+" "+a);
    ++a;//tpum e heto avelacnum e 1
        System.out.println("++a"+" "+ a);
    a--;//pakasecnum e 1 tpum
        System.out.println("a--"+" "+a);
    --a;//tpum e heto pakasecnum e 1
        System.out.println("--a"+" "+a);
//Relational operators(true or false)
        System.out.println("a==b"+" "+(a==b));
        System.out.println("a!=b"+" "+(a!=b));
        System.out.println("a>b"+" "+(a>b));
        System.out.println("a>=b"+" "+(a>=b));
        System.out.println("a<b"+" "+(a<b));
        System.out.println("a<=b"+" "+(a<=b));
//The Logical Operators(true or false)
        System.out.println("a>90 && b<a"+" "+(a>90 && b<a));
        System.out.println("a>90 || b<a"+" "+(a>90 || b<a));
        System.out.println("!(a>90 || b<a)"+" "+( !(a>90 || b<a)));
//Bitwise operators
        System.out.println("a&b="+(a & b));//96=(1100000)2 and 8=(1000)2
        System.out.println("a|b="+(a | b));
        System.out.println("a^b="+(a ^ b));
        System.out.println("~a="+~a);//example k=42, ~k=-(k+1) , ~k=-43
        System.out.println("b << 2 = " +(b<<2));//8=1000 b<<2=100000
        System.out.println("b >> 2 = " +(b>>2));//b>>2=10
        System.out.println("b >>> 2 = " +(b>>>2));//b>>>2  0010 skzbic avelacnum enq 2hat 0, verji 2 hat 0 sxvum en
//2.program
        int  m = 10, n = 23;
        m = m + n;  //a=a+b=10+23=33
//        System.out.println(m);
        n = m - n;//b=a-b=33-23=10
//        System.out.println(n);
        m = m - n;//a=a-b=33-10=23
//        System.out.println(m);
        System.out.println("m="+m+" "+"n="+n);
    }
}