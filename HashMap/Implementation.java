import java.util.*;

public class Implementation {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() {
            n = 0;
            N = 4;
            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            return Math.floorMod(key.hashCode(), N);
        }

        private int searchInLL(K key, int bucketIndex) {
            LinkedList<Node> bucket = buckets[bucketIndex];

            for (int i = 0; i < bucket.size(); i++) {
                if (Objects.equals(bucket.get(i).key, key)) {
                    return i;
                }
            }
            return -1;
        }

        public void put(K key, V value) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if (dataIndex == -1) {
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            } else {
                buckets[bucketIndex].get(dataIndex).value = value;
            }

            if ((double) n / N > 2.0) {
                rehash();
            }
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            N *= 2;
            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (LinkedList<Node> bucket : oldBuckets) {
                for (Node node : bucket) {
                    int bucketIndex = hashFunction(node.key);
                    buckets[bucketIndex].add(node);
                }
            }
        }

        public V get(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);
            return dataIndex == -1 ? null : buckets[bucketIndex].get(dataIndex).value;
        }

        public boolean containsKey(K key) {
            return searchInLL(key, hashFunction(key)) != -1;
        }

        public V remove(K key) {
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if (dataIndex == -1) {
                return null;
            }

            n--;
            return buckets[bucketIndex].remove(dataIndex).value;
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public ArrayList<K> key() {
            ArrayList<K> keys = new ArrayList<>();

            for (LinkedList<Node> bucket : buckets) {
                for (Node node : bucket) {
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("Aus", 100);
        map.put("China", 100);


        System.out.println(map.key());

        System.out.println(map.get("India"));
        System.out.println(map.get("Aus"));

        
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("China"));

        map.remove("Aus");

        System.out.println(map.key());
    }
}
