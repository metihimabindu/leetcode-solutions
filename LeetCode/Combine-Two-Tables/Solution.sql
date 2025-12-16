1SELECT Person.firstName,Person.lastName,Address.city,Address.state FROM Person
2LEFT JOIN Address
3ON Person.personId=Address.personId;
4
5