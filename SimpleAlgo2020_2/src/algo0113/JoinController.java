package algo0113;

import javax.swing.JFrame;



public class JoinController {


	    private JoinView view;
	    private MemberDAO model;

	    public JoinController(JoinView view){
	        this.view = view;
	        model = MemberDAO.getInstance();
	    }

	    public void joinProcess(String name, String userid, String userpwd, String address, String email){
//	        model.setUsername(username);
//	        model.getCredentials();
	    	int result = model.insertMember(name, userid, userpwd, address, email);
	        if(result == 1){
	            view.setErrorMessage("Login Success!");
	            // 여기서 main으로 이동해야 함. 
	            Main_View toMain = new Main_View();
	            toMain.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	            toMain.setUndecorated(false);
	            view.setVisible(false);
	            toMain.setVisible(true);
	            
	        }
	        else if(result == 0){
	            view.setErrorMessage("Wrong password");
	        } 
	        else if(result == -1) {
	        	 view.setErrorMessage("Do not exits userid");
	        }
	    }

		
	}