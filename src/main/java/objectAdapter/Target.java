package objectAdapter;

/**
 * 
* 
* Adaptee类并没有sampleOperation2()方法，而客户端则期待这个方法。
* 为使客户端能够使用Adaptee类，需要提供一个包装(Wrapper)类Adapter。
* 这个包装类包装了一个Adaptee的实例，从而此包装类能够把Adaptee的API与Target类的API衔接起来。
* Adapter与Adaptee是委派关系，这决定了适配器模式是对象的
 */
public interface Target {

	/**
     * 这是源类Adaptee也有的方法
     */
    public void sampleOperation1(); 
    /**
     * 这是源类Adapteee没有的方法
     */
    public void sampleOperation2(); 
}
