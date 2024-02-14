package org.example;

class Friend{
    private String name;
    private Company com;

    public Friend(String name, Company com) {
        this.name = name;
        this.com = com;
    }

    public String getName() {
        return name;
    }

    public Company getCom() {
        return com;
    }
}

class Company {
    private String cName;
    private ContInfo contInfo;

    public Company(String cName, ContInfo contInfo) {
        this.cName = cName;
        this.contInfo = contInfo;
    }

    public String getcName() {
        return cName;
    }

    public ContInfo getContInfo() {
        return contInfo;
    }
}

class ContInfo {
    private String addr;
    private String phone;

    public ContInfo(String addr, String phone) {
        this.addr = addr;
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public String getPhone() {
        return phone;
    }
}

public class Main5 {
    public static void main(String[] args) {
        // 홍길동이라는 친구가 다니는 회사의 주소를 출력할거다
        Friend friend = new Friend("홍길동", new Company("그린", null));
        // 친구의 회사를 회사 클래스에 담고
        Company company = friend.getCom();
        // 회사의 정보를 회사 정보 클래스에 담고
        ContInfo contInfo = company.getContInfo();
        // 주소에 회사정보의 주소를 담는다
        String addr = contInfo.getAddr();

        System.out.println("addr = " + addr);
    }
}
