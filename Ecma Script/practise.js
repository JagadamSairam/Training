var fs=require('fs');

 var promise=new Promise((resolve,reject)=>{
        fs.mkdir('Sairam', function(err){
            if(err)
            console.error('Directory was not created');
            else
            console.log('Directory Created Successfully');
        })
        resolve();
 })
 .then(()=>{
     fs.write('.//Sairam//jagadam.txt', SampleText, function(err){
         if(err)
         console.error("File Was Not written")
         else
         console.log('File is uploaded succesfully');
     })
 })

 .catch(()=>{
     console.log('The Data is not Written');
 })
 .then(()=>{
     fs.read('.//Sairam//jagadam.txt', function(err){
         if(err)
         console.error('Error in reading file');
         else{
             fs.rmdir('Sairam',function(err){
                if (err) {
                    console.error("Error deleting file!");
                }
                else {
                    fs.rmdir('hello', function () { });
                    console.log('The Directory is deleted Successfully');
                }
            });
        }
    })
})
