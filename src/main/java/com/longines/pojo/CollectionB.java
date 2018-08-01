package com.longines.pojo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CollectionB {
    private BigDecimal price;
    private  Integer inv;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getInv() {
        return inv;
    }

    public void setInv(Integer inv) {
        this.inv = inv;
    }

    @Override
    public String toString() {
        return "CollectionB{" +
                "price=" + price +
                ", inv=" + inv +
                '}';
    }
}
