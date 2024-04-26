package com.an.ObjectOrentedlianxi2;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/2 16:17
 */
public class StudentText2 {
    public static void main(String[] args) {
        //1.定义一个数组
        Student[] array = new Student[3];

        //2.创建学生对象
        Student r1 = new Student(001,"李新安",18);
        Student r2 = new Student(002,"廖乐乐",18);
        Student r3 = new Student(003,"刘德华",58);

        //(1)把学生信息添加到数组中去
        array[0] = r1;
        array[1] = r2;
        array[2] = r3;

        //要求3：通过Son删除学生信息
        //如果存在，则删除，如果不存在，则提示删除失败
        int index =  getIndex(array,2);
        if(index >= 0){
            //如果存在，则删除
            array[index] = null;
            //遍历数组
            printArr(array);
        } else {
            //如果不存在，则提示删除失败
            System.out.println("当前id 不存在，删除失败");
        }


    }

    //1.我要干嘛 找到id在数组中的索引
    //2.我需要什么 数组 id
    //3.调用出是否需要继续使用方法的结果？ 要
    public static int getIndex(Student[] array,int son){
        for (int i = 0; i < array.length; i++) {
            //依次得到每个学生的对象
            Student Student = array[i];
            //对stu进行一个非空判断
            if(Student != null){
                int sid = Student.getSon();
                if(sid==son){
                    return i;
                }
            }
        }
        //当循环结束之后，还没有找到就表示不存在
        return -1;
    }

    public static void printArr(Student[] array) {
        for (int i = 0; i < array.length; i++) {
            Student s =  array[i];
            if(array[i] != null){
                System.out.println(s.getSon()+", "+s.getName()+", "+s.getAge());
            }
        }

    }
}
