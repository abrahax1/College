const logRequest = (app) => {
  app.use((req, res, next) => {
    console.log(`${req.method} request for ${req.url}`);
    next();
  });
};

export default logRequest;
