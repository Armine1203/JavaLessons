//import java.util.Arrays;
public class hello {
    public static void main(String[] args) {
//problem 1
        int numbers[] = {100, 48, 84, -27, 30, 30, 85, 47, -57};
        int count=0;
        int n =30;
        for (int i=0;i<9;i++){
            if (numbers[i]!=n) {
            count++;
            }
            else {
                System.out.println("The index of 30 is:"+i);
            }
        }
     /*       for (int i = 0; i < 9; i++)
            {
                n = numbers[i];

                if (n == numbers[i])
                {
                    count++;
                }


            }
                    System.out.println(count);

*/
    //problem 2
        int num[] = {1, 4, 7, -5, 3, 7, 32, 4, -7, 12};
     //   int count=0;
        System.out.print("Odd numbers are: ");
        for (int i=0;i<10;i++){
            if(num[i]%2==1 || num[i]%2==-1){
                int oddNumbers=num[i];
               //    System.out.print("index:"+i+"=");
                System.out.print(oddNumbers+" ");
             //   System.out.println(i);
            }
            }
        System.out.println(" ");
        System.out.print("Even numbers are: ");
        for (int i=0;i<10;i++) {
            if (num[i] % 2 == 0) {
                int evenNumber = num[i];
                System.out.print(evenNumber + " ");
            }
        }
        System.out.println(" ");
//problem 3
      int firstArray[] = {3, 6, 0, -3, 10, 8, 13};
        int secondArray[] ={2, 56, -5, 9, 45, 10, 12, 6, 13, 56};
        System.out.print("Common numbers are: ");
        for(int i=0;i<7;i++) {
            for(int j=0;j<10;j++) {
                if(firstArray[i]==secondArray[j]) {
                    System.out.print(firstArray[i]+" ");
                }
            }
        }

    }
}
// ctrl alt l
/* System.out.println("Task 2");


        int oddNumbersCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 1 || numbers[i] % 2 == -1) {

                oddNumbersCount++;
            }
        }

        int[] oddNumbrs = new int[oddNumbersCount];
        System.out.println("The Array of even numbers are :");
        int oddNumberIndex = 0;
        int evenNumberIndex = 0;
        int[] evenNumbers = new int[numbers.length - oddNumbersCount];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1 || numbers[i] % 2 == -1) {
                oddNumbrs[oddNumbersCount] = numbers[i];
                oddNumberIndex++;
            } else {
                evenNumbers[evenNumberIndex] = numbers[i];
                evenNumberIndex++;
            }
        }
        for (int i = 0; i < evenNumbers.length; i++) {

            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
        System.out.println("The Array of odd numbers are :");
        for (int i = 0; i < oddNumbrs.length; i++) {

            System.out.print(oddNumbrs[i] + " ");
        }

        System.out.println();
        System.out.println("Task 3");
        int[] firstArray = {3, 6, 0, -3, 2, 2, 13};
        int[] secondArray = {2, 56, -5, 2, 45, 2, 12, 6, 13, 56};
        int[] thertArray = new int[firstArray.length];
        int thertArrayIndex = 0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    thertArray[thertArrayIndex] = firstArray[i];
                    thertArrayIndex++;
                    break;
                }
            }
        }
        System.out.println("The common numbers between first and second arrays are :");
        for (int i = 0; i < thertArray.length; i++) {
            if (thertArray[i] != 0) {
                System.out.print(thertArray[i] + " ");
            }
        }


    }
}*/
//xndir 3-y tnayin------------------