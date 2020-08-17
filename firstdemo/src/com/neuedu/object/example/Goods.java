package com.neuedu.object.example;

public class Goods {
    /*
    * 商品：
    *    商品编号：String gid   h00002
    *    商品名：  String  name
    *    单价：    double  price
    *     单位（斤/千克/袋。。。）：String unitOfMeasurement
    *    库存：int stock
    *
    * */

    private String gid;
    private String name;
    private double price;
    private String unitOfMeasurement;
    private int stock;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid='" + gid + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", unitOfMeasurement='" + unitOfMeasurement + '\'' +
                ", stock=" + stock +
                '}';
    }
}
