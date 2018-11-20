
var express = require("express");
var app = express();
var Request = require('tedious').Request;


app.set("view engine","ejs");

app.get("/", function(req,res){
    res.sendFile(__dirname + "/public/html/login.html");
});

app.post("/index.html",function(req,res){
    res.sendFile(__dirname + "/public/html/index.html");
});

app.get("/login",function(req,res){
    res.sendFile(__dirname + "/public/html/login.html");
});

app.get("/steffen",function(req,res){
    res.sendFile(__dirname+"/public/html/test.html");
});

app.get("/login/:name",function(req,res){
    var data = ["jonathan","as","hhdahds","hdasd"];
    data.push("test");
    getDataFromSQL(data);
    res.render("login",{name: req.params.name, data : data});
});

app.get("/getData/:id",function(req,res){
    var data = ["test"];
    var test = getDataFromSQL();
    console.log(test);
    res.render("data",{id:req.params.id,data:test})
});

app.get("/home",function(req,res){
    createConnection((data)=>{
        res.render("index",{daten:data})
    });
});

app.get("/navbar",function(req,res){
   res.sendFile(__dirname+"/public/html/navbar.html");
});

app.get('*', function(req, res) {
    res.sendFile(__dirname+"/public/html/404.html");
});

function createConnection(cb){
    var Connection = require('tedious').Connection;
    var Request = require('tedious').Request;
    var config = {
        userName: 'MSM_Promotion_Admin',
        password: 'Seebaer181050',
        server: 'msm.database.windows.net',
        // If you are on Microsoft Azure, you need this:
        options: {encrypt: true, database: 'MSM_Promotion_Vorversion',rowCollectionOnRequestCompletion:true,rowCollectionOnDone: true}
    };
    const connection = new Connection(config);

    connection.on('connect', function(err) {
        // If no error, then good to go...
        console.log("connected");
        console.log('Reading rows from the Table...');
        // Read all rows from table
        request = new Request( "SELECT * FROM dbo.LeistungskundeAccount", function(err, rowCount, rows){
            console.log(rowCount + ' row(s) returned');});

        request.on('row', function(columns) {
            var data = [];
            columns.forEach(function(column) {

                data.push(column.value);
                //console.log("%s\t%s", column.metadata.colName, column.value);
            });
            // data is available here
            cb(data);
        });
        connection.execSql(request);
    });
}


var port = process.env.PORT || 1337;
app.listen(port);