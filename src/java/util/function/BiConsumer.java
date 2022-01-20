package java.util.function;

/**
 * @author jiangwenjie
 * @date 2022/1/19
 */
public interface BiConsumer<K, V> {
    void accept(K key, V value);
}
