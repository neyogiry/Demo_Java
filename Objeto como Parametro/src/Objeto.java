
import javax.swing.JOptionPane;

public class Objeto {
int x;
int y;
Objeto(){
}
Objeto(int x, int y){
	this.x=x;
	this.y=y;
}
public void Distancia(Objeto p2){
	double d;
	d=Math.pow((this.x-p2.x),2);
	d=d+ Math.pow((this.y-p2.y),2);
	d=Math.sqrt(d);
	JOptionPane.showMessageDialog(null,"la Distancia es " + d);
}
public void leer(){
	x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese abcisa :"));
	y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese ordenada :"));
}
public static void main (String[]args){
	int r=Integer.parseInt(JOptionPane.showInputDialog("Desea con Argumentos"));
	if (r==0){
	int x, y;
	int x1, y1;
	x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese abcisa 1° coordenada :"));
	y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese ordenada 1° coordenada :"));
	x1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese abcisa 2° coordenada :"));
	y1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese ordenada 2° coordenada :"));
	Objeto p1=new Objeto(x,y);
	Objeto p2=new Objeto(x1,y1);
	p1.Distancia(p2);
	}
	if (r==1){
		Objeto p3=new Objeto();
		Objeto p4=new Objeto();
		p3.leer();
		p4.leer();
		p3.Distancia(p4);
	}
}
}
