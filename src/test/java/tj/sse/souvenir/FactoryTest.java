package tj.sse.souvenir;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;
import tj.sse.Souvenir.prototype.*;
import tj.sse.Souvenir.abstractfactory.*;


public class FactoryTest {
    @Test
    public void test(){
        //get souvenir factory
        AbstractFactory souvenirFactory = FactoryProducer.getFactory("SOUVENIR");
        ISouvenir souvenir1= souvenirFactory.getSouvenir("KEY BUCKLE");
//        souvenir1.draw();
        ISouvenir souvenir2=souvenirFactory.getSouvenir("DOLL");
//        souvenir2.draw();
        AbstractFactory movieIpFactory=FactoryProducer.getFactory("MOVIE");
        MovieIP movie1=movieIpFactory.getMovieIP("MINIONS");
//        movie1.create();
        MovieIP movie2=movieIpFactory.getMovieIP("PANDA");
//        movie2.create();

        System.out.println("---------------- [Factory Test] --------------");
        // 原型模式&抽象工厂模式测试
//        System.out.println("Choose to clone a souvenir:【clone】");
//        System.out.println("Choose to clone a souvenir:【clone】");
//        System.out.println("Choose to clone a souvenir:【clone】");
        System.out.println("\n【Souvenir agent: Do you want to clone a souvenir ？（Y/N）】");
        if(AppTest.input){
            while (true){
                String choice1;
                choice1 = AppTest.scanner.next();
//                Scanner input=new Scanner(System.in);
                //接受String类型
//                String choice=input.next();
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

                //抽象工厂交互
                String choice2;
                choice2 = AppTest.scanner.next();

            }
        }else{
            Souvenir prototype1 = new PrototypeSouvenir();
            try {
                PrototypeSouvenir concretePrototype1 = (PrototypeSouvenir) prototype1.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            System.out.println("Copied a souvenir！");

            souvenir1.draw();
            souvenir2.draw();
            movie1.create();
            movie2.create();
            System.out.println("Enter any character to exit！");
            return;
        }
        System.out.println("-----------------------[End]--------------------------");

    }
}
