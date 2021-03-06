package eu.sig.training.ch03.binarytree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinaryTreeSearchTest {

    @Test
    public void testSimpleTree() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
        root.insert(3);
        root.insert(10);
        root.insert(12);

        assertEquals(eu.sig.training.ch03.binarytree.BinaryTreeSearch.calculateDepth(root, 12), 2);
    }

    @Test
    public void testDepth0() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(2);
        root.insert(5);
        root.insert(1);
        root.insert(16);

        assertEquals(eu.sig.training.ch03.binarytree.BinaryTreeSearch.calculateDepth(root, 2), 0);
    }

    @Test
    public void testNotInTree() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(2);
        root.insert(5);
        root.insert(1);
        root.insert(16);
        boolean exceptionCaught_v1 = false;

        try {
            assertEquals(eu.sig.training.ch03.binarytree.BinaryTreeSearch.calculateDepth(root, 17), 0);
        } catch (TreeException e) {
            exceptionCaught_v1 = true;
        }
        assertTrue(exceptionCaught_v1);
    }

}