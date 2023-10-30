package data;

public class Child extends Parent {
    
    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }
    
    @Override
    public void showProfile() {
        System.out.println("CHILD > " + "asset1: " + assetOne + "; asset2: " + assetTwo);
    }
    
    // Hàm khác biệt, chỉ riêng Con mới có
    public void sayHi() {
        System.out.println("Hey, I'll find you!");
    }
}
