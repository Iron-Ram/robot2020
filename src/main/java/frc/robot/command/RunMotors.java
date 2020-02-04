package frc.robot.command;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class RunMotors extends CommandBase {
    private double speed;

    public RunMotors(double speed) {
        addRequirements(RobotContainer.drivetrain);
        this.speed = speed;
    }//sets speed for motor

    @Override
    public void execute() {
        RobotContainer.drivetrain.drive(speed, speed);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}