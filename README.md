# ![image](https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/f2d14fa0-df5f-48ee-a905-101c8936f5f7) SpotlightKonex  

| 메인페이지 |
|------------|
|<img src="https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/9d4fa7da-1b32-4b4c-8d94-86bf2295adb1" width="400"/>|


| 기업 소개 페이지 |
|-----------------|
|<img src="https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/b0258595-a1e5-42fe-bd08-4fb86cfaf49e" width="400"/> <img src="https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/92c1a4fb-a9ab-4c35-983d-74ef5fd8b467" width="400" height="460"/>|


| 회원가입 / 로그인 |
|-------------------|
|<img src="https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/8396f304-a7ef-4c45-b9c4-1f7376305f95" width="400" height="550"/> <img src="https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/2f290826-2d8a-4034-a08b-0a343becbcdc" width="400" height="500"/>|

| 기업 관리자 페이지 |
|---------------------|
|<img src="https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/a8ab6a18-c83c-4451-9bd6-9f3a35ec5b34" width="400"/> <img src="https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/88e65fd9-e4f3-42f3-80ed-d4a0c39f3634" width="400"/>|

<br>

## 프로젝트 소개
- SpotlightKonex는 코넥스 상장 기업과 투자자를 연결해주는 플랫폼
- 코넥스 기업들의 실시간 순위, 관심도, 사용자 의견 제공 기능을 통해 기업과 투자자 간의 소통의 창 제공
- "상장 -> 투자 -> 상장" 선순환 구조를 구축하여 코넥스 거래량을 늘려 베너캐피털 등 투자자들이 활발한 투자를 할 수 있는 시장 조성
- 기업과 투자자 모두가 함께 성장하는 프랫폼을 만들어 상생하는 생태계 조성
<br>

## 팀원 구성

<ul>
  <li>김서윤 - 게시판 CRUD API 개발, 엔젤 투자 세제 혜택 계산기 개발, 기업 관리자 페이지 "좋아요 수, 조회수, 거래량" 조회 API 개발 </li>
    <li>김민서 - 인프라 구축(Cloud 배포, CI/CD구축), 기업 뉴스 조회 API 개발 </li>
  <li>김성범 - 기업 사용자 회원가입, 로그인, 로그아웃 API 개발</li>    
  <li>서가은 - 프론트엔드 개발</li>
  <li>이지은 - 상위 11기업 조회 API, 기업 검색(검색창, 테마별, 지정자문인별) API 개발, 모든 코넥스 기업 조회 API 개발, 기업 상세 정보 조회 API 개발, 기업 댓글(생성, 조회) API 개발, 거래 대금 기반 순위변동 조회 API개발</li>
  <li>추예진 - 프론트엔드 개발</li>
</ul>

<br>

## 분석 / 설계

### TechStack
- FrontEnd
  - React, Redux
- BackEnd
  - Java, Python, SpringBoot, JPA, Naver Open API, JWT
### Figma
![image](https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/f81ba844-e5cc-4c9f-adb1-c3c646eb2b4c)

### ERD
![image](https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/240b2f53-a1d8-4d13-a343-6696a6bda375)

### API 명세
![image](https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/c5fee931-934e-4b04-94a9-44a6ea1407c5)

### 요구사항 명세
![image](https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/5a302e6e-740f-4bcc-a3da-47a98a80dc1e)

### Infra Architecture
![image](https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/a1ea2b98-3449-43ff-bd49-8a58640890fa)
- Cloud 배포를 통한 확장성 용이
- CI/CD 사용을 통한 용이한 배포

<br>

## 서비스 기획

### 사용자 타입
- 기업 고객, 개인 고객
### 기능
- 실시간 순위 제공
- 기업 상세 정보 페이지 제공
- 사용자 간 메시지 소통 기능
- 기업과 투자자 간의 소통 지원(의견 전달, IR자료 요청)
- 회원 관리 및 권한 부여 기능
- 콘텐츠 관리(기업 정보, 댓글)
- 서비스 통계 및 분석 기능
### 성능
- 실시간 시세 제공을 위한 KRX 스크래핑 모듈
### 보안
- 사용자 데이터의 안전한 저장과 전송을 위한 보안 조치
- 인가된 사용자만이 특정 정보에 접근 가능
<br>

## 테스트 
### 테스트 시나리오
![image](https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/b836375c-8944-4c98-8113-e28c8d29bd69)
![image](https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/99399e3a-a096-4bd7-bb5a-5014b22977b3)
### Swagger 검증
![image](https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/b7960ad0-004c-4005-8914-a6d4910e24f2)
![image](https://github.com/Seoyun0626/Shinhan-Intern-Project-SpotlightKonexx/assets/104416283/6d9355a0-8c02-45e8-a655-8363cf097f26)
<br>

## 기대효과 및 확장 가능성
### 코넥스 상장 기업과 투자자 연결
- 모두가 함께 성장하는 플랫폼
- "상장 -> 투자 -> 성장"의 선순환 구조 구축
- 기업과 투자자가 상생하는 생태계 조성
### 개입 투자자
- 기존에 몰랐던 새로운 종목 발견
### 코넥스 상장 기업
- 투자자 유치와 자본금 확보

## 느낀점
- Github Issue를 처음 사용하였는데 기능별로 Issue를 생성하고 관리함에 따라 코드 유지 보수를 용이하게 할 수 있었다.
- Commit Convention을 정하고 Commit Message를 작성함으로써 다른 팀원과 코드에 대해 소통을 할 때 수월하게 할 수 있었다.
- DB를 사용하면서 중복된 항목에 대해서는 외래키를 사용하여 접근하는 방식이 흥미로웠고 외래키를 사용해서 활용하는 과정이 재미있었다.
- JWT 인가를 활용해서 게시판에 접근할 수 있는 권환을 체크하는 과정을 개발하는 것이 흥미로웠다.




