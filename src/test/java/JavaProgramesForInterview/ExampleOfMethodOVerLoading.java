package JavaProgramesForInterview;

public class ExampleOfMethodOVerLoading {



    public static void details(String name)
    {
        System.out.println(name);
    }

    public static void details(String name, int age)
    {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        details("Puttraja");
        details("Puttraja", 35);
    }
}
