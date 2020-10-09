import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vui lòng nhập số hạng thứ nhất :");
        int soA= scanner.nextInt();
        System.out.println("Vui lòng nhập số hạng thứ hai :");
        int soB= scanner.nextInt();
        int kq=soA + soB;
        System.out.println("Kết quả tổng của hai số hạng là : " + kq);

    }
}
