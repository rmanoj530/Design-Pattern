package StreamBasicsandMapTransformation;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> inventory = List.of(
                new Item(101, "Laptop"),
                new Item(102, "Mouse"),
                new Item(103, "Keyboard"),
                new Item(104, "Monitor")
        );

        inventory.stream()
                .map(Item::getId)
                .forEach(System.out::println);
    }
}
