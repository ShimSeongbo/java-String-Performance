package 일급객체.불변;

import java.util.HashMap;
import java.util.Map;

public class final도_변경이_가능하다 {

    public static void main(String[] args) {
        /**
         * 불변(X) -> '재할당' 금지(O)
         */
        final Map<String, Boolean> collection = new HashMap<>();

        collection.put("A", true);
        collection.put("B", false);
        collection.put("C", true);

        System.out.println("collection = " + collection);
    }
}
