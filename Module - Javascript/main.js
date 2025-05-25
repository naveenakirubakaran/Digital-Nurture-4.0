document.addEventListener('DOMContentLoaded', () => {
  console.log("Welcome to the Community Portal");

  // Alert when page is fully loaded
  alert("Page is fully loaded!");

  // Form Validation
  const form = document.getElementById('registrationForm');
  const confirmationMessage = document.getElementById('confirmationMessage');

  form.addEventListener('submit', (e) => {
    e.preventDefault();
    const name = form.name.value.trim();
    const email = form.email.value.trim();
    const phone = form.phone.value.trim();
    const eventType = form.eventType.value;

    if (!name || !email || !phone || !eventType) {
      confirmationMessage.textContent = "Please fill in all required fields.";
      return;
    }

    confirmationMessage.textContent = `Thank you, ${name}, for registering for the ${eventType} event!`;
    form.reset();
  });

  // Video readiness
  const video = document.getElementById('promoVideo');
  const videoStatus = document.getElementById('videoStatus');

  video.addEventListener('canplay', () => {
    videoStatus.textContent = "Video ready to play";
  });

  // Geolocation
  const findEventsBtn = document.getElementById('findEventsBtn');
  const locationOutput = document.getElementById('locationOutput');

  findEventsBtn.addEventListener('click', () => {
    if (navigator.geolocation) {
      navigator.geolocation.getCurrentPosition(
        (position) => {
          const { latitude, longitude } = position.coords;
          locationOutput.textContent = `Your location: Latitude ${latitude}, Longitude ${longitude}`;
        },
        (error) => {
          locationOutput.textContent = `Error: ${error.message}`;
        },
        {
          enableHighAccuracy: true,
          timeout: 5000,
          maximumAge: 0
        }
      );
    } else {
      locationOutput.textContent = "Geolocation is not supported by this browser.";
    }
  });
});
