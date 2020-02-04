/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  /**
   * Creates a new Shooter.
   */
  private static WPI_VictorSPX shooterMotorOne;
  private static WPI_VictorSPX shooterMotorTwo;
  
  private Shooter() {
    shooterMotorOne = new WPI_VictorSPX(6);
    shooterMotorTwo = new WPI_VictorSPX(7);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
