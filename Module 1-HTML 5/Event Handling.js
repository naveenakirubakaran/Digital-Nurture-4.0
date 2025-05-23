<script>
  function validatePhone(el) {
    const regex = /^\d{10}$/;
    if (!regex.test(el.value)) {
      alert("Enter a valid 10-digit phone number");
    }
  }

  function showFee(el) {
    document.getElementById("feeDisplay").textContent = "Fee: ₹" + (el.value === "tech" ? "500" : "200");
  }

  function enlargeImg(img) {
    img.style.width = "300px";
  }

  function countChars(el) {
    document.getElementById("charCount").textContent = "Characters: " + el.value.length;
  }
</script>

<input type="text" placeholder="Phone" onblur="validatePhone(this)">
<select onchange="showFee(this)">
  <option value="">Choose Event</option>
  <option value="music">Music</option>
  <option value="tech">Tech</option>
</select>
<div id="feeDisplay"></div>
<button onclick="alert('Feedback submitted!')">Submit</button>
<img src="event.jpg" ondblclick="enlargeImg(this)" width="100">
<textarea onkeyup="countChars(this)"></textarea>
<div id="charCount"></div>
