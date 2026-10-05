public class ShoppingCart {

    // Hàm thanh toán: nhận danh sách giá sản phẩm, trả về tổng tiền phải trả
    public static double purchase(double[] prices) {
        // Tổng tiền tạm tính
        double subtotal = 0;
        for (double price : prices) {
            subtotal += price;
        }

        // Tổng tiền cuối cùng
        // Dev A: sửa dòng này để giảm 10%  -> subtotal * 0.9
        // Dev B: sửa dòng này để cộng VAT 5% -> subtotal * 1.05
        double total = subtotal;

        return total;
    }

    public static void main(String[] args) {
        double[] prices = {100000, 200000, 300000};
        double total = purchase(prices);
        System.out.println("Tong tien phai tra: " + total);
    }
}
