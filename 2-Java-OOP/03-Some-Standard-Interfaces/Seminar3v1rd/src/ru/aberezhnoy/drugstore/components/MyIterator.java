package ru.aberezhnoy.drugstore.components;

import ru.aberezhnoy.drugstore.pharmacy.PharmacyIterable;

import java.util.Iterator;

public class MyIterator implements Iterator<Component> {
    private final PharmacyIterable pharmacyIterable;
    private int idx;

    public MyIterator(PharmacyIterable pharmacyIterable) {
        this.pharmacyIterable = pharmacyIterable;
        this.idx = pharmacyIterable.getIdx();
    }

    @Override
    public boolean hasNext() {
        return pharmacyIterable.getIdx() < pharmacyIterable.getSize() - 1;
    }

    @Override
    public Component next() {
        idx++;
        pharmacyIterable.setIdx(idx);
        return pharmacyIterable.getComponents().get(idx);
    }
}