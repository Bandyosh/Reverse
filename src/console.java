public class console {
    public static void log(String msg){
        System.out.println(ANSI.GREEN() + msg + ANSI.RESET());
    }
    public static void error(String msg){

        System.out.println(ANSI.RED() + "Error Handler: " + msg + ANSI.RESET());

    }

    public static void color(String color, String msg){

        System.out.println(color + msg + " " + ANSI.RESET());
    }

    public static void setcolor(String color){
        System.out.print(color);
    }

    public static void print(String color, String msg){

        System.out.print(color + msg);
    }
    public static void escape(){

        System.out.println("\033[H\033[2J");
    }


    public static void end(){
        System.exit(0);
    }

}
