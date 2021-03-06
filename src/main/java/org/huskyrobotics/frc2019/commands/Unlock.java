/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.huskyrobotics.frc2019.commands;

import org.huskyrobotics.frc2019.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Unlock extends Command {
  public Unlock() {
    requires(Robot.m_Armstrong);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.m_Armstrong.lock();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if(Robot.m_Oi.getArmstrongLocked()) {
      Robot.m_Armstrong.unlock();
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
