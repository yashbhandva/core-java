package coreJava;

class ObjectTypeVariable{
    private Object container;
    public ObjectTypeVariable(Object container){
        this.container = container;
    }

    public Object getContainer() {
        return container;
    }

    public void setContainer(Object container) {
        this.container = container;
        System.out.println(this.container);
    }
}
public class ObjectTypeVariables {
    public static void main(String[] args) {
        ObjectTypeVariable objectTypeVariables = new ObjectTypeVariable(888);
        System.out.println(objectTypeVariables.getContainer());
        objectTypeVariables.setContainer("hello");

    }
}
