package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoListTest {




    @Test
    void mergeTwoLists() {


        ListNode A1 = new ListNode(4);
        ListNode A2 = new ListNode(3, A1);
        ListNode A3 = new ListNode(1, A2);

        ListNode B1 = new ListNode(4);
        ListNode B2 = new ListNode(2, B1);
        ListNode B3 = new ListNode(1, B2);

        MergeTwoList mergeTwoList = new MergeTwoList();

        mergeTwoList.mergeTwoLists(A3, B3);

    }
}