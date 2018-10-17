package com.cheesy.pizzashopapi;
import org.springframework.web.bind.annotation.*;
@RestController
public class PizzaController {
	@RequestMapping("/pizzas")
	public String getPizzas() {
		return "Pizzas are good";
	}

}
