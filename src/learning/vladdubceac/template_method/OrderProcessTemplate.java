package learning.vladdubceac.template_method;

public abstract class OrderProcessTemplate {
    public boolean isGift;

    public abstract void doSelect();
    public abstract void doPayment();

    public final void giftWrap(){
        System.out.println("Gift wrap successful");
    }

    public abstract void doDelivery();

    // the actual template method
    public final void processOrder(boolean isGift){
        doSelect();
        doPayment();

        if(isGift){
            giftWrap();
        }
        doDelivery();
    }
}
