<script>
  window.onload = function() {
    let type = localStorage.getItem("eventType");
    if (type) document.getElementById("eventPref").value = type;
  };

  function savePreference(el) {
    localStorage.setItem("eventType", el.value);
  }

  function clearPrefs() {
    localStorage.clear();
    sessionStorage.clear();
    alert("Preferences cleared!");
  }
</script>

<select id="eventPref" onchange="savePreference(this)">
  <option value="">Select Event</option>
  <option value="music">Music</option>
  <option value="tech">Tech</option>
</select>
<button onclick="clearPrefs()">Clear Preferences</button>
