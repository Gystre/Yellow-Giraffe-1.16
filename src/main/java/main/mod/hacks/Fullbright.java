package main.mod.hacks;

/*
Description:
This will make the ingame brightness very high so that you can see everything
 */

import main.YellowGiraffe;
import main.mod.Mod;

public class Fullbright extends Mod {
    public Fullbright(YellowGiraffe instance){
        super(instance, "fullbright", -1);
    }

    @Override
    public void onLivingUpdate(EntityPlayerSP player){
        instance.mc.gameSettings.gamma = 16;
    }

    @Override
    public void onDisable(){
        instance.mc.gameSettings.gamma = 1;
    }
}