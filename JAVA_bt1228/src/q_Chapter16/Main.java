package q_Chapter16;

import q_Chapter16.controller.OrderController;
import q_Chapter16.model.OrderModel;
import q_Chapter16.view.OrderView;

public class Main {
	public static void main(String[] args) {
		OrderModel model = new OrderModel();
		OrderView view = new OrderView();
		OrderController controller = new OrderController(model, view);
		controller.processOrder();
				
	}
}
