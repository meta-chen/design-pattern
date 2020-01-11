package abstractFactory;

import java.lang.reflect.Constructor;

public class FactoryProducer {
    public AbstractFactory getFactory(String factory){
        AbstractFactory o = null;
        try {
            Class clazz = Class.forName(factory);
            Constructor constructor = clazz.getConstructor();
            o = (AbstractFactory)constructor.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }
}
