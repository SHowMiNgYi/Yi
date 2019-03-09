package Day9;

import java.util.Arrays;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] as = new Animal[]{
                new Dog("Pluto"),
                new Cat("Tom"),
                new Dog("Snoopy"),
                new Cat("Garfield"),
        };
        Dog[] dogs = getAllDog(as);
        for (int i = 0; i <= dogs.length; i++) {
            System.out.println(dogs[i].getName());
        }
    }

    public static Dog[] getAllDog(Animal[] as) {
        //4
        //初始化
        Dog[] ds = new Dog[0];
        int index = 0;
        for (int i = 0; i < as.length; i++) {
            //instanceof（布尔值）二元操作符，判断继承中的子类的实例是否为父类的实现
            if (as[i] instanceof Dog) {
                //Arrays.copyOf(x,x.length)方法，x复制的数组，length新数组的长度
                ds = Arrays.copyOf(ds, ds.length + 1);
                ds[index] = (Dog) as[i];
                index++;
            }
        }
        return ds;
    }
}

class Animal {
    private String name;

    //无参构造
    public Animal() {

    }

    //有参构造
    public Animal(String name) {
        this.name = name;
    }

    //get方法
    public String getName() {
        return name;
    }

    //set方法
    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    //构造方法，无参有参
    public Dog() {

    }

    public Dog(String name) {
        super(name);
    }

}

class Cat extends Animal {
    //构造方法，无参有参
    public Cat() {

    }

    public Cat(String name) {
        super(name);
    }
}
