package tj.sse.playItems.template;


import tj.sse.playItems.visitor.StampDisplayVisitor;
import tj.sse.playItems.visitor.StampJurassicFlyersCoaster;
import tj.sse.playItems.visitor.StampDecepticoaster;

public class templatemethod {
//    public static void main( String[] args )
 //   {
  //      templateMethodAbstractClass tm = new JurassicFlyersCoaster();
 //       tm.TemplateMethod();
        //this.JurassicFlyersCoasterEnd();
  //  }
    public void DecepticoasterBook(){
        System.out.println("——————————————Book Decepticoaster successfully!——————————————\n");
    }
    public void JurassicFlyersCoasterBook(){
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
            StampDecepticoaster sd = new StampDecepticoaster();
            StampDisplayVisitor sdv=new StampDisplayVisitor();
            sdv.visit(sd);
        }
        private void JurassicFlyersCoasterEnd(){
            StampJurassicFlyersCoaster sj = new StampJurassicFlyersCoaster();
            StampDisplayVisitor sdv=new StampDisplayVisitor();
            sdv.visit(sj);
        }
    }


