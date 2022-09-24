package src.training.collection.arraylist;

import src.training.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서훤");
        Member memberHong = new Member(1004, "홍길동");
        //새로운 회원 인스턴스 생성
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberPark);
        memberArrayList.addMember(memberHong);
        ///ArrayList에 회원 추가
        memberArrayList.showAllMember(); //전체 회원 출력
        
        memberArrayList.removeMember(memberHong.getMemberId()); //홍길동 회원 삭제
        memberArrayList.showAllMember(); //홍길동 회원을 삭제한 후 다시 전체 회원 출력
    }
}
