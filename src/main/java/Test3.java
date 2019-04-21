import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test3 {


    public static void main(String[] args) throws IOException {

        String[] nameList = {"1-性能测试本质介绍.itcast","2-性能测试分类.itcast","3-性能测试指标.itcast","4-性能测试之需求分析.itcast","5-性能测试之需求分析2.itcast","6-性能测试计划和方案.itcast","7-性能测试用例设计思路.itcast","8-性能测试执行.itcast","9-LoadRunner的安装和破解.itcast","10-LoadRunner三大组件介绍.itcast","11-协议探测器的使用.itcast","12-录制脚本操作.itcast","13-脚本查看方式以及函数介绍.itcast","14-init和end和Action介绍.itcast","15-LoadRunner脚本运行及查看结果.itcast","16-Html不同录制级别的区别.itcast","17-LoadRunner流程介绍.itcast","18-案例分析及作业.itcast","19-迭代和步调.itcast","20-log日志.itcast","21-思考时间设置.itcast","22-虚拟用户运行时进程和线程.itcast","23-web_url函数.itcast","24-web_submit_data函数.itcast","25-web_custom_request函数.itcast","26-iwebshop登录练习.itcast","27-参数化设置1.itcast","28-参数化列数据.itcast","29-多个数据参数化.itcast","30-9种策略的引入.itcast","31-A1B1策略.itcast","32-A1B2策略.itcast","33-A1B3策略.itcast","34-A2B1.itcast","35-A2B2策略.itcast","36-A2B3策略.itcast","37-A3B1策略.itcast","38-A3B1补充.itcast","39-A3B1补充2.itcast","40-A3B1补充2.itcast","41-A3B2策略.itcast","42-A3B2策略补充1.itcast","43-A3B2策略补充2.itcast","44-A3B2策略补充3.itcast","45-A3B2策略补充4.itcast","46-A3B3策略.itcast","47-DateTime日期类型.itcast","48-RandomNumber随机数类型.itcast","49-uniquenumber唯一数类型.itcast","50-uniquenumber补充1.itcast","51-uniquenumber补充2.itcast","52-读取iwebshop数据1.itcast","53-读取iwebshop数据2.itcast","54-参数定义以及与变量的区别.itcast","55-练习.itcast","56-练习1.itcast","57-练习2.itcast","58-webtours练习.itcast","59-关联引出.itcast","60-手动关联","61-边录制边关联.itcast","62-录制后关联.itcast","63-高级关联引出.itcast","64-高级关联使用1.itcast","65-高级关联之idx函数的应用.itcast","66-参数数组长度的应用.itcast","67-参数数组之获取随机数据的应用.itcast","68-高级关联应用2.itcast","69-高级关联练习.itcast","70-事务1.itcast","71-事务2.itcast","72-事务与检查点函数.itcast","73-事务与检查点练习.itcast","74-检查点函数.itcast","75-思考时间和集合点1.itcast","76-集合点策略1.itcast","77-vugen小结.itcast","78-压力曲线图分析.itcast","79-Controller场景设计1.itcast","80-Controller场景设计2.itcast","81-场景设计策略.itcast","82-场景运行.itcast","83-图表监控.itcast","84-图表监控2.itcast","85-场景运行.itcast","86-IP欺骗.itcast","87-nmon工具的安装.itcast","88-nmon工具使用.itcast","89-Dos窗口执行单脚本.itcast","90-批处理文件执行脚本.itcast","91-Analysis分析器.itcast","92-图表的合并和页面细拆分.itcast","93-系统资源以及测试报告.itcast"};


        int i = 1;
        for (String name : nameList){

            String expect = name.split("-")[1];

            find(expect, name);

        }

    }

    private static void find(String expect, String finalName) throws IOException {
        for (int i = 1; i <= 6; i++) {

            String dirName = "C:\\Users\\likgj\\Desktop\\课程\\性能测试视频\\性能测试第" + i + "天\\3-视频";
            File dir = new File(dirName);



            for (File f : dir.listFiles()) {
                String fName = f.getName();
                System.out.println(fName);

                if (fName.contains(expect)) {
                    String destName = "C:\\Users\\likgj\\Desktop\\课程\\性能测试视频\\加密视频\\"+finalName;
                    FileUtils.copyFile(f, new File(destName));
                    return ;
                }

            }
        }
    }
}
