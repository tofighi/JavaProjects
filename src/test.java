import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by ghassem on 2/6/2014.
 */
public class test {

    public static void main(String[] Args) {
        System.out.println(Args.length);
        Arrays.sort(Args);
        for (String arg: Args)
            System.out.print (arg + " ");
        System.out.println();
    }
}
