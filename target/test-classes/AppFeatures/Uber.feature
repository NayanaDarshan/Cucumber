Feature: Uber booking

Scenario: Testing uber booking scenario

Given User tries to book the "Sedan" type car
When User books the "Sedan" type car the pick up location is "Banglore" and drop location "Mandya"
Then Driver starts the Journey
And Driver ends the Journey
Then user pays the amout of Rs 2000