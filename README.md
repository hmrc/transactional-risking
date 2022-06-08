
# Transactional Risking Service

This will be the service which will provide HMRC Assist, both as an API as well as for internal usage.

## Documentation

### OpenAPI

The OpenAPI specs are located [here](resources/public/api/conf) and are served from `/api/conf/`; for example:

``` 
curl http://localhost:9000/api/conf/0.0.0/application.yaml
```

If you'd like to see it in a more structured format, I'd suggest copying & pasting the spec into [Swagger Editor](https://editor.swagger.io/).

### License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").