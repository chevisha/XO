package pavel;

import javax.swing.JButton;

public class BetterButton extends JButton{
	int i,j;
	BetterButton(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	int geti()
	{
		return this.i;
	}
	int getj()
	{
		return this.j;
	}
}
