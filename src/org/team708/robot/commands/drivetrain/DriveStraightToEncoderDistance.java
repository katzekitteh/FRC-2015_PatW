package org.team708.robot.commands.drivetrain;

import org.team708.robot.Robot;
import org.team708.robot.util.Math708;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveStraightToEncoderDistance extends Command {

	private double targetDistance = 0;
	private final double rotate = 0;
	
    public DriveStraightToEncoderDistance(double distance) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetrain);
    	targetDistance = distance;
    }

    // Called just before this Command runs the first time
    // Enables the PIDController (if it was not already) before attempting to drive straight
    protected void initialize() {
    	Robot.drivetrain.resetEncoder();
    	Robot.drivetrain.enable();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    
    	Robot.drivetrain.haloDrive(Math708.getPercentError
    			(Robot.drivetrain.getEncoderDistance(), targetDistance), rotate);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (Robot.drivetrain.getEncoderDistance() >= targetDistance);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.stop();
    	Robot.drivetrain.resetEncoder();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.drivetrain.stop();
    	Robot.drivetrain.resetEncoder();
    }
}
