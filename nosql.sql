## collection name :: user


show dbs;
use db;
show collection;

// ddl commands 
db.createCollection("nex");
db.collection.drop();
db.collection.createIndex({ name: 1 })
db.collection.dropIndex("name_1")

// dml dql

db.collection.insertOne({name :  "mIHIR"});
db.collection.insertMany([ {} , { }]);

db.collection.findone({name : "John"});
db.collection.find({age : {$gte : 25}});

db.collection.updateOne(
  { name: "John" },
  { $set: { age: 31, city: "San Francisco" } }
)

db.collection.updateMany(
  { age: { $gte: 25 } },
  { $set: { status: "active" } }
)

db.collection.deleteOne({ name: "John" })
db.collection.deleteMany({ age: { $lt: 25 } })

db.collection.countDocuments({ status: "active" })
