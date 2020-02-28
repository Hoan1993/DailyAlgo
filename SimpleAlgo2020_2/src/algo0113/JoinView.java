package algo0113;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class JoinView extends JFrame{
	private static JoinView view = new JoinView();
	
	
    private static final long serialVersionUID = 3566038652320101414L;
    
    private JTextField txtUserRealName;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JTextField txtUserAddress;
    private JTextField txtUserEmail;
    
    private JButton btnLogin;
   // private JButton btnJoin;
    private JLabel lblErrorMessage;
    private MemberDAO mDao;
    private MemberVO mVo;
    public JoinView() {
    	mVo = new MemberVO(); 
        setTitle("Login");
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setUndecorated(false);
        //setBounds(100, 100, 400, 250);
        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);

        
        JLabel lblUserRealName = new JLabel("Name :");
        lblUserRealName.setHorizontalAlignment(SwingConstants.RIGHT);
        lblUserRealName.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblUserRealName.setBounds(10, 11, 120, 25);
        contentPane.add(lblUserRealName);
        
        txtUserRealName = new JTextField();
        txtUserRealName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtUserRealName.setBounds(140, 11, 200, 25);
        contentPane.add(txtUserRealName);
        
        mVo.setName(txtUserRealName.getText());
        String name = txtUserRealName.getText();
        
        
        JLabel lblUsername = new JLabel("Userid :");
        lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
        lblUsername.setBounds(10, 52, 120, 25);
        contentPane.add(lblUsername);

        txtUsername = new JTextField();
        txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtUsername.setBounds(140, 52, 200, 25);
        contentPane.add(txtUsername);
        mVo.setUserid(txtUsername.getText());
        String userid = txtUsername.getText();
        

        JLabel lblPassword = new JLabel("Password :");
        lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPassword.setBounds(10, 93, 120, 25);
        contentPane.add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtPassword.setBounds(140, 93, 200, 25);
        contentPane.add(txtPassword);
        mVo.setUserpwd(new String(txtPassword.getPassword()));
        String userpwd = new String(txtPassword.getPassword());
        
        
        JLabel lblAddress = new JLabel("Address :");
        lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
        lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblAddress.setBounds(10, 134, 120, 25);
        contentPane.add(lblAddress);

        txtUserAddress = new JTextField();
        txtUserAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtUserAddress.setBounds(140, 134, 200, 25);
        contentPane.add(txtUserAddress);
        mVo.setAddress(txtUserAddress.getText());
        String address = txtUserAddress.getText();
        
        
        JLabel lblUserEmail = new JLabel("Email :");
        lblUserEmail.setHorizontalAlignment(SwingConstants.RIGHT);
        lblUserEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblUserEmail.setBounds(10, 175, 120, 25);
        contentPane.add(lblUserEmail);

        txtUserEmail = new JTextField();
        txtUserEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtUserEmail.setBounds(140, 175, 200, 25);
        contentPane.add(txtUserEmail);
        mVo.setEmail(txtUserEmail.getText());
        String email = txtUserEmail.getText();

        // 로그인 버튼
        JoinController controller = new JoinController(this);
        btnLogin = new JButton("Join");
        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                mDao = MemberDAO.getInstance();
                int result = mDao.insertMember(mVo);
                if(result == 1) {
                	JOptionPane.showInputDialog("회원가입 성공");
                } else {
                	JOptionPane.showInputDialog("회원가입 실패");
                }
            }
        });
        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnLogin.setBounds(251, 216, 89, 25);
        contentPane.add(btnLogin);
        
        
        

        // 회원가입 버튼  
  /*      JButton btnJoin = new JButton("Join");
        btnJoin.addActionListener(new JoinListener());*/
        
        /*btnJoin = new JButton("Join");
        btnJoin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controller.joinMember();
				
			}
		});
		*/
/*        btnJoin.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnJoin.setBounds(150, 93, 89, 25);
        contentPane.add(btnJoin);*/
        
      
        lblErrorMessage = new JLabel("");
        lblErrorMessage.setHorizontalAlignment(SwingConstants.RIGHT);
        lblErrorMessage.setForeground(Color.RED);
        lblErrorMessage.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblErrorMessage.setBounds(10, 151, 330, 25);
        contentPane.add(lblErrorMessage);
    }
    
/*    class JoinListener implements ActionListener {
    	
    	
		@Override
		public void actionPerformed(ActionEvent e) {
			LoginController controller = new LoginController(this);
			controller.joinMember();
			JoinView join = new JoinView();
			view.setVisible(false);
			join.setVisible(true);
			
		}
    
    }*/
    

    public void setErrorMessage(String errorMessage) {
        lblErrorMessage.setText(errorMessage);
    }

    public static void main(String args[]){
        view.setVisible(true);
    }

	
}
