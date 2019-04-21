import java.io.File;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {


    public static void main(String[] args) {

        String[] nameList = {"1-性能测试本质介绍.itcast","2-性能测试分类.itcast","3-性能测试指标.itcast","4-性能测试之需求分析.itcast","5-性能测试之需求分析2.itcast","6-性能测试计划和方案.itcast","7-性能测试用例设计思路.itcast","8-性能测试执行.itcast","9-LoadRunner的安装和破解.itcast","10-LoadRunner三大组件介绍.itcast","11-协议探测器的使用.itcast","12-录制脚本操作.itcast","13-脚本查看方式以及函数介绍.itcast","14-init和end和Action介绍.itcast","15-LoadRunner脚本运行及查看结果.itcast","16-Html不同录制级别的区别.itcast","17-LoadRunner流程介绍.itcast","18-案例分析及作业.itcast","3-迭代和步调.itcast","4-log日志.itcast","5-思考时间设置.itcast","6-虚拟用户运行时进程和线程.itcast","7-web_url函数.itcast","8-web_submit_data函数.itcast","9-web_custom_request函数.itcast","10-iwebshop登录练习.itcast","11-参数化设置1.itcast","12-参数化列数据.itcast","13-多个数据参数化.itcast","14-9种策略的引入.itcast","15-A1B1策略.itcast","16-A1B2策略.itcast","17-A1B3策略.itcast","18-A2B1.itcast","19-A2B2策略.itcast","20-A2B3策略.itcast","21-A3B1策略.itcast","22-A3B1补充.itcast","23-A3B1补充2.itcast","24-A3B1补充2.itcast","25-A3B2策略.itcast","26-A3B2策略补充1.itcast","27-A3B2策略补充2.itcast","28-A3B2策略补充3.itcast","29-A3B2策略补充4.itcast","30-A3B3策略.itcast","1-DateTime日期类型.itcast","2-RandomNumber随机数类型.itcast","3-uniquenumber唯一数类型.itcast","4-uniquenumber补充1.itcast","5-uniquenumber补充2.itcast","6-读取iwebshop数据1.itcast","7-读取iwebshop数据2.itcast","8-参数定义以及与变量的区别.itcast","9-练习.itcast","10-练习1.itcast","11-练习2.itcast","12-webtours练习.itcast","13-关联引出.itcast","14-手动关联-获取一个动态数据.itcast","1-边录制边关联.itcast","2-录制后关联.itcast","3-高级关联引出.itcast","4-高级关联使用1.itcast","5-高级关联之idx函数的应用.itcast","6-参数数组长度的应用.itcast","7-参数数组之获取随机数据的应用.itcast","8-高级关联应用2.itcast","9-高级关联练习.itcast","10-事务1.itcast","11-事务2.itcast","12-事务与检查点函数.itcast","13-事务与检查点练习.itcast","14-检查点函数.itcast","2-思考时间和集合点1.itcast","3-集合点策略1.itcast","4-vugen小结.itcast","5-压力曲线图分析.itcast","6-Controller场景设计1.itcast","7-Controller场景设计2.itcast","8-场景设计策略.itcast","9-场景运行.itcast","10-图表监控.itcast","11-图表监控2.itcast","12-场景运行.itcast","2-IP欺骗.itcast","3-nmon工具的安装.itcast","4-nmon工具使用.itcast","5-Dos窗口执行单脚本.itcast","6-批处理文件执行脚本.itcast","7-Analysis分析器.itcast","8-图表的合并和页面细拆分.itcast","9-系统资源以及测试报告.itcast"};


        int i = 1;
        for (String name : nameList){
            String name2 = name.split("-")[1];
            System.out.println(i++ + "-"+name2);
        }

    }
}
