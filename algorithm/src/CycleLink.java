import java.util.HashSet;
import java.util.Set;

/**
 * 环形链表
 */
public class CycleLink {
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
//        node5.next = node2;
        System.out.println(solution(node1));
        System.out.println(solution2(node1));
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
     * 双指针 判断是否有环
     *
     * @param head
     * @return
     */
    public static boolean solution(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode quick = head.next;
        while (quick != slow) {
            if (quick == null || quick.next == null) {
                return false;
            }
            slow = slow.next;
            quick = quick.next.next;
        }
        return true;
    }

    public static boolean solution2(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        while (head != null) {
            boolean res = nodeSet.add(head);
            if (!res) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
