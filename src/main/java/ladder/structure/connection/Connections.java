package ladder.structure.connection;

import ladder.structure.Connection;

import java.util.ArrayList;
import java.util.List;

import static ladder.structure.Connection.NOT_CONNECTED_BRIDGE;

public class Connections {
    private static final int MOVE_RIGHT = 1;
    private static final int MOVE_STRAIGHT = 0;
    private static final int MOVE_LEFT = -1;
    private static final int CONNECTION_TO_RIGHT = 0;
    private static final int CONNECTION_TO_LEFT = -1;
    private List<Connection> connections;

    public Connections(int ladderWidth,
                       ConnectionStrategy connectionStrategy) {
        this.connections = new ArrayList<>();
        addConnections(ladderWidth, connectionStrategy);
    }

    public List<Connection> getConnections() {
        return connections;
    }

    public Connection get(int index) {
        if (index < 0 || index >= connections.size()) {
            return NOT_CONNECTED_BRIDGE;
        }
        return connections.get(index);
    }

    private void addConnections(int ladderWidth, ConnectionStrategy connectionStrategy) {
        Connection before = null;
        for (int width = 0; width < ladderWidth; width++) {
            before = Connection.of(connectionStrategy, before);
            connections.add(before);
        }
    }

}
