package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요 : ");
        int orderNum = sc.nextInt();
        ProductOrder[] po = new ProductOrder[orderNum];

        for (int i = 0; i < orderNum; i++) {
            System.out.println(i+1 + "번째 주문 정보를 입력하세요.");

            System.out.println("상품명 : ");
            String name = sc.next();
            System.out.println("가격 : ");
            int price = sc.nextInt();
            System.out.println("수량 : ");
            int quantity = sc.nextInt();

            po[i] = createProductOrder(name, price, quantity);
        }

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
            result += orders[i].price *= orders[i].quantity;
        }

        return result;
    }
}
