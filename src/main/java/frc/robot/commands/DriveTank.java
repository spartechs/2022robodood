package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivetrainsub;


public class DriveTank extends CommandBase{

    private final drivetrainsub m_Drive;
    private final DoubleSupplier leftSpeed;
    private final DoubleSupplier rightSpeed;
    
    public DriveTank (drivetrainsub subsystem, DoubleSupplier leftSpeed, DoubleSupplier rightSpeed){
        m_Drive = subsystem;
        addRequirements(m_Drive);
        this.leftSpeed = leftSpeed;
        this.rightSpeed = rightSpeed;
    }
    
     // only goes once at beginning when command is called
    @Override
    public void initialize(){

    }

    // keeps repeating until the command ends
    @Override
    public void execute(){
        m_Drive.tankdrive(leftSpeed.getAsDouble(), rightSpeed.getAsDouble());
    }

    //only goes once at end when command is finishing
    @Override
    public void end(boolean inerrupted){

    }

    //condition for the command to end on its own
    @Override
    public boolean isFinished(){

        return false;

    }





}