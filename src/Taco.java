import javax.swing.JOptionPane;

public class Taco {
String meat;
String sauce;
public void Taco(String meat, String sauce) {
	this.meat = meat;
	this.sauce = sauce;
}
public String getMeat() {
	return meat;
}
public String getSauce() {
	return sauce;
}
public void setMeat(String meat) {
	JOptionPane.showMessageDialog(null, meat + " is the meat on your taco!");
}
public void setSauce(String sauce) {
	JOptionPane.showMessageDialog(null, sauce + " is the sauce on your taco!");
}
}
