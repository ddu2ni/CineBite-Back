
![003](https://github.com/user-attachments/assets/37882eba-3d6f-4bef-9b61-166bf2537375)

![004](https://github.com/user-attachments/assets/7d534395-c36d-4168-a290-c9e5f788def0)

<table>
    <tr>
        <th>프로젝트 명</th>
        <td>CineBite</td>
        <th>개발기간</th>
        <td>2024/06/03 ~ 2024/07/12</td>
    </tr>
    <tr>
        <th>프로젝트 개요</th>
        <td colspan="3"> 영화 커뮤니티 웹사이트</td>
    </tr>
    <tr>
        <th>개발인원</th>
        <td colspan="3">팀/ 5인 </td>
    </tr>
    <tr>
        <th>맡은기능</th>
        <td colspan="3"> 영화 및 커뮤니티 검색해서 조회 (최근검색어 · 연관검색어) / 메인 · 검색 및 리뷰 css </td>
    </tr>
    <tr>
        <th>운영체제</th>
        <td colspan="3">Windows 10</td>
    </tr>
    <tr>
        <th>개발언어</th>
        <td colspan="3"> java 11, JavaScript</td>
    </tr>
      <tr>
        <th>Backend</th>
        <td colspan="3"> Spring Boot (ver. 3.x / port : 4000)</td>
    </tr>
     <tr>
        <th>Frontend</th>
        <td colspan="3"> React (ver.18.x/port : 3000)</td>
    </tr>
    <tr>
        <th>개발도구</th>
        <td colspan="3">VSCode, Gradle</td>
    </tr>
    <tr>
        <th>DB</th>
        <td colspan="3">MySQL (8.3.0)</td>
    </tr>
     <tr>
        <th>형상관리</th>
        <td colspan="3">Git (개발/배포 브랜치 전략)</td>
    </tr>
</table>
- 추후 디벨롭 예정
---

💻 **참여인원**

| 이름   |  파트  | 역할                                                                              |
| ------ | :----: | --------------------------------------------------------------------------------- |
| 김지은 | BE, FE | 영화 tmdb api로 조회, 영화 상세정보, 랭킹, 오늘의 영화, 메인 css                  |
| 박진영 | BE, FE | 영화 tmdb api로 조회, 영화 상세정보, 영화 추천, 영화 상세정보 css                 |
| 박 솔  | BE, FE | Oauth 로그인, 로그인 및 회원가입, 마이페이지 파일 업로드, 로그인 및 회원가입 css  |
| 윤수인 | BE, FE | 영화 및 커뮤니티 검색해서 조회 (최근검색어 · 연관검색어), 메인 · 검색 및 리뷰 css |
| 이혜민 | BE, FE | 커뮤니티 게시글 및 태그 등록 및 삭제 , 핫한 영화 조회, 커뮤니티 css               |

---

### Tech Stack

### Directory Path

```back
├─ .gitignore
├─ gradle
│  └─ wrapper
│     ├─ gradle-wrapper.jar
│     └─ gradle-wrapper.properties
├─ gradlew
└─ src
   ├─ main
   │  ├─ java
   │  │  └─ com
   │  │     └─ cine
   │  │        ├─ advice
   │  │        ├─ board
   │  │        │  ├─ comment
   │  │        │  │  ├─ controller
   │  │        │  │  ├─ dto
   │  │        │  │  ├─ entity
   │  │        │  │  ├─ repository
   │  │        │  │  └─ service
   │  │        ├─ like
   │  │        │  ├─ controller
   │  │        │  ├─ entity
   │  │        │  ├─ repository
   │  │        │  └─ service
   │  │        ├─ post
   │  │        │  ├─ controller
   │  │        │  ├─ dto
   │  │        │  ├─ entity
   │  │        │  ├─ repository
   │  │        │  └─ service
   │  │        ├─ search
   │  │        │  ├─ controller
   │  │        │  ├─ dto
   │  │        │  └─ service
   │  │        ├─ tag
   │  │        │  ├─ controller
   │  │        │  ├─ dto
   │  │        │  └─ service
   │  │        ├─ util
   │  │        ├─ config
   │  │        │  ├─ file
   │  │        ├─ favorite
   │  │        │  ├─ controller
   │  │        │  ├─ dto
   │  │        │  ├─ entity
   │  │        │  ├─ exception
   │  │        │  ├─ repository
   │  │        │  └─ service
   │  │        ├─ handler
   │  │        ├─ movieList
   │  │        │  ├─ controller
   │  │        │  ├─ dto
   │  │        │  ├─ entity
   │  │        │  ├─ exception
   │  │        │  ├─ repository
   │  │        │  ├─ request
   │  │        │  ├─ response
   │  │        │  └─ service
   │  │        ├─ paging
   │  │        ├─ recommendation
   │  │        │  ├─ controller
   │  │        │  ├─ dto
   │  │        │  └─ service
   │  │        ├─ search
   │  │        │  ├─ controller
   │  │        │  ├─ dto
   │  │        │  ├─ entity
   │  │        │  ├─ repository
   │  │        │  └─ service
   │  │        └─ user
   │  │           ├─ common
   │  │           ├─ controller
   │  │           ├─ dto
   │  │           │  ├─ oauth2
   │  │           │  ├─ request
   │  │           │  └─ response
   │  │           ├─ entity
   │  │           ├─ filter
   │  │           ├─ handler
   │  │           ├─ provider
   │  │           ├─ repository
   │  │           ├─ service
   │  │           └─ util
   │  └─ resources
   │     ├─ log4j2.xml
   │     └─ static
   └─       └─ images
```

