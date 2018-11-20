

var test = {};
createConnection((data)=>{
    test = data;
    console.log(test);
    return test;
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
