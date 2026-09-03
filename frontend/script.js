async function getWeather() {

    const city = document.getElementById("cityInput").value;

    if(city===""){
        alert("Enter city name");
        return;
    }

    document.getElementById("loading").style.display="block";

    try{

        const response =
        await fetch(`http://localhost:8080/weather/${city}`);

        const data = await response.json();

        document.getElementById("loading").style.display="none";

        document.getElementById("weatherCard").classList.remove("hidden");

        document.getElementById("city").innerHTML=data.city;

        document.getElementById("country").innerHTML=data.country;

        document.getElementById("temp").innerHTML=data.temperature;

        document.getElementById("desc").innerHTML=data.description;

        document.getElementById("humidity").innerHTML=data.humidity+" %";

        document.getElementById("wind").innerHTML=data.windSpeed+" m/s";

    }
    catch(e){

        document.getElementById("loading").style.display="none";

        alert("Unable to fetch weather.");
    }

}