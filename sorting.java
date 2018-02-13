import java.util.Scanner;

/**
 * Created by zunlin on 9/12/17.
 * Counting Sort
 * CSMC 401
 */
public class sorting {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();   //n is the number in the Array
        System.out.println("Enter the limits of the array");
        int l = in.nextInt();   //l is the limits of the Array

        int [] list = new int[n];
        int [] count = new int[2*l+1];
        int [] sort = new int[n];
        //Read in the element.
        for(int i = 0; i<n; i++){
            list[i] = in.nextInt()+l;
        }
        //Find the Majority of the element
        for(int j = 0; j<list.length; j++){
            count[list[j]]++;
        }
        //recalculate the array by adding up the previous element.
        for(int k = 1; k < count.length; k++){
            count[k] = count[k]+count[k-1];
        }
        //Sorting the array from left to right.
        for(int h = 0; h < n; h++){
            sort[(count[list[h]]-1)]  = list[h] - l ;
            count[list[h]]--;
        }

        System.out.println("n is the number in the Array");
        System.out.print(n + " ");
        System.out.println("l is the limits of the Array");
        System.out.print(l + " ");
        System.out.println(" ");
        System.out.print("In the list Array : ");
        for(int k = 0; k<list.length; k++){
            System.out.print(list[k] +" ");
        }
        System.out.println(" ");

        System.out.print("In the count Array: ");
        for(int k = 0; k<count.length; k++){
            System.out.print(count[k] +" ");
        }
        System.out.println(" ");
        System.out.print("In the sort Array: ");
        for(int k = 0; k<sort.length; k++){
            System.out.print(sort[k] +" ");
        }

    }
}
