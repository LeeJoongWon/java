public class Linkedlist {
    private Node header;
    protected class Node{
        int data;
        Node next = null;
    }

    public Linkedlist() {
        header = new Node();
    }

    //노드에 값 추가
    public void append(int... add){
        for (int j : add) {
            Node end = new Node();
            //en.data에 add값 대입
            end.data = j;

            //n에 시작지점 대
            Node n = header;

            //비어있는 노드를 찾을때까지 순환후
            while (n.next != null) {
                n = n.next;
            }
            //비어있는 노드를 찾았을시
            n.next = end;
        }
    }

    //삭제
    public void delete(int d){
        //n에 시작지점(header) 대입
            Node n = header;
        // 비어있는 노드를 만날때까지 순환
            while (n.next != null) {
                //삭제하고 싶은 데이터(d)를 찾은경우 삭제
                if (n.next.data == d) {
                    n.next = n.next.next;
                } else {
                    n = n.next;

                }
            }
    }

    public void search(){
        //시작지점 할당(
        Node n = header;
        while (n != null){
            System.out.print(n.data+"-> ");
            n = n.next;
        }
        System.out.println();
    }

    public void removeDups(){
        Node n = header;
        while (n != null){
            Node r = n;
            while (r.next != null){
                if(n.data == r.next.data){
                    r.next = r.next.next;
                }else {
                    r = r.next;
                }
            }
            n = n.next;
        }
    }
    public void KthToLast(int k){
        Node n = header;
        recursive(n,k);
    }

    private int recursive(Node n, int k){
        if(n==null) {
            return 0;
        }

        int count = recursive(n.next,k) + 1;
        if(count == k){
            System.out.println(k+ "th to last node "+ n.data);
        }
        return count;
    }
    public void pront(){
        Node n = header;
        int count =0;
        while (n != null){
            count++;
            System.out.print(n.data +"-> ");
            n = n.next;
        }
        System.out.println();
        System.out.println("count= "+count);

    }
}
