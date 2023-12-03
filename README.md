# bulletin-board-app

### React 시작하기

1. React 앱 생성
    ```
    $ npx create-react-app client
    ```

2. router library, axios 설치
    ```
    $ npm install react-router-dom
    $ npm install axios
    ``` 

### 단축키
1. Spring Boot Snippets 확장팩 설치 후 `rafce` (React Snippets)

### 스프링 확장 필수 설치 목록 (설치 후 `개발 창 다시 로드`)
1. Spring Initializr Java Support
2. Spring Boot Extension Pack
3. Spring Boot Developer Extension Pack
4. Spring Code Generator

### mysql 설정 

1. 연결 에러 -> DBMS 재부팅
    ```
    $ mysql.server restart 
    ```

2. 계정 에러 -> Mysql 터미널 통한 유저 생성
    ```
    $ mysql -uroot -p
    ```

3. 암호 에러 -> (아래 조건 참조)
    ```
    $ create user 'nero_coding'@'%' identified by 'abcd1234';
    ```
    ```
    LOW인 경우 Length 만 지켜 주면 됩니다. 아무튼 패스워드는 최소 8자 이상 설정
    MEDIUM인 경우 Length는 물론 숫자, 대문자, 소문자, 특수문자가 모두 포함된 비밀번호 설정
    STRONG인 경우 dictionary file 이란 것을 등록해서 사용하게 되는데, 이 파일에 포함된 단어는 비밀번호로 사용 불가
    ```

4. 권한 에러 -> 터미널을 통해 모든 권한 부여
    ```
    $ GRANT ALL PRIVILEGES on *.* TO 'nero_coding'@'%' WITH GRANT OPTION;
    ```