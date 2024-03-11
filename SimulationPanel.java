import javax.swing.JPanel;
import java.awt.Graphics;

public class SimulationPanel extends JPanel {
    private Grid grid;
    
    public SimulationPanel() {
        grid = new Grid(20, 15); // Example grid size
        // Initialize grid, obstacles, and algorithms
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw grid and path here
    }
}
