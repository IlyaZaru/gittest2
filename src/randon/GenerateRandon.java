package randon;

import java.util.Random;

public class GenerateRandon {
    private static Random random = new Random();

    public static int generate(){
        return random.nextInt(50);
    }
}
