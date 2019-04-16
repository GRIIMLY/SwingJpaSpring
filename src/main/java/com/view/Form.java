package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.entities.Persona;
import com.service.IPersonaService;
import com.util.BeanUtil;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Form extends JFrame {

	private JPanel contentPane;
	private IPersonaService ips;
	private JTable datos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ips = (IPersonaService) BeanUtil.getBeanByName("personaBean");
				loadData();
			}
		});
		btnNewButton.setBounds(94, 215, 244, 35);
		contentPane.add(btnNewButton);
		
		datos = new JTable();
		datos.setBounds(110, 58, 200, 110);
		contentPane.add(datos);
	}
	
	public void loadData() {
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		defaultTableModel.addColumn("Id");
		defaultTableModel.addColumn("Nombre");
		for (Persona  p : ips.findAll()) {
			System.out.println("hola " + p.getNombre());
			defaultTableModel.addRow(new Object[] {
					p.getIdpersona(),
					p.getNombre()
			});
		}
		datos.setModel(defaultTableModel);
		
	}
}
