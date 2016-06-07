Dim customData = Await account.GetCustomDataAsync()

customData.Put("name", "createadmin")
customData.Put("description", "This permission allows the account to create an admin")
customData.Put("action", "read")
customData.Put("resource", "/admin/create")
customData.Put("effect", "allow")

Await customData.SaveAsync()
