package frc.robot.subsystem;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    private WPI_TalonSRX leftMaster;
    private WPI_TalonSRX rightMaster;

    public Drivetrain() {
        leftMaster = new WPI_TalonSRX(4);

        rightMaster = new WPI_TalonSRX(3);

        WPI_VictorSPX leftFollower = new WPI_VictorSPX(2);
        leftFollower.follow(leftMaster);

        WPI_VictorSPX rightFollower = new WPI_VictorSPX(1);
        rightFollower.follow(rightMaster);

        leftMaster.setInverted(true);
        leftFollower.setInverted(InvertType.FollowMaster);
    }

    public void drive(double left, double right) {
        leftMaster.set(left);
        rightMaster.set(right);
    }

    public void driveQuart(double left, double right) {
        drive(Math.pow(left, 3), Math.pow(right, 3));
    }

    public void arcadeDrive(double y, double turn) {
        drive(Math.pow(y, 3) - turn, Math.pow(y, 3) + turn);
    }
}
