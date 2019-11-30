package ladder.structure;

import ladder.structure.connection.RandomMove;
import ladder.structure.connection.result.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class LineOfLadderTest {
    @Test
    @DisplayName("연속된 두 칸 모두 사다리가 그려질 수 업다")
    void verifiedLadderTest() {
        List<Point> points = new LineOfLadder(4, new RandomMove()).getPoints();
        assertAll(
                () -> assertThat(points.get(0).isRightOpened()
                        && points.get(1).isRightOpened()).isFalse(),
                () -> assertThat(points.get(1).isRightOpened()
                        && points.get(2).isRightOpened()).isFalse(),
                () -> assertThat(points.get(2).isRightOpened()
                        && points.get(3).isRightOpened()).isFalse(),
                () -> assertThat(points.get(3).isRightOpened()
                        && points.get(4).isRightOpened()).isFalse()
        );
    }
}