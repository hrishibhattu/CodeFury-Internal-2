var quantity = document.getElementsByClassName('product-quantity')
console.log(quantity);
for (var i = 0; i < quantity.length; i++) {

	var input = quantity[i];
	console.log(input.value);

	input.addEventListener('change', quantitychanged);

}

function quantitychanged(event) {

	var input = event.target

	if (isNaN(input.value) || input.value <= 0) {
		input.value = 1
	}
	UpdateCartTotal()
}

function UpdateCartTotal() {
	var quantity = document.getElementsByClassName('product-quantity')

	var item = document.getElementsByClassName("products-rows")[0]
	var cartrows = item.getElementsByClassName("product-row")
	var shipping_cost = 0;
	var total = 0;
	var total_cost = 0;
	
	for (var i = 0; i < cartrows.length; i++) {
		var cr = cartrows[i]
		var priceelement = cr.getElementsByClassName("product-price")[0]
		// console.log(priceelement)
		var qu = cr.getElementsByClassName("product-quantity")[0]

		var category = cr.getElementsByClassName("product-category")[0]

		console.log(priceelement, qu, category)

		console.log(qu)

		var p = priceelement.innerText;
		var q = qu.value;
		var c = category.innerText
		console.log(p, q, c)

		total = total + (p * q)
		console.log(total)
		if (total >= 100000) {
			shipping_cost = 0;
		}

		else if (c.localeCompare("level 1") == 0) {
			shipping_cost = 0.05 * p;
		}

		else if (c.localeCompare("level 2") == 0) {
			shipping_cost = 0.03 * p
		}

		else {
			shipping_cost = 0.02 * p
		}

		total_cost = total + shipping_cost
		console.log(total_cost)
	}

	document.getElementById("shippingCost").value = shipping_cost
	document.getElementById("totalOrderValue").value = total_cost;

}