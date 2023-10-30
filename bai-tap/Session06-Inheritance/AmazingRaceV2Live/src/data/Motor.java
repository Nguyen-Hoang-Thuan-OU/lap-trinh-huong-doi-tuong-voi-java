package data;

import java.util.Random;

// Mặc dù là một đối tượng thuộc một lớp cụ thể,
// nhưng vẫn được phép tham gia những hội nhóm khác nhau
// và phải thực hiện nội quy của hội nhóm
// (hiện thực các hàm trừu tượng)
public class Motor implements DeathRacer {

    public static final double MAX_SPEED = 180; // 180 km/h

    private String model;  // Mẫu xe
    private String volume; // Số phân khối, vd: 125.0 cm3
    private String vin;    // Biển số, số khung (Vehicle Identification Number)

    public Motor(String model, String volume, String vin) {
        this.model = model;
        this.volume = volume;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Motor{" + "model=" + model + ", volume=" + volume + ", vin=" + vin + '}';
    }

    // Chạy với tốc độ ngẫu nhiên,
    // nhưng không quá 50 km/h
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    // Khoe thành tích
    public void showRecord() {
        System.out.printf("| %-10s | %-15s | %-8s | %11s | %5.1f |\n",
                "MOTOR", model, volume, vin, run());
    }

    // Đã quyết định chọn tham gia câu lạc bộ nào
    // thì cũng đều phải tuân thủ nội quy,
    // nghĩa là phải thực hiện những hoạt động
    // trong khuôn khổ của câu lạc bộ ấy
    
    @Override
    public double runToDead() {
        // Chạy trối chết với tốc độ ngẫu nhiên,
        // vượt giới hạn và gấp 3 lần so với mọi khi
        // nhưng không quá 180 km/h
        return run() * 3;
    }

    // Gáy cũng phải oách hơn so với mọi khi
    @Override
    public void showHowToDead() {
        System.out.printf("| %-20s | %-15s | %-8s | %11s | %5.1f |\n",
                "MOTOR-RACER", model, volume, vin, runToDead());
    }
}
