//size of an empty class is 8 byte

import java.lang.instrument.Instrumentation;
 class ObjectSizeFetcher {
 private static Instrumentation instrumentation;
 public static void premain(String args, Instrumentation inst)throws Exception
{
instrumentation = inst;
 }
public static long getObjectSize(Object o)throws Exception
{
 return instrumentation.getObjectSize(o);
}
}
// Class using method defined in above class
 class EmptyFileSize {
 private int x;
private int y;
public static void main(String [] args)throws Exception
{
System.out.println(ObjectSizeFetcher.getObjectSize(new EmptyFileSize()));
 }
}