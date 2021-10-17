const from=document.querySelector("#from")
const to=document.querySelector("#to")
const input=document.querySelector("#input")
const result_box=document.querySelector("#result")

function calculate_temp(){
    temp=parseFloat(input.value)
    if(from.value === to.value)
        result=temp;
    else if(from.value==="C" && to.value==="F")
		result=(temp * 9/5) + 32;
	else if(from.value==="C" && to.value==="K")
		result=(temp+273.15);
	else if(from.value==="F" && to.value==="C")
		result=(temp - 32)* 5/9;
	else if(from.value==="F" && to.value==="K")
		result=(temp- 32)* 5/9 + 273.15;
	else if(from.value==="K" && to.value==="F")
		result=(temp  - 273.15)* 9/5 + 32 ;
	else if(from.value==="K" && to.value==="C")
		result=(temp  - 273.15) ;
	result=result.toFixed(2);
    result_box.innerText=result
}