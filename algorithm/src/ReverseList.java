import java.util.List;

/**
 * 链表反转
 */
public class ReverseList {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.println(node1);
        solution1(node1);
        System.out.println(node5);
        solution2(node5);
        System.out.println(node1);
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 迭代反转
     *
     * @param curr
     */
    public static void solution1(ListNode curr) {
        ListNode prev = null, next;
        while (curr != null) {
            next = curr.next;//临时存一下
            //反转
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }

    /**
     * 递归反转
     */
    public static void solution2(ListNode curr) {
        if (curr == null || curr.next == null) {
            return;
        }
        solution2(curr.next);
        //反转
        curr.next.next = curr;
        curr.next = null;
    }
}
