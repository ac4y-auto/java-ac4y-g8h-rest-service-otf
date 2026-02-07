# java-ac4y-g8h-rest-service-otf

On-the-fly RESTful service variant for G8H GUID-to-HumanId operations. All endpoints use GET with query parameters.

## Coordinates

- **GroupId**: `ac4y`
- **ArtifactId**: `ac4y-g8h-rest-service-otf`
- **Version**: `1.0.0`

## Description

Lightweight REST service variant where all operations are exposed as GET endpoints with `@QueryParam("request")` for JSON request data. Suitable for quick integration and testing.

### Endpoints

All endpoints accept a `request` query parameter with JSON payload.

| Method | Path | Description |
|--------|------|-------------|
| GET | `/setByHumanIDs` | Set G8H mapping |
| GET | `/getGUIDByHumanIDs` | Get GUID by human IDs |
| GET | `/getTemplateGUID` | Get template GUID |
| GET | `/isExistByGUID` | Check existence by GUID |
| GET | `/isExistByHumanIDs` | Check existence by human IDs |
| GET | `/getByGUID` | Get by GUID |
| GET | `/getByHumanIDs` | Get by human IDs |
| GET | `/getList` | Get filtered list |
| GET | `/getInstanceList` | Get instance list |
| GET | `/getGUIDList` | Get GUID list |

## Dependencies

- Jersey 1.x (JAX-RS)
- `ac4y-g8h-object-service`
- `ac4y-http-handler`

## Build

```bash
mvn clean package
```

## Origin

Extracted from `IJAc4yG8HModule/RestServiceOnTheFly`.
