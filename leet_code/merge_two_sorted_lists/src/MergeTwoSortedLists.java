public class MergeTwoSortedLists {
    public static void main(String[] args){
        
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //ListNode head = null;

        ListNode finalList = null;

        if(l1 == null && l2 == null){
            return finalList;
        } else {
            finalList = new ListNode(0);
        }

        ListNode finalListNext = finalList;

        /*
        ListNode l1sNext = l1;
        ListNode l2sNext = l2;
        */

        ///*
        while(l1 != null && l2 != null){

            if(l1.val < l2.val){
                finalListNext.val = l1.val;
                l1 = l1.next;
            } else {
                finalListNext.val = l2.val;
                l2 = l2.next;
            }

            finalListNext.next = new ListNode(0);
            finalListNext = finalListNext.next;

        }
        ///*
        while(l1 != null){
            finalListNext.val = l1.val;
            l1 = l1.next;
            if(l1 != null){
                finalListNext.next = new ListNode(0);
                finalListNext = finalListNext.next;
            }

        }
        //*/
        ///*
        while(l2 != null){
            finalListNext.val = l2.val;
            l2 = l2.next;
            if(l2 != null){
                finalListNext.next = new ListNode(0);
                finalListNext = finalListNext.next;
            }

        }
        //*/
        return finalList;
        //*/
        /*
        while(l1sNext != null && l2sNext != null){

            if(l1.val < l2.val) {
                if(head == null)
                {
                    head = new ListNode(l1.val);
                }
                else{
                    append(head, l1.val);
                }

                l1sNext = l1sNext.next;
            } else {
                if(head == null)
                {
                    head = new ListNode(l2.val);
                }
                else{
                    append(head, l2.val);
                }

                l2sNext = l2sNext.next;
            }
        }
            if(l1sNext != null)
            {
                head.next = l1sNext;
            }
            if(l2sNext != null)
                head.next = l2sNext;


        return head;
        */
    }
    /*
    private void append(ListNode head, int val){
        head.next = new ListNode(val);
    }
    */
}
