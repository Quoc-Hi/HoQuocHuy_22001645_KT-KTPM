import com.example.order.context.Order;
import com.example.order.decorator.LoggingDecorator;
import com.example.order.decorator.NotificationDecorator;
import com.example.order.decorator.OrderDecorator;
import com.example.order.strategy.refund.CashRefund;
import com.example.order.strategy.shipping.ExpressShipping;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Khởi tạo Đơn Hàng mới ---");
        // Khởi tạo đơn hàng với các strategy
        Order order = new Order(new ExpressShipping(), new CashRefund());

        System.out.println("\n--- Áp dụng các Decorator (Logging & Notification) ---");
        OrderDecorator decoratedOrder = new NotificationDecorator(new LoggingDecorator(order));

        System.out.println("\n--- Quá trình xử lý đơn hàng (Mẫu State) ---");
        
        // Trạng thái: NewOrderState
        decoratedOrder.process(); 
        
        // Trạng thái: ProcessingState
        decoratedOrder.process(); 
        
        // Trạng thái: DeliveredState
        decoratedOrder.process(); 
    }
}