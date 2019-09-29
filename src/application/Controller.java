package application;



import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

	@FXML
	Button btnRong;
	
	@FXML
	Button btn1;
	
	@FXML
	Button btn2;
	
	@FXML
	Button btn3;
	
	@FXML
	Button btn4;
	
	@FXML
	Button btn5;
	
	@FXML
	Button btn6;
	
	@FXML
	Button btn7;
	
	@FXML
	Button btn8;
	
	@FXML
	private void btnRong()
	{
		String bRong = btnRong.getText();
		if(btn1.getText().equals(""))
		{
			btn1.setText(bRong);
			btnRong.setText("");
		}
		else if(btn3.getText().equals(""))
		{
			btn3.setText(bRong);
			btnRong.setText("");
		}
		
	}
	
	@FXML
	private void btn1()
	{
		String b1 = btn1.getText();
		if(btnRong.getText().equals(""))
		{
			btnRong.setText(b1);
			btn1.setText("");
		}
		else if(btn2.getText().equals(""))
		{
			btn2.setText(b1);
			btn1.setText("");
		}
		else if(btn4.getText().equals(""))
		{
			btn4.setText(b1);
			btn1.setText("");
		}
			
	}
	
	@FXML
	private void btn2()
	{
		String b2 = btn2.getText();
		if(btn1.getText().equals(""))
		{
			btn1.setText(b2);
			btn2.setText("");
		}
		else if(btn5.getText().equals(""))
		{
			btn5.setText(b2);
			btn2.setText("");
		}
	}
	
	@FXML
	private void btn3()
	{
		String b3 = btn3.getText();
		if(btnRong.getText().equals(""))
		{
			btnRong.setText(b3);
			btn3.setText("");
		}
		else if(btn4.getText().equals(""))
		{
			btn4.setText(b3);
			btn3.setText("");
		}
		else if(btn6.getText().equals(""))
		{
			btn6.setText(b3);
			btn3.setText("");
		}
		
	}
	
	@FXML
	private void btn4()
	{
		String b4 = btn4.getText();
		if(btn1.getText().equals(""))
		{
			btn1.setText(b4);
			btn4.setText("");
		}
		else if(btn3.getText().equals(""))
		{
			btn3.setText(b4);
			btn4.setText("");
		}
		else if(btn5.getText().equals(""))
		{
			btn5.setText(b4);
			btn4.setText("");
		}
		else if(btn7.getText().equals(""))
		{
			btn7.setText(b4);
			btn4.setText("");
		}
	}
	
	@FXML
	private void btn5()
	{
		String b5 = btn5.getText();
		if(btn2.getText().equals(""))
		{
			btn2.setText(b5);
			btn5.setText("");
		}
		else if(btn4.getText().equals(""))
		{
			btn4.setText(b5);
			btn5.setText("");
		}
		else if(btn8.getText().equals(""))
		{
			btn8.setText(b5);
			btn5.setText("");
		}
	}
	
	@FXML
	private void btn6()
	{
		String b6 = btn6.getText();
		if(btn3.getText().equals(""))
		{
			btn3.setText(b6);
			btn6.setText("");
		}
		else if(btn7.getText().equals(""))
		{
			btn7.setText(b6);
			btn3.setText("");
		}
	}
	
	@FXML
	private void btn7()
	{
		String b7 = btn7.getText();
		if(btn4.getText().equals(""))
		{
			btn4.setText(b7);
			btn7.setText("");
		}
		else if(btn6.getText().equals(""))
		{
			btn6.setText(b7);
			btn7.setText("");
		}
		else if(btn8.getText().equals(""))
		{
			btn8.setText(b7);
			btn7.setText("");
		}
	}
	
	@FXML
	private void btn8()
	{
		String b8 = btn8.getText();
		if(btn5.getText().equals(""))
		{
			btn5.setText(b8);
			btn8.setText("");
		}
		else if(btn7.getText().equals(""))
		{
			btn7.setText(b8);
			btn8.setText("");
		}
	}
}
