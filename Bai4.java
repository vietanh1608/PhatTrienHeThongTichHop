import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print(">> Chương trình kiểm tra số chẵn lẻ << \n");
        System.out.println("Hãy nhập số hạng :");
        int so=scanner.nextInt();
        if (so%2==0) {
            System.out.println("SSố " +so+ " là số chẵn !");
        }
        else {
            System.out.println("SSố " +so+ " là số lẻ !");
        }
    }
}
