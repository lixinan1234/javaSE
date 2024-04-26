package com.an.ObjectOrentedlianxi2;

/**
 * @author:lixinan
 * @email:2489460735@qq.com
 * @desc:
 * @datetime: 2023/11/1 17:00
 */
public class StudentText {
    public static void main(String[] args) {
        //1.定义一个数组
        Student[] array = new Student[2];

        //2.创建学生对象
        Student r1 = new Student(001,"李新安",18);
        Student r2 = new Student(002,"廖乐乐",18);
        Student r3 = new Student(003,"刘德华",58);

        //要求1：再添加一个学生对象，并再添加的时候进行学号的唯一判断
        Student r4 = new Student(004,"张学友",59);


        //唯一判断
        //已存在：不用添加
        //不存在：就可以把学生对象直接添加


        //把r4添加到数组中
        //第一种情况：数组存满 --- 只能创建一个新的数组，新数组的长度 = 老数组 + 1
        //第二种情况：数组没有存满 --- 直接添加

        boolean flag = contains(array,r4.getSon());
        if (flag){
            //已存在：不用添加
            System.out.println("当前son存在，请修改id后进行添加");
        }else {
            //不存在：就可以把学生对象直接添加
            int count = getCount(array);
            if(count == array.length){
                //第一种情况：数组存满 --- 只能创建一个新的数组，新数组的长度 = 老数组 + 1
                Student[] newArr = creatNewArr(array);
                newArr[count] = r4;

                //要求2：添加之后遍历所有学生的信息
                printArr(newArr);

            }else {
                //第二种情况：数组没有存满 --- 直接添加
                array[count] = r4;
                printArr(array);
            }
        }



        //要求2：添加之后遍历所有学生的信息
        //(1)把学生信息添加到数组中去
        array[0] = r1;
        array[1] = r2;
        array[2] = r2;
        //(2)遍历所有学生的信息
        for (int i = 0; i < array.length; i++) {
            Student s = array[i];
            System.out.println(s.getSon()+", "+s.getName()+", "+s.getAge());
        }



    }
    public static void printArr(Student[] array) {
        for (int i = 0; i < array.length; i++) {
            Student s =  array[i];
            if(array[i] != null){
                System.out.println(s.getSon()+", "+s.getName()+", "+s.getAge());
            }
        }

    }

    //把老数组的元素拷贝到新数组中
    public static Student[] creatNewArr(Student[] array) {
        Student[] newArr = new Student[array.length + 1];

        //循环遍历得到老数组中的每一个元素
        for (int i = 0; i < array.length; i++) {
            //把老数组的元素添加到新数组中
            newArr[i] = array[i];
        }

        //把新数组返回
        return newArr;
    }

    //定义一个方法判断数组中已经存了几个元素
    public static int getCount(Student[] array){
        //定义一个计数器用来统计

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null){
                count++;
            }
        }
        return count;
    }


    public static boolean contains(Student[] array,int son){
        for (int i = 0; i < array.length; i++) {
            //依次获取到数组里面的每一个对象
            Student stu = array[i];
            //获取数组中学生对象的Son
            int sid  = stu.getSon();
            //比较
            if (sid == son) {
                return true;
            }
        }
        return false;
    }
}
















