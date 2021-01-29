package main.mod;

import main.YellowGiraffe;
import main.settings.Setting;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Mod {
    protected YellowGiraffe instance;

    private int toggleKey = -1;

    private boolean enabled = false;

    private String name;

    private final LinkedHashMap<String, Setting> settings = new LinkedHashMap<>();

    public Mod(YellowGiraffe instance, String name, int toggleKey){
        this.instance = instance;
        this.name = name;
        this.toggleKey = toggleKey;
    }

    public final Map<String, Setting> getSettings(){
        return Collections.unmodifiableMap(settings);
    }

    public final void addSetting(Setting setting){
        String key = setting.getName();

        if(settings.containsKey(key))
            throw new IllegalArgumentException("Duplicate setting: " + name + " " + key);

        settings.put(key, setting);
    }

    public int getToggleKey(){
        return toggleKey;
    }

    public void setEnabled(boolean enabled){
        this.enabled = enabled;
    }

    public boolean isEnabled(){
        return enabled;
    }

    public String getName(){
        return name;
    }

    public void onLivingUpdate(EntityPlayerSP player) {};

    public void onDisable() {};
}