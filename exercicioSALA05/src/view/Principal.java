package view;

import controller.MdcController;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		MdcController mdcCont = new MdcController();
		int x = 0;
		int y = 0;		
			
		do {
			try {
				String input = JOptionPane.showInputDialog("insira o X do MDC: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "encerrado");
					System.exit(0);
				}
				x = Integer.parseInt(input);
				if (x <= 0) {
					JOptionPane.showMessageDialog(null, "número inválido");
					continue;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "número inválido");
				continue;
			}
			break;
		} while(true);
		
		do {
			try {
				String input = JOptionPane.showInputDialog("insira o y do MDC: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "encerrado");
					System.exit(0);
				}
				y = Integer.parseInt(input);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "número inválido");
				continue;
			}
			break;
		} while(true);
		JOptionPane.showMessageDialog(null, "O resultado do MDC dos números " + x + " e " + y + " é de = " +mdcCont.MDC(x, y));
	}
}


