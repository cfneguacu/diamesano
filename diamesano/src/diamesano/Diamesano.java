package diamesano;

import javax.swing.JOptionPane;

public class Diamesano {
	
	public static void main (String args[]){
	String sndata = JOptionPane.showInputDialog("Insira a data de nasimento no modelo (dd/mm/aaaa/)");
	String sadata = JOptionPane.showInputDialog("Insira o dia atual no modelo (dd/mm/aaaa/)");

	//byte[] ndata = sndata.getBytes(); 
	int ndia = Integer.parseInt(sndata.substring(0,1));
	int nmes = Integer.parseInt(sndata.substring(3,4));
	int nano = Integer.parseInt(sndata.substring(6,10));

	//byte[] adata = sadata.getBytes();
	int adia = Integer.parseInt(sadata.substring(0,1));
	int ames = Integer.parseInt(sadata.substring(3,4));
	int aano = Integer.parseInt(sadata.substring(6,10));

	int idade = 0;

	if (ames > nmes){
	idade = (aano - nano);
	} 
	if (ames < nmes){
	idade = ((aano - nano)-1);
	} 
	if (ames == nmes){
	if (adia >= ndia){
	idade = (aano - nano);
	}
	if (adia < ndia){
	idade = ((aano - nano)-1);
	}
	}
	JOptionPane.showMessageDialog(null, "A idade do individuo e " + idade);
	}
}

