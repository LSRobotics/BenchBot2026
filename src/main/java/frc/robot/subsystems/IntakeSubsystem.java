
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


import frc.robot.Constants.MotorCANConsants;

public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
    private TalonFX intakeMotor;
    public IntakeSubsystem() {
        intakeMotor = new TalonFX(MotorCANConsants.TALON_B_CAN_ID);
  }

    public void runIntake(double speed) {   

        intakeMotor.set(speed);
    }
  

  /**
   * Example command factory method.
   *
   * @return a command
   */

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
