public class Linkedlist {
    private Linkedlist.Node header = new Linkedlist.Node();

    public Linkedlist() {
    }

    public void append(int... add) {
        int[] var2 = add;
        int var3 = add.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int j = var2[var4];
            Linkedlist.Node end = new Linkedlist.Node();
            end.data = j;

            Linkedlist.Node n;
            for(n = this.header; n.next != null; n = n.next) {
            }

            n.next = end;
        }

    }

    public void delete(int d) {
        Linkedlist.Node n = this.header;

        while(n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }

    }

    public void search() {
        for(Linkedlist.Node n = this.header; n != null; n = n.next) {
            System.out.print(n.data + "-> ");
        }

        System.out.println();
    }

    public void removeDups() {
        for(Linkedlist.Node n = this.header; n != null; n = n.next) {
            Linkedlist.Node r = n;

            while(r.next != null) {
                if (n.data == r.next.data) {
                    r.next = r.next.next;
                } else {
                    r = r.next;
                }
            }
        }

    }

    public void KthToLast(int k) {
        Linkedlist.Node n = this.header;
        this.recursive(n, k);
    }

    private int recursive(Linkedlist.Node n, int k) {
        if (n == null) {
            return 0;
        } else {
            int count = this.recursive(n.next, k) + 1;
            if (count == k) {
                System.out.println(k + "th to last node " + n.data);
            }

            return count;
        }
    }

    public void pront() {
        Linkedlist.Node n = this.header;

        int count;
        for(count = 0; n != null; n = n.next) {
            ++count;
            System.out.print(n.data + "-> ");
        }

        System.out.println();
        System.out.println("count= " + count);
    }

    protected class Node {
        int data;
        Linkedlist.Node next = null;

        protected Node() {
        }
    }
}
