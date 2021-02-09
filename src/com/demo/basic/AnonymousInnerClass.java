package src.com.demo.basic;

class AClass {
    public void showMain() {
        System.out.println("Syso...");
    }

    public void show() {
        System.out.println("In A Show");
    }
}

class AnonymousInnerClass {
    public static void main(String[] args) {
        AClass obj = new AClass() {
            public void show() {
                System.out.println("In Custom Show");
            }
        };
        obj.show();
    }
}