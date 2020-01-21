var arr= new Array(10);
// arr[0]=22;
// arr[1]=40;
// arr[2]=33;
// arr[3]=50;
// arr[4]=60;
// arr[5]=44;
// arr[6]=35;
// arr[7]=30;
// arr[8]=20;
// arr[9]=10;
 for(let j=0;j<10;j++){
   arr[j]=Math.floor(Math.random()*100);
 }
 console.log('Random Values are');
console.log(arr);

let filter = () => {
    for(let i=0;i<10;i++){
        if((arr[i]%2==0) && (arr[i]%5==0) ){
            console.log("Divisible values is  "+ arr[i]);
           
        }
    }
}
let filter=arr.filter(x => (x%2==0)&& (x%5 == 0))
console.log(filter);
const map =a=> {
    let sum=0;
    sum= a+((a*10)/100)
    console.log('10 Per is '+ sum);
}
filter();
for(let i=0;i<10;i++)
map(arr[i]);
// let map=arr.map(x => parseInt(x*1.1));
// console.log(map);