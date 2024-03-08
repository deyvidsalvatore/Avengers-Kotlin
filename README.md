# AvengerResource Kotlin Class README

## Description:
This Mini Webproject represents a RESTful web resource for managing Avengers. It provides endpoints for retrieving, creating, updating, and deleting Avenger entities.

## Endpoints:
1. **GET /v1/api/avenger**
    - Retrieves a list of all Avengers.

2. **GET /v1/api/avenger/{id}/detail**
    - Retrieves details of a specific Avenger by ID.

3. **POST /v1/api/avenger**
    - Creates a new Avenger entity.

4. **PUT /v1/api/avenger/{id}**
    - Updates an existing Avenger entity by ID.

5. **DELETE /v1/api/avenger/{id}**
    - Deletes an existing Avenger entity by ID.

## Class Structure:
- com.deyvidsalvatore.avengersapi.application.web.resources.AvengerResource

## Dependencies:
- AvengerRepository: Used for interacting with the database to perform CRUD operations on Avenger entities.

## Sample Usage:
- **To retrieve a list of all Avengers:**
  Send a GET request to `/v1/api/avenger`.

- **To retrieve details of a specific Avenger:**
  Send a GET request to `/v1/api/avenger/{id}/detail`, where `{id}` is the ID of the Avenger.

- **To create a new Avenger:**
  Send a POST request to `/v1/api/avenger` with the Avenger data in the request body.

- **To update an existing Avenger:**
  Send a PUT request to `/v1/api/avenger/{id}` with the updated Avenger data in the request body, where `{id}` is the ID of the Avenger to be updated.

- **To delete an existing Avenger:**
  Send a DELETE request to `/v1/api/avenger/{id}`, where `{id}` is the ID of the Avenger to be deleted.

*Note: Ensure that request and response bodies comply with the AvengerRequest and AvengerResponse formats defined in the class.*
