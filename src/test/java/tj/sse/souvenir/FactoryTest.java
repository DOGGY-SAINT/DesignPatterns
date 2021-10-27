package tj.sse.souvenir;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;
import tj.sse.souvenir.prototype.*;
import tj.sse.souvenir.abstractfactory.*;


public class FactoryTest {
    @Test
    public void test(){
        //get souvenir factory

        System.out.println("--------------------- [Factory Test] -------------------");
        // 原型模式&抽象工厂模式测试

        if(AppTest.input){
            while (true){
                System.out.println("\n【Choose souvenir: What kind of souvenir do you want ？（doll/keybuckle）】");
                String chooseSouvernir=AppTest.scanner.next();
                if(chooseSouvernir.equalsIgnoreCase("doll")||chooseSouvernir.equalsIgnoreCase("keybuckle")){
                    AbstractFactory souvenirFactory = FactoryProducer.getFactory(chooseSouvernir);
                    if(chooseSouvernir.equalsIgnoreCase("doll")){
                        System.out.println("\n【'Kung Fu Panda' or 'Minions'?  (K/M)】");
                        String choice=AppTest.scanner.next();
                        if(choice.equalsIgnoreCase("K")){
                            PandaDoll souvenir1= (PandaDoll) souvenirFactory.newKungFuPanda();
                            souvenir1.create();
                        }
                        else if(choice.equalsIgnoreCase("M")){
                            MinionsDoll souvenir2= (MinionsDoll) souvenirFactory.newMinions();
                            souvenir2.create();
                        }
                    }
                    else if(chooseSouvernir.equalsIgnoreCase("keybuckle")){
                        System.out.println("\n【'Kung Fu Panda' or 'Minions'?  (K/M)】");
                        String choice=AppTest.scanner.next();
                        if(choice.equalsIgnoreCase("K")){
                            PandaKeyBuckle souvenir3= (PandaKeyBuckle) souvenirFactory.newKungFuPanda();
                            souvenir3.create();
                        }
                        else if(choice.equalsIgnoreCase("M")){
                            MinionsKeyBuckle souvenir4= (MinionsKeyBuckle) souvenirFactory.newMinions();
                            souvenir4.create();
                        }
                    }

                    System.out.println("\n【Souvenir agent: Do you want to continue to choose ？（Y/N）】");
                    String choice=AppTest.scanner.next();
                    if(choice.equalsIgnoreCase("N")){
                        System.out.println("You have cancelled choosing！");
                    }
                    else if(choice.equalsIgnoreCase("Y")){
                        continue;
                    }
                }
                else{
                    System.out.println("Input error：Please input 'doll' or 'keybuckle'.");
                    continue;
                }

                System.out.println("\n【Souvenir agent: Do you want to clone your souvenir ？（Y/N）】");
                String choice=AppTest.scanner.next();
                if(choice.equalsIgnoreCase("N")){
                    System.out.println("You have cancelled cloning！");
                    break;
                }
                else if(choice.equalsIgnoreCase("Y")){
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
                    System.out.println("Input error：Please input single Y or N.");

            }
        }else{
            System.out.println("--------------- [Test] Abstract Factory -------------");
            AbstractFactory souvenirFactory = FactoryProducer.getFactory("doll");
            AbstractFactory movieIpFactory=FactoryProducer.getFactory("keybuckle");
            PandaDoll souvenir1= (PandaDoll) souvenirFactory.newKungFuPanda();
            MinionsDoll souvenir2= (MinionsDoll) souvenirFactory.newMinions();
            PandaKeyBuckle souvenir3= (PandaKeyBuckle) movieIpFactory.newKungFuPanda();
            MinionsKeyBuckle souvenir4= (MinionsKeyBuckle) movieIpFactory.newMinions();
            souvenir1.create();
            souvenir2.create();
            souvenir3.create();
            souvenir4.create();
            System.out.println("-------------------------[End]----------------------------");

            System.out.println("--------------- [Test] Prototype -------------");
            Souvenir prototype1 = new PrototypeSouvenir();
            try {
                PrototypeSouvenir concretePrototype1 = (PrototypeSouvenir) prototype1.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            System.out.println("Copied a souvenir！");
        }
        System.out.println("-------------------------[End]----------------------------");

    }
}
