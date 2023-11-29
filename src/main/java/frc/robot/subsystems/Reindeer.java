// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Reindeer extends SubsystemBase {
  private CANSparkMax motor = new CANSparkMax(Constants.RoboRioConfig.reindeerMotor, MotorType.kBrushed);
  
  /** Creates a new Reindeer. */
  public Reindeer() {}

  public void reindeerStart() {
    this.motor.set(0.25);
  }
  public void reindeerStop() {
    this.motor.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
