var http = require('http');

var server = http.createServer(function(request, response) {

    response.writeHead(200, {"Content-Type": "text/plain"});
        connectServer();
        response.end("test");
    });


    var port = process.env.PORT || 1337;
    server.listen(port);

    console.log("Server running at http://localhost:%d", port);

    function connectServer () {

    var Connection = require('tedious').Connection;
         var config = {
             userName: 'MSM_Promotion_Admin',
             password: 'Seebaer181050',
             server: 'msm.database.windows.net',
             // If you are on Microsoft Azure, you need this:
             options: {encrypt: true, database: 'AdventureWorks'}
         };
         var connection = new Connection(config);
            connection.on('connect', function(err) {
                // If no error, then good to proceed.
                console.log("Connected");
                executeStatement();
            });

        function executeStatement() {
            request = new Request("SELECT * FROM LeistungsKundenAccount", function(err) {
            if (err) {
                console.log(err);}
            });
            var result = "";
            request.on('row', function(columns) {
                columns.forEach(function(column) {
                  if (column.value === null) {
                    console.log('NULL');
                  } else {
                    result+= column.value + " ";
                  }
                });
                console.log(result);
                result ="";
            });

            request.on('done', function(rowCount, more) {
            console.log(rowCount + ' rows returned');

            });
            connection.execSql(request);
        }
    }