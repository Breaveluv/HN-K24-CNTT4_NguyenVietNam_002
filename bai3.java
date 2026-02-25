import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mang A");
        int n1 = sc.nextInt();
        if(n1 <=0){
            System.out.println("So luong phai lon hon 0");

        }
        int[] array=new int[n1];
        for (int i = 0; i< n1; i++){
            System.out.print("Nhap phan tu thu"+(i+1)+":");
            array[i]= sc.nextInt();
        }

        System.out.print("Nhap mang A");
        int n2 = sc.nextInt();
        if(n2 <=0){
            System.out.println("So luong phai lon hon 0");

        }
        int[] array1 =new int[n2];
        for (int i = 0; i< n2; i++){
            System.out.print("Nhap phan tu thu"+(i+1)+":");
            array1[i]= sc.nextInt();
        }

        int n3 = sc.nextInt();
        int[] array2 =new int[n3];
        for(int i )


    }
}
