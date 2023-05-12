package org.example;

public class Invoice {

    private Marker marker;
    Long qty;
    public Long calculateTotal(){
        return this.marker.price * qty;
    }
}
