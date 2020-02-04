package frc.robot.command;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class TeleOPDrive extends CommandBase {

    public TeleOPDrive() {
        addRequirements(RobotContainer.drivetrain);
    }

    @Override
    public void execute() {
        RobotContainer.drivetrain.arcadeDrive(RobotContainer.controller.getRawAxis(1), 
        RobotContainer.controller.getRawAxis(4));
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}