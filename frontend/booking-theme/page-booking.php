<?php
/*
Template Name: Booking Page
*/
get_header(); 
?>

<h2>Booking Form</h2>

<input type="text" id="name" placeholder="Your Name">
<input type="text" id="name" placeholder="Your Email Address">
<input type="date" id="date">
<button onclick="submitBooking()">Book</button>

<?php
get_footer(); 
?>