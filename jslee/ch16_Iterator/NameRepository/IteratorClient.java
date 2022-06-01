package NameRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Iterator 패턴은 Java 및 .Net 프로그래밍 환경에서 매우 일반적으로 사용되는 디자인 패턴입니다.
 * 이 패턴은 기본 표현을 알 필요 없이 컬렉션 개체의 요소에 순차적으로 액세스하는 방법을 얻는 데 사용됩니다.
 *
 * 반복자 패턴은 행동 패턴 범주에 속합니다.
 *
 * 구현
 * 탐색 방법을 설명하는 Iterator 인터페이스와
 * iterator를 다시 실행하는 Container 인터페이스를 만들 것입니다.
 * Container 인터페이스를 구현하는 구현 클래스는 Iterator 인터페이스를 구현하고 사용할 책임이 있습니다.
 *
 * 우리 데모 클래스는 NamesRepository에 컬렉션으로 저장된 Names를 인쇄하기 위한
 * 구체적인 클래스 구현인 NamesRepository를 사용할 것입니다.
 */
public class IteratorClient {
    /**
     * "기본 표현을 알 필요 없이" 컬렉션 개체의 요소에 순차적으로 액세스하는 방법을 얻는 데 사용됩니다.
     * @param args
     */
    public static void main(String[] args) {

        NameRepository namesRepository = new NameRepository();

        for(NameIterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }




        // java lib
        List<String> names = new ArrayList<>();
        names.add("이재선");
        names.add("이이이");

        for (java.util.Iterator<String> iterator = names.iterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("JAVA: Name : " + name);
        }





    }
}
