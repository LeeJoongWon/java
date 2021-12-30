public class test {
    public void A(String n) throws test1{
        System.out.println("Test1");
        if(n.length() < 1)
            throw new test1("아무것도 아님");
        else
            throw new test1("최종 예선",703);
    }

    public static void main(String[] args) {
        test t1 = new test();
        try {
            t1.A("1234");
        }catch (test1 ue){
            System.out.println(ue.getMessage());
        }
    }
}