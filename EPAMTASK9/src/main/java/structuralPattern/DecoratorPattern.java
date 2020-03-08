package structuralPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Rhombus implements WorkerInterface{
	public static final Logger LOGGER = LogManager.getLogger(Rhombus.class);
	public void draw(){
		
		LOGGER.info("Rhomnus shape to be drawn");
	}
}
class Polygon implements WorkerInterface{
	public static final Logger LOGGER = LogManager.getLogger(Polygon.class);
	public void draw(){
		
		LOGGER.info("Ploygon shape to be drawn");
	}
}
class Decorator implements WorkerInterface{
	WorkerInterface worker;
	
	public Decorator(WorkerInterface worker) {
		this.worker=worker;
	}
	public void draw() {
	    worker.draw();	
	}
}
class PinkDecorator extends Decorator{
	WorkerInterface worker;
	public static final Logger LOGGER = LogManager.getLogger(PinkDecorator.class);
	public PinkDecorator(WorkerInterface worker) {
		super(worker);
	}
	public void draw() {
	    super.draw();
	    this.drawPink();
	    //Adding new functionalities with touching the already existing one's
	}
	public void drawPink() {
		LOGGER.info("shape drawn with the pink colour");
	}
}


public class DecoratorPattern {
	public static void main(String args[]) {
		PinkDecorator pinkDecorator1=new PinkDecorator(new Rhombus());
        pinkDecorator1.draw();
        PinkDecorator pinkDecorator2=new PinkDecorator(new Polygon());
        pinkDecorator2.draw();
        
		
	}

}
