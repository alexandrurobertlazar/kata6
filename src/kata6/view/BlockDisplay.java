package kata6.view;

import kata6.model.Block;

public interface BlockDisplay extends Block.Observer{
    public Block block();
    public void display(Block block);
}
