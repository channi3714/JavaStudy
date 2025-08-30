# JavaStudy

### 단축키

---

- psvm: `public static void main(String[] args) {}`
- sout: `System.*out*.println();`
- ctrl + d: 라인 복붙
- ctrl + shift + enter(shift + command + enter): 문장 자동 완성 (괄호와 세미콜론 자동입력)

---

### 변수

---

- int: 정수 (byte, short, int, long - 20억 넘으면 long)
- double: 실수 (float, double - float 사용X 낮은 정확도 이슈)
- boolean: 참/거짓 (true, false -1byte)
- char: 문자 하나 (작은 따옴표 ’a’ 사용)
- String: 문자열 (큰 따옴표 “hello java” 사용) *참고: String은 첫 글자 대문자로 시작함 주의

---

### 변수 명명 규칙

---

규칙은 필수, 지키지 않을 시 컴파일 오류 발생. 관례는 필수X, 하지만 모든 개발자가 해당 관례를 따르기에 사실상 규칙

**규칙**

---

- 변수 이름은 숫자로 시작 불가 (ex> 1num, 1st) 하지만 숫자를 이름에 포함은 가능 (ex> myVar1)
- 이름에 공백 불가
- 자바 예약어는 변수 이름 불가 (ex> int, class, public)
- 변수 이름에는 영문자 (a-z, A-Z), 숫자(0-9), 달러 기호($), 언더바(_)만 사용 가능

**관례**

---

- 낙타 표기법(camel case)를 따름 (ex> orderDetail, myAccount)
- 클래스 이름 첫 글자는 대문자, 나머지는 소문자로 시작 && 낙타 표기법 적용 (ex> 클래스: Person, OrderDetail / 변수 포함 나머지: firstName, userAccount)
- 예외 2가지 - 상수: 대문자 사용 && 언더바 구분 (ex> USER_LIMIT) / 패키지: 모두 소문자 (ex> org.spring.boot)

---

### 연산자 종류

---

- 산술 연산자:   `+`, `-`,   `*`,   `/`,   `%`(나머지 연산자)
- 증감(증가 및 감소) 연산자:   `++`, `--`
- 비교 연산자:   `==`,   `!=`, `>`, `<` , `<=` , `<=`
- 논리 연산자: && (AND), || (OR), ! (NOT)
- 대입 연산자: `=`, `+=`, `-=`, `*=`, `/=`, `%=`
- 삼항 연산자: `? :`

---

### 논리 연산자

---

- true && true : true
- true && false : false
- false && false : false

---

- true || true : true
- true || false : true
- false || false : false

---

- ! true : false
- ! false : true

---

### 문자열 비교

---

==보다 .equals()를 사용해야 함
