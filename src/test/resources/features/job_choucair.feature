# Autor: leider tanos

@stories
Feature: I want to send my automation resume on the choucair testing page in the jobs section

  @scenario1

  Scenario Outline: search for an automation job in medellin

    Given which leider wants to submit their Analista de Pruebas resume on the choucair page

    When leider enter search data
    | strJob              | strCity         |
    | Analista de prueba       | medellin        |

    And register to send the resume
    | strName   | strEmail   | phoneNumber   | strStudies   | workExperience   | technicalKnowledge   | strAvailability   | salaryAspiration | aditionalMessage |
    | <strName> | <strEmail> | <phoneNumber> | <strStudies> | <workExperience> | <technicalKnowledge> | <strAvailability> | <salaryAspiration> | <aditionalMessage> |

    Then He verifies the <message> on the screen

    Examples:
      | strName | strEmail        | phoneNumber | strStudies            | workExperience | technicalKnowledge | strAvailability | salaryAspiration | aditionalMessage | message |
      | pepito | pepito@email.com | 7777777777  | ingeniero de sistemas | si             | si                 | tiempo completo | 7000000 | hola mundo | "CV" is a required field |