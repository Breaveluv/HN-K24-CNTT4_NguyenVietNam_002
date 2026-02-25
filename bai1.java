import java.util.Scanner;

public class bai1 {
   
    public static String normalizeName(String s) {
        if (s == null)
            return null;
        
        String onlyLettersAndSpaces = s.replaceAll("[^\\p{L} ]+", "");
     
        String trimmed = onlyLettersAndSpaces.trim().replaceAll("\\s+", " ");
        if (trimmed.isEmpty())
            return null;
        String[] parts = trimmed.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            String p = parts[i].toLowerCase();
            if (p.length() > 0) {
                sb.append(Character.toUpperCase(p.charAt(0))).append(p.substring(1));
                if (i < parts.length - 1)
                    sb.append(' ');
            }
        }
        return sb.toString();
    }

   
    public static Character firstUniqueChar(String s) {
        if (s == null)
            return null;
        String trimmed = s;
        if (trimmed.isEmpty())
            return null;
        
        int[] freq = new int[65536];
        for (int i = 0; i < trimmed.length(); i++) {
            freq[trimmed.charAt(i)]++;
        }
        for (int i = 0; i < trimmed.length(); i++) {
            char c = trimmed.charAt(i);
            if (freq[c] == 1)
                return c;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Phần 1: Chuẩn hóa tên
        System.out.println("Phan 1 - Nhap vao chuoi (ho ten):");
        String raw = sc.nextLine();
        String normalized = normalizeName(raw);
        if (normalized == null) {
            System.out.println("Lỗi: không nhập nội dung");
        } else {
            System.out.println(normalized);
        }

        // Phần 2: Ký tự không lặp lại đầu tiên
        System.out.println("Phan 2 - Nhap vao chuoi de tim ky tu khong lap:");
        String input = sc.nextLine();
        if (input == null || input.trim().isEmpty()) {
            System.out.println("Lỗi: không nhập nội dung");
        } else {
            Character ch = firstUniqueChar(input);
            if (ch == null)
                System.out.println("Khong tim thay ky tu khong lap");
            else
                System.out.println(ch);
        }
    }
}