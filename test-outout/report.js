$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactUs.feature");
formatter.feature({
  "line": 1,
  "name": "Securepay - Contact Us Page",
  "description": "",
  "id": "securepay---contact-us-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7734124670,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Securepay - Navigate to Contact Us form and enter details",
  "description": "",
  "id": "securepay---contact-us-page;securepay---navigate-to-contact-us-form-and-enter-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user searches for securepay on google",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "clicks through to securepay website",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User is redirected to the SecurePay homepage",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Navigates to Contact Us page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "verify that the Contact Us page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User should be able to enter details into the contact form",
  "keyword": "And "
});
formatter.match({
  "location": "SearchActions.user_searches_for_securepay_on_google()"
});
formatter.result({
  "duration": 4228113302,
  "status": "passed"
});
formatter.match({
  "location": "SearchActions.clicks_through_to_SecurePay_website()"
});
formatter.result({
  "duration": 4383131464,
  "status": "passed"
});
formatter.match({
  "location": "HomePageActions.user_is_redirected_to_the_SecurePay_homepage()"
});
formatter.result({
  "duration": 43081990,
  "status": "passed"
});
formatter.match({
  "location": "HomePageActions.user_Navigates_to_Contact_Us_page()"
});
formatter.result({
  "duration": 166816256,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsActions.verify_that_the_Contact_Us_page_is_displayed()"
});
formatter.result({
  "duration": 7561099133,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsActions.user_should_be_able_to_enter_details_into_the_contact_form()"
});
formatter.result({
  "duration": 1471919187,
  "status": "passed"
});
formatter.after({
  "duration": 2915450153,
  "status": "passed"
});
});