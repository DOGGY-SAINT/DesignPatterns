package tj.sse.playItems.Template;


import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampImplementation;
import tj.sse.playItems.visitor.StampWand;
import tj.sse.playItems.visitor.StampQuidditch;
import tj.sse.playItems.visitor.StampJurassicFlyersCoaster;
import tj.sse.playItems.visitor.StampDecepticoaster;

public class templatemethod {
    public void DecepticoasterBook(){
        System.out.println("——————————————Book Decepticoaster successfully!——————————————\n");
    }
    public void playJurassicFlyersCoasterBook(){
        System.out.println("——————————————Book playJurassicFlyersCoaster successfully!——————————————\n");
    }
    public void playDecepticoaster() {
        {
            templateMethodAbstractClass tm = new Decepticoaster();
            tm.TemplateMethod();
            this.DecepticoasterEnd();
        }
    }
    public void playJurassicFlyersCoaster()
        {

            templateMethodAbstractClass tm = new JurassicFlyersCoaster();
            tm.TemplateMethod();
            this.JurassicFlyersCoasterEnd();
        }
        private void DecepticoasterEnd(){
            StampWand sd = new StampDecepticoaster();
            StampDisplayVisitor sdv=new StampDisplayVisitor();
            sdv.visit(sd);
        }
        private void JurassicFlyersCoasterEnd(){
            StampWand sj = new StampJurassicFlyersCoaster();
            StampDisplayVisitor sdv=new StampDisplayVisitor();
            sdv.visit(sj);
        }
    }


    // 抽象类
    abstract class templateMethodAbstractClass {
        //模板方法
        public void TemplateMethod() {
            checkEquipmentSecurity();
            openTheGate();
            checkSafetyBelt();
            startRollerCoaster();
            removeSeatBelt();
            letTouristOut();
            cleanRollerCoaster();
        }

        //具体方法
        public void openTheGate() {
            System.out.println("Open the Gate.");
        }

        public void checkSafetyBelt() {
            System.out.println("Check safety belt.");
        }

        public void removeSeatBelt() {
            System.out.println("Unload safety belt.");
        }

        public void checkEquipmentSecurity() {
            System.out.println("Check equipment security.");
        }

        public void letTouristOut() {
            System.out.println("Guide tourists leaving.");
        }

        public void cleanRollerCoaster() {
            System.out.println("clean rollercoaster.");
        }

        //抽象方法1
        public abstract void startRollerCoaster();
    }

    //具体子类
    class Decepticoaster extends templateMethodAbstractClass {
        public void startRollerCoaster() {
            System.out.println("Start Decepticoaster.");
        }
    }



    class JurassicFlyersCoaster extends templateMethodAbstractClass {
        public void startRollerCoaster() {
            System.out.println("Start JurassicFlyersCoaster.");
        }

    }
}