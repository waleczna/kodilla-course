package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest //inicjalizacja kontenera springa
public class InvoiceDaoTestSuite {


    @Autowired
    private InvoiceDao invoiceDao; //przechowuje referencje do kontorlera repozytorium
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;


    @Transactional
    @Test
    void testInvoiceDaoSave() { //27
        //Given
        Invoice invoice = new Invoice("FV 123/2022");
        Product iron = new Product("Iron");
        Product tv = new Product("TV");
        Item item1 = new Item(invoice, iron, new BigDecimal("200"), 1, new BigDecimal("200"));
        Item item2 = new Item(invoice, tv, new BigDecimal("3000"), 2, new BigDecimal("6000"));

        iron.getItems().add(item1);
        tv.getItems().add(item2);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);


        //When
        invoiceDao.save(invoice);

        productDao.save(iron);
        productDao.save(tv);


        itemDao.save(item1);
        itemDao.save(item2);

        //Then
        Integer id = invoice.getId();
        assertNotNull(id);

        //CleanUp
//        itemDao.delete(item1);
//        itemDao.delete(item2);
//        productDao.delete(iron);
//        productDao.delete(tv);
//        invoiceDao.delete(invoice);
//
    }
}