import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class Display extends JFrame implements ActionListener{
  private JPanel panel, center_panel, bottom_panel;
  private DefaultTableModel dtm;
  private String[] selector = {"1", "2", "3", "4", "5", "6"};
  private JComboBox<String> left_box, center_box, right_box;
  private JButton judge;
  private JTable result_table;
  private JScrollPane sc;
  private JFrame frame;
  private Game game = new Game();
  

  public Display(){

    frame = new JFrame("CodeBreaker");

    panel = new JPanel(new BorderLayout());
    center_panel = new JPanel();
    bottom_panel = new JPanel();

    dtm = new DefaultTableModel();
    dtm.addColumn("1");
    dtm.addColumn("2");
    dtm.addColumn("3");
    dtm.addColumn("HIT");
    dtm.addColumn("Blow");

    result_table = new JTable(dtm);
    result_table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    sc = new JScrollPane(result_table, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    center_panel.add(sc);

    left_box = new JComboBox<String>(selector);
    left_box.setActionCommand("0");
    left_box.addActionListener(this);
    bottom_panel.add(left_box);

    center_box = new JComboBox<String>(selector);
    center_box.setActionCommand("1");
    center_box.addActionListener(this);
    bottom_panel.add(center_box);

    right_box = new JComboBox<String>(selector);
    right_box.setActionCommand("2");
    right_box.addActionListener(this);
    bottom_panel.add(right_box);

    judge = new JButton("JUDGE");
    judge.addActionListener(this);
    judge.setActionCommand("JUDGE");
    bottom_panel.add(judge);

    panel.add(center_panel, BorderLayout.CENTER);
    panel.add(bottom_panel, BorderLayout.SOUTH);
    frame.getContentPane().add(panel);//ここの理解
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(100, 100, 500, 500);
    frame.pack();//ここの理解
    frame.setTitle(game.getTitle());
    frame.setVisible(true);

    JOptionPane.showMessageDialog(this, game.getRule(), game.getTitle(), JOptionPane.INFORMATION_MESSAGE);

  }
  public void actionPerformed(ActionEvent e){
    System.out.println(e.getActionCommand());
    if(e.getActionCommand().equals("JUDGE")){
      game.judge();
      boolean judge = game.judge();
      int[] ans = game.getAnswer();
      System.out.println("答え");
      for (int i = 0; i < ans.length; i++) {
         System.out.print(ans[i]);
      }
      System.out.println();
      System.out.println("入力");
      int[] input = game.getInput();
      for (int i = 0; i < input.length; i++) {
        System.out.print(input[i]);
      }
      System.out.println();
      System.out.println("hit:" + game.getHit()
        + " blow:" + game.getBlow());

      Object[] row = new Object[5];
      for(int i=0;i<game.getNumberOfAnswer();i++){
        row[i] = Integer.valueOf(input[i]);
      }
      row[3] = game.getHit();
      row[4] = game.getBlow();
      dtm.addRow(row);
      if(judge){
        JOptionPane.showMessageDialog(this, "おめでとう");
      }

    }else if(e.getActionCommand().equals("0")){
      int input = Integer.parseInt(e.getActionCommand());
      game.inputAnswer(input, (String)left_box.getSelectedItem());
    }else if(e.getActionCommand().equals("1")){
      int input = Integer.parseInt(e.getActionCommand());
      game.inputAnswer(input, (String)center_box.getSelectedItem());
    }else if(e.getActionCommand().equals("2")){
      int input = Integer.parseInt(e.getActionCommand());
      game.inputAnswer(input, (String)right_box.getSelectedItem());
    }else{
      throw new NullPointerException("値が不適切です");
    }
  }
}