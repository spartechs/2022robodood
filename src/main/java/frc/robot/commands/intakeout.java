package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.intakesub;

public class intakeout extends CommandBase{

    private final intakesub m_Intake;

    public intakeout (intakesub subsystem){
        m_Intake = subsystem;
        addRequirements(m_Intake);
    }
    
    //only goes once at beginning when command is called
    @Override
    public void initialize(){
       
    }

    //keeps repeating until the command ends
    @Override
    public void execute(){
        m_Intake.intakeOut();
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
