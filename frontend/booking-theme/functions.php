<?php

function booking_enqueue_scripts() {
    wp_enqueue_script(
        'booking-js',
        get_template_directory_uri() . '/js/booking.js',
        [],
        null,
        true
    );
}

add_action('wp_enqueue_scripts', 'booking_enqueue_scripts');