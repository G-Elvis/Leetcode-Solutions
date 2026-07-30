class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class Solution{

    public ListNode reverseList(ListNode head){

        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    //Test Case
    public static void main(String [] args){

      
        
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        

        System.out.println("Original list: ");

    }
    
}
