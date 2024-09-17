package sladki.tfc.ab.Handlers.Anvil;

import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Crafting.AnvilManager;
import com.bioxx.tfc.api.Crafting.AnvilRecipe;
import com.bioxx.tfc.api.Crafting.AnvilReq;
import com.bioxx.tfc.api.Events.AnvilCraftEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import sladki.tfc.ab.Items.Armor.ItemRoundShield;

import static com.bioxx.tfc.api.Constant.Global.SKILL_ARMORSMITH;

public class AnvilCraftEventHandler {
    @SubscribeEvent
    public void onAnvilCraftEvent(AnvilCraftEvent event) {
        if(event.result != null &&event.entity instanceof EntityPlayer && event.result.getItem() instanceof ItemRoundShield) {
            AnvilManager.setDurabilityBuff(event.result, TFC_Core.getSkillStats((EntityPlayer) event.entity).getSkillMultiplier(SKILL_ARMORSMITH));
        }
    }

}
