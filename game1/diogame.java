import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.SecureCacheResponse;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class diogame extends JFrame  implements ActionListener {
    private JButton l1, b2,reset;
    private int y = 200;
    private int x = 200;
    JLabel text,text2;

    int mv = 40;
    private volatile boolean running = false;

    boolean btnrun = true;

    int score = 0;
    int mainscore = score -10;
    public diogame() {
        setTitle("Key Listener Example");
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);

        l1 = new JButton("");
        l1.setBounds(x, y, 50, 120);
        l1.setBackground(Color.black);

        add(l1);

        b2 = new JButton("Tree:");
        b2.setBounds(800, 200, 80, 30);
        b2.setBackground(Color.BLUE);
        // add(b2);
        text = new JLabel("");
        text.setBounds(900,500, 400,80);
        text.setForeground(Color.blue);
        text.setFont(new Font("Arial",Font.BOLD, 35));
        add(text);

        text2 = new JLabel("");
        text2.setBounds(900,600, 400,80);
        text2.setForeground(Color.RED);
        text2.setFont(new Font("Arial",Font.BOLD, 35));
        add(text2);

        reset = new JButton("Restart");
        reset.setBounds(900,700, 400,80);
        reset.setForeground(Color.red);
        add(reset);
        reset.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource() == reset){
         System.out.println("reset");

         score = 0;

         text.setText("0");
         text2.setText("");
         btnrun = true;
     }
    }

    //THIS IS IMPORTENT
    public void startMovement() {
        new Thread(() -> {
            while (running) {
                x += 50;
                SwingUtilities.invokeLater(() -> l1.setBounds(x, y, 80, 30));
                if(l1.getX() == b2.getX() && l1.getY() == b2.getY()) {
                    System.out.println("Game over : " + score);
                    running = false;
                }




                if(x>1500) {
                    running = false;
                }

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



            }
        }).start();
    }


    public void newtre(int ux) {




        JButton bn= new JButton("");
        bn.setBounds(ux,200,40,50);
        bn.setBackground(Color.red);
        add(bn);


        boolean thisrun = true;

        new Thread(() ->{
            int tx = ux;

            boolean neerun =true;


            while(true) {

                if(btnrun) {
                    int currenttx = tx;

                    SwingUtilities.invokeLater(() -> bn.setBounds(currenttx, 200, 40, 50));

                    if (neerun) {
                        tx -= mv;


                    }


                    if (tx < 100) {
                        score += 10;
                        System.out.println(score);


                        text.setText("" + score);

                        tx = 222222;
                        neerun = false;

                    }

                    if (bn.getX() == l1.getX() && bn.getY() == l1.getY()) {
                        //if(bn.getY() == l1.getY()) {
                        btnrun = false;
                        System.out.println("Game over");

                        text.setBounds(700, 500, 400, 80);
                        bn.setBounds(2222222, 200, 40, 50);
                        text.setText("Your score is : " + "" + score);
                        text2.setText("Game over !!");

                    }


                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }

        }).start();



    }






    public void moretre(int ux) {




        JButton bn= new JButton("");
        bn.setBounds(ux,200,40,70);
        bn.setBackground(Color.blue);
        add(bn);


        boolean thisrun = true;

        new Thread(() ->{
            int tx = ux;

            boolean neerun =true;


            while(btnrun) {
                int currenttx = tx;

                SwingUtilities.invokeLater(()-> bn.setBounds(currenttx,200,40,50));

                if(neerun) {
                    tx-= mv;


                }


                if(tx < 100) {
                    score += 20;
                    System.out.println(score);


                    text.setText(""+score);

                    tx = 222222;
                    neerun = false;

                }

                if(bn.getX() == l1.getX() && bn.getY() == l1.getY() ) {
                    //if(bn.getY() == l1.getY()) {
                    btnrun = false;
                    System.out.println("Game over");

                    text.setBounds(700,500, 400,80);
                    bn.setBounds(2222222,200,40,50);
                    text.setText("Your score is : "+""+score);
                    text2.setText("Game over !!");
                }


                try {
                    Thread.sleep(200);
                }

                catch(InterruptedException e) {
                    e.printStackTrace();
                }



            }

        }).start();



    }


    private void setupKeyBindings() {
        // Get the input and action maps
        InputMap inputMap = l1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = l1.getActionMap();

        // Bind the 'N' key
        inputMap.put(KeyStroke.getKeyStroke(' '), "moveUp");
        actionMap.put("moveUp", new AbstractAction() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Key 'N' pressed - moving up!");
                new Thread(() -> {
                try {
                	y= 100;
                   SwingUtilities.invokeLater(() -> l1.setBounds(x, 100, 50, 90));
                    Thread.sleep(800);
                    y= 200;
                    SwingUtilities.invokeLater(() -> l1.setBounds(x, y, 50, 120));
                } catch (InterruptedException ex) {
                    ex.printStackTrace();}
            }).start();
            }
        });

        // Bind the 'S' key
        inputMap.put(KeyStroke.getKeyStroke('s'), "moveDown");
        actionMap.put("moveDown", new AbstractAction() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Key 'S' pressed - moving down!");
                text.setText("Key 'S' pressed!");
                y += 20; // Move the button down
                l1.setBounds(x, y, 50, 120);
            }
        });
    }


    public static void main(String[] args) {
        diogame keyList = new diogame();



        int nums = 10;
 keyList.setupKeyBindings();





        while(true) {

            keyList.newtre(1400);

            try {
                Thread.sleep(2000);
            }

            catch(InterruptedException e) {
                e.printStackTrace();
            }

            keyList.moretre(2000);

            try {
                Thread.sleep(1000);
            }

            catch(InterruptedException e) {
                e.printStackTrace();
            }



        }






    }
}