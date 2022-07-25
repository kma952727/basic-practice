package typecasting;

public class TypeAutoCasting {

    public static void main(String[] args)
    {
        // correct case

        int intVal = 1;
        long longVal = intVal;

        // incorrect case

        //intVal = longVal;

        // 1. 정수형 -> 실수형에서는 ".0"이 붙습니다.
        int iamInt = 10;
        float floatVal = iamInt;
        float doubleVal = iamInt;
        System.out.println(floatVal);
        System.out.println(doubleVal);

        // 문자 -> 정수

        char charVal = 'A';
        // incorrect case
        //byte byteVal = charVal;
        int unicodeVal = charVal;
        System.out.println(unicodeVal);
        double iamDouble = charVal;
        System.out.println(iamDouble);

        int iamByte = 161;
        char imaChar = (char) iamByte;
        System.out.println(imaChar);

        // 실수 -> 정수
        float iamRealFloat = 1.1f;
        // incorrect case
        //long iamRealInt = iamRealFloat;
        //System.out.println(iamRealInt);
    }
}
