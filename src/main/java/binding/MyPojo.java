package binding;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jensklingsporn
 */
public class MyPojo {

    @JsonProperty("foo")
    private String foo;

    public MyPojo(String foo) {
        this.foo = foo;
    }

    public MyPojo(){}


}
