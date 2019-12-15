class Customer{
    firstName : string;
    lastName : string;

    constructor(theFirst:string, theLast:string){
        this.firstName = theFirst;
        this.lastName = theLast;
    }

}

let customer = new Customer('Duyen', 'Ngoc');


console.log(customer.firstName + " " + customer.lastName);