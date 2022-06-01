package node;

import context.Context;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
