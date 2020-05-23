import javax.swing.*;

/**
 * @author Albert
 * @date 2020/5/4 - 10:52 下午
 */
class ListTest01 {
    public static void main(String[] args) {
        Box<String> name = new Box<String>("lx");
        System.out.println(name.getData());
    }
}

/**
 * 类Box定义时在其旁边加了<T>，T表示此类的数据类型，T的作用相当于方法中的形参，等待被调用时输入实参。　　
 * 在main函数中，将Sting类型传入形参，此时，Box类就是String型
 * @param <T>
 */

class Box<T> {
    private T data;
    public Box(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
}