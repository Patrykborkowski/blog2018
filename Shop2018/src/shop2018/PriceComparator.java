/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop2018;

import java.util.Comparator;

/**
 *
 * @author Student
 */
public class PriceComparator implements Comparator<Product> {
    

    @Override
    public int compare(Product p1, Product p2) {
  
     return p1.getPrice().compareTo(p2.getPrice());
    }
    
}
