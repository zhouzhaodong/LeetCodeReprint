package xyz.zhouzhaodong.leetcodereprint.simple;

import java.util.List;

/**
 * 690. 员工的重要性
 *
 * @author zhouzhaodong
 */
public class GetImportance {

    static class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;

        /**
         * 给定一个保存员工信息的数据结构，它包含了员工唯一的id，重要度 和 直系下属的id。
         * 比如，员工1是员工2的领导，员工2是员工3的领导。他们相应的重要度为15, 10, 5。那么员工1的数据结构是[1, 15, [2]]，员工2的数据结构是[2, 10, [3]]，员工3的数据结构是[3, 5, []]。注意虽然员工3也是员工1的一个下属，但是由于并不是直系下属，因此没有体现在员工1的数据结构中。
         * 现在输入一个公司的所有员工信息，以及单个员工id，返回这个员工和他所有下属的重要度之和。
         *
         * @param employees
         * @param id
         * @return
         */
        public int getImportance(List<Employee> employees, int id) {

            // 在这里我们需要使用广度优先搜索，就是按照一个线一直找到最后面的
            // 这里需要用到递归的知识
            Employee employee = null;
            for (Employee e : employees) {
                if (e.id == id) {
                    // 找到员工
                    employee = e;
                }
            }
            // 获取员工的下属
            List<Integer> list = employee.subordinates;
            // 获取该员工的重要度
            int num = employee.importance;
            if (list != null) {
                // 遍历该员工的所有下属
                for (int a : list) {
                    // 将重要值进行相加
                    num += getImportance(employees, a);
                }
            }
            // 返回重要值
            return num;
        }

    }

    ;

}
