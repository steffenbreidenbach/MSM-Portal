var http = require('http');
var Request = require('tedious').Request;

var server = http.createServer(function(request, response) {

    response.writeHead(200, {"Content-Type": "text/plain"});
    getDataFromSQL();
    response.end("Hello World!");

});

var port = process.env.PORT || 1337;
server.listen(port);

console.log("Server running at http://localhost:%d", port);


/*function getDataFromSQL() {
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
            console.log("connected")
            response.end(err);
            //    executeStatement();
            queryDatabase();
            //   queryDatabase2();
        }
    );

    function executeStatement() {

        var request = new Request("select * form dbo.LeistungskundeAccount",function(err,count,rows){
        });
        console.log("execunting statement")
        request.on('row', function(columns) {
            columns.forEach(function(column) {
                console.log("%s\t%s", column.metadata.colName, column.value);
            });     console.log(column.value);
        });
        console.log("execunting statement")
    }

    function queryDatabase()
    { console.log('Reading rows from the Table...');

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
                console.log("%s\t%s", column.metadata.colName, column.value);
            });
        });
        connection.execSql(request);
    }

    function queryDatabase2() {
        var result = [];
        request = new Request("select * form dbo.LeistungskundeAccount",function(err,count,rows){
            console.log(result);

        });
        request.on("row", function (columns) {
            var item = {};
            columns.forEach(function (column) {
                item[column.metadata.colName] = column.value;
                console.log(column.value);
            });
            result.push(item);
        });
        connection.execSql(request);
        return result;
    }
}