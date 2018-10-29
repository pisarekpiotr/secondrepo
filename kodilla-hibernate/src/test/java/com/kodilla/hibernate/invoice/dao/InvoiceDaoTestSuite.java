package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    public InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Alfa Romeo 8C");
        Product product1 = new Product("Alfa Romeo 4C");

        Item item = new Item (new BigDecimal(250000),1,new BigDecimal(175000));
        Item item1 = new Item (new BigDecimal(170000),1,new BigDecimal(130000));

        product.setItems(Arrays.asList(item));
        product1.setItems(Arrays.asList(item1));
        Invoice invoice = new Invoice("123456");

        invoice.getItems().add(item);
        invoice.getItems().add(item1);

        item.setInvoice(invoice);
        item1.setInvoice(invoice);

        item.setProduct(product);
        item1.setProduct(product1);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
       // invoiceDao.deleteById(id);
    }
}
