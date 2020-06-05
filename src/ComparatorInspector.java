import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

//You need to implement method getComparatorType(Class) in ComparatorInspector class. The method should examine provided class and return Type object that corresponds to the type parameter that parameterizes Comparable interface the class implements. Consider the example:
//
//class MyInt implements Comparable<Integer> {
//    // Implementation omitted
//}
//
//    // Method to implement
//    Type type = ComparatorInspector.getComparatorType(MyInt.class);
//
//System.out.println(type.getTypeName());
//// prints: java.lang.Integer since MyInt implements Comparable with Integer parameter type
//
//        The method should:
//        Return type parameter for Comparable interface class implements
//        Return null if Comparable interface does not have type parameter
//        Should not produce compile-time warnings
//        Additional requirements:﻿
//
//        Compile-time error should arise if class not implementing Comparable is provided as input value
//        No 'rawtype' warnings should remain or be supressed
//        Method getComparatorType should be generic
//        You are free to correct method's type signature if needed.

public class ComparatorInspector {

    public static <T extends Comparable<?>> Type getComparatorType(Class<T> clazz) {
        for (Type type : clazz.getGenericInterfaces()) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType().getTypeName().equals(Comparable.class.getCanonicalName())) {
                    return parameterizedType.getActualTypeArguments()[0];
                }
            }
        }
        return null;
    }
}
