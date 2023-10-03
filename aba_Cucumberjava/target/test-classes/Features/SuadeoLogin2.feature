@mustrun
Feature: Check Suadeo login functionality

#@smoke
  Scenario Outline: Check login functionality with valid credential

    Given Open suadeo login page
    When authentiacation selection
    When enter email <email>
    When enter password <password>
    And Click login button
    Then User should loginn successfuly
    And Suadeo home page should display

    Examples: 
      | email    | password        |
      | qatester | &m.XkHUa.4qm7Df |

 #Scenario Outline: Check login functionality with valid credential
#
    #Given Open suadeo login page
    #When authentiacation selection
    #When enter email <email>
    #When enter password <password>
    #And Click login button
    #Then User should login successfuly
    #And Suadeo home page should display
#
    #Examples: 
      #| email    | password        |
      #| qatester | &m.XkHUa.4qm7Df |

 
      

   #@regression   
   #Scenario: Sample 2
      #Given
      #When
      #Then
      #
   #@smoke @regression   
   #Scenario: Sample 3
      #Given
      #When
      #Then
      #
         #@important   
   #Scenario: Sample 4
      #Given
      #When
      #Then