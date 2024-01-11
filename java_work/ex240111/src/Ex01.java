public class Ex01 {
    public static void main(String[] args) {
        String[] names = {"박길동", "이길동", "홍길동"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for(String name:names){
            System.out.println(name);
        }
    }
}
