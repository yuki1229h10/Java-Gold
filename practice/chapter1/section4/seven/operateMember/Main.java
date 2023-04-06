package practice.chapter1.section4.seven.operateMember;

import java.lang.module.ModuleDescriptor.Modifier;
import java.lang.reflect.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Class<?> clazz = RefSample.class;

    Constructor<?> cons = clazz.getConstructor(int.class);
    RefSample rs = (RefSample) cons.newInstance(256);

    Filed f = clazz.getField("times");
    f.set(rs, 2);
    System.out.println(f.get(rs));

    Method m = clazz.getMethod("hello", String.class, int.class);
    m.invoke(rs, "reflection!", 128);

    boolean pubc = Modifier.isPublic(clazz.getModifiers());
    boolean finm = Modifier.isFinal(m.getModifiers());
  }
}
