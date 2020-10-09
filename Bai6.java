import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       System.out.println("Nhập cân nặng của sư tử Leo :");
       int cnst=scanner.nextInt();
       System.out.println("Nhập số thức ăn sư tử Leo tiêu thụ :");
       int tast=scanner.nextInt();
       System.out.println("Nhập cân nặng của con rắn Boa :");
       int cncr=scanner.nextInt();
       System.out.println("Nhập chiều dài của con rắn Boa:");
       int cdcr=scanner.nextInt();
       System.out.println("Nhập cân nặng của con khỉ George :");
       int cnck=scanner.nextInt();
       System.out.println("Nhập món ăn ưa thích của con khỉ George :");
       String tack=scanner.nextLine();
       System.out.println("Sư tử Leo nặng" +cnst+ " cân và ăn "+tast+ "cân thịt mỗi ngày " );
       System.out.println("Con rắn Boa nặng " +cncr+ " cân và dài " +cdcr+ "mét.");
       System.out.println("Con khỉ George nặng " +cnck+ " cân và thích ăn "+tack);
    }
}
