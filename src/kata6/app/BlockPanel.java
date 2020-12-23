package kata6.app;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import kata6.model.Block;
import kata6.view.BlockDisplay;

public class BlockPanel extends JPanel implements BlockDisplay{
    private static final int SIZE = 100;
    private Block block;
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 700, 700);
        
        g.setColor(Color.BLACK);
        int max = Block.MAX*SIZE;
        for (int i = 0; i <= Block.MAX; i++){
            int d = i*SIZE;
            g.drawLine(d, 0, d, max);
            g.drawLine(0, d, max, d);
        }
        
        if (block == null) return;
        
        g.setColor(Color.RED);
        g.fillRect((block.x()-1)*SIZE, (Block.MAX-block.y()-1)*SIZE, SIZE, SIZE);
    }
    
    @Override
    public Block block(){
        return this.block;
    }
    
    @Override
    public void display(Block block) {
        this.block = block;
        repaint();
    }
    
    @Override
    public void changed(){
        repaint();
    }
}
