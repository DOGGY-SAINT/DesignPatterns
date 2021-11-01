package tj.sse.souvenir;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;
import tj.sse.souvenir.mediator.*;
import tj.sse.souvenir.prototype.*;
import tj.sse.souvenir.abstractfactory.*;

/**
 * @author DOGGY_LEE
 * @date 2021/11/1 16:47
 * @description 纪念品测试
 */
public class SouvenirTest {
    @Test
    public void test(){
        //get souvenir factory
        AbstractFactory souvenirFactory = FactoryProducer.getFactory("SOUVENIR");
        ISouvenir souvenir1= souvenirFactory.getSouvenir("KEY BUCKLE");
        ISouvenir souvenir2=souvenirFactory.getSouvenir("DOLL");
        AbstractFactory movieIpFactory=FactoryProducer.getFactory("MOVIE");
        MovieIP movie1=movieIpFactory.getMovieIP("MINIONS");
        MovieIP movie2=movieIpFactory.getMovieIP("PANDA");

        System.out.println("---------------- [Souvenir Test] --------------");
        Mediator md = new ConcreteMediator();
        Trader c1, c2;
        c1 = new ConcreteTrader1();
        c2 = new ConcreteTrader2();
        md.register(c1);
        md.register(c2);

        if(AppTest.input){
            while (true){
                System.out.println("\n【Souvenir agent: Do you want to clone a souvenir ？（Y/N）】");
                String choice1;
                choice1 = AppTest.scanner.next();

                if(choice1.equals("N")){
                    System.out.println("You have cancelled cloning！");
                    break;
                }
                else if(choice1.equals("Y")){
                    Souvenir prototype1 = new PrototypeSouvenir();
                    try {
                        PrototypeSouvenir concretePrototype1 = (PrototypeSouvenir) prototype1.clone();
                        System.out.println("Copied a souvenir！");
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                        System.out.println("clone error");
                    }
                }
                else
                    System.out.println("input error");
                souvenir1.draw();
                souvenir2.draw();
                movie1.create();
                movie2.create();

                System.out.println("\n【Souvenir agent: Do you want to enter souvenirs market？（Y/N）】");
                //中介者交互
                String choice2;
                choice2 = AppTest.scanner.next();
                if(choice2.equals("N"))
                    break;
                else if(choice2.equals("Y")){
                    /////
                    c1.send();
                    System.out.println("-------------");
                    c2.send();
                    break;
                }
                else
                    System.out.println("error");
            }

        }else{
            System.out.println("--------------- [Test] Prototype -------------");
            Souvenir prototype1 = new PrototypeSouvenir();
            try {
                PrototypeSouvenir concretePrototype1 = (PrototypeSouvenir) prototype1.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            System.out.println("Copied a souvenir！");
            System.out.println("-------------------------[End]----------------------------");

            System.out.println("--------------- [Test] Abstract Factory -------------");
            souvenir1.draw();
            souvenir2.draw();
            movie1.create();
            movie2.create();
            System.out.println("-------------------------[End]----------------------------");

            System.out.println("-------------------- [Mediator Test] -------------------");
            c1.autoSend();
            System.out.println("-------------");
            c2.autoSend();
        }
        System.out.println("-----------------------[End]--------------------------");
    }
}
