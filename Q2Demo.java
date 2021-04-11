import java.util.*;
import javafx.application.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.scene.paint.Color;
import javafx.geometry.*;
public class Q2Demo extends Application{
	public void start(Stage myStage){
		myStage.setTitle("Multiplication table");
        FlowPane rootNode= new FlowPane(Orientation.VERTICAL,5,5);
        rootNode.setAlignment( Pos.CENTER );
        Label response=new Label();
        Scene myScene = new Scene( rootNode, 300, 200 );
        TextField tf= new TextField();
        // Button btngetText=new Button("Get multi"); 
        tf.setPromptText("Enter multi");
        //tf.setPrefColumnCount(20);
        tf.setOnAction(new EventHandler<ActionEvent>(){
        	public void handle(ActionEvent ae){
        		final String resp=Mult.calc(Integer.parseInt(tf.getText()));
        		response.setText(resp);
        	}
        });

        rootNode.getChildren().addAll(tf,response);
		myStage.setScene( myScene);
        myStage.show();  	
	}
	public static void main(String args[]){
		launch(args);
	}
}

class Mult 
{
	int a;

	static String calc(int a)
	{
		String s=new String();
		for(int i=1;i<11;i++)
		{
			s=s+"\n";
			s=s+ a +"*" +i + "="+ a*i;                                                  
		}
		return s;
	}
}