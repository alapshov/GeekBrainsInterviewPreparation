package excamples;

import java.util.LinkedList;
import java.util.List;

public class PrivateProtectedChildrenExample extends PrivateProtectedExample {

    public void test() {
        super.protectedMethod();

        List<String> stringList = new LinkedList<String>();
    }
}
