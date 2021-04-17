Feature: Automation Study  Case

    Scenario: Login user,control account,add product to basket , control price-name
        Given I am on the sign in page
        When I sign in with valid credentials
        And Go to the Dresses field
        And Go to the Summer Dresses field
        And The second product is added from Summer Dresses to the basket
        And Go to the T-Shirts field
        And A Tshirt product is added to the basket
        And My shopping cart page should be open
        And Compare actual and expected name for summer dress
        And Compare actual and expected price for summer dress
        And Compare actual and expected name for T-shirts
        And Compare actual and expected price for T-shirts
        Then Compare actual total price and expected total price
