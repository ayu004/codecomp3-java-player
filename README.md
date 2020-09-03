# CodeComp3-Java-Player

# Codecomp is hosted entirely on GCP, so you do not need DB environment at any step.

## Prerequisites to play
- Git
- Editor of your choice(eclipse/intelliJ recommended)

## How to play from your local machine with 'dumb' algo
We have written all boilerplate code to get you started within 5 minutes. You kust need to make 'MySmartAlgo' smarter. You can improve your algo by playing with test server.
- Clone this repo using : git clone <Link of this repo>
- cd codecomp3-java-player
- change 'myTeam' and 'pass' in application.properties inside src/main/resources
- Using editor of your choice, Run as Java Application or as maven project using run goal as : clean spring-boot:run and start playing.
- see url for live score : <leaderboard URL Here>

## Final Competition Day
- You need to deploy your algo in Google Cloud Platform to connect to game server.
- You can fork this repository, modify algo, check-in and deploy into Google Cloud from your github repository.
-  Step-by-step guide to deploy a Java application on google cloud is given below:

## Step-by-step guide

1. Setting up Google Cloud Project
  * Skip this section if you have google cloud account set up already
- Go to [Google Cloud](https://cloud.google.com/) and click on ‘Get Started for FREE‘.
- Login using personal gmail account and choose your country and accept terms and conditions and click Continue
- In the next step, fill your details, like account type, Name, Address, credit card details, tax information, etc. If you have old Gmail account and all the information is already there it would take it and you might not have to fill all the details.
- After filling all the details click on “Start my free trial“.
- Google will setup your cloud account and in few seconds your Google Cloud Platform account will be ready to start deploying applications on it. It will look like below:
![GCP Home Screen](/img/welcome.PNG)

2. Deploying the Java Application
- Enable Cloud Console APIs
  - Go to Navigation Menu(Top left Corner) > API & Services > Dashboard
  - Click on Enable APIS and SERVICES button.
  - Search App Engine Admin in search box.
  - Click on App Engine Admin and click Enable in next step
  - Wait till it gets enabled successfully.
  - Similarly enable Cloud Build API.
 
- Create an App Engine app
  - Go to Navigation Menu(Top left Corner) > App Engine > Dashboard
  - Select Region according to your location.
  - Click Create App and wait till it successfully creates an App Engine app.
 
- Grant App Engine access to the Cloud Build service account to automate deployments
  - Go to Navigation Menu(Top left Corner) > Cloud Build > Settings
  - Enable App Engine Admin role
  
- Create a build Trigger
  - Go to Navigation Menu(Top left Corner) > Cloud Build > Triggers
  - Click Create trigger
  - Fill out the details as per your choice. For simplicity keep Event value as Push to Branch.
  - Before Selecting source, lets fill out the remaining form.
  - For Simplicity, Fill Branch as * (meaning to trigger build on push to any branch)
  - In Build Configuration, Select Cloud Build Configuration as File Type and keep all fields as it is
![Create Trigger](/img/createTrigger.PNG)  
  
  - Now come to Source field, click on Connect new repository which appears on a click and select GitHub as source.
  - GCP will ask you to login into your account to verify the user and for permission to access your repository
  - Select your forked github repository and click Connect Repository and then on Create push Trigger.
![Connect Repository](/img/connectRepo.PNG)    
  
  - Now everytime you push the code, this will trigger the build and deploy the app to App Engine, you can even trigger it manually by clicking Run Trigger in Triggers tab in Cloud Build.
  
- Checking Logs
  - Go to App Engine > Services and click on Tools in your default deployed service and select Logs which will open the logs of application.
  - You can click on Play button on top to start streaming live logs.
![Logs](/img/logs.PNG)  
  
- It might take some time to service to get up and running or logs to load initially

- Happy Coding :smile:
  



