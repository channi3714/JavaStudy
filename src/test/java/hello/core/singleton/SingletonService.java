package hello.core.singleton;

public class SingletonService {

    //static으로 만들면 내부 클래스로 하나만 올라감, 실행될때 자기 자신을 생성해서 인스턴스에 넣어놓음 이제 이 인스턴스의 참조를 꺼낼 수 있는 방법은 아래의 getInstance 메서드로만 조회할 수 있음.
    //1. static 영역에 객체를 딱 1개만 생성해둔다.
    private static final SingletonService instance = new SingletonService();

    //이제 위의 인스턴스의 참조를 꺼낼 수 있는 방법은 이것 밖에 없음.
    //2. public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용된다.
    public static SingletonService getInstance() {
        return instance;
    }

    //3. 생성자를 private으로 선언해서 외부에서 new키워드를 사용한 객체 생성을 막는다.
    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
