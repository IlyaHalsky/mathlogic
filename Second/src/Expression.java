import java.util.Map;

/**
 * Created by Ilya on 05.12.2015.
 */

public interface Expression {

    public abstract boolean evaluate(Map<String, Boolean> variables);
}
