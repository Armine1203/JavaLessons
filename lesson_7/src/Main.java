import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//PROBLEM 1
        System.out.println("Problem-1");
       int numbers[] = {4, 2, 7, -5, 9, 6, 7, 9, -2, -5, 7};
        boolean z = true;
        int count = 0;
        int n;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        System.out.println("The index of the number "+ numbers[i] +" is "+i+","+j);
                        break;
                    }
                }
            }
        if(!z){
            System.out.println("There is no any duplicate");
        }
        System.out.println(" ");
//PROBLEM2
        System.out.println("Problem-2");
        int [] array=new int[]{2, -6, -8, 5, -4, 90, 13, -68, 0, -7};
        //օգտագործել եմ պղպջակի մեթոդ, յուրաքանչուր թիվ համեմատել եմ իր հաջորդի հետ,եթե մեծատեղերը փոխել եմ
        // temp-ը վերցրել եմ թվերի տեղերը փոխելու համար
        int k=7;
        int temp;
        boolean expression = false;
        while (!expression) {
            expression = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {//-68,-8,-7,-6,-4,0,2,5,13,90;
                     temp = array[i];
                    array[i] = array[i + 1];
                    array[i+1] = temp;
                    expression = false;
                    i=k;
                }
            }
        }
        System.out.print("Array in ascending order։ ");
        System.out.println(Arrays.toString(array));
        System.out.println("The "+k+"-th"+" largest number in the array is "+array[k]);




    }
}
