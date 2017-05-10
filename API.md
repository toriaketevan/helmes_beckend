**Create Article**
----
* **URL**

  api/article/

* **Method:**

    `POST`

* **Data Params exapmle**

        {
            "title": "post1",
            "date": "2017-10-10",
            "text": "post1 text1"
        }

* **Success Response example:**

  * **Code:** 201 <br />
    **Content:** 
    
         {
             "title": "post1",
             "date": "2017-10-10",
             "text": "post1 text1"
         }
 
* **Error Response example:**
  * **Code:** 400 bad request
  
**Get Article**
----
* **URL**

  api/article/id


*  **URL Params**
  
     **Required:**
   
     `id=[integer]`

* **Method:**

    `GET`

* **Success Response example:**

  * **Code:** 200 <br />
    **Content:** 
    
         {
             "id": 1,
             "title": "post1",
             "date": 1507593600000,
             "text": "post1 text"
         }
 
 * **Error Response example:**
     * **Code:** 404 not found
     
 **Get Articles**
 ----
 * **URL**
 
   api/article/
 
 * **Method:**
 
     `GET`
 
 * **Success Response example:**
 
   * **Code:** 200 <br />
     **Content:** 
     
         [
                    {
                      "id": 1,
                      "title": "post1",
                      "date": 1507593600000,
                      "text": "post1 text1"
                    },
                    {
                      "id": 2,
                      "title": "post2",
                      "date": 1507593600000,
                      "text": "post2 text2"
                    },
                    {
                      "id": 3,
                      "title": "post3",
                      "date": 1507593600000,
                      "text": "post3 text3"
                    }
         ]
  
 * **Error Response example:**
   * **Code:** 404 not found
 
 
  **Delete Article**
  ----
  * **URL**
  
    api/article
  
  * **Method:**
  
      `DELETE`
  
  * **Success Response example:**
  
    * **Code:** 204 no content <br />
   
  * **Error Response example:**
    * **Code:** 404 not found
    
 **Update Article**
 ----
 * **URL**
 
   api/article/id
 
 * **Method:**
 
     `PUT`
   
 *  **URL Params**
  
    `id=[integer]`
 
 * **Data Params exapmle**
 
   {
   	"title": "post1",
   	"date": "2017-10-10",
   	"text": "post1 updated"
   }
 
 * **Success Response example:**
 
   * **Code:** 201 <br />
     **Content:** 
     
         {
             "title": "post1",
             "date": "2017-10-10",
             "text": "post1 text1"
         }
  
 * **Error Response example:**
   * **Code:** 400 bad request