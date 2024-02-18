import java.util.Scanner;

interface informationShelf{
    public void setInformation(String name, int price, float duraton);
    public informationShelf getInformation();
    public void displayInformation();
}

class Books implements informationShelf{
    
    private String name;
    private int price;
    private float duration;
    //System.out.println("Enter the information of the book-");   
    public void setInformation(String name, int price, float duration){
        this.name = name;
        this.price = price;
        this.duration = duration;
    }
    public Books getInformation(){
        return this;
    }
    public void displayInformation(){
        System.out.println("Name of book-"+name);
        System.out.println("Price of book-"+price);
        System.out.println("No of pages-"+duration);
    }
}
class Media implements informationShelf{
    private String name;
    private int price;
    private float duration;
    //System.out.println("Enter the information of the book-");   
    public void setInformation(String name, int price, float duration){
        this.name = name;
        this.price = price;
        this.duration = duration;
    }
    public Media getInformation(){
        return this;
    }
    public void displayInformation(){
        System.out.println("Name of DVD-"+name);
        System.out.println("Price of DVD-"+price);
        System.out.println("Duration of DVD-"+duration);
    }
}
class Novel implements informationShelf{
    private String name;
    private int price;
    private float duration;
    //System.out.println("Enter the information of the book-");   
    public void setInformation(String name, int price, float duration){
        this.name = name;
        this.price = price;
        this.duration = duration;
    }
    public Novel getInformation(){
        return this;
    }
    public void displayInformation(){
        System.out.println("Name of Novel-"+name);
        System.out.println("Price of Novel-"+price);
        System.out.println("No of pages-"+duration);
    }
}
public class BookShelf {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Books b = new Books();
        Media m = new Media();
        Novel n = new Novel();
        System.out.println("Enter the no of operations-");
        int i = sc.nextInt();
        int j=0;
        while(j<i){
        System.out.println("Enter 1 for managing your books-");
        System.out.println("Enter 2 for managing your DVD's-");
        System.out.println("Enter 3 for managing your Novels-");
        System.out.print("Enter your choice- ");
        int x = sc.nextInt();
        switch(x){
            case 1:
            System.out.println("Enter the information about the book-");
            System.out.println("Enter name of the book- ");
            String bname = sc.next();
            System.out.println("Enter price of th Book- ");
            int bprice = sc.nextInt();
            System.out.println("Enter no of pages- ");
            float bduration = sc.nextFloat();
            b.setInformation(bname, bprice, bduration);
            b.getInformation();
            b.displayInformation();
            break;

            case 2:
            System.out.println("Enter the information about the Media- ");
            System.out.println("Enter name of the media- ");
            String mname = sc.next();
            System.out.println("Enter price of th media- ");
            int bmprice = sc.nextInt();
            System.out.println("Enter the duration of media- ");
            float mduration = sc.nextFloat();
            m.setInformation(mname, bmprice, mduration);
            m.getInformation();
            m.displayInformation();
            break;

            case 3:
            System.out.println("Enter the information about the Novel- ");
            System.out.println("Enter name of the Novel- ");
            String nname = sc.next();
            System.out.println("Enter price of th Novel- ");
            int nprice = sc.nextInt();
            System.out.println("Enter the duraation of the Novel- ");
            float nduration = sc.nextFloat();
            n.setInformation(nname, nprice, nduration);
            n.getInformation();
            n.displayInformation();
            break;

            default:
            System.out.println("Invalid input");
        }
        j++;
    }
    sc.close();
    System.out.println("End of the program");
}
}
