package ladder.game;

import java.util.Collections;
import java.util.Map;

public class Results {
    private Map<String, String> prizeByParticipant;

    Results(Map<String, String> result) {
        this.prizeByParticipant = result;
    }

    public Map<String, String> getPrizeByParticipant() {
        return Collections.unmodifiableMap(prizeByParticipant);
    }
}
