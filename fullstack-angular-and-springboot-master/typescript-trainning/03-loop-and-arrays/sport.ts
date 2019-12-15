let sportsOne: string[] = ['golf', 'cricket', 'nam nguyen'];

/*
for( let i=0; i< sportsOne.length; i++){
    console.log(sportsOne[i]);
}
console.log('----------------');
*/

for( let name of sportsOne){
    if( name == 'cricket'){
        console.log('My favorite sport ' +name);
    } else {
        console.log(name);
    }
    
}