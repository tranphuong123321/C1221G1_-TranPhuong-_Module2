package bai12.bai_tap.luyen_tap_arlist_lklist;

import java.util.Comparator;

public class Sort implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {

        return o1.getCost()- o2.getCost();
    }
}
