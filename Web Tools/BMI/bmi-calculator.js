const height=document.querySelector("#height")
const weight=document.querySelector("#weight")
const bmi_result=document.querySelector("#bmi")
const category_result=document.querySelector("#result")

function calc_bmi(){
    var bmi=weight.value/(height.value*height.value);//Calculating bmi

    // Calculating category 
    if (bmi < 18.5)
    category="Underweight";
    else if( bmi >= 18.5 && bmi < 24.9)
    category="Healthy";
    else if( bmi >= 24.9 && bmi < 30)
    category="Overweight"
    else if( bmi >=30)
    category="Obesity";

    // Showing Green if Healthy else red box 
    if(category=="Healthy")
        $(".result-box").removeClass("red").addClass("green")
    else
        $(".result-box").removeClass("green").addClass("red")

    // Outputing the values in their tags 
    bmi_result.innerText=bmi.toFixed(1);
    category_result.innerText=category;
    $(".output-box").slideDown()
}