package main.commands;

import main.YellowGiraffe;

public abstract class Command {
    protected YellowGiraffe instance;
    private final String name;
    private final String description;
    private final String[] syntax;

    public Command(YellowGiraffe instance, String name, String description, String... syntax){
        this.instance = instance;
        this.name = name;
        this.description = description;
        this.syntax = syntax;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String[] getSyntax() {
        return syntax;
    }

    //NOTE: First arg will always be command, [0] = .help
    public abstract void call(String[] args);
}