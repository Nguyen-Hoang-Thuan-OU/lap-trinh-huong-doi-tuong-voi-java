package data;

public abstract class Pet {
    // Những đặc điểm chung nhất của các loại thú cưng
    protected String name;
    protected int yob;
    protected double weight;

    public Pet(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeith() {
        return weight;
    }

    public void setWeith(double weith) {
        this.weight = weith;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
    }
    
    // Hành động chạy sẽ là một ý tưởng trừu tượng,
    // tuỳ vào mỗi loại thú cưng
    // mà sẽ có tốc độ, hình dáng chạy... khác nhau,
    // nhưng loài thú cưng nào cũng sẽ có
    public abstract double run();
    
    // Hiển thị thành tích chạy
    public abstract void showRecord(); // paint(), showProfile()
}
