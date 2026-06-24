import java.util.Scanner;
public class TinhSoNgay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tháng vào đây ");
        int month = scanner.nextInt();

        String TinhSoNgay;
        switch (month) {
            case 2:
                TinhSoNgay = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                TinhSoNgay = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                TinhSoNgay = "30";
                break;
            default:
                TinhSoNgay = "";
        }

        if (!TinhSoNgay.equals("")) System.out.printf("Tháng  '%d' có %s ngày!", month, TinhSoNgay);
        else System.out.print("Invalid input!");
    }
}
