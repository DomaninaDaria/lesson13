package jmx_test;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.StandardMBean;
import java.lang.management.ManagementFactory;

public class CalcJMXTest {
    public static void main(String[] args) throws Exception {
        StandardMBean standardMBean = new StandardMBean(new Calculator(10, 20), CalculatorInterface.class);
        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();

        platformMBeanServer.registerMBean(standardMBean,
                new ObjectName("JMX_EXAMPLE: type=jmx, name=jmx_name"));
        for(;;){

        }
    }
}
