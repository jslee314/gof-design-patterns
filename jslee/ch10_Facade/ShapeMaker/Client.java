package ShapeMaker;


/**
 * Facade 패턴은 시스템의 복잡성을 숨기고 클라이언트가 시스템에 액세스할 수 있는 인터페이스를 클라이언트에 제공합니다. 이러한 유형의 디자인 패턴은 복잡성을 숨기기 위해 기존 시스템에 인터페이스를 추가하기 때문에 구조적 패턴에 속합니다.
 *
 * 이 패턴은 클라이언트가 요구하는 단순화된 메소드를 제공하고 기존 시스템 클래스의 메소드에 대한 호출을 위임하는 단일 클래스를 포함합니다.
 *
 * 구현
 * Shape 인터페이스와 Shape 인터페이스를 구현하는 구체적인 클래스를 만들 것입니다. 파사드 클래스 ShapeMaker는 다음 단계로 정의됩니다. 기존 시스템 클래스입니다.
 * ShapeMaker 클래스는 구체적인 클래스를 사용하여 이러한 클래스에 사용자 호출을 위임합니다. 데모 클래스인 FacadePatternDemo는 ShapeMaker 클래스를 사용하여 결과를 표시합니다.
 */
public class Client {



    /**
     * Use the facade to draw various types of shapes.
     *
     */
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
