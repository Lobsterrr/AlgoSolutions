SELECT Person.FirstName, Person.LastName, Address.City, Address.State FROM Person, Address WHERE Person.PersonId = Address.PersonId;
