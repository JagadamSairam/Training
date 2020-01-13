package com.thread;

public class ThreadJava {
public static void main(String[] args) {
	System.out.println("Main Thread");
	
	Resource resource=new Resource();
	
	ExampleOnThread t=new ExampleOnThread(resource);
	SecondThread st = new SecondThread(resource);
	
	Thread threadone = new Thread(t);
	Thread threadtwo = new Thread(st);
	
	threadone.start();
	threadtwo.start();
}
}
class ExampleOnThread implements Runnable{
	Resource resource;
	public ExampleOnThread(Resource resource){
		this.resource=resource;
	}
	
	@Override
	public void run() {
		resource.display("FirstThread");
	}
}

class SecondThread implements Runnable{
	
	
	Resource resource;
	public SecondThread(Resource resource) {
		this.resource=resource;
	}
	@Override
	public void run()
	{
		resource.display("Second Thread");
	}
}


class Resource{
	public void display(String message) {
		synchronized(this)
		{
			for(int i=1;i<=5;i++) {
				System.out.println(message+" : "+i);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
			}
		
		}
	}
	
}