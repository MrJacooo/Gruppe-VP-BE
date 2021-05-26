# Gruppe-VP-BE
## What this app does
This app is a backend for [this repository](https://github.com/MrJacooo/Gruppe2-VP-FE). The backend sends items from a list, which is not hooked up to any database, but rather has a list, which saved all the items as Objects. All the items can be returned as JSON Objects.  
It contains a three-layer app, which has all the CRUD methods, fully functioning. All methods contain a CORS-Adress, which will probably be needed to change.

## Methods
#### **_GetMapping()_**
The getMapping() method is triggered by the default path. It does not need any parameters or RequestBody. The method returns all list items when called.

#### **_PostMapping(Item item)_**
The postMapping(_Item item_) method is triggered by the default path. It needs an item, which is given to it by the RequestBody. It creates a new Object and adds it onto the list. The needed parameters look like this:  
`
{  
"name": "myName",  
"description": "myDescription",  
"amount": "myAmount",  
"amountType": "myAmountType",  
"alreadyBought": "isAlreadyBought"  
}
`

#### **_DeleteMapping(long id)_**
The deleteMapping(_long id_) method is triggered by the path: "/id". It only needs the path variable to function. It deletes the Object with the given id. The needed parameter can be any existing number.

#### **_PutMapping(long id)_**
The putMapping(_long id_) method is triggered by the path "/id". It only needs the path variable to function. It changes the "alreadyBought" boolean status. The needed parameter can be any existing number.

## Version updates
#### **_Version 1.0_**
Added the getMapping method, which returns all items from the list.

#### **_Version 2.0_**
Added the postMapping method, which is responsible for adding new items to the list. It gives every item a new id, automatically.

#### **_Version 3.0_**
Added the deleteMapping method, which is able to delete existing items, by passing the item id trough the link.

#### **_Version 3.1_**
Updated the README.md file. It had a few spelling errors, so I corrected them.

#### **_Version 4.0_**
Added the putMapping method, which is able to change the status of the boolean "alreadyBought".

#### **_Version 4.1_**
Updated the README.md file. It was missing the Version 4.0 text.

#### **_Version 4.2_**
Updated the README.md file. The methods where missing what they actually do. _oops_
