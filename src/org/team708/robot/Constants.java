package org.team708.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay;

/**
 * Class containing all the code-related constants, so wiring and
 * gamepad controls are not included
 * @author omn0mn0m
 */
public final class Constants {

	/*
	 * Motor Controllers
	 */
	public static final Relay.Value SPIKE_FORWARD = Relay.Value.kForward;
	public static final Relay.Value SPIKE_REVERSE = Relay.Value.kReverse;
	public static final Relay.Value SPIKE_OFF = Relay.Value.kOff;
	public static final double MOTOR_FORWARD = 1.0;
	public static final double MOTOR_REVERSE = -1.0;
	public static final double MOTOR_OFF = 0.0;
	
	/*
	 * Double Solenoids
	 */
	public static final DoubleSolenoid.Value OPEN = DoubleSolenoid.Value.kReverse;
	public static final DoubleSolenoid.Value CLOSED = DoubleSolenoid.Value.kForward;
	public static final DoubleSolenoid.Value VERTICAL = DoubleSolenoid.Value.kReverse;
	public static final DoubleSolenoid.Value HORIZONTAL = DoubleSolenoid.Value.kForward;
	public static final DoubleSolenoid.Value RETRACTED = DoubleSolenoid.Value.kReverse;
	public static final DoubleSolenoid.Value DEPLOYED = DoubleSolenoid.Value.kForward;
	
	/*
	 * Smart Dashboard
	 */
	public static final double SEND_STATS_INTERVAL = .25;		// Interval between statistic reporting in seconds
	
	/*
	 * Sensors
	 */
	public static final double IR_HAS_TOTE_DISTANCE = 5.0;
	public static final double ENCODER_BOTTOM_POSITION = 0.0;
	
	/*
	 * Game Elements
	 */
	public static final double TOTE_HEIGHT = 12.1;
	
	/*
	 * Indexer
	 */
	public static final double INDEXER_ENCODER_PULSES_PER_REV = 7.0;
	public static final double INDEXER_GEARING = 0.32;
	public static final double INDEXER_SPROCKET_DIAMETER = 2.0;
	public static final int TOTE_LIMIT = 6;
	
	/*
	 * Drivetrain
	 */
	public static final double TANK_STICK_TOLERANCE = .025;
	public static final boolean DRIVETRAIN_USE_LEFT_ENCODER = true;	// Variable to determine which side the encoder is on
	public static final boolean DRIVE_USE_SQUARED_INPUT = false;
	
	/*
	 * Vision Processor
	 */
}
