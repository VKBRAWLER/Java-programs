interface customerRaj {
  int amt = 5;
  public abstract void purchace();
}
class sellerSanju implements customerRaj {
  @Override
  public void purchace() {
    System.out.println("Raj needs "+amt+" Kg rice");
  }
}
public class InterfaceClass {
  public static void main(String[] args) {
    customerRaj obj = new sellerSanju();
    obj.purchace();
    System.out.println(customerRaj.amt);
  }
};