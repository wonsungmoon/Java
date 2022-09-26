package src.training.map.treemap;

import src.training.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberHashMap = new MemberTreeMap();

        Member memberPark = new Member(1003, "박서훤");
        Member memberLee = new Member(1001, "이지원");
        Member memberHong = new Member(1004, "홍길동");
        Member memberSon = new Member(1002, "손민국");
        //회원 아이디 순서와 상관없이 회원 추가
        memberHashMap.addMember(memberPark);
        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberHong);
        memberHashMap.addMember(memberSon);
        
        memberHashMap.showAllMember();
        
        memberHashMap.removeMember(1004); //회원 아이디(key 값)가 1004인 회원 삭제
        memberHashMap.showAllMember();
    }
}