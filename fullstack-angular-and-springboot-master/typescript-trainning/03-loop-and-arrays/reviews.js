var reviews = [10, 5, 1, 20];
var total = 0;
for (var i = 0; i < reviews.length; i++) {
    console.log(reviews[i]);
    total += reviews[i];
}
var averate = total / reviews.length;
console.log("Average " + averate);
