package com.unfbx.hashmap;

/**
 * @Description
 * @Author Grt
 * @Date 2021-04-15
 */
public class A03Bean {
    protected int number;

    public A03Bean(int number) {
        this.number = number;
    }

    /**
     * 重写hashCode()方法，只要是4的倍数，最后算出的哈希值都会是0.
     */
    @Override
    public int hashCode() {
        return number % 4;
    }

    /**
     * 也必须重写equals()方法。当发生哈希冲突的时候，需要调用equals()方法比较两个对象的实际内容是否相同。
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        A03Bean other = (A03Bean) obj;
        if (number != other.number) {
            return false;
        }
        return true;
    }
}
