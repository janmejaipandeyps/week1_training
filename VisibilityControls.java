class Data {

    int default_int;

    public int public_int;

    private int private_int;

    protected void display() {
        private_int = 4;
        System.out.println("I am an data");
        System.out.println("private " + private_int);
    }
}


public class VisibilityControls extends Data {
    public static void main(String[] args)
    {
        var data = new Data();
        data.display();

        data.default_int = 5;
        data.public_int = 10;

        System.out.println(data.default_int);
        System.out.println(data.public_int);
    }
}
