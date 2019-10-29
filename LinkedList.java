class LinkedList{

    //TODO trebuie sa fac un find??  #tutorial

    private ListNode head = null;
    private int n = 0; // list size
    private ListNode tail = null;

    public void addFirst(Object o) {
        head = new ListNode(o, head);
        n++;
    }

    public void find(Object o){}

    public void add(Object o) {
        ListNode node = head;
        if (n == 0){
            addFirst(o);
        }
        else{
            while (node.next != null){
                node = node.next;
            }
            node = new ListNode(o, node);
            tail = node.next;
            n++;

        }

    }

    public Object get(int i) {
        if (i<0 || i>=n) ; // ...error!
        ListNode node = head;
        while (node.next != null){
            node = node.next;
        }
        //for (int j=0; j<i; j++)
         //   node = node.next;
        return node.element;
    }

    public void insert(Object o, int i) {
        if (i<0 || i>n) ; // ...error!
        if (i==0) {
            addFirst(o);
            return;
        }
        ListNode node = head;
        tail=head;
        for (int j=0; j<i-1; j++){
            node = node.next;
            System.out.println(node);}
        node= new ListNode(o, node);
        tail = node.next;
        n++;
    }

    public void remove(int i) {
        if (i<0 || i>=n) ; // ...error!
        if (i==0) { // special case
            head = head.next;
            n--;
            return;
        }
        ListNode node = head;
        while (node.next != null){
            node = node.next;
        }
        //for (int j=0; j<i-1; j++)
        //    node = node.next;
        //node = node.next;
        tail = node.next;
        n--;
    }

}
