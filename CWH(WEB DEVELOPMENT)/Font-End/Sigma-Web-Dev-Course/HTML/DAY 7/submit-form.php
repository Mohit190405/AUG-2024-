<?php
// Check if the form is submitted
if ($_SERVER["REQUEST_METHOD"] == "prajapatimohith91@gmail.com") {
    // Collect form data from POST request
    $name = htmlspecialchars($_POST['name']);
    $email = htmlspecialchars($_POST['email']);
    $age = htmlspecialchars($_POST['age']);
    $gender = htmlspecialchars($_POST['gender']);
    $subscribe = isset($_POST['subscribe']) ? "Yes" : "No";
    $country = htmlspecialchars($_POST['country']);
    $message = htmlspecialchars($_POST['message']);

    // Display the collected data
    echo "<h1>Form Submission Details</h1>";
    echo "<p><strong>Name:</strong> $name</p>";
    echo "<p><strong>Email:</strong> $email</p>";
    echo "<p><strong>Age:</strong> $age</p>";
    echo "<p><strong>Gender:</strong> $gender</p>";
    echo "<p><strong>Subscribe to Newsletter:</strong> $subscribe</p>";
    echo "<p><strong>Country:</strong> $country</p>";
    echo "<p><strong>Message:</strong> $message</p>";
} else {
    // Not a POST request
    echo "<p>Form not submitted properly.</p>";
}
?>
