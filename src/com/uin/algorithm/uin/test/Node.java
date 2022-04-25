package com.uin.algorithm.uin.test;

/**
 * @author wanglufei
 * @description: TODO
 * @date 2022/2/17/9:43 PM
 */
public class Node<Key,Value> {

    //存储键
    public Key key;
    //存储值
    private Value value;
    //记录左子结点
    public Node left;
    // 记录右子结点
    public Node right;

    public Node(Key key, Value value, Node left, Node right) {
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
