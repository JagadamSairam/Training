function employee(id, name) { 
    this.id = id; 
    this.name = name; 
 } 
 let emp = new employee(123, "Sairam"); 
 employee.prototype.email = "Jagadamsairam@abc.com"; 
 
 console.log("Employee 's Id: " + emp.id); 
 console.log("Employee's name: " + emp.name);
 console.log("Employee's Email ID: " + emp.email);

 var name=new String("Jagadam  ");
 let len=name.length;
 console.log(name)
 console.log('Consists of '+ len);
 for(let i=0;i<len;i++){
     console.log(name.charAt(i));
 }