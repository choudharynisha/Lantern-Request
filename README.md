# Lantern Request

As our final project for [the Google J-Term / Applied CS program](https://appliedcsskills.withgoogle.com), we decided to create an app to facilitate Bryn Mawr students' requests for Lantern Van rides around campus and select off-campus locations. The Lantern Van is a service where a student driver will pick students up and drop them off at desired locations.

Our final project supports functionality for choosing pickup and dropoff locations, and for displaying both locations on the map.

## Inspiration & Objectives

When Bryn Mawr students call to request a ride, they usually have to wait a long time, do not know where the Lantern Van is, and find it to be an inconvenient process.

By creating Lantern Request, we wanted to create an app where students can request rides more conveniently, get real-time updates of where the Lantern Van is, how long they have to wait before the Lantern Van to arrives at their pickup location, and add multiple pickup and dropoff locations.

## App Images

When the app is first run, the default screen prompts the user for a pickup and dropoff location.
![Default](https://www.nishachoudhary.me/assets/images/JTerm-Lantern-Ride/RequestRide.png)

The menu for the pickup and dropoff locations look like the following, with more locations (like Starbucks and Wawa) not shown.
![Dropdown Menu 1](https://www.nishachoudhary.me/assets/images/JTerm-Lantern-Ride/DropdownMenu1.png)

![Dropdown Menu 2](https://www.nishachoudhary.me/assets/images/JTerm-Lantern-Ride/DropdownMenu2.png)

A sample ride from Rockefeller Hall to Park Science Building is shown below.
![Sample Upcoming Ride](https://www.nishachoudhary.me/assets/images/JTerm-Lantern-Ride/SampleUpcomingRide.png)

## Challenges

Since we are a team of four students, we decided to do some pair programming. The dropdown menus for the current default page of the app on one screen and being able to store the pickup and dropoff locations was on one computer, which was to be merged with the code for setting the markers for the selected pickup and dropoff locations on the map using the Google Maps API. There were some subtle differences in some of the project files on the two computers, so merging took much more time than originally anticipated to stop the app from crashing.

A challenge that was much easier to be resolved was figuring out how to implement the Google Maps API. While we were originally using a MapView object in Android Studio, we found, through the documentation, that using a GoogleMap object and an API key would help us display the map we wanted on the screen.

A challenge we hoped to resolve was being able to support ride requests with multiple passengers. Since the Lantern Van can hold up to four passengers, we would have liked to have the user be able to specify the number of passengers for their ride instead of defaulting to one passenger per request.

## Next Steps

1. Enhance the app so that a single request can be made for 1, 2, 3, or 4 passengers.

2. Manage time slots and figure out a more realistic waiting time.

3. Adjust the size of the map for a better UI experience.

4. Make an iOS version of the app.

5. Make the app available for download via the Apple App Store and Google Play Store.
