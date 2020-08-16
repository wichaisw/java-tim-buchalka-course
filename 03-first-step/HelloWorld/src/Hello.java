public class Hello {

    // ประกาศ method
    // void ประกาศว่า method นี้จะไม่รีเทิร์นอะไร
    // public เป็น access modifier
    public static void main(String[] args) {
        System.out.println("Hello World");

        // declaration statement
        // กำหนด data type, ประกาศชื่อตัวแปร, กำหนดค่าตัวแปร (optional)
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        int myLastOne = myTotal - 1000;
        System.out.println("mylast " + myLastOne);
    }
}
