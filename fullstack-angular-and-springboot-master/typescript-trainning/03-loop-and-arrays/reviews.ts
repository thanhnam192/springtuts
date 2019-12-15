let reviews : number[] = [10, 5, 1, 20];
let total : number = 0;
for(let i=0; i< reviews.length;i++){
    console.log(reviews[i]);
    total += reviews[i];
}

let averate : number = total/reviews.length;
console.log(`Average ${averate}`);