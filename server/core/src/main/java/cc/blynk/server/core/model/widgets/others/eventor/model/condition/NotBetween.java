package cc.blynk.server.core.model.widgets.others.eventor.model.condition;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 01.08.16.
 */
public class NotBetween extends BaseCondition {

    private final double left;

    private final double right;

    @JsonCreator
    public NotBetween(@JsonProperty("left") double left,
                      @JsonProperty("right") double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isValid(double in) {
        return !((left < in) && (in < right));
    }

}
