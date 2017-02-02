package practise.session18.threads;

public class SynchronizationDemo {

	public static void main(String[] args) {
		IncrementOper inc1=new IncrementOper();
		
		SyncScenario thread1=new SyncScenario("Java", inc1);
		SyncScenario thread2=new SyncScenario("SQL", inc1);
		SyncScenario thread3=new SyncScenario("Oracle",inc1);
		

	}

}


class SyncScenario implements Runnable{
	String name;
	Thread t;
	IncrementOper inc;
	 SyncScenario(String name, IncrementOper inc){
		this.name=name;
		this.inc=inc;
		t=new Thread(this,name);
		t.start();
		
	}
	public void run(){
		System.out.println("Thread started :" +t.getName());
		synchronized(inc){
			inc.noSynMethod(name);
		}
		System.out.println("Thread ended:" +t.getName());
	}
}

class IncrementOper{
	public void noSynMethod(String name){
		for(int i=0;i<5;i++){
			incMethod(name);
			System.out.println("Running noSynMethod thread Name:" +name+"count" +i);
		}
	}
	public synchronized void incMethod(String name){
		for(int i=0;i<5;i++){
			System.out.println("Running Thread name:"+name+ "count" +i);
		}
	}
}