
var express = require("express");
var app = express();
var Request = require('tedious').Request;


app.set("view engine","ejs");

app.get("/", function(req,res){
    res.sendFile(__dirname + "/public/html/index.html");
});

app.post("/index.html",function(req,res){
    res.sendFile(__dirname + "/public/html/index.html");
});

app.get("/login",function(req,res){
    getDataFromSQL();
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
    var Connection = require('tedious').Connection;
    var config = {
        userName: 'MSM_Promotion_Admin',
        password: 'Seebaer181050',
        server: 'msm.database.windows.net',
        // If you are on Microsoft Azure, you need this:
        options: {encrypt: true, database: 'MSM_Promotion_Vorversion'}
    };
    var connection = new Connection(config);

    connection.on('connect', function(err) {
            // If no error, then good to go...
            console.log("connected");

            console.log('Reading rows from the Table...');
            // Read all rows from table
            request = new Request(
                "SELECT * from dbo.LeistungskundeAccount where ID = ",
                function(err, rowCount, rows)
                {
                    console.log(rowCount + ' row(s) returned');
                    // process.exit();
                }
            );

            request.on('row', function(columns) {
                columns.forEach(function(column) {
                    data.push(column.value);
                    console.log("%s\t%s", column.metadata.colName, column.value);
                    data.push(column.value);
                });
            });
            connection.execSql(request);
            return request;
        }
    );
    res.render("index",{id:req.query.id})
    });



function getDataFromSQL() {
    var Connection = require('tedious').Connection;
    var config = {
        userName: 'MSM_Promotion_Admin',
        password: 'Seebaer181050',
        server: 'msm.database.windows.net',
        // If you are on Microsoft Azure, you need this:
        options: {encrypt: true, database: 'MSM_Promotion_Vorversion'}
    };
    var connection = new Connection(config);

    connection.on('connect', function(err) {
            // If no error, then good to go...
            console.log("connected");

        console.log('Reading rows from the Table...');
        var data = [];
        // Read all rows from table
        request = new Request(
            "SELECT * from dbo.LeistungskundeAccount",
            function(err, rowCount, rows)
            {
                console.log(rowCount + ' row(s) returned');
                // process.exit();
            }
        );

        request.on('row', function(columns) {
            columns.forEach(function(column) {
                data.push(column.value);
                console.log("%s\t%s", column.metadata.colName, column.value);
                data.push(column.value);
            });
        });
        connection.execSql(request);
        return request;
        }
    );



    function queryDatabase(datens)
    { console.log('Reading rows from the Table...');
        var data = [];
        // Read all rows from table
        request = new Request(
            "SELECT * from dbo.LeistungskundeAccount",
            function(err, rowCount, rows)
            {
                console.log(rowCount + ' row(s) returned');
                // process.exit();
            }
        );

        request.on('row', function(columns) {
            columns.forEach(function(column) {
                data.push(column.value);
                console.log("%s\t%s", column.metadata.colName, column.value);
                data.push(column.value);
            });
        });
        connection.execSql(request);
    }

}
var port = process.env.PORT || 1337;
app.listen(port);