size(600,600);
background(0, 0, 0);
int x=300;
int y=350;

// first circle
fill(0, 0, 250, 100);
ellipse (x, y, 200, 200);
textSize(8);
fill(0, 0, 0);
text("A plumber?", x, y+25);

//seconed circle
fill(0, 250, 0, 100);
ellipse (x+50, y-100, 200, 200);
fill(0, 0, 0);
text("A platypus plumber!", x+50, y-100);

//third circle
fill(250, 0, 0, 100);
ellipse (x-50, y-100, 200, 200);
fill(0, 0, 0);
text("parry the platypus plumber?!", x-120, y-100);

//ven parts
fill(0, 0, 0);
text("A platypus", 300, 300);
text("both a plumber", x+35, y-40);
text("both a plumber", x-95, y-40);
text("both platypus plumbers", x-50, y-130);
//thats all folks
