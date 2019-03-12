package APIdemo;

import java.util.Objects;

public class ApiDemo {
    public static void main(String[] args) {
       /*Object o =new Object();
        System.out.println(o.hashCode());
        System.out.println(o.toString());
        System.out.println(o);

        Object o1= new Object();
        Object o2=new Object();
        //equals 判断个对象的地址值是否相等
        System.out.println(o1.equals(o2));*/

       /*Person p=new Person();
       p.name="张三";
       p.age=18;
       Person p1 =new Person();
       p1.name="张三 ";
       p1.age=19;
        System.out.println(p.equals(p1));*/

        User u=new User();
        u.setName("周杰伦");
        u.setPwd("123");
        System.out.println(u);
    }
}

class User {
    String name;
    String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /*//重写toString
    @Override
    public String toString() {
        return name+pwd;
    }*/

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getName().equals(user.getName()) &&
                getPwd().equals(user.getPwd());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPwd());
    }
}
/*
class Person{
    int age;
    String name;

    //需求，比较两个对象。地址值相同且属性值相同
    @Override
    public boolean equals(Object obj) {
        //判断地址值相同
        if(this==obj){
            return true;
        }
        //排除参数null
        if(obj==null){
            return false;
        }
        //排除参数不匹配的类型
        //getClass（）返回的类型
        if(this.getClass()!=obj.getClass()){
            return false;
        }
        //判断属性值相同
        Person p=(Person)obj;
        if(this.age!=p.age){
            return false;
        }
        //this.name.equals(null)
        //null==null
        if(this.name==null){
            if(p.name!=null){
                return false;
            }
        } else if (!this.name.equals(p.name)){
            return false;
        }
        return true;
    }
}
*/
