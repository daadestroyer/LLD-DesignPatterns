package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Invoice invoice = new Invoice();
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.print();

        saveInvoice saveInvoice = new saveInvoice(invoice);
        saveInvoice.saveInvoice();

    }
}
