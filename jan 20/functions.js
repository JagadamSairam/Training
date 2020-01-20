let a=20;
let b=30;
function sum(a,b){
    return (a+b);
}
const mul=function(a,b){
    return a*b;
}
function sub(a,b){
    console.log(b-a);
}
console.log(sum(b,a));
console.log(mul(a,b));
sub(a,b)

function fact(c){
    if(c==0 || c==1)
    return 1;
    else
    return c*fact(c-1)
}
console.log("Factorial of c is "+ fact(5))
const main= function(){
    (function(){
        console.log("Function invoked")
        for(i=1;i<=5;i++)
        console.log(i)
    })();

}
main();

const sai = x => {
    console.log("sai "+ x)
}
sai(10);
