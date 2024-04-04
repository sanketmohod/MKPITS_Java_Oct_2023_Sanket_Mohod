let timerInterval;
let startTime;
const timerDisplay = document.getElementById("timer");
const matrixContainer = document.getElementById("matrix");
let lastClickedNumber = 0;

function startTimer(durationInSeconds) {
  startTime = Date.now();
  timerInterval = setInterval(updateTimer, 1000, durationInSeconds);
}

function updateTimer(durationInSeconds) {
  const elapsedTime = Math.floor((Date.now() - startTime) / 1000);
  const hours = Math.floor(elapsedTime / 3600);
  const minutes = Math.floor((elapsedTime % 3600) / 60);
  const seconds = elapsedTime % 60;

  const hoursDisplay = hours.toString().padStart(2, "0");
  const minutesDisplay = minutes.toString().padStart(2, "0");
  const secondsDisplay = seconds.toString().padStart(2, "0");

  timerDisplay.textContent = `${hoursDisplay}:${minutesDisplay}:${secondsDisplay}`;

  if (elapsedTime >= durationInSeconds) {
    clearInterval(timerInterval);
    timerDisplay.textContent = "Time's up!";
  }
}

function handleClick(event) {
  const clickedNumber = parseInt(event.target.textContent);

  if (clickedNumber === lastClickedNumber + 1) {
    event.target.style.backgroundColor = "green";
  } else {
    event.target.style.backgroundColor = "red";
  }

  lastClickedNumber = clickedNumber;

  // Stop the timer

  if (event.target.style.backgroundColor === "red") {
    clearInterval(timerInterval);
  }
}

function generateMatrix() {
  matrixContainer.innerHTML = ""; // Clear previous matrix if any

  for (let i = 0; i < 10; i++) {
    for (let j = 0; j < 10; j++) {
      const cellValue = getRandomInt(1, 100);
      const cell = document.createElement("div");
      cell.classList.add("cell");
      cell.textContent = cellValue;
      cell.addEventListener("click", handleClick); // Add click event listener
      matrixContainer.appendChild(cell);
    }
  }
}

window.onload = function () {
  generateMatrix();
  startTimer(3000 ); // Start timer with 300 seconds duration
};

function getRandomInt(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}
