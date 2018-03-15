package se.matzlarsson.cragglez.model;

import javafx.beans.property.*;

public class Layer {

    private IntegerProperty level;
    private StringProperty name;
    private IntegerProperty x, y, width, height;
    private BooleanProperty percentages;
    private IntegerProperty screen;

    public Layer(int screen, int level, int x, int y, int width, int height, boolean percentage) {
        this("Layer " + level, screen, level, x, y, width, height, percentage);
    }

    public Layer(String name, int screen, int level, int x, int y, int width, int height, boolean percentage){
        this.name = new SimpleStringProperty(name);
        this.screen = new SimpleIntegerProperty(screen);
        this.level = new SimpleIntegerProperty(level);
        this.x = new SimpleIntegerProperty(x);
        this.y = new SimpleIntegerProperty(y);
        this.width = new SimpleIntegerProperty(width);
        this.height = new SimpleIntegerProperty(height);
        this.percentages = new SimpleBooleanProperty(percentage);
    }

    public IntegerProperty levelProperty(){
        return level;
    }

    public StringProperty nameProperty(){
        return name;
    }

    public IntegerProperty screenProperty() {
        return screen;
    }

    public IntegerProperty xProperty() {
        return x;
    }

    public IntegerProperty yProperty() {
        return y;
    }

    public IntegerProperty widthProperty() {
        return width;
    }

    public IntegerProperty heightProperty() {
        return height;
    }

    public BooleanProperty isPercentagesProperty(){
        return percentages;
    }
}