// class Hello{
//     constructor(fname, lname, age){
//         this.fn=fname;
//         this.ln=lname;
//         this.a=age;
//     }
//     constructor()
//     full_name(){
//         return this.fn +' '+ this.ln+' '+ this.a
//     }
// }
// let hello = new Hello('Sairam','Jagada',22);
// console.log("The Candidate is "+hello.full_name());




// class Rectangle {
//     constructor(height, width) {
//       this.height = height;
//       this.width = width;
//     }
//         get area() {
//             return this.height * this.width;
//     }
    

//   }
  
//   const square = new Rectangle(10, 10);
  
//   console.log(square.area);






// class Point {
//     constructor(x, y) {
//       this.x = x;
//       this.y = y;
//     }
  
//     static distance(a, b) {
//       const dx = a.x - b.x;
//       const dy = a.y - b.y;
  
//       return Math.hypot(dx, dy);
//     }
//   }
  
//   const p1 = new Point(5, 5);
//   const p2 = new Point(10, 10);
//  // p1.distance;   //Undefined
//  // p2.distance;
  
//   console.log(Point.distance(p1, p2)); 

function Animal() { }

Animal.prototype.speak = function() {
  return this;
}

Animal.eat = function() {
  return this;
}

let obj = new Animal();
let speak = obj.speak;
console.log(speak());

let eat = Animal.eat;
eat(); 