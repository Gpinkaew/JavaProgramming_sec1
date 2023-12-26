import javax.swing.*;
public class Example601 {

	public static void main(String[] args) {
		inputEmail();

	}
	public static boolean checkEmail(String email) {
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return true;
		}
		return false;
	}
	public static void inputEmail() {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail:");
		while(inputEmail.startsWith("@")||inputEmail.startsWith(" ")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail,again : ");
			}
		
		boolean validateEmail = checkEmail(inputEmail);
		if (validateEmail==true) {
			JOptionPane.showMessageDialog(null,"your e-mail is " + inputEmail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your email is not hotmail or gmail dot com");
		}
	}

}
