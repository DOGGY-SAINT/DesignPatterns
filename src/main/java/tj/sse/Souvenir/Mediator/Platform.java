//Author: Yang Jing
//Date：2021.10.18

package tj.sse.Souvenir.Mediator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Platform {
    public void start(){
        System.out.println("——————————————Welcome to the souvenir sales platform——————————————\n");
    };
    public void chat() {
        Medium md = new SouvenirMedium();
        Customer member1, member2;
        member1 = new Seller("Seller");
        member2 = new Buyer("Buyer");
        md.register(member1); //客户注册
        md.register(member2);
    };
}





