package ru.JavaRush.JavaCore.LvL13.lec11.BattlesRobots;

public abstract class AbstractRobot implements Defensable, Attackable {

    @Override
    public BodyPart attack() {
        BodyPart leg = BodyPart.LEG;
        BodyPart arm = BodyPart.ARM;
        if (AbstractRobot.this.name.)
        return ;
    }

    @Override
    public BodyPart defense() {
        BodyPart head = BodyPart.HEAD;
        BodyPart chest = BodyPart.CHEST;
        return null;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractRobot(String name) {
        this.name = name;
    }
}
