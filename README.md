### 일반 Java 프로젝트를 AWS에 배포하는 방법

- IntelliJ IDEA에서 new project를 만들 때부터 gradle project로 만든다.
- build.gradle에서 ./gradlew bootRun 명령어를 실행할 수 있게 하는 플러그인을 임포트 해야 한다.
- gradle을 써야 클래스들이 여러 디렉토리에 나누어져 있어도 편리하게 한 번에 빌드, 실행할 수 있다.