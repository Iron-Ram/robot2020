package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.subsystem.Climber;
import frc.robot.subsystem.Drivetrain;
import frc.robot.subsystem.Intake;
import frc.robot.subsystem.Shooter;

public class RobotContainer {
    public static final Drivetrain DRIVETRAIN = new Drivetrain();
    public static final Climber CLIMBER = new Climber();
    public static final Intake INTAKE = new Intake();
    public static final Shooter SHOOTER = new Shooter();
    

    public static XboxController controller = new XboxController(0);
}