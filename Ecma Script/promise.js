const myPromise = new Promise(function(resolve, reject)  {
    setTimeout(resolve,5000);
   
 });

myPromise.then(function () {
    console.log('This is done');
})



// var asynchronousFunction = function(){
//     return new Promise(function(resolve, reject){
//         console.log('Promise');
//         setTimeout(resolve,5000);
//     })
// }
// asynchronousFunction()
// .then(asynchronousFunction)
// .then(asynchronousFunction)

// const promise = new Promise((resolve, reject)=>{
//     if(Math.random() *100<=90){
//         resolve("Hello Promises");
//     }
//     reject(new Error("Fail"));
// });
// const onResolved = (resolvedValue)=>  console.log(resolvedValue);
// const onReject = (error) => console.log(error);
// promise.then(onResolved, onReject)
