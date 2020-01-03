package binding;

/**
 * @author jensklingsporn
 */
public class MyPojoBinding extends PojoListToJsonArrayBinding<MyPojo> {
    public MyPojoBinding() {
        super(MyPojo.class);
    }
}
