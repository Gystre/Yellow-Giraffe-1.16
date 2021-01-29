package main.mod;

import main.YellowGiraffe;
import main.handler.Handler;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModHandler implements Handler {
    private LinkedHashMap<String, Mod> mods = new LinkedHashMap<>();

    @Override
    public void init(YellowGiraffe instance){
        //register mods here
        registerMod(new Fullbright(instance));
        //registerMod(new Nofall(instance));
        //registerMod(new Speed(instance));
        //registerMod(new AutoMine(instance));
        //registerMod(new BunnyHop(instance));
        //registerMod(new Step(instance));
        //registerMod(new KillAura(instance));
    }

    private void registerMod(Mod mod){

        this.mods.put(mod.getName(), mod);
    }

    public Map<String, Mod> getMods(){
        return this.mods;
    }
}