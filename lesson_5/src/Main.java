public class Main {
    public static void main(String[] args) {
//1+2+3+4+....n= n (1+n)/2
// problem1
    int [] arr = new int[]{1,3,2,5,4,7,9,8};
   int n= arr.length+1;
   //     System.out.println(n);
    int MissingNum;
    int sumtotal=((n)*(1+n))/2;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
        sum += arr[i];
    }
        MissingNum=sumtotal-sum;
        System.out.println("Missing number is "+ MissingNum);
//problem 2
    int [] num = new int[]  {1, 4, 7, -5, 3, 7, -32, 4, -7, 123};
      int min=num[0];
      for (int i = 0; i< num.length; i++)
          if (num[i]<min) {
              min=num[i];
          }
        System.out.println("The minimum element is " + min);
//problem3
        //int [] ar = new int[]{-6, 0, 12, 3, 3, 12, 0, -6};
        int [] ar =new int[] {1, -5, -6, 8, -6, 4, 1};
        boolean z=true;
        for (int i=0;i<ar.length/2;i++){
            int k =ar.length-1;
            if (ar[i]!=ar[k-i]) {
                System.out.println("NO");
                z=false;
                break;
            }
            }
        if (z){
                System.out.println("YES");
        }


//problem4
        int count=0;
        int m = 2;
        int array []=new int[] {-8, 5, 0, 7, 6, 9, 13};
      //int array []=new int[]{1, 2, 3, 5, 4, 7, 6}; int m=2;
      //int array []=new int[]{0, -7, 3, 6, 14, 18}; int m=3;
        for (int i=0;i<array.length-1;i++){
            if (array[i]>array[i+1]){
                count++;
            }}
            if(count==m){
                System.out.println("Violations="+ m+" (YES)");
            }
            else {
                System.out.println("Violations="+ m+" (NO)");
            }
                System.out.println("There are "+count+" violations");
    //problem 3 ex
    /*   int [] numbers = new int[]{-6, 0, 12, 3, 3, 12, 0, -6};  // YES
       // int [] ar =new int[] {1, -5, -6, 8, -6, 4, 1};
        //NO
        for (int i=0;i< numbers.length;i++){
            int k =numbers.length-i;
            if (numbers[i]==numbers[k-1]) {
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
        }
*/
    /*     int [] ar =new int[] {1, -5, -6, 8, -6, 4, 1};
        for (int i=0;i<=ar.length/2;i++){
            int k =ar.length-i;
            if (!(ar[i]==ar[k-1])) {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }*/
    /*       int [] ar =new int[] {-6, 0, 12, 3, 3, 12, 0, -6};
        //NO
        for (int i=0;i<=ar.length/2;i++){
            int k =ar.length-i;
            if (!(ar[i]==ar[k-1])) {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }*/
    }
}