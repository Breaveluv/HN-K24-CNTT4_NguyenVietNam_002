import java.util.Scanner;

public class bai2 {
    // Phần 1: Xóa phần tử theo vị trí 
    public static void deleteByIndex(int[] arr, int index) {
        if (arr == null || arr.length == 0)
            return;
        if (index < 0 || index >= arr.length) {
            System.out.println("Index khong hop le");
            return;
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    // Phần 2: Tìm số còn thiếu trong dãy 0..n khi mảng có n phần tử
    public static int missingNumber(int[] arr, int n) {
        int xor = 0;
        for (int i = 0; i <= n; i++)
            xor ^= i;
        for (int v : arr)
            xor ^= v;
        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Phần 1
        System.out.println("Phan 1 - Nhap so luong phan tu n (so nguyen > 0):");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("So luong phai lon hon 0");
        } else {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
                array[i] = sc.nextInt();
            }
            System.out.println("Nhap vi tri muon xoa (0-based index):");
            int deleteIndex = sc.nextInt();
            if (deleteIndex < 0 || deleteIndex >= n) {
                System.out.println("Index khong hop le");
            } else {
                deleteByIndex(array, deleteIndex);
                // In ra n-1 phần tử
                for (int i = 0; i < n - 1; i++) {
                    System.out.print(array[i]);
                    if (i < n - 2)
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        // Phần 2
        System.out.println("Phan 2 - Tim so con thieu. Nhap n (max value), sau do nhap n phan tu:");
        int n1 = sc.nextInt();
        if (n1 < 1) {
            System.out.println("So luong phai lon hon 0");
        } else {
            int[] arr = new int[n1];
            for (int i = 0; i < n1; i++) {
                System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
            int missing = missingNumber(arr, n1);
            System.out.println(missing);
        }
    }
}
