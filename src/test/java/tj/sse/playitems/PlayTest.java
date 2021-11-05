package tj.sse.playitems;

import org.junit.jupiter.api.Test;
import tj.sse.AppTest;
import tj.sse.playItems.decorator.RobotGame;
import tj.sse.playItems.facade.Booking;
import tj.sse.playItems.observer.PotionsClass;
import tj.sse.playItems.reschain.WandGame;
import tj.sse.playItems.route.iterator.Route;
import tj.sse.playItems.route.iterator.SpotsName;
import tj.sse.playItems.state.QuidditchGame;
import tj.sse.playItems.template.templatemethod;
import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampQuidditch;
import tj.sse.playItems.utils.Visitor;
import tj.sse.playItems.utils.Gender;
import tj.sse.playItems.transfer.*;

import java.util.Arrays;
import java.util.Locale;


/**git
 * 娱乐项目的测试
 */
public class PlayTest {

    @Test
    public void test(){
        Visitor vs01 = new Visitor("Robert");
        vs01.setAge(18);
        vs01.setHeight(175.0);
        Visitor vs02 = new Visitor("Robert");
        vs02.setAge(15);
        vs01.setHeight(167.0);
        Visitor vs03 = new Visitor("John");
        vs03.setAge(22);
        vs01.setHeight(180.0);

        System.out.println("--------------------------------- [Playitems Test] --------------------------------");
        //一些变量声明
        tj.sse.playItems.route.strategy.strategyA Route=new tj.sse.playItems.route.strategy.strategyA();
        String[] path = Route.provideSuggestions();

        SpotsName spotsName=new SpotsName();

        if(AppTest.input){
            System.out.println("\n【Do you want to do some playitems？（Y/N）】");
            while (true){
                String choice;
                choice = AppTest.scanner.next();
                if(choice.equals("N"))
                    break;
                else if(choice.equals("Y")){
                    PlayerBO playerBusinessObject = new PlayerBO();
                    System.out.println("---------------------------------------");
                    System.out.println("|-------transfer object pattern-------|");
                    System.out.println("---------------------------------------");
                    //输出所有的玩家
                    System.out.println("Coming Visitors: ");
                    for (PlayerVO player : playerBusinessObject.getAllPlayers()) {
                        System.out.println("Players' name for this round: [RollNo : "
                                +player.getRollNo()+", Name : "+player.getName()+" ]");
                    }

                    System.out.println("---------------------------------------");
                    System.out.println("|-----------facade pattern------------|");
                    System.out.println("---------------------------------------");
                    //交互模式
                    Booking book = new Booking();
                    for(int i = 0; i < path.length; i++){
                        book.book(path[i]);
                    }
                    while (true){
                        choice = AppTest.scanner.next();
                        if(choice.equals("GO")||choice.equals("go")){
                            break;
                        }
                    }

                    System.out.println("---------------------------------------");
                    System.out.println("|-----------iterator pattern-----------|");
                    System.out.println("---------------------------------------");

                    System.out.println("THE GAME SEQUENCE:");
                    for(Route route = spotsName.getRoute(); route.hasNext();){
                        String name=(String)route.next();
                        System.out.println("Game Name:"+name);
                    }
                    while (true){
                        choice = AppTest.scanner.next();
                        if(choice.equals("GO")||choice.equals("go")){
                            break;
                        }
                    }

                    System.out.println("---------------------------------------");
                    System.out.println("|------------state pattern-------------|");
                    System.out.println("---------------------------------------");
                    System.out.println("-----Quidditch----");
                    QuidditchGame quidditch = new QuidditchGame();
                    quidditch.play(vs02);
                    quidditch.play(vs03);
                    while (true){
                        choice = AppTest.scanner.next();
                        if(choice.equals("GO")||choice.equals("go")){
                            break;
                        }
                    }
                    System.out.println("---------------------------------------");
                    System.out.println("|-----responsibility chain pattern----|");
                    System.out.println("---------------------------------------");

                    System.out.println("----WandGame----");
                    WandGame wandGame = new WandGame();
                    wandGame.play(vs02);
                    wandGame.play(vs03);
                    while (true){
                        choice = AppTest.scanner.next();
                        if(choice.equals("GO")||choice.equals("go")){
                            break;
                        }
                    }
                    System.out.println("---------------------------------------");
                    System.out.println("|------------observer pattern----------|");
                    System.out.println("---------------------------------------");
                    System.out.println("-----PotionClass------");
                    PotionsClass potionClass = new PotionsClass();
                    potionClass.play(vs02);
                    potionClass.play(vs03);
                    while (true){
                        choice = AppTest.scanner.next();
                        if(choice.equals("GO")||choice.equals("go")){
                            break;
                        }
                    }
                    System.out.println("---------------------------------------");
                    System.out.println("|--------template method pattern-------|");
                    System.out.println("---------------------------------------");
                    templatemethod coaster = new templatemethod();
                    System.out.println("-----JurassicFlyerscoaster------");
                    coaster.playJurassicFlyersCoaster();
                    System.out.println("-----DeceptiCoaster----");
                    coaster.playDecepticoaster();
                    while (true){
                        choice = AppTest.scanner.next();
//                        choice.toUpperCase(Locale.ROOT);
                        if(choice.equals("GO")||choice.equals("go")){
                            break;
                        }
                    }
                    System.out.println("---------------------------------------");
                    System.out.println("|----------decorator pattern----------|");
                    System.out.println("---------------------------------------");
                    System.out.println("-----Robot Game------");
                    RobotGame robotGame = new RobotGame();
                    robotGame.play(vs02);
                    robotGame.play(vs03);

                    break;
                }
                else
                    System.out.println("error");
            }
        }else{
            PlayerBO playerBusinessObject = new PlayerBO();

            System.out.println("---------------- [Test] Transfer Object" +
                    " ----------------");
            //输出所有的玩家
            for (PlayerVO player : playerBusinessObject.getAllPlayers()) {
                System.out.println("Players' name for this round: [RollNo : "
                        +player.getRollNo()+", Name : "+player.getName()+" ]");
            }
            System.out.println("--------------------- [End] ---------------------");

            System.out.println("---------------- [Test] Strategy ----------------");
            System.out.println(Arrays.toString(Route.provideSuggestions()));
            System.out.println("--------------------- [End] ---------------------");

            //无交互
            System.out.println("---------------- [Test] Facade ----------------");
            Booking book = new Booking();
            for(int i = 0; i < path.length; i++){
                book.book(path[i]);
            }
            System.out.println("--------------------- [End] ---------------------");

            System.out.println("---------------- [Test] Iterator ----------------");
            System.out.println("THE GAME SEQUENCE:");
            for(tj.sse.playItems.route.iterator.Route route = spotsName.getRoute(); route.hasNext();){
                String name=(String)route.next();
                System.out.println("Game Name:"+name);
            }
            System.out.println("--------------------- [End] ---------------------");

            System.out.println("---------------- [Test] Visitor ----------------");
            StampQuidditch sq = new StampQuidditch();
            StampDisplayVisitor sdv=new StampDisplayVisitor();
            sdv.visit(sq);
            System.out.println("--------------------- [End] ---------------------");

            System.out.println("---------------- [Test] Specification ----------------");
            QuidditchGame q =new QuidditchGame();
            q.play(vs02);
            q.play(vs03);
            System.out.println("--------------------- [End] ---------------------");

            System.out.println("---------------- [Test] State ----------------");
            System.out.println("-----Quidditch----");
            QuidditchGame quidditch = new QuidditchGame();
            quidditch.play(vs02);
            quidditch.play(vs03);
            System.out.println("--------------------- [End] ---------------------");

            System.out.println("---------------- [Test] Chain Of Responsibility ----------------");
            System.out.println("----WandGame----");
            WandGame wandGame = new WandGame();
            wandGame.play(vs02);
            wandGame.play(vs03);
            System.out.println("--------------------- [End] ---------------------");

            System.out.println("---------------- [Test] Observer ----------------");
            System.out.println("-----PotionClass------");
            PotionsClass potionClass = new PotionsClass();
            potionClass.play(vs02);
            potionClass.play(vs03);
            System.out.println("--------------------- [End] ---------------------");

            System.out.println("---------------- [Test] Template Method ----------------");
            templatemethod coaster = new templatemethod();
            System.out.println("-----JurassicFlyerscoaster------");
            coaster.playJurassicFlyersCoaster();
            System.out.println("-----DeceptiCoaster----");
            coaster.playDecepticoaster();
            System.out.println("--------------------- [End] ---------------------");

            System.out.println("---------------- [Test] Decorator ----------------");
            System.out.println("-----Robot Game------");
            RobotGame robotGame = new RobotGame();
            robotGame.play(vs02);
            robotGame.play(vs03);

        }
        System.out.println("----------------------------------------[End]---------------------------------------------");

    }





}
