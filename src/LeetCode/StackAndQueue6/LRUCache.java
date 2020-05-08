package LeetCode.StackAndQueue6;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class LRUCache {
    public class Node{
        public int key, val;
        public Node next, prev;
       public Node(int k, int v) {
            this.key = k;
            this.val = v;
        }
    }
    public class DoubleList{
        public Node head,tail;
        public int size;
        public DoubleList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        // 在链表头部添加节点 x
        public void addFirst(Node x) {
            x.next = head.next;
            x.prev = head;
            head.next.prev = x;
            head.next = x;
            size++;
        }

        // 删除链表中的 x 节点（x 一定存在）
        public void remove(Node x) {
            x.prev.next = x.next;
            x.next.prev = x.prev;
            size--;
        }

        // 删除链表中最后一个节点，并返回该节点
        public Node removeLast() {
            if (tail.prev == head)
                return null;
            Node last = tail.prev;
            remove(last);
            return last;
        }

        // 返回链表长度
        public int size() { return size; }
    }

    private int cap;
    Map<Integer,Node> map;
    DoubleList cache;

    public LRUCache(int capacity) {
        this.cap=capacity;
        map=new HashMap<>();
        cache=new DoubleList();
    }

    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        int val=map.get(key).val;
        put(key,val);
        return val;
    }

    public void put(int key, int value) {
        Node node=new Node(key,value);
        if(map.containsKey(key)){
            cache.remove(node);
            cache.addFirst(node);
            map.put(key,node);
        }else{
            if(map.size()>cap){
                Node last=cache.removeLast();
                map.remove(last.key);
            }
            cache.addFirst(node);
            map.put(key,node);
        }
    }
}
