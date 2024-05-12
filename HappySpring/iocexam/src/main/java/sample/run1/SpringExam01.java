package sample.run1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import sample.bean.MyBean;
import sample.config.MyBeanConfig;

public class SpringExam01 {
    public static void main(String[] args) {
        //직접 사용하는 경우
//        MyBean bean = new MyBean();
//        bean.setName("jeon");
//
//        System.out.println(bean);

        //스프링 ioc container를 이용해서 사용하는 경우
        //스프링 컨테이너에게 알려줘야하지 않을까요?
        //1. 어노테이션으로 알려줌.  --  컴포넌트 스캔 하도록!! 즉, @ComponentScan 을 사용
        //  --->  @SpringBootApplication 상위에 @ComponentScan 이 존재한다.
        //2. 자바파일을 통해서 알려줌.

        //beanFactory  -- 빈을 생성하는데 간단한 기능만 포함하고 있어요.. aop 기술은 사용할 수 없어요
        System.out.println("ApplicationContext 생성 전");
        ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class); // 공장이 생성될 때 어떤 빈을 생성해야 할지
        System.out.println("ApplicationContext 생성 후");
        MyBean bean1 = (MyBean)context.getBean("myBean");

        bean1.setName("bean으로 생성했어요!"); //lookup 방식..

//        System.out.println(bean1);

//        MyBean bean2 = (MyBean)context.getBean(MyBean.class); //타입만 알려줌. -- 해당 타입의 객체가 하나면 존재할 때는 오류가 없다.

        MyBean bean2 = (MyBean)context.getBean("myBean2",MyBean.class);

        bean2.setName("kim");
        System.out.println(bean2);
        System.out.println(bean1);

        if(bean2 == bean1){
            System.out.println("같은 인스턴스이다.");
        }else{
            System.out.println("다른 인스턴스다.");
        }

        MyBean bean3 = context.getBean("myBean", MyBean.class);

        if(bean3 == bean1){
            System.out.println("같은 인스턴스이다!!");
        }
        System.out.println(bean3);

        MyBean bean4 = context.getBean("myBean3", MyBean.class);
        MyBean bean5 = context.getBean("myBean3", MyBean.class);

        bean4.setName("lee");
        bean5.setName("park");
        System.out.println(bean4);
        System.out.println(bean5);
        if(bean4 == bean5){
            System.out.println("같은 인스턴스이다!!");
        }

        //3. xml을 통해서 알려줌. -- 현재는 많이 사용하지 않음
    }
}
