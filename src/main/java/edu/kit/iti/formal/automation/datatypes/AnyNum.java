package edu.kit.iti.formal.automation.datatypes;

/**
 * Created by weigl on 10.06.14.
 */
public class AnyNum extends Any {
    public static final Any ANY_NUM = new AnyNum();

    @Override
    public String repr(Object obj) {
        throw new IllegalStateException("No repr for AnyNum");
    }
}
