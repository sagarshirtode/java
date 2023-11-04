package collection;
import java.util.*;
public class mapdemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("sagar");
        names.add("rudang");
        names.add("Appa");
//        System.out.println(names);

        HashMap<String, Integer> course = new HashMap();
        course.put("java",3000);
        course.put("python",8000);
        course.put("java",6000);
        course.put("kotlin",3000);
        course.put("android",1000);
        System.out.println(course);
    }
}

