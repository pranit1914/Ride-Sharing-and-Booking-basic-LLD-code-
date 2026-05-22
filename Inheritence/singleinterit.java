class A{
    void show(){
        System.out.println("In A");
    }
}
class B extends A{
    void tell(){
        System.out.println("In B");
    }
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show(); // own method
       
        B obj2 = new B();
        obj2.show(); // inherited method
        obj2.tell(); // own method
    }
}