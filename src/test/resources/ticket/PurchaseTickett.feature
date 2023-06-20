Feature: Purchasinhg Ticket Fuctionality

  Scenario Outline: verifying purchasing ticket
    Given user navigates to login page "https://blazedemo.com/purchase.php "
    When User enters Full Name "<firstName>"
    And User enters Address "<address>"
    And User enters City "<city>"
    And User etners Zip Code "<zipcode>"
    And User selects Card type "<cardType >"
    And User enters Credit card number "<creditCardNumber >"
    And User enters month "<month>"
    And User enters year "<year>"
    And enters Name on card "<nameOnCard>"
    And User Clicks on remember me
    And User clicks on purchase flight
    Then User verifies success message "<message>"

    Examples: 
      | firstName   | address      | city        | state | zipcode | cardType         | creditCardNumber | month | year | nameOnCard | message                            |
      | John cena   | 123 drive st | Gilbert     | AZ    |   85297 | Visa             |          0000000 |    11 | 2017 | John       | Thank you for your purchase today! |
      | Hamza  S    | 345 drive st | sioux falls | SD    |   57103 | American Express |          1111111 |    12 | 2000 | Hamza      | Thank you for your purchase today! |
      | Gary    G   | 678 drive st | scottsdale  | AZ    |   58258 | Visa             |          2222222 |     2 | 2022 | Gary       | Thank you for your purchase today! |
      | Meridian  M | 912 drive st | chandler    | AZ    |   58260 | 'Dinner''s Club' |          3333333 |     5 | 2018 | Meridian   | Thank you for your purchase today! |
      | Yuliya  Y   | 454 drive st | brookings   | SD    |   57104 | Visa             |          4444444 |     6 | 2020 | Yuliya     | Thank you for your purchase today! |
