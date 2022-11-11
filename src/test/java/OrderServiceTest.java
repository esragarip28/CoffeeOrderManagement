import org.example.service.drink.DrinkServiceImpl;
import org.example.service.order.OrderService;
import org.example.service.order.OrderServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class OrderServiceTest {
   OrderService orderService=new OrderServiceImpl(new DrinkServiceImpl());
    @Test
    @DisplayName("get order price method works well")
    void getOrderPrice() throws Exception {
        assertEquals(17.0,Double.valueOf(orderService.getOrderPrice(1)),
                "This method have to return 17.0");
    }
}
