import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import sun.nio.ch.IOUtil;

import java.io.File;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class RenameUtil {

    public static void main(String[] args) {

//        File dir = new File("C:\\Users\\Administrator\\Desktop\\03视频1");
//        for(File f : dir.listFiles()) {
//            String old = f.getAbsolutePath();
//            String newPath = old.replace(".avi", ".wmv");
//
//            System.out.println(old);
//            System.out.println(newPath);
//
//            f.renameTo(new File(newPath));
//        }


//        File dir = new File("C:\\Users\\Administrator\\Desktop\\03视频_tlias");
//        for(File f : dir.listFiles()) {
//            String name = f.getName();
//            name = name.replace(".avi", "");
//            System.out.println(name);
//        }

        Map<String, String> data = new TreeMap<>();


        LinkedList list;

        data.put("SY201906100107", "9-17性能测试用例执行-负载400-登录");
        data.put("SY201906100106", "9-16性能测试用例执行-基准测试-其它用例");
        data.put("SY201906100105", "9-15性能测试用例执行-基准测试-登录");
        data.put("SY201906100109", "9-19性能测试报告编写");
        data.put("SY201906100103", "9-13性能测试脚本编写-购物车");
        data.put("SY201906100108", "9-18性能测试用例执行-100并发");
        data.put("SY201906100102", "9-12性能测试脚本编写-单品详情");
        data.put("SY201906100104", "9-14性能测试脚本编写-提交订单");
        data.put("SY201906100099", "9-9测试数据准备存储过程");
        data.put("SY201906100101", "9-11性能测试脚本编写-选择分类");
        data.put("SY201906100100", "9-10性能测试脚本编写-登录");
        data.put("SY201906100098", "9-8测试数据准备python生成数据");
        data.put("SY201906100096", "9-6性能测试方案编写");
        data.put("SY201906100095", "9-5性能测试分析");
        data.put("SY201906100093", "9-3环境配置之虚拟主机配置");
        data.put("SY201906100092", "9-2LNMP环境安装");
        data.put("SY201906100097", "9-7测试用例的编写");
        data.put("SY201906100091", "9-1开源商城tpshop介绍");
        data.put("SY201906100094", "9-4环境配置tpshop安装及配置");
        data.put("SY201906100090", "8-9Analysis生成报告");
        data.put("SY201906100089", "8-8Analysis图高级分析");
        data.put("SY201906100088", "8-7Analysis图分析");
        data.put("SY201906100087", "8-6SLA分析");
        data.put("SY201906100086", "8-5Analysis 摘要报告");
        data.put("SY201906100085", "8-4Analysis介绍及设置");
        data.put("SY201906100084", "8-3监控工具nmon分析");
        data.put("SY201906100083", "8-2监控工具nmon使用");
        data.put("SY201906100081", "7-10Controller命令行启动");
        data.put("SY201906100082", "8-1Loadrunner性能数据监控和分析");
        data.put("SY201906100078", "7-7场景运行");
        data.put("SY201906100077", "7-6场景设置策略group");
        data.put("SY201906100080", "7-9Controller监控");
        data.put("SY201906100079", "7-8IP欺骗");
        data.put("SY201906100075", "7-4压力负载机");
        data.put("SY201906100076", "7-5场景设置策略scenario");
        data.put("SY201906100074", "7-3controller场景设置");
        data.put("SY201906100073", "7-2controller介绍及启动");
        data.put("SY201906100070", "6-5练习2");
        data.put("SY201906100069", "6-5练习1");
        data.put("SY201906100072", "7-1压力曲线图分析");
        data.put("SY201906100068", "6-4集合点介绍及设置");
        data.put("SY201906100071", "6-6练习3");
        data.put("SY201906100067", "6-3图片检查");
        data.put("SY201906100066", "6-2检查点文本检查web_reg_find");
        data.put("SY201906100065", "6-1检查点文本检查web_find");
        data.put("SY201906100064", "5-2事务状态及验证");
        data.put("SY201906100063", "5-1事务介绍及设置");
        data.put("SY201906100062", "4-9关联练习");
        data.put("SY201906100061", "4-8高级关联之指定或随机操作");
        data.put("SY201906100060", "4-7高级关联之函数");
        data.put("SY201906100059", "4-6高级关联之脚本编写");
        data.put("SY201906100058", "4-5高级关联之分析");
        data.put("SY201906100056", "4-3录制后关联");
        data.put("SY201906100055", "4-2录制中关联");
        data.put("SY201906100054", "4-1关联介绍");
        data.put("SY201906100057", "4-4手动关联");
        data.put("SY201906100052", "3-19常用函数介绍");
        data.put("SY201906100051", "3-18Unique number");
        data.put("SY201906100053", "3-20练习");
        data.put("SY201906100050", "3-17Random Number");
        data.put("SY201906100045", "3-12唯一与每次出现3");
        data.put("SY201906100049", "3-16DateTime");
        data.put("SY201906100043", "3-12唯一与每次出现1");
        data.put("SY201906100048", "3-15数据库参数化");
        data.put("SY201906100042", "3-11唯一与每次迭代4");
        data.put("SY201906100047", "3-14数据库参数化配置");
        data.put("SY201906100046", "3-13唯一与只取一次");
        data.put("SY201906100040", "3-11唯一与每次迭代2");
        data.put("SY201906100039", "3-11唯一与每次迭代1");
        data.put("SY201906100044", "3-12唯一与每次出现2");
        data.put("SY201906100037", "3-9随机与每次出现");
        data.put("SY201906100041", "3-11唯一与每次迭代3");
        data.put("SY201906100034", "3-6顺序与每次出现");
        data.put("SY201906100033", "3-5顺序与每次迭代");
        data.put("SY201906100038", "3-10随机与只取一次");
        data.put("SY201906100036", "3-8随机与每次迭代");
        data.put("SY201906100035", "3-7顺序与只取一次");
        data.put("SY201906100030", "3-2LoadRunner参数化脚本创建");
        data.put("SY201906100028", "2-23练习");
        data.put("SY201906100032", "3-4LoadRunner参数化策略介绍");
        data.put("SY201906100031", "3-3LoadRunner参数化视图创建修改后");
        data.put("SY201906100025", "2-20常用函数web_url");
        data.put("SY201906100029", "3-1参数化介绍");
        data.put("SY201906100023", "2-16运行设置Miscellaneous");
        data.put("SY201906100027", "2-22函数web_custom_request");
        data.put("SY201906100022", "2-15运行设置think time");
        data.put("SY201906100026", "2-21函数web_submit_data");
        data.put("SY201906100020", "2-13运行时设置pacing");
        data.put("SY201906100024", "2-17LoadRunner运行流程");
        data.put("SY201906100021", "2-14运行时设置log");
        data.put("SY201906100019", "2-12运行时设置run logic");
        data.put("SY201906100016", "2-9录制配置分析");
        data.put("SY201906100015", "2-8录制配置2种模式");
        data.put("SY201906100018", "2-11脚本运行及查看结果");
        data.put("SY201906100013", "2-6Loadrunner协议探测器");
        data.put("SY201906100012", "2-5LoadrunnerVuser介绍");
        data.put("SY201906100017", "2-10脚本组成及函数");
        data.put("SY201906100010", "2-3Loadrunner基本组成");
        data.put("SY201906100009", "2-2Loadrunner安装及破解");
        data.put("SY201906100008", "2-1Loadrunner工具介绍及安装事项");
        data.put("SY201906100014", "2-7Loadrunner脚本录制");
        data.put("SY201906100007", "1-7性能测试用例编写及执行");
        data.put("SY201906100005", "1-5性能测试分析");
        data.put("SY201906100011", "2-4-Loadrunner自带的测试环境");
        data.put("SY201906100004", "1-4软件性能指标TPS及资源利用率");
        data.put("SY201906100001", "1-1软件测试基础");
        data.put("SY201906100006", "1-6性能测试计划和方案");
        data.put("SY201906100003", "1-3软件性能指标响应时间及并发数");
        data.put("SY201906100002", "1-2软件测试分类");



        for (Map.Entry<String, String> entry : data.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
//            System.out.println(entry.getValue() + "\t" + entry.getKey());
        }


    }
}
