package com.hcl.anonymus;

interface ITraining {
  void name();
  
  void email();
}

public class Demo1 {  
    
  /**
    * declaring main method.
    * @param args passed as arguments.
    */
    
  public static void main(String[] args) {
    ITraining obj = new ITraining() {
      @Override
       public void name() {
        System.out.println("name is hcl");
      }
      
      @Override
      
	public void email() {
        System.out.println("admin@hcl.com");
        }
    };
    obj.name();
    obj.email();

  }

}
