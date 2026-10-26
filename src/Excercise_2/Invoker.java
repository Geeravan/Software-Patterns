package Excercise_2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Invoker {
    private Deque<Command> history = new ArrayDeque<>();

    public void run(Command command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            history.pop().undo();
        }
    }
}
