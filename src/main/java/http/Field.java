package http;

/**
 * Created by К on 21.09.2016.
 */
public class Field {
    private String id;
    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ClassPojo [id = "+id+", value = "+value+"]";
    }
}
