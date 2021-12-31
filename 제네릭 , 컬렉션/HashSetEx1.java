import java.util.HashSet;
import java.util.Iterator;

import static java.lang.System.out;

public class HashSetEx1 {
    public static void main(String args[]) {

        HashSet<String> hs1 = new HashSet<String>();

        //add(E o) - 제네릭 타입으로 넘어온 객체가 Set 구조에 없다면 추가하고 true를 반환
        hs1.add("하나");
        hs1.add("둘");

        // 중복을 허용하지 않으므로 추가되어 않음
        hs1.add("하나");
        out.println(hs1);


        //clear() - Set 구조에 있는 모든 요소들을 삭제
        hs1.clear();
        out.println(hs1);

        //contains(Object o) - 인자로 전달된 객체를 현 Collection에서 요소로 가지고 있으면 true를 반환
        hs1.add("사과");
        hs1.add("바나나");
        hs1.add("키위");
        out.println("사과 "+hs1.contains("사과"));
        out.println("딸기? "+hs1.contains("딸기"));

        //lterator() - 현 Set 구조의 요소들을 순서대로 처리하기 위해 lterator 객체로 반환한다
        Iterator<String> it = hs1.iterator();
        while (it.hasNext())
            out.println("과일 -> "+ it.next());

        //size() - 현 Set 구조에 저장된 요소의 수를 반환한다
        out.println(hs1.size());

        //remove(Object o) - 현 Set 구조에서 인자로 전달된 객체를 삭제한다 이때 삭제에 성공하면 true를 반환한다
        hs1.remove("사과");
        out.println(hs1);
    }
}
