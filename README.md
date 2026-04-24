# JobFinder — Eureka Discovery Service

> JobFinder 구인구직 플랫폼의 서비스 디스커버리  
> MSA 환경에서 각 서비스의 등록과 조회를 담당

## 역할

- MSA 각 서비스(Main, Board)가 자신을 등록하는 Service Registry
- API Gateway가 서비스 위치를 조회할 때 사용
- 포트: 8761

## 관련 레포지토리

| 서비스 | 레포 | 포트 | 역할 |
|--------|------|------|------|
| Main Service | [jobfinder-main](https://github.com/kimseoyoung000/jobfinder-main) | 8001 | 회원/채용/이력서/지원 |
| Board Service | [jobfinder-board](https://github.com/kimseoyoung000/jobfinder-board) | 8002 | 게시판/커뮤니티 |
| API Gateway | [jobfinder-gateway](https://github.com/kimseoyoung000/jobfinder-gateway) | 8000 | 라우팅/JWT 검증 |
| Discovery | [jobfinder-discovery](https://github.com/kimseoyoung000/jobfinder-discovery) | 8761 | 서비스 등록/조회 |

## 기술 스택

| 구분 | 기술 |
|------|------|
| Framework | Spring Cloud Netflix Eureka Server |
| Port | 8761 |
