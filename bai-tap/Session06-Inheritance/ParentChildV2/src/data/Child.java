package data;

public class Child extends Parent {
    // Con có thêm một thuộc tính khác
    // ngoài những gì được thừa kế từ Cha
    private String assetThree;

    // Nhận thừa kế từ Cha,
    // đồng thời kèm thêm tài sản cá nhân
    public Child(String assetOne, String assetTwo, String assetThree) {
        super(assetOne, assetTwo);
        this.assetThree = assetThree;
    }

    public String getAssetThree() {
        return assetThree;
    }

    public void setAssetThree(String assetThree) {
        this.assetThree = assetThree;
    }
    
    @Override
    public void showProfile() {
        System.out.println("CHILD > " + "asset1: " + assetOne +
                "; asset2: " + assetTwo +
                "; asset3: " + assetThree);
    }
    
    public void sayHi() {
        System.out.println("Hey, I'll find you!");
        System.out.println("By this way, my 3rd asset is: " + assetThree);
    }
}
