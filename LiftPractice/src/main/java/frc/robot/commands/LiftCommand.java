package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.*;

public class LiftCommand extends Command{

    public class LiftCommand(){
        requires(robot.liftSubsystem);
    }

    protected boolean isFinished(){
        return false;
    }
}