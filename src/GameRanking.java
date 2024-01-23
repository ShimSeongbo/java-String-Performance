import java.util.HashMap;
import java.util.Map;

/**
 * Collection 을 Wrapping 하면서, 그 외 다른 멤버 변수가 없는 상태를 '일급 컬렉션' 이라고 한다.
 */
public class GameRanking {
    private Map<String, String> ranks;

    public GameRanking(Map<String, String> ranks) {
        this.ranks = ranks;
    }

    public static void main(String[] args) {
        Map<String, String> ranks = new HashMap<>();
        ranks.put("A", "B");
        ranks.put("B", "C");
        ranks.put("C", "D");
        ranks.put("D", "E");

        GameRanking gameRanking = new GameRanking(ranks);
    }
}
