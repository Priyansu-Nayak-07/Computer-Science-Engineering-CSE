document.addEventListener("DOMContentLoaded", function() {
    const expandButtons = document.querySelectorAll(".expand-button");
  
    expandButtons.forEach(button => {
      button.addEventListener("click", function() {
        const hiddenContent = this.previousElementSibling;
        hiddenContent.style.display = hiddenContent.style.display === "none" ? "block" : "none";
      });
    });
  });
  
  function submitForm() {
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const message = document.getElementById("message").value;
    const errorMessage = document.getElementById("errorMessage");
  
    // Validate form fields
    if (name === "" || email === "" || message === "") {
      errorMessage.innerText = "please fill all the fields.";
      errorMessage.style.display = "block";
    } else if (!isValidEmail(email)) {
      errorMessage.innerText = "Please use a valid email address.";
      errorMessage.style.display = "block";
    } else {
      // Form submission logic (you can replace this with your actual form submission code)
      errorMessage.style.display = "none";
      alert("Form submitted successfully!");
    }
  }
  
  function isValidEmail(email) {
    // Simple email validation, you may want to use a more robust solution
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailRegex.test(email);
  }
  