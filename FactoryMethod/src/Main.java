import logistics.Logistics;
import logistics.RoadLogistics;
import logistics.SeaLogistics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cấu hình Logistics Đường Bộ");
        Logistics roadLog = new RoadLogistics();
        roadLog.planDelivery();

        System.out.println();

        System.out.println("Cấu hình Logistics Đường Thủy");
        Logistics seaLog = new SeaLogistics();
        seaLog.planDelivery();
    }
}