//package headfirst.designpatterns.factory.pizzafm;

public class jh984PizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new jh984StyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new jh984StyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new jh984StyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new jh984StylePepperoniPizza();
        	} else return null;
	}
}
