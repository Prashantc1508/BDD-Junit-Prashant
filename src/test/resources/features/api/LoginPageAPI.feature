Feature: Validate api response for Amazon website

  @api @Login
  Scenario: Validate the get api response
    Given User get the booking id and validate the response
    When User create the bookingid

