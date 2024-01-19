import java.util.*;
class linear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[]=new int[len];

        for(int i = 0; i<len;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the no. to find in array");
        int tofind = sc.nextInt();

        for(int i = 0; i<len; i++)
        {
            if(arr[i] == tofind)
            {
                System.out.println("the no. is found at index"+i);
                break;
            }
            
            
        }

sc.close();
        }
}