 - java中嵌套类就是以static开头的，不会存储外部类的引用的静态嵌套类
    - kotlin中对应的嵌套类，不需要static关键字，可以直接声明

 - java中直接声明一个内部类，不需要关键字，内部类会存储外部类的应用
    - kotlin中对应内部类需要添加关键字，inner

kotlin中访问外部类实例是需要使用this@Outer来访问