package Pratice_video;

public class StringPractice {
    public static void main(String[] args) {
        /*
        String name = "String Test";
        System.out.println(name);
        */


        /*
        String name1 = "name1";
        String name2 = "name1";

        // 같은 모브젝트를 가리킨다.
        System.out.println(name1 == name2);
        */


        /*
        // new 라는 명령어 사용시 다른 오브젝트 생성
        String name1 = new String("name");
        String name2 = new String("name");

        // 주소값이 같은가
        System.out.println(name1 == name2);

        // 값이 같은가
        System.out.println((name1.equals(name2)));
        */


        // 문자열의 특정 문자 불러오
        String name = "java Programming";
        String name2 = "java,Pro";

        char charValue = name.charAt(5);

        int length = name.length();

        String replaced = name.replace("java", "python");

        String subString = name.substring(5);

        boolean result = name.contains("java");

        String[] arr = name2.split(",");

        System.out.println(charValue);
        System.out.println(length);
        System.out.println(replaced);
        System.out.println(subString);


        if (result) {
            System.out.println("yes");
        }
         else {
             System.out.println("no");
        }

         for(int i = 0; i < arr.length; i++){
             System.out.println(arr[i]);
         }

    }
}
