import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class View implements ActionListener, Observermvc{
	
	private Subject model;
	private controllerInterface controller;
	private String real = "0";
	private String peso = "0";
	
	JFrame frame;
	JPanel panelBotoes;
	JPanel panelDados;
	JPanel panelBr;
	JPanel panelArg;
	JLabel labelBr;
	JLabel labelArg;
	JLabel brText;
	JLabel argText;
	JButton assinar;
	JButton cancelar;
	
	public View(Subject mo, controllerInterface co) {
		this.model = mo;
		this.controller = co;
	}
	
	public void createView() {
		frame = new JFrame("Valores do Dólar US:");
		panelBotoes = new JPanel();
		panelDados = new JPanel();
		panelBr = new JPanel();
		panelArg = new JPanel();
		assinar = new JButton("Assinar");
		cancelar = new JButton("Cancelar Assinatura");
		labelBr = new JLabel();
		labelArg = new JLabel();
		brText = new JLabel("Brasil: BRL");
		argText = new JLabel("Argentina: ARS");
		
		assinar.addActionListener(this);
		cancelar.addActionListener(this);
		
		panelBotoes.add(assinar);
		panelBotoes.add(cancelar);
		panelBr.add(brText);
		panelBr.add(labelBr);
		panelArg.add(argText);
		panelArg.add(labelArg);
		panelDados.add(panelBr);
		panelDados.add(panelArg);
		frame.getContentPane().add(BorderLayout.SOUTH, panelBotoes);
		frame.getContentPane().add(BorderLayout.CENTER, panelDados);
		
		labelBr.setText(real);
		labelArg.setText(peso);
		
		frame.setSize(300, 150);
		frame.setVisible(true);	

	}
	
	public void update(String br, String arg) {
		real = br;
		peso = arg;
		
		display();
	}
	
	public void display() {
		labelBr.setText(real);
		labelArg.setText(peso);
	}
	
	public void habilitarBotaoAssinar(){
		
		assinar.setEnabled(true);
		
	}
	public void desabilitarBotaoAssinar(){
		
		assinar.setEnabled(false);
		
	}
	public void habilitarBotaoCancelar(){
		
		cancelar.setEnabled(true);
		
	}
	public void desabilitarBotaoCancelar(){
		
		cancelar.setEnabled(false);
		
	}
	public void actionPerformed(ActionEvent event){
		if (event.getSource() == assinar){
				controller.assinar();
		}
		if (event.getSource() == cancelar){
				controller.cancelar();
		}
	}
	

}
