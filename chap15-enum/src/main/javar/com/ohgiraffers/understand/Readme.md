# enum 이해하기
## 본문
<p>
    운동을 좋아하는 기유는 개발자 일을 하면서 주말에 트레이너로 근무를 하고 있다. <br>
    그런데 요즘 심각한 고민이 생기게 되었는데 관리하는 회원 10명의 상태를 파악해야 하기 때문이다. <br>
    하지만 개발자 일이 너무 바빠 기억을 하는 것이 어려워 기억보다는 기록을 해야 겠다 마음을 먹었다. <br>
    그래도 명색의 개발자 인데 그냥 기록하기는 싫고 프로그램으로 관리를 하고자 한다.
</p>
<p>
    기유 트레이너가 관리하는 회원은 다음과 같은 유형으로 분리된다.
    
1. 벌크업 회원 (중량을 높혀 운동을 하며 체력이 많이 소모됨) 
2. 감량 회원 (회수를 중심으로 운동을 진행하며 목소리가 많이 소모됨)
3. 다이어트 회원 (런닝만 시키면 되서 가장 편하며 체력이 충전됨)
4. 요가 회원 (스트레칭 중심으로 진행하여 체력이 충전됨)
5. 유령 회원 (시간만 잡아먹는 회원)
</p>

기유 트레이너가 주말에 가진 체력은 100hp 이다.
사용자의 체력은 상관 없이 기유 트레이너의 체력 소모만 신경쓰면 되는데 <br>
회원 5가지 유형은 enum을 이용하여 관리하며 회원 등록 과정을 거치게 된다. <br>

회원은 다음과 같은 필드를 갖는다.
<pre>
class member
String name ;
int weight;
enum type;
</pre>

기유 트레이너는 하루에 체력이 다 소진될 때까지 회원을 받을 수 있으며 <br>
많이 회원을 받을 수록 자신의 수입이 올라가게 된다. <br>
회원이 주는 damage와 cache는 enum에 정의해서 사용한다. <br>
이러한 이유는 회원의 유형은 회원의 귀속되는 정보이지만 damage와 cache는 유형에 따라 달라지는 <br>
값이기 때문이다.

처음 욕심이 없던 기유에게 새로운 욕심이 생기게 되어 가장 많은 회원을 받을 수 있도록 여러분이 도와주세요!

