package ru.yandex.lesson2.homework;

public class Lot {
    private long serialKey;
    private long quantity;
    private Sku sku;

    public Lot(Sku sku, long serialKey, long quantity ){
        this.sku = sku;
        this.serialKey = serialKey;
        this.quantity = quantity;
    }

    public void setSerialKey(long serialKey) {
        this.serialKey = serialKey;
    }

    public long getSerialKey() {
        return serialKey;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public Sku getSku() {
        return sku;
    }
}
