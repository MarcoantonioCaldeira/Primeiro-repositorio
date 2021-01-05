import javax.swing.JOptionPane;

public class Calcula{

static int valor1;
static int valor2;
static int soma;


  static void calcula() { 
    soma = valor1 + valor2;
  }
  
  public static void main(String[] args) {
    Calcula.valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
    Calcula.valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
    Calcula.calcula();
    JOptionPane.showMessageDialog(null, "O resultado é " + Calcula.soma);
  }
}