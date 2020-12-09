/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import Model.Product;

/**
 *
 * @author be_me
 */
public class ProductDAO {
    
    /* Gets number of top products specified */
    /* we are gonna fake this one */
    public ArrayList<Product> getTopProducts(int numProducts){
        
        ArrayList<Product> prods = new ArrayList();
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Design Essentials Natural Almond & Avocado Shampoo");
        p1.setDescription("These are amazing products for retaining the moisture in your hair. They perfectly hydrate for the natural-haired, and those with any type of real texture");
        p1.setPrice(4);
        p1.setImageLocation("product1.jpg");
        prods.add(p1);
        
        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Kenra Professional Styling Gel 17");
        p2.setDescription("Design versatile looks with Kenra Styling Gel 17. For use on all hair types");
        p2.setPrice(5);
        p2.setImageLocation("product2.jpg");
        prods.add(p2);
        
        Product p3 = new Product();
        p3.setId(3);
        p3.setName("SuperPlump Thickening Blow Dry Spray");
        p3.setDescription("Get an instant lift and noticeable volume with ColorProof's featherweight, fast-acting mist, the winner of the GH Beauty Lab's hair volumizing sprays test");
        p3.setPrice(5);
        p3.setImageLocation("product3.jpg");
        prods.add(p3);
        
        Product p4 = new Product();
        p4.setId(5);
        p4.setName("John Frieda Frizz Ease Extra Strength Serum");
        p4.setDescription("The serum forms a barrier to prevent frizz but also to keep your hair shiny all winter long");
        p4.setPrice(5);
        p4.setImageLocation("product4.jpeg");
        prods.add(p4);
        
        Product p5 = new Product();
        p5.setId(5);
        p5.setName("It's a 10 Haircare Miracle Leave-In product");
        p5.setDescription("Our Miracle Leave-In Conditioner spray is a great addition to your daily hair care routine to help leave dull, damaged hair in the past and rejuvenate natural oils");
        p5.setPrice(17);
        p5.setImageLocation("product5.jpg");
        prods.add(p5);
        
        Product p6 = new Product();
        p6.setId(6);
        p6.setName("Pattern Argan Oil Hair Serum");
        p6.setDescription("Great for curlies, coilies & tight textures - when your hair needs extra moisture & protection");
        p6.setPrice(17);
        p6.setImageLocation("product6.jpg");
        prods.add(p6);
        
        Product p7 = new Product();
        p6.setId(7);
        p6.setName("Garnier Fructis Style Curl Sculpt Conditioning Cream Gel");
        p6.setDescription("Garnier's gel is strongly scented, but in a nice, 'fruity shampoo' way—and the bouncy, medium-hold definition it creates is a convincing argument to buy two at a time");
        p6.setPrice(17);
        p6.setImageLocation("product7.jpg");
        prods.add(p6);
        
        Product p8 = new Product();
        p6.setId(8);
        p6.setName("Foam reset rinseless hydrating hair cleanser");
        p6.setDescription("The best shampoo for... achieving shine");
        p6.setPrice(17);
        p6.setImageLocation("product8.jpg");
        prods.add(p6);
        
        Product p9 = new Product();
        p6.setId(9);
        p6.setName("Kennedy & Co Matte Hair Clay");
        p6.setDescription("Kennedy & Co Matte Hair Clay doesn't just sculpt your style - it works to reduce hair loss and stimulate healthy growth for hair that looks thick and full");
        p6.setPrice(17);
        p6.setImageLocation("product9.jpg");
        prods.add(p6);
        
        Product p10 = new Product();
        p6.setId(10);
        p6.setName("Harry's Dry Scalp 2 in 1 Shampoo & Conditioner");
        p6.setDescription("For guys dealing with dry, itchy scalp");
        p6.setPrice(17);
        p6.setImageLocation("product10.jpg");
        prods.add(p6);
        
        Product p11 = new Product();
        p6.setId(11);
        p6.setName("Garnier Fructis Style Frizz Guard Anti-Frizz Dry Spray");
        p6.setDescription("Instantly helps eliminate frizz, static and flyaways with no residue on the hair");
        p6.setPrice(17);
        p6.setImageLocation("product11.jpg");
        prods.add(p6);
        
        Product p12 = new Product();
        p6.setId(12);
        p6.setName("Essy Hair Growth Oil");
        p6.setDescription("With all-natural and pure ingredients, this is one of the most beloved growth-promoting hair products on our market");
        p6.setPrice(17);
        p6.setImageLocation("product12.jpg");
        prods.add(p6);
        
        return prods;     
        
    }
    
}
