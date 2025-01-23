function showTestRideForm() {
    var formDiv = document.getElementById("test-ride-form");
    if (formDiv) {
        formDiv.style.display = "block";  // Show the form
    }
}
 
// Function to hide the form when the close button is clicked
function hideTestRideForm() {
    var formDiv = document.getElementById("test-ride-form");
    formDiv.style.display = "none";  // Hide the form
}