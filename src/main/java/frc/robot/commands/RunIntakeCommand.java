// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSub;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.Constants.SpeedConstants;
import frc.robot.subsystems.LedSubsystem;
import frc.robot.Constants.LEDConstants;
/** An example command that uses an example subsystem. */
public class RunIntakeCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private IntakeSubsystem intake;
  private LedSubsystem led;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public RunIntakeCommand(IntakeSubsystem intake, LedSubsystem led) {
    this.intake = intake;
    this.led = led;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(intake, led);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    intake.runIntake(SpeedConstants.FAST_FORWARD);
    led.runLed(LEDConstants.colorBlue);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intake.runIntake(0);
    led.runLed(LEDConstants.colorGold);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

