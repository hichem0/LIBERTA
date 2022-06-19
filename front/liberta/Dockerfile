# base image
FROM node:16.3.0-alpine

# set working directory
WORKDIR /app

# add `/app/node_modules/.bin` to $PATH
ENV PATH /app/node_modules/.bin:$PATH

# install and cache app dependencies
COPY package.json /app/package.json
RUN npm install
RUN mkdir node_modules/.cache && chmod -R 777 node_modules/.cache
RUN npm install -g @vue/cli

# start app
CMD ["npm", "run", "serve"]docker build -t my-app:dev