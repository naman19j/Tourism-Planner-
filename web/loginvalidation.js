function validateForm() {
  let x = document.forms["loginForm"]["ID"].value;
  if (x == "") {
    alert("Username Should not be Empty");
    return false;
  }
  let y = document.forms["loginForm"]["password"].value;
  if (y == "") {
    alert("Password Should not be Empty");
    return false;
  }
  if(x.length>10)
  {
      alert("Username Should not be greater than 10 characters");
      return false;
  }
  if(y.length<8)
  {
      alert("Password Should not be less than 8 characters");
      return false;
  }
}