// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShootSub;

public class ShootCommand extends Command {

  private final ShootSub m_shooter;
  private final double   speed1;
  private final double   speed2;

  /**
   * Spin Shooter Motors.
   */

  public ShootCommand(ShootSub shooter, double speed1, double speed2) {
    m_shooter = shooter;
    this.speed1 = speed1;
    this.speed2 = speed2;
    addRequirements(shooter);
  }

    @Override
    public void initialize() {}
  
    @Override
    public void execute() {m_shooter.runShooterMotor(speed1,speed2);}
  
    @Override
    public void end(boolean interrupted) {
      m_shooter.runShooterMotor(0,0);
    }
  
    @Override
    public boolean isFinished() {
      return false;
    }
  }

