package com.cba.lambda;
interface Executable{
    int execute(int a, int b);
}

class Runner{
    public void run(Executable e){
        System.out.println("Executing code block");
        int value =e.execute(10, 20);
        System.out.println("Return value" + value);
    }
}

/*
Various way to create lambda experssions

1. () -> System.out.println("Hello Lambda")

2.() -> {
            System.out.println("Hello Lambda");
            System.out.println("Multiple lines");
        }

   3.() -> {
            System.out.println("Hello Lambda");
            System.out.println("Multiple lines");
            return 20;
        }
 4. () -> { return 20}
 5. () -> 20
6. (int a) -> { return a;}
7. (a) -> { return a;}
8.a -> { return a;}
9. (a,b) -> {
            System.out.println("input: " +a);
            return a+b;
        });
 */
public class App {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute(int a, int b) {
                System.out.println("Hello Anonymous");
                return a+b;
            }
        });
        System.out.println("===================================");
        runner.run((a,b) -> {
            System.out.println("input: " +a);
            return a+b;
        }
        );
    }
}

