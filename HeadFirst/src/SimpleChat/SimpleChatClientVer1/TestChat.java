package SimpleChat.SimpleChatClientVer1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class TestChat {
    JTextField outgoing;
    PrintWriter writer;
    Socket sock;

    public void go(){
        JFrame frame = new JFrame("Simple Chat Client");
        JPanel mainPanel = new JPanel();
        outgoing = new JTextField(20);


        JButton sendButton = new JButton("Send");
        //sendButton.addActionListener(new SendButtonListener());
        sendButton.addActionListener((e)->{
            try {
                writer.println(outgoing.getText());
                writer.flush();
            }catch (Exception ex){ex.printStackTrace();}
            outgoing.setText("");
            outgoing.requestFocus();
        });

        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        setUpNetworking();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }
    private void setUpNetworking(){
        try{
            sock = new Socket("127.0.0.1", 5000);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("networking established");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
  /*  public class SendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                writer.println(outgoing.getText());
                writer.flush();
            }catch (Exception ex){
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

   */

    public static void main(String[] args) {
        new SimpleChatClientVer1().go();
    }
}
