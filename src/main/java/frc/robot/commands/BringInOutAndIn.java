// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.InAndOut2;

public class BringInOutAndIn extends CommandBase {
  public final InAndOut2 inAndOut2;
  /** Creates a new BringInOutAndIn. */
  public BringInOutAndIn(InAndOut2 inAndOut) {
    inAndOut2 = inAndOut;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(inAndOut);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    inAndOut2.InAndOutExtend(-.25);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    inAndOut2.InAndOutExtend(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return inAndOut2.getRevLimitState(); // Stop running if Rev limit reached
  }
}
