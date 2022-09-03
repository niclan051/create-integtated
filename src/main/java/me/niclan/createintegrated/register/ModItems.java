package me.niclan.createintegrated.register;

import com.simibubi.create.AllItems;
import com.simibubi.create.foundation.data.CreateRegistrate;
import me.niclan.createintegrated.BuildConfig;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItems {
    public static CreativeModeTab itemGroup = new CreativeModeTab(BuildConfig.MODID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AllItems.WRENCH.get());
        }
    };

    public static void register(CreateRegistrate registrate) {
        registrate.creativeModeTab(()->itemGroup, BuildConfig.DISPLAY_NAME);
    }
}
