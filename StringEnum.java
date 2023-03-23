enum DemoType{
    DAILY, WEEKLY, MONTHLY;
}

public class StringEnum {
    public static void main(String[] args){
        DemoType demoType =   DemoType.valueOf("DAILY");

        System.out.println(demoType);
    }
}
