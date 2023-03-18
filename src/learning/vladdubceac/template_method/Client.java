package learning.vladdubceac.template_method;

public class Client {

    public static void main(String[] args) {
        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder(true);

        System.out.println("----- Changed the template to a store order -----");

        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }
}
