# Dockerfile
FROM node:latest

# Create app directory
WORKDIR /usr/src/app

# Install app dependencies
COPY package*.json ./
RUN npm install

# Bundle app source
COPY . .

# Bind to port 8000
EXPOSE 8000

# Run the application
CMD ["node", "index.js"]
