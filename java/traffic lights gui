import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class signal extends Frame implements ActionListener{
String msg="";
JRadioButton stop,ready,go;
ButtonGroup bg;
public void in(){
bg=new ButtonGroup();
stop=new JRadioButton("Stop");
ready=new JRadioButton("ready");
go=new JRadioButton("go");
stop.setBounds(50,50,100,30);
ready.setBounds(50,100,100,30);
go.setBounds(50,150,100,30);
bg.add(stop);
bg.add(ready);
bg.add(go);
add(stop);
add(ready);
add(go);
stop.addActionListener(this);
ready.addActionListener(this);
go.addActionListener(this);
setSize(600,600);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
repaint();}
public void paint(Graphics g){
g.drawOval(165,40,50,50);
g.drawOval(165,100,50,50);
g.drawOval(165,160,50,50);
if(stop.isSelected()){
g.setColor(Color.red);
g.fillOval(165,40,50,50);}
else if(ready.isSelected()){
g.setColor(Color.yellow);
g.fillOval(165,100,50,50);}
 else if(stop.isSelected()){
g.setColor(Color.green);
g.fillOval(165,160,50,50);}
}
}
public class ex{
public static void main(String args[]){
new signal().in();
}
}
