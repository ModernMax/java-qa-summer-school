package ru.yandex.lesson2;

import ru.yandex.lesson2.homework.Loc;
import ru.yandex.lesson2.homework.Lot;
import ru.yandex.lesson2.homework.SerialInventory;
import ru.yandex.lesson2.homework.SerialInventoryBuilder;
import ru.yandex.lesson2.homework.Sku;

public class Main {
    public static void main(String[] args) {

        Point p = new Point();
        System.out.println(p);
        Point p1 = new Point(1, 3);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p.getId());
        System.out.println(p1.getId());
        System.out.println(Point.getCounter());
        Point p3 = Point.of(5, 5);

        Point point = PointBuilder.builder()
                .withX(12)
                .withY(7)
                .build();

        Line line = Line.of(1, 3, 1, 5);

    }

    SerialInventory serialInventory = SerialInventoryBuilder.builder()
            .withSerialKey(1789634)
            .withSku(new Sku(001, 006650041040, "Подарочный набор"))
            .withLot(new Lot(new Sku(001, 006650041040, "Подарочный набор"),
                    002,
                    7651))
            .withLoc(new Loc(003, "P01-01A5", "MEZ-4",
                    345, 231, 18,
                    8, 1,12))
            .withQuantity(26)
            .build();
}
