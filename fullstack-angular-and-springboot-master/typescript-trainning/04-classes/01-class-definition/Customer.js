var Customer = /** @class */ (function () {
    function Customer(theFirst, theLast) {
        this.firstName = theFirst;
        this.lastName = theLast;
    }
    return Customer;
}());
var customer = new Customer('Duyen', 'Ngoc');
console.log(customer.firstName + " " + customer.lastName);
