package main;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Util;
import net.minecraft.util.text.TranslationTextComponent;

public class Helper {

    public static void outputInfo(String text){
        outputMessage(text);
    }

    public static void outputError(String text){
        outputMessage("[ERROR] " + text);
    }

    private static void outputMessage(String text){
        Minecraft.getInstance().player.sendMessage(new TranslationTextComponent("[YG] " + text), Util.DUMMY_UUID);
    }
}