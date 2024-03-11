import javax.swing.JFrame;

public class MainFrame extends JFrame {
    public MainFrame() {
        this.setTitle("Robot Path Planning Simulator");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new SimulationPanel());
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
