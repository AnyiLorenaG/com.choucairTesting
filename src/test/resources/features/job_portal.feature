#Author: Lore-16@live.com
# LaNGUAgE: EN
Feature:Validate that if you redirect employee portal
  As a commercial user,I want enter the job portal button

  @ValidateJobsPortal
  Scenario:validate that the jobs portal button
    Given That users  needs to enter the page choucair
    When  enter the jobs section and click on the job portal button and agree to continue
    Then see that it redirects us to the magneto page Magneto Empleos
