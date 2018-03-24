

import java.awt.geom.Point2D;
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Walker extends Application {

	
	private Pane drawPane;
	Button b = new Button("again");
	private Scene scene;
	Group rootGroup;
	int x=400,y=100;
	
	
	@Override
    public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		rootGroup = new Group();
		drawPane = new Pane();
		scene =  new Scene(rootGroup,800,300);
     	rootGroup.getChildren().addAll(drawPane,b);
     	b.setOnAction(e->{
     		drawPane.getChildren().clear();
     	x=400;
     	y=100;
     		setup();
     		
     	});
    	primaryStage.setScene(scene);
	   setup();
		primaryStage.show();
	}

	void diplay(){
		Circle point = new Circle(2);
		point.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
		point.setCenterX(x);
		point.setCenterY(y);
		drawPane.getChildren().add( point);
		
	}
	
	void setup(){
		Random ran = new Random();
		int step;
		for(int i=0;i<10000;i++){
		 step = (int) (ran.nextDouble()*(4));
	
	
		 if(step == 0){
			 x+=2;y+=2;
	}	else if(step==1){
		x+=2;y-=2;
	}
	else if(step == 2){
		x-=2;y+=2;
	}	else if (step==3){
				x-=2;y-=2;
	}	
		
		
		diplay();
		}
	}
	
	
	
	
	
	  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
	
}
