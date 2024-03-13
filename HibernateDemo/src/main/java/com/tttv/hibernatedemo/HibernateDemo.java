/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tttv.hibernatedemo;

import com.tttv.pojo.Category;
import com.tttv.pojo.Product;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
        try (Session s = HibernateUtils.getFactory().openSession()) {
//            Query q = s.createQuery("Product.findAll");
            Query q = s.createNamedQuery("Product.findAll");
            List<Product> products = q.getResultList();
            
            products.forEach(p->System.out.println(p.getName()));
//            cates.forEach(c -> System.out.println(c.getName()));
        }
    }
}
