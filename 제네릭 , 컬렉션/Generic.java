//제네릭 타입을 적용한 클래스 선언
public class Generic<T> {
    //제네릭 타입의 배열 선언
    T[] v;

    //제네릭타입의 인자로 하는 메서드 정의
    public void set(T[] n){
        v = n;
    }

    //출력 메서드
    public void print(){
        for(T s : v)
            System.out.println(s);
    }


    public static void main(String[] args){
        /*
        제네릭 클래스명<적용할 제네릭 타입> 변수명; //선언
        변수명 = 제네릭 클래스생성자명<적용할 제네릭 타입>(); //생성
        */

        Generic<String> g_String = new Generic<String>();
        Generic<Integer> g_Integer = new Generic<Integer>();

        String[] string = {"가","나","다","라"};
        g_String.set(string);

        Integer[] integer = {1,2,3,4};
        g_Integer.set(integer);


        g_String.print();
        /*
        실행결과 -> 가 나 다 라
        */

        g_Integer.print();
        /*
        실행결과 -> 1 2 3 4
        */
    }
}
