package FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lilei
 **/
public class ShapeFactory {
    static Map<String,Shape> shapeMap= new HashMap<>();
    static Shape getShape(String shapeType){
        Shape shape = shapeMap.get(shapeType);

        if(shape != null){
            return shape;
        }

        if("circle".equals(shapeType)){
            Circle circle = new Circle();
            shapeMap.put("circle",circle);
            return circle;
        }else if("rectangle".equals(shapeType)){
            Rectangle rectangle = new Rectangle();
            shapeMap.put("rectangle",rectangle);
            return rectangle;
        }else {
            return null;
        }
    }
}
