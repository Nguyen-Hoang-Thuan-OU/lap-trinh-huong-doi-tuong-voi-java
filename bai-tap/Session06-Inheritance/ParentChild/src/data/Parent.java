package data;

public class Parent {
    protected String assetOne; // Tài sản 1 - Biệt thự
    protected String assetTwo; // Tài sản 2 - Tiền ảo

    public Parent(String assetOne, String assetTwo) {
        this.assetOne = assetOne;
        this.assetTwo = assetTwo;
    }

    public String getAssetOne() {
        return assetOne;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
    }

    public String getAssetTwo() {
        return assetTwo;
    }

    public void setAssetTwo(String assetTwo) {
        this.assetTwo = assetTwo;
    }

    @Override
    public String toString() {
        return "Parent{" + "assetOne=" + assetOne + ", assetTwo=" + assetTwo + '}';
    }
    
    public void showProfile() {
        System.out.println("PARENT > " + "asset1: " + assetOne + "; asset2: " + assetTwo);
    }
}
