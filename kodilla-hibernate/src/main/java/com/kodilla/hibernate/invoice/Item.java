package com.kodilla.hibernate.invoice;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "ITEM")
public class Item {

   private int id;
   private BigDecimal price;
   private int quantity;
   private BigDecimal value;
   private Product product;
   private Invoice invoice;

    public Item(BigDecimal price, int quantity, BigDecimal value) {
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    public Item() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }

    @Column (name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column (name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @Column (name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
