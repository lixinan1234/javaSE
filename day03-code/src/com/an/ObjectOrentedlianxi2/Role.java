package com.an.ObjectOrentedlianxi2;

import java.util.Random;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/10/29 16:33
 */
public class Role {
    private String name;
    private int blood;
    private char sex;
    private String face;//长相是随机的
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "亭亭玉立", "身材姣好", "相貌平平", "相貌丑陋", "惨不忍睹"};

    //attack 攻击描述：
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【霹雷坠地】，锤向%s双腿。",
            "%s运气于掌，一瞬间手掌心变得血红，一式【掌心雷】，推向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。",
            "%s阴手翻起阳手跟进，一招【没遮掩】，结结实实的锤向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果「轰」的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"

};

    public Role() {
    }

    public Role(String name, int blood, char sex) {
        this.name = name;
        this.blood = blood;
        this.sex= sex;
        //随机长相
        setFace(sex);
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char sex) {
        Random r = new Random();
        //长相是随机的
        if (sex == '男') {
            //从boyfaces里面随机长相
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (sex == '女') {
            //从girlfaces里面随机长相
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "面目狰狞";
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法用于去攻击别人
    //思考：谁攻击谁？
    //Role r1 = new Role();
    //Role r2 = new Role();
    //r1.攻击（r2）;
    //方法调用者去攻击参数
    public void attack(Role role) {
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String kungFu = attacks_desc[index];
        //输出一个攻击的效果
        System.out.printf(kungFu,this.getName(),role.getName());
        System.out.println();


        //计算造成的伤害 1~20f
        int hurt = r.nextInt(20) + 1;

        //剩余血量
        int remainBlood = role.getBlood() - hurt;
        //对剩余血量做一个验证，如果为负数就修改为0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //修改下挨揍人的血量
        role.setBlood(remainBlood);

        //受伤的描述
        //血量>90 利用0索引的描述
        //90 ~ 80 利用1索引的描述
        //80 ~ 70 利用2索引的描述
        //70 ~ 60 利用3索引的描述
        //60 ~ 40 利用4索引的描述
        //40 ~ 20 利用5索引的描述
        //20 ~ 10 利用6索引的描述
        //10 ~ 0  利用6索引的描述
        if(remainBlood > 90){
            System.out.printf(injureds_desc[0],role.getName());
        }else if(remainBlood >80 && remainBlood<=90){
            System.out.printf(injureds_desc[1],role.getName());
        }else if(remainBlood >70 && remainBlood<=80){
            System.out.printf(injureds_desc[2],role.getName());
        }else if(remainBlood >60 && remainBlood<=70){
            System.out.printf(injureds_desc[3],role.getName());
        }else if(remainBlood >40 && remainBlood<=60){
            System.out.printf(injureds_desc[4],role.getName());
        }else if(remainBlood >20 && remainBlood<=40){
            System.out.printf(injureds_desc[5],role.getName());
        }else if(remainBlood >10 && remainBlood<=20){
            System.out.printf(injureds_desc[6],role.getName());
        }else{
            System.out.printf(injureds_desc[7],role.getName());
        }
        System.out.println();
    }

    public void showRoleTnfo() {
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getSex());
        System.out.println("相貌为：" + getFace());
    }
}
