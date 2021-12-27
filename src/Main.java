import java.util.*;
public class Main {
public static void main(String[] args){
console.escape();
console.color(ANSI.CYAN(), "Enter Message to be Reversed:");
console.setcolor(ANSI.GREEN());
Scanner scanner = new Scanner(System.in);
String userResponse = scanner.nextLine();
char[] userChar = userResponse.toCharArray();
char[] temp = new char[userChar.length];
console.setcolor(ANSI.lightRed());
for(int i = 0; i<userChar.length; i++){
        temp[i] = userChar[(userChar.length - 1) - i];
        System.out.print(temp[i]);
}
console.log(ANSI.RESET());
}
}
