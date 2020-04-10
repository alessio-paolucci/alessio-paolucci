import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent; 
import java.net.*;

public class HelloGithub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Ciao Github!");
		Label l1,l2;  
	    l1=new Label("Hi, this is my first Github project. It's a trial");  
	    l1.setBounds(10, 0, 400, 100);;  
	    l2=new Label("You can find all my info in my site that will be opened automatically");  
	    l2.setBounds(10,100, 400,30);  
	    f.add(l1); f.add(l2);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	    	    
	   try {
	    	    Desktop.getDesktop().browse(new URL("https://www.alexpaulofficial.com/").toURI());
	    	} catch (Exception e) {}
	    
	    
	    f.addWindowListener(new WindowAdapter() {

	        @Override
	        public void windowClosing(WindowEvent e) {
	            System.exit(0);
	        }
	    });
	    
	    
	}
	
	
}