class Product{
    int pid;
    String name;
    int price;

    Product(){
        System.out.println();
    }
    void setProductDetails(int pid,String name,int price){
        this.pid = pid;
        this.name = name;
        this.price = price;
    }
}

public class OOPS {
    public static void main(String[] args) {
        Product product = new Product(); 
    }
}
