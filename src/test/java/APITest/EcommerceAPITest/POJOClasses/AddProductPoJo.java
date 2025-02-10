package APITest.EcommerceAPITest.POJOClasses;

public class AddProductPoJo {

    private String productId;  // Use "productId" as in JSON
    private String message;

    public String getProductId() {  // Change to match the field name
        return productId;
    }

    public void setProductId(String productId) {  // Change to match the field name
        this.productId = productId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
