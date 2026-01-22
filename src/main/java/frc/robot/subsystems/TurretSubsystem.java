
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.util.function.DoubleSupplier;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class TurretSubsystem extends SubsystemBase {
  private TalonFX turretMotor = new TalonFX(31);
  public TurretSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setTurretSpeed(double speed) {
    turretMotor.set(speed);
  }

  public void setTurretSpeed(DoubleSupplier speedSupplier) {
    turretMotor.set(speedSupplier.getAsDouble());
  }

}
