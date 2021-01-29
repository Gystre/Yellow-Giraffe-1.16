package main;

import main.commands.CommandHandler;
import main.event.EventHandler;
import main.handler.Handler;
import main.mod.ModHandler;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.ArrayList;
import java.util.List;

public class YellowGiraffe
{
    public static final String MOD_NAME = "YellowGiraffe";
    public static final String MOD_ID = "YellowGiraffe";
    public static final String MOD_VERSION = "1.0";
    public Minecraft mc = Minecraft.getInstance();
    private List<Handler> handlers = new ArrayList<>();

    public ModHandler modHandler;
    public EventHandler eventHandler;
    public CommandHandler commandHandler;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        if(event.getSide() == Side.CLIENT){
            System.out.println("2 ez");
            addHandler(modHandler = new ModHandler());
            addHandler(eventHandler = new EventHandler());
            addHandler(commandHandler = new CommandHandler());
            FMLCommonHandler.instance().bus().register(eventHandler);
            MinecraftForge.EVENT_BUS.register(eventHandler);
        }
    }

    public void addHandler(Handler handler){
        getHandlers().add(handler);
        handler.init(this);
    }

    public List<Handler> getHandlers(){
        return handlers;
    }

}
