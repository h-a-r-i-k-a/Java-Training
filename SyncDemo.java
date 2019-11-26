package com.hcl.anonymus;


class Demo{
	 void dispMsg(String name){
		System.out.println("hello "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("how are u...");
	}

	public static void show(int i) {
		// TODO Auto-generated method stub
		
	}
}

public class SyncDemo {
	public static void main(String[] args) {
		Demo obj=new Demo();
		Thread t1=new Thread() {
			@Override
			public void run() {
				obj.dispMsg("sowmya");
			}
		};
		Thread t2=new Thread(){
			@Override
			public void run() {
				obj.dispMsg("harika");
			}
		};
		Thread t3=new Thread(){
			synchronized void show(int n){
				int p;
				for(int i=1;i<=10;i++){
					p=n*i;
					System.out.println(n +" * " +i+ " = "+p);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		
			}
			@Override
			public void run() {
				Demo.show(12);
			}
			
		};
		
	
		t1.start();
		t2.start();
		t3.start();
		
	}
}
	


