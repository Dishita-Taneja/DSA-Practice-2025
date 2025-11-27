package hashmap;
import java.util.*;

public class implement {

    public static class MyHashMap {

        private class Node {
            int key;
            int value;

            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size;
        private int capacity;
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public MyHashMap() {
            this.capacity = 4;
            buckets = new LinkedList[capacity];
            for (int i = 0; i < capacity; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hash(int key) {
            return Math.abs(Integer.hashCode(key)) % capacity;
        }

        public void put(int key, int value) {
            int idx = hash(key);
            LinkedList<Node> list = buckets[idx];

            for (Node node : list) {
                if (node.key == key) {
                    node.value = value;
                    return;
                }
            }

            list.add(new Node(key, value));
            size++;
        }

        public int get(int key) {
            int idx = hash(key);
            LinkedList<Node> list = buckets[idx];

            for (Node node : list) {
                if (node.key == key) {
                    return node.value;
                }
            }
            return -1;
        }

        public boolean containsKey(int key) {
            int idx = hash(key);
            LinkedList<Node> list = buckets[idx];

            for (Node node : list) {
                if (node.key == key) {
                    return true;
                }
            }
            return false;
        }

        public int remove(int key) {
            int idx = hash(key);
            LinkedList<Node> list = buckets[idx];

            for (int i = 0; i < list.size(); i++) {
                Node node = list.get(i);
                if (node.key == key) {
                    int old = node.value;
                    list.remove(i);
                    size--;
                    return old;
                }
            }
            return -1;
        }

        public int size() {
            return size;
        }

        public Set<Integer> keySet() {
            Set<Integer> set = new HashSet<>();
            for (LinkedList<Node> list : buckets) {
                for (Node node : list) {
                    set.add(node.key);
                }
            }
            return set;
        }
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        System.out.println("Get 2: " + map.get(2));
        System.out.println("Contains 3: " + map.containsKey(3));
        System.out.println("Removed 1: " + map.remove(1));
        System.out.println("Size: " + map.size());
        System.out.println("KeySet: " + map.keySet());
        
    }
}
