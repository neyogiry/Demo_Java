import java.util.Vector;
import javax.swing.JOptionPane;

public class Vectores {
int x;
int y;
String z;
Vector v;

Vectores(int x,int y,String z, Vector v){
this.x=x;
this.y=y;
this.z=z;
this.v=v;
}

public void leendo(Vector v) {
v.add(x);
v.insertElementAt(y, 1);
v.add(z);
	
}
public void mostrar(){
for (int i=0;i<v.size();i++){
JOptionPane.showMessageDialog(null,i+" = "+v.get(i));
}
}
        
	public static void main (String []args){
	Vector v=new Vector();
        Vectores p=new Vectores(3,7, "Neyo",v);
        p.leendo(v);
        p.mostrar();
	}
}