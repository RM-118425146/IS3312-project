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
        p1.setCode("aaa");
        p1.setName("Design Essentials Natural Almond & Avocado Shampoo");
        p1.setDescription("These are amazing products for retaining the moisture in your hair. They perfectly hydrate for the natural-haired, and those with any type of real texture");
        p1.setPrice(4);
        p1.setImageLocation("product1.jpg");
        prods.add(p1);
        
        Product p2 = new Product();
        p2.setId(2);
        p2.setCode("aab");
        p2.setName("Kenra Professional Styling Gel 17");
        p2.setDescription("Design versatile looks with Kenra Styling Gel 17. For use on all hair types");
        p2.setPrice(5);
        p2.setImageLocation("product2.jpg");
        prods.add(p2);
        
        Product p3 = new Product();
        p3.setId(3);
        p3.setCode("aac");
        p3.setName("SuperPlump Thickening Blow Dry Spray");
        p3.setDescription("Get an instant lift and noticeable volume with ColorProof's featherweight, fast-acting mist, the winner of the GH Beauty Lab's hair volumizing sprays test");
        p3.setPrice(5);
        p3.setImageLocation("product3.jpg");
        prods.add(p3);
        
        Product p4 = new Product();
        p4.setId(5);
        p4.setCode("aad");
        p4.setName("John Frieda Frizz Ease Extra Strength Serum");
        p4.setDescription("The serum forms a barrier to prevent frizz but also to keep your hair shiny all winter long");
        p4.setPrice(5);
        p4.setImageLocation("product4.jpeg");
        prods.add(p4);
        
        Product p5 = new Product();
        p5.setId(5);
        p5.setCode("aae");        
        p5.setName("It's a 10 Haircare Miracle Leave-In product");
        p5.setDescription("Our Miracle Leave-In Conditioner spray is a great addition to your daily hair care routine to help leave dull, damaged hair in the past and rejuvenate natural oils");
        p5.setPrice(17);
        p5.setImageLocation("product5.jpg");
        prods.add(p5);
        
        Product p6 = new Product();
        p6.setId(6);
        p6.setCode("aaf");
        p6.setName("Pattern Argan Oil Hair Serum");
        p6.setDescription("Great for curlies, coilies & tight textures - when your hair needs extra moisture & protection");
        p6.setPrice(17);
        p6.setImageLocation("product6.jpg");
        prods.add(p6);
        
        Product p7 = new Product();
        p7.setId(7);
        p7.setCode("aag");        
        p7.setName("Garnier Fructis Style Curl Sculpt Conditioning Cream Gel");
        p7.setDescription("Garnier's gel is strongly scented, but in a nice, 'fruity shampoo' way—and the bouncy, medium-hold definition it creates is a convincing argument to buy two at a time");
        p7.setPrice(17);
        p7.setImageLocation("product7.jpg");
        prods.add(p7);
        
        Product p8 = new Product();
        p8.setId(8);
        p8.setCode("aah");        
        p8.setName("Foam reset rinseless hydrating hair cleanser");
        p8.setDescription("The best shampoo for... achieving shine");
        p8.setPrice(17);
        p8.setImageLocation("product8.jpg");
        prods.add(p8);
        
        Product p9 = new Product();
        p9.setId(9);
        p9.setCode("aai");        
        p9.setName("Kennedy & Co Matte Hair Clay");
        p9.setDescription("Kennedy & Co Matte Hair Clay doesn't just sculpt your style - it works to reduce hair loss and stimulate healthy growth for hair that looks thick and full");
        p9.setPrice(17);
        p9.setImageLocation("product9.jpg");
        prods.add(p9);
        
        Product p10 = new Product();
        p10.setId(10);
        p10.setCode("aaj");
        p10.setName("Harry's Dry Scalp 2 in 1 Shampoo & Conditioner");
        p10.setDescription("For guys dealing with dry, itchy scalp");
        p10.setPrice(17);
        p10.setImageLocation("product10.jpg");
        prods.add(p10);
        
        Product p11 = new Product();
        p11.setId(11);
        p11.setCode("aak");        
        p11.setName("Garnier Fructis Style Frizz Guard Anti-Frizz Dry Spray");
        p11.setDescription("Instantly helps eliminate frizz, static and flyaways with no residue on the hair");
        p11.setPrice(17);
        p11.setImageLocation("product11.jpg");
        prods.add(p11);
        
        Product p12 = new Product();
        p12.setId(12);
        p12.setCode("aal");        
        p12.setName("Essy Hair Growth Oil");
        p12.setDescription("With all-natural and pure ingredients, this is one of the most beloved growth-promoting hair products on our market");
        p12.setPrice(17);
        p12.setImageLocation("product12.jpg");
        prods.add(p12);
        
        return prods;     
        
    }
    
}
