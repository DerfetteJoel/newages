package dfj.newages.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockWorkbenchAdvanced extends Block {

    public BlockWorkbenchAdvanced() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(3.0f)
        );
        setRegistryName("workbench_advanced");
    }
}
