# REST API 명세

- 로그인
    - path : /auth
    - Method : post
    - Success Status : 2xx
    - fail status : 4xx error, 5xx error
- 로그아웃
    - path : /auth
    - Method : delete
    - Success Status : 2xx
    - fail status : 4xx error, 5xx error
- 회원가입
    - path : /users
    - Method : Post
    - Success Status : 2xx
    - fail status : 4xx error, 5xx error
- 회원탈퇴
    - path : /users
    - Method : delete
    - Success Status : 2xx
    - fail Status : 4xx error, 5xx error
- 회원정보변경
    - path : /users
    - Method : put
    - Success Status : 2xx
    - fail Status : 4xx error, 5xx error
- 회원 전체 보기
    - path : /users
    - Method : get
    - Succes Status : 2xx
    - fail Status : 4xx error, 5xx error
- 회원 조건 검색
    - path : /users
    - Method : get
    - Success Status : 2xx
    - fail Status : 4xx error, 5xx error
- 찜
    - path :/followers/{username}
    - Method : post
    - Success Status : 2xx
    - fail Status : 4xx error, 5xx error
- 신고
    - path : /followers/{username}
    - Method : post
    - Success Status : 2xx
    - fail Status : 4xx error, 5xx error