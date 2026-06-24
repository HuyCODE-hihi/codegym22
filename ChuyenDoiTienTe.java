import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        final double EXCHANGE_RATE = 23000.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số tiền USD cần đổi: ");
        double usdAmount = scanner.nextDouble();
        double vndAmount = usdAmount * EXCHANGE_RATE;
        System.out.printf("Kết quả: %.2f USD tương đương với %.2f VNĐ\n", usdAmount, vndAmount);
    }
}