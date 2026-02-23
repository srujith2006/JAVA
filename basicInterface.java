interface i {
    void show();
}

class sample implements i {
    public void show() {
        System.out.println("This is show function, which is defined in interface");
    }
}

class Main {
    public static void main(String[] args) {
        i i1;
        i1 = new sample();
        i1.show();
    }
}
