package tj.sse.souvenir;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;
import tj.sse.souvenir.prototype.*;
import tj.sse.souvenir.abstractfactory.*;


public class FactoryTest {
    @Test
    public void test(){
        //get souvenir factory
        AbstractFactory souvenirFactory = FactoryProducer.getFactory("SOUVENIR");
        ISouvenir souvenir1= souvenirFactory.getSouvenir("KEY BUCKLE");
        ISouvenir souvenir2=souvenirFactory.getSouvenir("DOLL");
        AbstractFactory movieIpFactory=FactoryProducer.getFactory("MOVIE");
        MovieIP movie1=movieIpFactory.getMovieIP("MINIONS");
        MovieIP movie2=movieIpFactory.getMovieIP("PANDA");

        System.out.println("--------------------- [Factory Test] -------------------");
        // 原型模式&抽象工厂模式测试

        if(AppTest.input){
            while (true){
                System.out.println("\n【Souvenir agent: Do you want to clone a souvenir ？（Y/N）】");
                String choice;
                choice = AppTest.scanner.next();
                if(choice.equals("N")){
                    System.out.println("You have cancelled cloning！");
                    break;
                }
                else if(choice.equals("Y")){
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
        }
        System.out.println("-------------------------[End]----------------------------");

    }
}
