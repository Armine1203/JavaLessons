public class Main {
    public static void main(String[] args) {
        int[] array = {4,2,7,-5,9,6,7,9,-2,-5,7};
        int count=0;
        int n =30;
        for (int i=0;i<9;i++){
            if (array[i]!=n) {
                count++;
            }
            else {
                System.out.println("The index of 30 is:"+i);
            }
        }
    }
}