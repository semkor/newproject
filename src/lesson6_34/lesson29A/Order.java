package lesson6_34.lesson29A;

import java.util.Objects;

public class Order {
    private long id;
    private int price;
    private String currency;
    private String itemName;
    private String shopIdentificator;

    public Order(long id, int price, String currency, String itemName, String shopIdentificator) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        lesson6_34.lesson29A.Order order = (lesson6_34.lesson29A.Order) o;
        return id == order.id && price == order.price && currency.equals(order.currency) && itemName.equals(order.itemName) && shopIdentificator.equals(order.shopIdentificator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, currency, itemName, shopIdentificator);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
