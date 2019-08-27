<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1" charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="HeaderStyle.css">
<link rel="stylesheet" type="text/css" href="ButtonStyle.css">

<style>
* {box-sizing: border-box}
body {font-family: Verdana, sans-serif; margin:0}
.mySlides {display: none}
img {vertical-align: middle;}

* {
  box-sizing: border-box;
}

/* Style the header */
.header {
  background-color: #f1f1f1;
  padding: 20px;
  text-align: center;
}

/* Style the top navigation bar */
.topnav {
  overflow: hidden;
  background-color: #333;
}

/* Style the topnav links */
.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change color on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.slideshow-container {
  max-width: 1000px;
  position: relative;
  margin: auto;
}


.prev, .next {
  cursor: pointer;
  position: absolute;
  top: 50%;
  width: auto;
  padding: 16px;
  margin-top: -22px;
  color: white;
  font-weight: bold;
  font-size: 18px;
  transition: 0.6s ease;
  border-radius: 0 3px 3px 0;
  user-select: none;
}


.next {
  right: 0;
  border-radius: 3px 0 0 3px;
}

.prev:hover, .next:hover {
  background-color: rgba(0,0,0,0.8);
}

.text {
  color: #f2f2f2;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}


.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}


.dot {
  cursor: pointer;
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active, .dot:hover {
  background-color: #717171;
}


.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}


@media only screen and (max-width: 300px) {
  .prev, .next,.text {font-size: 11px}
}

</style>
</head>
<body style="background-color: #B0C4DE	;">
<jsp:include page="header.jsp"></jsp:include>
<hr size="5" color="skyblue">




<hr size="5" color="black">

<div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 5</div>
  <img src="image/flat1.png" width= 100% height= 400px border=8px>
  <div class="text"><h2>Home is the nicest word there is...</h2></div>
</div>
<div class="mySlides fade">
  <div class="numbertext">2 / 5</div>
  <img src="image/slide4.jpg" width= 100% height= 400px border=8px>
  <div class="text"><h2>My restless, roaming spirit would not allow me to remain at home very long...</h2></div>
</div>
<div class="mySlides fade">
  <div class="numbertext">3 / 5</div>
  <img src="image/app.jpg" width= 100% height= 400px border=8px>
  <div class="text"><h2>Nothing can bring a real sense of security into the home...</h2></div>
</div>



<a class="prev" onclick="plusSlides(-1)">&#10094;</a>
<a class="next" onclick="plusSlides(1)">&#10095;</a>

</div>
<br/>
<br/>

<div style="text-align:center">
  <span class="dot" onclick="currentSlide(1)"></span> 
  <span class="dot" onclick="currentSlide(2)"></span> 
 
 <span class="dot" onclick="currentSlide(3)"></span>
</div>

<script>
var slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
  showSlides(slideIndex += n);
}

function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
}
</script>

<div class="btn-group" align="center">
	
	<button onclick="location.href='Clientlogin.jsp';" id="btn-group" class="float-left submit-button"><h2>Client</h2></button>
	
	<button onclick="location.href='OwnerLogin.jsp';" id="btn-group" class="float-left submit-button"><h2>Owner</h2></button> 

	

</div>

<br/>
<br/>

<video width=100% height="400px" controls="controls" autoplay="autoplay">
<source src="image/video.mp4" type="video/mp4">
</video>

<br/>
<br/>
<hr size="5" color="black">
 <jsp:include page="Footer.html"></jsp:include>

</body>
</html> 
