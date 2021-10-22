package tj.sse.playItems.Template;

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
