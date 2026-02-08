
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ActuatorSubsystem extends SubsystemBase {
    private Servo s;;
  public ActuatorSubsystem(int pwmPort) {
    s = new Servo(pwmPort);
    // setBounds(2.0, 1.8, 1.5, 1.2, 1.0); in ms
    s.setBoundsMicroseconds((int)(2.0*1000), (int)(1.8*1000), (int)(1.5*1000), (int)(1.2*1000), (int)(1.0*1000));
  }

  public void run(double speed) {
    s.setSpeed(speed);
  }

  public void run(DoubleSupplier speed) {
    s.setSpeed(speed.getAsDouble());
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
