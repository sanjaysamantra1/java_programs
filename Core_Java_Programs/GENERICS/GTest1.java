//can’t have static field of type T

public class GTest1<T>
{
   private static T member; //This is not allowed
}

//C.E:  error: non-static type variable T cannot be
//referenced from a static context