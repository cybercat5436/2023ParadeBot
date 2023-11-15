// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.util.prefs.BackingStoreException;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class TankChassis extends SubsystemBase {
  
  private CANSparkMax frontLeft = new CANSparkMax(Constants.RoboRioConfig.frontLeft, MotorType.kBrushless);
  private CANSparkMax frontRight = new CANSparkMax(Constants.RoboRioConfig.frontRight, MotorType.kBrushless);
  private CANSparkMax backLeft = new CANSparkMax(Constants.RoboRioConfig.backLeft, MotorType.kBrushless);
  private CANSparkMax backRight = new CANSparkMax(Constants.RoboRioConfig.backRight, MotorType.kBrushless);



  /** Creates a new TankChassis. */
  public TankChassis() {
    frontRight.setInverted(true);
    backRight.setInverted(true);
  }


  public void drive(double speed) {
    frontLeft.set(speed);
    frontRight.set(speed);
    backLeft.set(speed);
    backRight.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
