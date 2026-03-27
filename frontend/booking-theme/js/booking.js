function submitBooking() {
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const date = document.getElementById('date').value;

    fetch('http://localhost:8081/api/bookings', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ name, email, date })
    })
    .then(response => response.json())
    .then(data => {
        alert('Booking successful');
        console.log(data);
    })
    .catch(error => console.error(error));
}