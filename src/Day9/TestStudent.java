package Day9;

public class TestStudent {
    public static void main(String[] args) {
        Student p =new Student();
        p.getAddress();
    }
}

class Student{
    int age;
    private String address;
    private String zipCode;
    private String mobile;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    //getPostAddress方法
    public void getPostAddress(String address,String mobile){
        this.address=address;
        this.mobile=mobile;

    }
}
