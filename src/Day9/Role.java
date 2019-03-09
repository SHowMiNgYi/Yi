package Day9;

import java.util.ArrayList;
import java.util.List;

public class Role {
    private String name;

    public Role(String name) {
        this.name = name;
    }

    //attack类
    public int attack() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//Magicer法师类
class Magicer extends Role {
    //属性范围
    private int level;

    //名字
    public Magicer(String name) {
        super(name);
    }

    //attack方法
    public int attack() {
        return 5 * level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

//Soldier战士类
class Soldier extends Role {
    //属性伤害
    private int hurt;

    public Soldier(String name) {
        super(name);
    }

    public int attack() {
        return hurt;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
}

//Team类
class Team {
    //链表储存，长度为6
    private List<Role> members = new ArrayList<>(6);

    //无参构造方法
    public Team() {

    }

    //addMember类
    public void addMember(Role role) {
        if(members.size()<6){
            members.add(role);
        }
        else {
            System.out.println("超出最大组队数量");
        }
    }

    //attackSum类
    public int attackSum() {
        int zHurt = 0;
        //循环每个人的输出
        for(Role member:members){
            zHurt+=member.attack();
        }
        return zHurt;
    }
    public List<Role> teamList(){
        return members;
    }
}