import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Display implements ActionListener{
  JFrame disp;
  JPanel top_panel;
  JPanel mid_panel;
  JPanel bottom_panel;
  JButton btn_high;
  JButton btn_low;
  JLabel msg_label;
  JLabel parent_lbl, parent_suit_lbl, parent_no_lbl;
  JLabel child_lbl, child_suit_lbl, child_no_lbl;
  Player parent, child;


  public Display(Player par, Player chi){
    parent = par;
    child = chi;

    disp = new JFrame("HIGH & LOW");
    disp.setSize(500, 300);
    disp.setLocationRelativeTo(null);
    disp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    disp.setVisible(true);
    
    //トップパネルの表示
    top_panel = new JPanel();
    setPanel(top_panel, Color.ORANGE, null, new Dimension(480, 50));
    disp.add(top_panel, BorderLayout.NORTH);

    msg_label = new JLabel("一発勝負!HIGHかLOWか当ててください");
    top_panel.add(msg_label);
    setLabelFont(msg_label, Color.BLACK, 0, 15, 480, 20, 20, false);

    //ミドルパネルの表示
    mid_panel = new JPanel();
    setPanel(mid_panel, Color.CYAN, null, new Dimension(480, 180));
    disp.add(mid_panel, BorderLayout.CENTER);

    //親カードの表示
    parent_lbl = new JLabel("私のカード");
    parent_suit_lbl = new JLabel(getSuitIcon(parent.getSuit()));
    parent_no_lbl = new JLabel(getNoStr(parent.getNo()));

    mid_panel.add(parent_lbl);
    mid_panel.add(parent_suit_lbl);
    mid_panel.add(parent_no_lbl);

    //ラベルのフォント設定=>カード情報の表示位置やサイズを決められる
    setLabelFont(parent_lbl, Color.BLACK, 90, 10, 100, 20, 14, false);
    setLabelFont(parent_suit_lbl, Color.WHITE, 100, 10, 80, 100, 16, false);
    setLabelFont(parent_no_lbl, Color.WHITE, 100, 35, 80, 100, 16, true);

    child_lbl = new JLabel("あなたのカード");
    child_suit_lbl = new JLabel("");
    child_no_lbl = new JLabel("?");

    mid_panel.add(child_lbl);
    mid_panel.add(child_suit_lbl);
    mid_panel.add(child_no_lbl);

    setLabelFont(child_lbl, Color.WHITE, 265, 10, 150, 20, 14, false);
    setLabelFont(child_suit_lbl, Color.LIGHT_GRAY, 300, 10, 80, 100, 16, false);
    setLabelFont(child_no_lbl, Color.LIGHT_GRAY, 300, 35, 80, 100, 16, true);

    bottom_panel = new JPanel();
    setPanel(bottom_panel, Color.LIGHT_GRAY, new BorderLayout(), new Dimension(480, 50));
    disp.add(bottom_panel, BorderLayout.SOUTH);

    //HIGHボタンの設置
    btn_high = new JButton("HIGH");
    setButton(btn_high, this, 240, 50, 20);
    bottom_panel.add(btn_high, BorderLayout.WEST);

    //LOWボタンの設置
    btn_low = new JButton("LOW");
    setButton(btn_low, this, 240, 50, 20);
    bottom_panel.add(btn_low, BorderLayout.EAST);

    disp.setVisible(true);
  }

  public void actionPerformed(ActionEvent e){
    String cmd = e.getActionCommand();
    int child_no = child.getNo();
    int child_suit = child.getSuit();
    int parent_no = parent.getNo();

    //子のカードをオープン
    child_no_lbl.setBackground(Color.WHITE);
    child_no_lbl.setText(getNoStr(child_no));
    child_suit_lbl.setBackground(Color.WHITE);
    child_suit_lbl.setText(getSuitIcon(child_suit));

    if(cmd.equals("HIGH")){
      btn_high.setBackground(Color.GREEN);
      if(parent_no < child_no){
        msg_label.setText("大正解!あなたの勝ちです");
      }else if(parent_no > child_no){
        msg_label.setText("残念!あなたの負けです");
      }else{
        msg_label.setText("同じです!ドロー");
      }
    }else if(cmd.equals("LOW")){
      btn_low.setBackground(Color.GREEN);
      if(parent_no < child_no){
        msg_label.setText("残念!あなたの負けです");
      }else if(parent_no > child_no){
        msg_label.setText("大正解!あなたの勝ちです");
      }else{
        msg_label.setText("同じです!ドロー");
      }
    }
    return;
  }


  public static void setPanel(JPanel panel, Color color, BorderLayout layout, Dimension dimension){
    panel.setBackground(color);
    panel.setLayout(layout);
    panel.setPreferredSize(dimension);
    return;
  }
  
  public static void setLabelFont(JLabel label, Color color, int x_pos, int y_pos, int x_size, int y_size, int strSize, boolean opq){
    label.setBackground(color);
    label.setLocation(x_pos, y_pos);
    label.setSize(x_size, y_size);
    label.setFont(new Font("MS ゴジック", Font.PLAIN, strSize));
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setVerticalAlignment(JLabel.CENTER);
    label.setOpaque(opq);
    return;
  }

  public static void setButton(JButton btn, ActionListener al, int x_size, int y_size, int strSize){
    btn.setPreferredSize(new Dimension(x_size, y_size));
    btn.setFont(new Font("MS ゴシック", Font.PLAIN, strSize));
    btn.addActionListener(al);
    return;
  }

  public static String getSuitIcon(int suit){


    switch(suit){
      case 0:
        return "♡";

      case 1:
        return "♤";

      case 2:
        return "♢";

      case 3:
        return "♧";

      default:
        return null;
    }
  }

  public static String getNoStr(int no){
    switch(no){
      case 1:
      return "A";

      case 11:
      return "J";

      case 12:
      return "Q";

      case 13:
      return "K";

      default:
      return String.valueOf(no);
    }
  }
}