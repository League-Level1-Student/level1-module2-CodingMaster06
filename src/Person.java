import javax.swing.JOptionPane;

public class Person {
String name;
String superpower;
public void Taco(String name, String superpower) {
	this.name = name;
	this.superpower = superpower;
}
public String getName() {
	return name;
}
public String getSuperpower() {
	return superpower;
}
public void setName(String name) {
	JOptionPane.showMessageDialog(null, name + " is the name of your superhero!");
}
public void setSuperpower(String superpower) {
	JOptionPane.showMessageDialog(null, superpower + " is the superpower of you superhero!");
}
}
