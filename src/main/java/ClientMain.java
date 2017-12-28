import java.rmi.Naming;

/**
 * @author flytoyou
 * @version 1.0.0
 */
public class ClientMain {

    public static void main(String[] args) throws Exception{
        //服务引入
        HelloService helloService = (HelloService) Naming.lookup("rmi://localhost:8080/HelloService");
        //调用远程方法
        System.out.println("RMI服务器返回的结果是:" + helloService.sayHello("liyebing"));
    }

}
