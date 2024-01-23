package 일급객체.불변;

import java.util.List;

public class Orders {

    private final List<Order> orders;

    public Orders(List<Order> orders) {
        this.orders = orders;
    }

    public long getAmountSum() {
        return orders.stream()
                .mapToLong(Order::getAmount)
                .sum();
    }

    public class Order {

        private final long amount;

        public Order(long amount) {
            this.amount = amount;
        }

        public long getAmount() {
            return amount;
        }
    }

}
