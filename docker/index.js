const express = require('express');
const app = express();
const PORT = 8000;

// pushing commands
// docker tag hello-docker:latest <your-account-id>.dkr.ecr.<region>.amazonaws.com/hello-docker:latest
// aws ecr get-login-password --region <region> | docker login --username AWS --password-stdin <your-account-id>.dkr.ecr.<region>.amazonaws.com
// docker push <your-account-id>.dkr.ecr.<region>.amazonaws.com/hello-docker:latest


app.get('/', (req, res) => {
    res.send("hello We Are Created a docker container");
});

app.listen(PORT, () => console.log("Node.js application: Started"));