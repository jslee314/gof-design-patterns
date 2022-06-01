package observer;

import generator.NumberGenerator;

public interface Observer {
    public void update(NumberGenerator generator);
}
