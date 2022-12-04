public class Main {
    public static void main(String[] args) {
//PROBLEM 2
       int num = 2568;
       int reversed = 0;
       int remainder;
        int original = num;
        while (num != 0) {
            remainder = num % 10;
          //  System.out.println(remainder);
            reversed = reversed * 10 + remainder;
           // System.out.println(reversed);
            num=num/ 10;
         //   System.out.println(num);
        }
        String result1=(original != reversed) ? original + " is not palindrome" : original  + " is palindrome.";
        System.out.println(result1);
//PROBLEM1
        int number=57;
        boolean isPrime = true;
        for(int i = 2; i <= number; i++){
             isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        String result2=(isPrime) ? number + " is a prime number" : number + " isn't a prime number";
        System.out.println(result2);
}}
