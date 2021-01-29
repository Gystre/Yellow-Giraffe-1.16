package main.commands;

import main.YellowGiraffe;
import main.handler.Handler;

import java.util.LinkedHashMap;

public class CommandHandler implements Handler {
    private LinkedHashMap<String, Command> commands = new LinkedHashMap<>();

    @Override
    public void init(YellowGiraffe instance){
        registerCommand(new HelpCommand(instance));
        registerCommand(new ToggleCommand(instance));
        registerCommand(new SetCommand(instance));
        registerCommand(new ListCommand(instance));
    }

    public void registerCommand(Command command){
        commands.put(command.getName(), command);
    }

    public LinkedHashMap<String, Command> getCommands() {
        return commands;
    }
}