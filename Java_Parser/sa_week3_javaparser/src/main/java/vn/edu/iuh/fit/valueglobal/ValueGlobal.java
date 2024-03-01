package vn.edu.iuh.fit.valueglobal;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Getter
public class ValueGlobal {
    private List<String> values;

    public ValueGlobal() {
        values = new ArrayList<>();
    }

    /*
        add value to values
     */
    public void add(String value){
        values.add(value);
    }

    @Override
    public String toString() {
        return String.join(", ", values);
    }
}
