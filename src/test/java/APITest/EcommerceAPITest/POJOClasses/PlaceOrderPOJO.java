package APITest.EcommerceAPITest.POJOClasses;

import java.util.List;

public class PlaceOrderPOJO {

    private List<OrderDetailsPoJO> orders;

    public List<OrderDetailsPoJO> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDetailsPoJO> orders) {
        this.orders = orders;
    }


}
