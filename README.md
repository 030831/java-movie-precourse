# java-movie-precourse

※ 클래스 목록

date folder

 - ClosedDate
 - Date

member folder

 - Member

movieTheater folder

 - Grade
 - Movie
 - MovieTheater
 - Seat

payment folder

 - MovieTheaterDiscountPolicy

repository folder

 - MovieTheaterRepository - MemoryMovieTheaterRepository
 - MemberRepository - MemoryMemberRepository
 - ClosedDateRepository - MemoryClosedDateRepository

service folder

 - MovieTheaterService 
 - MovieTheaterServiceImpl

※ 정의

1. 영화관
    - 영화 목록 관리
    - 운영 시간 
      - 멤버는 시간이 겹치도록 영화를 예매할 수 없음
      - 영화는 영화관이 운영하지 않는 시간에 상영될 수 없음
      - 멤버는 영화관이 운영하지 않는 시간에 영화를 볼 수 없음
    - 할인 정책
        - 무비데이 : 매월 10일, 20일, 30일은 10% 할인
        - 시간 조건 : 오전 11시 이전 또는 오후 8시 이후에 상영되는 영화는 2,000원 할인
        - 결제 시 포인트 사용 가능
        - 포인트는 시간 조건과 무비데이의 혜택을 받은 이후의 금액에서 사용 가능
        - 포인트 사용 시 신용카드 결제 시 5% 할인, 현금결제 시 2% 할인
        - 고정된 금액 할인을 통해서 0 원에 예매할 수 있음, 단 0 원보다 작아질 수는 없음

2. 영화
    - 좌석
        - 좌석은 등급, 행, 열, id, 가격으로 나뉨
        - 좌석 등급과 등급에 따른 가격
          - S 석은 18,000원
          - A 석은 15,000원
          - B 석은 12,000원
          - 기본은 B 석으로 정의함
        - 좌석은 행(알파벳) 과 열(숫자) 로 표시. ex)A1,C3,E4
          - 한사람당 하나의 좌석만 사용할 수 있음
          - 2차원 리스트로 동적인 좌석 배열로 구현
        - 좌석의 id는 기본값이 0
          - 예약된 좌석의 id는 예약한 멤버의 id 와 일치함
    - 멤버는 똑같은 영화를 예매할 수 없음
    - 예약된 자석은 구매가 불가능

3. 멤버
    - 멤버는 id, password, 예약한 영화 목록을 가짐
    - 같은 id 를 가진 멤버는 존재할 수 없음

4. 날짜
    - Date는 year, month, day, hour, minute 로 모두 int 형으로 관리
    - ClosedDate는 상영관이 운영하지 않는 시간을 정의 

※ 기능

ClosedDate
- 영업 종료 시작 시간과 영업 종료 끝 시간이 같은지 확인하는 기능


Date
- 두 개의 시간 중 어느 시간이 더 나중의 시간인지 확인하는 기능
- 두 시간이 겹치는지 확인하는 기능


Member
- 예약한 영화를 저장하는 기능

Grade
- enum 타입을 통한 좌석 등급 정의

Movie
- 영화의 좌석 행과 열의 개수를 동적인 List 로 정의
- 특정 멤버가 해당 영화를 예약했는지 확인 하는 기능
- 특정 좌석의 가격을 확인하는 기능

MovieTheater
- 영업종료 시각을 저장하는 기능

Seat
- 등급에 따른 가격 정의
- 해당 좌석이 예약되었는지 확인하는 기능

MovieTheaterDiscountPolicy
- 할인 정책 정의
    - 날짜 할인, 시간 할인, 포인트 할인, 포인트 할인에 따른 카드 & 현금 할인 기능

MovieTheaterRepository (interface)
- 영화 저장 기능
- id를 통한 영화 찾기 기능
- 중복된 id를 가진 영화인지 확인하는 기능
- 이름으로 영화를 찾는 기능(중복 가능)
- 구현체 = MemoryMovieTheaterRepository


MemberRepository (interface)
- 멤버 저장 기능
- id 를 통한 멤버 찾기 기능
- 구현체 = MemoryMemberRepository

ClosedDateRepository (interface)
- 운영 종료 시간 추가 기능
- 운영 종료 시간 변경 기능
- 상영관의 운영 시간에 따라서 영화를 상영시킬 수 있는지 확인하는 기능
- 구현체 = MemoryClosedDateRepository

MovieTheaterService (interface)
- 기본 예약 기능 (무비데이, 시간 조건 상시 적용) 
- 포인트와 카드 사용 시에 따른 할인된 가격의 예약 기능
- 포인트와 현금 사용 시에 따른 할인된 가격의 예약 기능
- 예약이 가능한지 검증하는 기능
- 구현체 = MovieTheaterServiceImpl






