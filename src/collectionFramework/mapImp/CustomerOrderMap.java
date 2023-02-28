package collectionFramework.mapImp;

import java.util.*;

public class CustomerOrderMap {
    public static void main(String[] args) {
        Map<Customer, List<Order>> customerOrderMap = new HashMap<>();

        Customer customer1 = new Customer(1,"Sachin");
        List<Order> orderListForCustomer1 = new ArrayList<>();
        orderListForCustomer1.add(new Order(1,"Mobiles"));
        orderListForCustomer1.add(new Order(2,"Laptops"));
        orderListForCustomer1.add(new Order(21,"Headphones"));

        Customer customer2 = new Customer(2,"Swapnil");
        List<Order> orderListForCustomer2 = new ArrayList<>();
        orderListForCustomer2.add(new Order(11,"Cameras"));
        orderListForCustomer2.add(new Order(22,"Tvs"));
        orderListForCustomer2.add(new Order(31,"Printers"));

        customerOrderMap.put(customer1, orderListForCustomer1);
        customerOrderMap.put(customer2, orderListForCustomer2);

        //System.out.println(customerOrderMap);
        Set<Map.Entry<Customer, List<Order>>> entries = customerOrderMap.entrySet();
        for (Map.Entry<Customer, List<Order>> entry: entries) {
            System.out.println(entry);
        }
    }
}
