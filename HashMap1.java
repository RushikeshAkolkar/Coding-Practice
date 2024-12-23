import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap hm =new HashMap();
        hm.put("a",123);
        hm.put("b", 10);
        hm.put("c", 896);
        hm.put("d", 456321);

        Iterator itr = hm.keySet().iterator();

        while (itr.hasNext()) {
            String s=(String)itr.next();
            System.out.println("key  "+s+"  Value  "+hm.get(s));
        }
    }
}
