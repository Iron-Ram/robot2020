package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystem.Drivetrain;

public class RobotContainer {
    public static Drivetrain drivetrain = new Drivetrain();

    public static XboxController controller = new XboxController(0);
}