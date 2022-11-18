import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=1; i<=a*b; i++){
            if(i%a!=0) System.out.print("*");
            else System.out.println("*");
        }
    }
}