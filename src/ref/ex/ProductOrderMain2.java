package ref.ex;

public class ProductOrderMain2 {
    static ProductOrder[] po = new ProductOrder[3];

    public static void main(String[] args) {
        po[0] = createProductOrder("두부", 2000, 2);
        po[1] = createProductOrder("김치", 5000, 1);
        po[2] = createProductOrder("콜라", 1500, 2);

        printOrders(po);
        System.out.println(getTotalAmount(po));
    }

    private static ProductOrder createProductOrder(String productName, int price, int quantity) {
        ProductOrder po = new ProductOrder();
        po.productName = productName;
        po.price = price;
        po.quantity = quantity;

        return po;
    }

    static void printOrders(ProductOrder[] orders) {
        for (int i = 0; i < orders.length; i++) {
            System.out.println("상품명 : " + orders[i].productName + " 가격 : " + orders[i].price + "수량 : " + orders[i].quantity);
        }

    }

    static int getTotalAmount(ProductOrder[] orders) {
        int result = 0;
        for (int i = 0; i < orders.length; i++) {
            result += orders[i].price*=orders[i].quantity;
        }

        return result;
    }
}
