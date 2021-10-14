from turtle import  *

speed(5)

def om(x,y):

    penup()

    goto(x,y)

    pendown()

def om1(x,y,f,c,c1,c2):

    color(c)

    om(x,y)

    begin_fill()

    for i in range(4):

        forward(f)

        circle(c1,c2)

    end_fill()

def om2(c,x,y,c1):

    color(c)

    begin_fill()

    om(x, y)

    circle(c1)

    end_fill()



om1(-150,-120,350,"black",20,90)

om1(-110,-70,260,"white",20,90)

om1(-90,-50,220,"black",20,90)

om2("white",20,10,70)

om2("black",20,30,50)

om2("white",110,160,15)



color("black")

om(-120,-180)

write("INSTAGRAM",font=("Helvetica",40,"bold"))

hideturtle()

done()
