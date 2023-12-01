public class PRODUCT
{
    private int no;
    private String name;
    private double price;
    private static int objcount=0;
    
    public PRODUCT(int id,String name,double price)
    {
         this.no=id;
         this.name=name;
         this.price=price;
         objcount++;
    }
    
    public static int getobjcount()
    {
          return objcount;
    }
    
    public void display()
    {
       System.out.println("Product no: "+no); 
       System.out.println("Product Name: "+name);
       System.out.println("Product price:"+price);
               
    }
    public static void main(String[] args)
    {
        PRODUCT item1=new PRODUCT(1,"abc",50000);
         item1.display(); 
         System.out.println("Object count  is: "+PRODUCT.getobjcount());
         System.out.println();
         PRODUCT item2=new PRODUCT(2,"xyz",75000);
         item2.display();
         System.out.println("Object count  is: "+PRODUCT.getobjcount());
         System.out.println();
         PRODUCT item3=new PRODUCT(4,"xvz",7000);
         item3.display();  
         System.out.println("Object count  is: "+PRODUCT.getobjcount());
    }
     
}
