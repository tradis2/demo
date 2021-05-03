function getinput(){
    var outcome=0;
    var a=document.getElementById("a").value;
    var b=document.getElementById("b").value;
    var s=document.getElementById("s").value;
    if (s=="+"){
        outcome=a+b;
        alert("计算结果为："+outcome);
    }
    if(s=="-"){
        outcome=a-b;
        alert("计算结果为："+outcome);
    }
    if(s=="/"){
        outcome=a/b;
        alert("计算结果为："+outcome);
    }
    if(s=="*"){
        outcome=a*b;
        alert("计算结果为："+outcome);
    }
}