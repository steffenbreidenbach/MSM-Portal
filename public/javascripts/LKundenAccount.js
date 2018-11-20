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
var rows = [];
function getData() {
    connection.on('connect', function (err) {
            // If no error, then good to go...
            console.log("connected");
            console.log('Reading rows from the Table...');
            // Read all rows from table
            request = new Request(
                "SELECT * from dbo.LeistungskundeAccount",
                function (err, rowCount, rows) {
                    console.log(rowCount + ' row(s) returned');
                    process.exit();
                }
            );

            request.on('row', function (columns) {
                var row = {};
                columns.forEach(function (column) {
                    row[column.metadata.colName] = column.value;
                });
                rows.push(row);
                console.log(rows);

            });
            connection.execSql(request);
        }
    );
}
getData();
console.log(rows);
