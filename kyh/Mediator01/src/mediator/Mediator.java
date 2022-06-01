package mediator;

import collegue.Colleague;

public interface Mediator {
    public void createColleagues();

    public void colleagueChanged(Colleague colleague);
}
