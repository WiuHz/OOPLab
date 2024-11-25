import java.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPanel{
    private int x;
    private int y;
    private final int SIZE;
    private Timer time;
    public int height;
    public int width;
    public int setHeight(){
        this.height = height;
    }
    public int setWidth(){
        this.width = width;
    }
    public void getHeight(int height){
        return height;
    }
    public void getWidth(int width){
        return width;
    }
}

public class ActionListener{
    public void actionPaint(ActionEvent e){
        repaint();
    }
}

public class KeyListener{
    private int a;
    public void keyPress(KeyEvent e){
        switch(e.getKeyCode()){
            case KeyEvent.VK_W{
                y = Math.max(0, y-a);
                break;
            }
            case KeyEvent.VK_A{
                y = Math.max(0, x-a);
                break;
            }
            case KeyEvent.VK_S{
                y = Math.min(getHeight() - SIZE, y);
                break;
            }
            case KeyEvent.VK_D{
                y = Math.min(getWidth() - SIZE, x);
                break;
            }
        }
        repaint();
    }
    public void keyReleased(KeyEvent e){
    }
    public void keyTyped(KeyEvent e){
    }
}

public class KeyBoard implements ActionListener, KeyListener extends JPanel{
    public KeyBoard(){
        setFocusable(true);
        addKeyListener(this);
    }

    public static void main(String[] args){
        JFrame jframe = new JFrame("KeyBoard");
        jframe.setSize(x, y);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
        KeyBoard keyboard = new KeyBoard();
        jframe.add(keyboard);
    }
}