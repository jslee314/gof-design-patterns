package collegue;

import mediator.Mediator;

public interface Colleague {
    public void setMediator(Mediator mediator);
    public void setColleagueEnabled(boolean enabled);
    public void setColleagueText(String text);
}
