package org.example.service.order;


public interface OrderService {
   void getOrder();
   public void getOrderNumber();

   Double getOrderPrice(int orderNumber) throws Exception;


}
