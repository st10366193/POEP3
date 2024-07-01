/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe.p2;

import javax.swing.JOptionPane;

/**
 *
 * @author katlego
 */
public class Task {
    String option1 ="TO DO";
     String option2 ="DOING";
      String option3 ="DONE";
      
      public void AddTasks(){
          
          int numOfTask = Integer.parseInt(JOptionPane.showInputDialog("Enter number of Tasks"));
          
         String[] taskName = new String[numOfTask];
         String[] taskDescription = new String[numOfTask];
         String[] taskDeveloper = new String[numOfTask];
         String[] taskID = new String[numOfTask];
         String[] taskStatus = new String[numOfTask];
         int[] taskNumber = new int[numOfTask];
         int[] taskDuration = new int[numOfTask];
         
         for (int susan = 0;susan<numOfTask;susan++){
             taskName[susan]= JOptionPane.showInputDialog("Enter name of "+(susan+1)+" Task");
             taskNumber[susan]=susan;
             
             String sort;
             do {
                 sort = JOptionPane.showInputDialog("Enter Task Description");
                 }while(!checkTaskDescription(sort));
             taskDescription[susan]=sort;
             taskDeveloper[susan]=JOptionPane.showInputDialog("Enter name of the Developer");
             taskDuration [susan]=Integer.parseInt(JOptionPane.showInputDialog("Enter hours worked"));
             taskID[susan]=createTaskID(susan,taskName[susan],taskDeveloper[susan]);
             
             sort = JOptionPane.showInputDialog("choice 1)"+option1+"\n"+
                     "choice 2)"+option2+"\n"+
                     "choice 3)"+option3+"\n");
             
             switch(sort){
                 case "1": 
                     taskStatus[susan]=option1 ;                                                      
                  case "2" : 
                      taskStatus[susan]=option2;
                  case "3":  
                      taskStatus[susan]=option3;
                    
             }
              JOptionPane.showInputDialog(null,printTaskDetails(taskNumber[susan],taskStatus[susan],taskDeveloper[susan],taskName[susan],taskDescription[susan],taskID[susan],taskDuration[susan],taskStatus[susan]));
              
         }
         JOptionPane.showInputDialog(null,"Total Number of hours is "+returnTotalHours(taskDuration) );
      }
    public boolean checkTaskDescription(String taskDescription){
        if (taskDescription.length()>50){
            JOptionPane.showMessageDialog(null,"Enter Task (Description of less than 50 characters)");
            return false;
        }else {
            JOptionPane.showInputDialog(null, "Task Sucessful");
            return true;
        }
    }
    public String printTaskDetails(int taskNumber, String taskStatus, String taskDeveloper, String taskName, String taskDescription, String taskID, int taskDuration, String taskStatu1){
      return "Details of task"+(taskNumber +1)+"\n task Status:"+taskStatus+"\n Task Developer:"+taskDeveloper+"\n Task Number:"+taskNumber+"\n Task Name:"+taskName+"\n Task Description:"+taskDescription+"\n Task Idetification:"+taskID+"\n Task Duration:"+taskDuration;
    } 
    public String createTaskID(int susan,String taskName,String taskDeveloper){
        String taskID =taskName.substring(7,8)+';'+susan+';'+
        taskDeveloper.substring(taskDeveloper.length() -1);
        return taskID.toUpperCase();
    }
    public int returnTotalHours(int[]taskDuration){
      int last = 0;
      for(int susan =0;susan<taskDuration.length;susan++){
          last=last+taskDuration[susan];
      }
      return last;
    }
    public void show(int []taskNumber,String []taskStatus,String [] taskDeveloper,String [] taskName,String [] taskDescription,String [] taskID,int [] taskDuration){
      throw new UnsupportedOperationException("Not Supported") ; 
    }

    public void doneTask(int[] taskNumber, String[] taskStatus, String[] taskDeveloper, String[] taskName, String[] taskDuration) {
        throw createUnsupportedOperationException();
    }

    private UnsupportedOperationException createUnsupportedOperationException() {
        return new UnsupportedOperationException("Not Supported");
    }


    
    public void straight(int taskNumber, int[] taskDuration, String[] taskDeveloper) {
        throw createOperationException();
    }

    private UnsupportedOperationException createOperationException() {
        return new UnsupportedOperationException("Not Supported");
    }


    
    public void search(int taskNumber, String[] taskName, String[] taskDeveloper, String taskStatus) {
        throw createUnsupported();
    }

    private UnsupportedOperationException createUnsupported() {
        return new UnsupportedOperationException("Not Supported");
    }


    
    public void checkDeveloper(int taskNumber, String[] taskName, String[] taskDeveloper, String taskStatus) {
        throw createException();
    }

    private UnsupportedOperationException createException() {
        return new UnsupportedOperationException("Not Supported");
    }

}
    

 
