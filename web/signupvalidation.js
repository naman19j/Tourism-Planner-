function Validate()
{
//Name validation
let c =document.forms["signup"]["fname"].value;
let d =document.forms["signup"]["lname"].value;
var letters = /^[A-Za-z]+$/;
if(!(c.match(letters)))
{
    alert("First Name should only be alphabet characters");
    document.signup.fname.focus();
    return false;
}
if(!(d.match(letters)))
{
    alert("Last Name should only be alphabet characters");
    document.signup.lname.focus();
    return false;
}
if (c==="") {
    alert("First Name should not be Empty");
    return false;
  }
  if (d === "") {
    alert("Last Name should not be Empty");
    return false;
  }

//Email Validation
let x = document.forms["signup"]["email"].value;
var mailformat = /^\w+([\.-]?\w+)@\w+([\.-]?\w+)(\.\w{2,3})+$/;
if(!(x.match(mailformat)))
{
    alert("Invalid email address!");
    document.signup.Email.focus();
    return false;
}
if (x ==="") {
    alert("Email Should not be Empty");
    return false;
  }

//Phone Number Validation
let y= document.forms["signup"]["phone"].value;
var phoneno = /^\d{10}$/;
if(!(y.match(phoneno)))
{
    alert("Invalid Phone Number!");
    document.signup.phone.focus();
    return false;
}
if (y ==="") {
    alert("Phone Number Should not be Empty");
    return false;
  }

//password validation
let z = document.forms["signup"]["pass"].value;
if(z.length<8)
{
    alert("Password Should not be less than 8 characters");
    return false;
}
if (z === "") {
    alert("Password Should not be Empty");
    return false;
  }

//retype password validation
let a =document.forms["signup"]["rpass"].value;
if(z!=a)
{
    alert("Should be same as enter above!!!");
    return false;
}

//username Validation
let b=document.forms["signup"]["uname"].value;
if(b.length>10)
{
    alert("Username should not be more than 10 characters!");
}

}