package ru.yandex.lesson2.homework;

public class Loc {
    private long serialKey;
    private String name;
    private String zone;
    private double length;
    private double width;
    private double height;
    private int x;
    private int y;
    private int z;

    public Loc(long serialKey, String name, String zone,
               double length, double height, double width,
               int x, int y, int z) {

        this.serialKey = serialKey;
        this.name = name;
        this.zone = zone;

        this.length = length;
        this.height = height;
        this.width = width;

        this.x = x;
        this.y = y;
        this.z = z;

    }

    public void setSerialKey(long serialKey) {
        this.serialKey = serialKey;
    }

    public long getSerialKey() {
        return serialKey;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getZone() {
        return zone;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY(){
        return y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
