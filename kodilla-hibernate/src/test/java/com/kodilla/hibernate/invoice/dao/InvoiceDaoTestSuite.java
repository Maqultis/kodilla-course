package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    private ProductDao productDao;
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("product 1");
        Product product2 = new Product("product 2");
        Product product3 = new Product("product 3");

        Item item1 = new Item(product1, new BigDecimal(300), 1);
        Item item2 = new Item(product2, new BigDecimal(100), 3);
        Item item3 = new Item(product3, new BigDecimal(5), 60);

        Invoice invoice = new Invoice("2021/04/26/1", null);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int item1id = item1.getId();
        int item2id = item2.getId();
        int item3id = item3.getId();
        int product1id = product1.getId();
        int product2id = product2.getId();
        int product3id = product3.getId();
        int size = invoice.getItems().size();

        //Then
        assertNotEquals(0, invoiceId);
        assertEquals(3, size);
        assertEquals(new BigDecimal(300), invoice.getItems().get(2).getValue());

        //CleanUp
        try {
            invoiceDao.deleteById(invoiceId);
            itemDao.deleteById(item1id);
            itemDao.deleteById(item2id);
            itemDao.deleteById(item3id);
            productDao.deleteById(product1id);
            productDao.deleteById(product2id);
            productDao.deleteById(product3id);
        } catch (Exception e) {
            //do nothing
        }
    }
}
