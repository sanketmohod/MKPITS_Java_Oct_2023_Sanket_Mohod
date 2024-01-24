package com.mkpits.treecomplex;

public class TestTree {

	public static void main(String[] args) {

		TreeNode drinks = new TreeNode("Drinks");
		TreeNode hot = new TreeNode("Hot");
		TreeNode cold = new TreeNode("Cold");
		TreeNode snacks = new TreeNode("Snacks");

		// Adding data to Hot list
		TreeNode tea = new TreeNode("Tea");
		TreeNode coffee = new TreeNode("Coffee");
		TreeNode soup = new TreeNode("Soup");
		TreeNode greenTea = new TreeNode("Green Tea");

		// Adding data to cold list
		TreeNode wine = new TreeNode("Wine");
		TreeNode coldCoffee = new TreeNode("Cold Coffee");
		TreeNode beer = new TreeNode("Beer");
		TreeNode pepsi = new TreeNode("Pepsi");

		// Adding data to snacks list
		TreeNode kurkure = new TreeNode("Kurkure");
		TreeNode chips = new TreeNode("Chips");
		TreeNode soya = new TreeNode("Soya");
		TreeNode papdi = new TreeNode("Papdi");

		drinks.addChild(hot);
		drinks.addChild(cold);
		drinks.addChild(snacks);

		hot.addChild(tea);
		hot.addChild(coffee);
		hot.addChild(soup);
		hot.addChild(greenTea);

		cold.addChild(wine);
		cold.addChild(coldCoffee);
		cold.addChild(beer);
		cold.addChild(pepsi);

		snacks.addChild(kurkure);
		snacks.addChild(chips);
		snacks.addChild(soya);
		snacks.addChild(papdi);

		System.out.println(drinks.print(0));

	}

}
