var a,b,c,d=0,dstr="",x1=0,x2=0;

function quadcalc()
{
	a=document.getElementById("a").value;
	b=document.getElementById("b").value;
	c=document.getElementById("c").value;
	if(a===""||b===""||c==="")
		document.getElementById("dtext").innerHTML="❌ Fill All 3 Boxes";
	else
	{
		if(a==0)
		document.getElementById("dtext").innerHTML="❌ Error coefficient of x<sup>2</sup> should be >0";
		else	
		calculate();
	}
	
}
function clearall()
{
	a=0,b=0,c=0,d=0,dstr="",x1=0,x2=0;
	document.getElementById("a").value="";
	document.getElementById("b").value="";
	document.getElementById("c").value="";
	document.getElementById("dtext").innerHTML="Fill your Equation";
	document.getElementById("x1").innerHTML="";
	document.getElementById("x2").innerHTML="";

}
function dshow()
{
	if(d>0)
	{
		dstr="Both roots are Real & Distinct";
	}
	else if(d<0)
	{
		dstr="Both roots are Distinct & Imaginary";
	}
	else if(d==0)
	{
		dstr="Both roots are Real & Equal";
	}
	document.getElementById("dtext").innerHTML=dstr;
}
function calculate()
{
	d=(b*b)-(4*a*c);
	dshow();
	if(d>=0)
	{
		x1=((-b)+Math.sqrt(d))/(2*a);
		x2=((-b)-Math.sqrt(d))/(2*a);
		if(!(Number.isInteger(x1)))
			x1=Number(x1.toFixed(3));
		if(!(Number.isInteger(x2)))
			x2=Number(x2.toFixed(3));
		x1=x1.toString();
		x2=x2.toString();
		document.getElementById("x1").innerHTML=x1;
		document.getElementById("x2").innerHTML=x2;
	}
	else
	{
		imgstr1="",imgstr2="";
		d=Math.sqrt(Math.abs(d));
		x1=((-b)/(2*a));
		x2=d/(2*a);
		if(!(Number.isInteger(x1)))
			x1=Number(x1.toFixed(2));
		if(!(Number.isInteger(x2)))
			x2=Number(x2.toFixed(2));

		imgstr1=x1.toString();
		if(x2>0)
			imgstr1+=" + ";
		else
			imgstr1+=" - ";
		imgstr1+=(Math.abs(x2)).toString()+"i";
		document.getElementById("x1").innerHTML=imgstr1;
		imgstr2=x1;
		if(x2>0)
			imgstr2+=" - ";
		else
			imgstr2+=" + ";
		imgstr2+=(Math.abs(x2)).toString()+"i";
		document.getElementById("x2").innerHTML=imgstr2;
	}
}