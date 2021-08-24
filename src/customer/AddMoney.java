package e_post;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddMoney
{
    JDialog newdialog = new JDialog();
    
    Color background_Color = new Color(34,34,45);
    Color on_background_Color = new Color(254,254,254);
    Color primary_Color = new Color(71,63,145);
    
    JLabel addMoney_pbank_name;
    JLabel addMoney_username;
    JLabel addMoney_amount;
    JLabel addMoney_password;
    
    JTextField addMoney_pbank_name_info;
    JTextField addMoney_username_info;
    JTextField addMoney_amount_info;
    JTextField addMoney_password_info;
    
    JButton addMoney_btn_confirm;

    public AddMoney() 
    {
        newdialog.setBounds(375,50, 600,700);
        newdialog.setLayout(null);

        JLabel e_payment_auth = new JLabel("Add Money");
        e_payment_auth.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_auth.setBounds(220, 30, 187, 30);
        e_payment_auth.setForeground(on_background_Color);
        newdialog.add(e_payment_auth);
        
        addMoney_pbank_name = new JLabel("Bank Name");
        addMoney_username = new JLabel("Username");
        addMoney_amount = new JLabel("Amount");
        addMoney_password = new JLabel("Password");
        
        addMoney_pbank_name_info = new JTextField();
        addMoney_username_info = new JTextField();
        addMoney_amount_info = new JTextField();
        addMoney_password_info = new JTextField();
        
        addMoney_btn_confirm = new JButton("Confirm");
        
        addMoney_pbank_name.setBounds(135, 120, 200, 20);
        addMoney_username.setBounds(135, 210, 200, 20);
        addMoney_amount.setBounds(135, 300, 200, 20);
        addMoney_password.setBounds(135, 390, 200, 20);
        
        addMoney_pbank_name_info.setBounds(135, 160, 310, 30);
        addMoney_username_info.setBounds(135, 250, 310, 30);
        addMoney_amount_info.setBounds(135, 340, 310, 30);
        addMoney_password_info.setBounds(135, 440, 310, 30);
        
        addMoney_btn_confirm.setBounds(220, 540, 150, 40);
        
        addMoney_pbank_name.setForeground(on_background_Color);
        addMoney_username.setForeground(on_background_Color);
        addMoney_amount.setForeground(on_background_Color);
        addMoney_password.setForeground(on_background_Color);
        
        addMoney_pbank_name_info.setForeground(background_Color);
        addMoney_username_info.setForeground(background_Color);
        addMoney_amount_info.setForeground(background_Color);
        addMoney_password_info.setForeground(background_Color);
        
        addMoney_btn_confirm.setForeground(on_background_Color);
        
        addMoney_pbank_name.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        addMoney_username.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        addMoney_amount.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        addMoney_password.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        
        newdialog.add(addMoney_pbank_name);
        newdialog.add(addMoney_username);
        newdialog.add(addMoney_amount);
        newdialog.add(addMoney_password);
        newdialog.add(addMoney_pbank_name_info);
        newdialog.add(addMoney_username_info);
        newdialog.add(addMoney_amount_info);
        newdialog.add(addMoney_password_info);
        newdialog.add(addMoney_btn_confirm);
        
        //auth_password_info.setColumns(10);

        addMoney_btn_confirm.setBackground(primary_Color);
        addMoney_btn_confirm.setBorder(null);
        
        addMoney_btn_confirm.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(null, "Money has been transfered successfully");
                newdialog.dispose();
            }
                        
        });

        newdialog.getContentPane().setBackground(background_Color);
        newdialog.setVisible(true);

    }
    
}
