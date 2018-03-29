<?php 
require "conn.php";
$user_name = $_POST["user_email"];
$user_pass = $_POST["user_password"];
$mysql_qry = "select * from userData where user_email like '$user_email' and user_password like '$user_password';";
$result = mysqli_query($conn ,$mysql_qry);
if(mysqli_num_rows($result) > 0) {
echo "login success !!!!! Welcome user";
}
else {
echo "login not success";
}
 
?>