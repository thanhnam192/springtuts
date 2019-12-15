var sportsOne = ['golf', 'cricket', 'nam nguyen'];
/*
for( let i=0; i< sportsOne.length; i++){
    console.log(sportsOne[i]);
}
console.log('----------------');
*/
for (var _i = 0, sportsOne_1 = sportsOne; _i < sportsOne_1.length; _i++) {
    var name_1 = sportsOne_1[_i];
    if (name_1 == 'cricket') {
        console.log('My favorite sport ' + name_1);
    }
    else {
        console.log(name_1);
    }
}
