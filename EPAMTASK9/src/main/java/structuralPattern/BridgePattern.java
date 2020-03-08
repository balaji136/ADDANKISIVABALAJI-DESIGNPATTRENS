package structuralPattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
interface WorkerInterface{
	public void draw();
}
class StraightLineWorker implements WorkerInterface{
	public static final Logger LOGGER = LogManager.getLogger(StraightLineWorker.class);
	public void draw() {
		LOGGER.info("Draw is Straight lines to complete this shape");
	}
}
class CurveLineWorker implements WorkerInterface{
	public static final Logger LOGGER = LogManager.getLogger(CurveLineWorker.class);
	public void draw() {
		LOGGER.info("draw a curves and sectors to complete this shape");
	}
}
abstract class Shape{
	WorkerInterface worker;
	public Shape(WorkerInterface worker) {
		this.worker = worker;
	}
	abstract public void drawShape();
}
class Rectangle extends Shape{
	public Rectangle(WorkerInterface worker){
		super(worker);
	}
	@Override
	public void drawShape() {
		worker.draw();
	}
}
class Circle extends Shape{
	public Circle(WorkerInterface worker){
		super(worker);
	}
	@Override
	public void drawShape() {
		worker.draw();
	}
}
public class BridgePattern {
	public static void main(String args[]) {
    Rectangle rectangle = new Rectangle(new StraightLineWorker());
    rectangle.drawShape();
    Circle circle = new Circle(new CurveLineWorker());
    circle.drawShape();
    
    
	}
}
