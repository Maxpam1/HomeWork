package Task5;

public class Main {
    public static void main(String[] args) {
        IPhone xr = new IPhone("XR",12,12,20,"стекло");
        IPhone thirteen = new IPhone("Thirteen",10,20,13,"металл");
        IPhone ten = new IPhone("Ten",12,20,15,"стекло");
        xr.print(xr);
        thirteen.print(thirteen);
        ten.print(ten);
        System.out.println(xr.equals(thirteen));
        System.out.println(xr.equals(ten));



    }
}
