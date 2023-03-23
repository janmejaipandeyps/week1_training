import java.util.Arrays;

class AddNumbers {
 
    public static void main(String[] args)
    {
        System.out.println(Arrays.stream(args).mapToInt(Integer::parseInt).reduce(Integer::sum).getAsInt());
    }
}