package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import frc.robot.Constants.MotorCANConsants;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private TalonFX intakeMotor;
  public IntakeSubsystem() {
    intakeMotor = new TalonFX(MotorCANConsants.TALON_A_CAN_ID);
  }

  public void runIntake(double speed){
    intakeMotor.set(speed);
  }
  /**
   * Example command factory method.
   *
   * @return a command
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
