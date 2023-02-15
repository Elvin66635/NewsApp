<!-- ABOUT THE PROJECT -->
## About The Project

NewsApp is a sample project that presents a modern approach to Android app development.

* MVVM
* Dagger Hilt
* Retrofit
* Room
* Coroutines
* Navigation Components
* Cache Strategy (Repository Pattern)
* Coroutines
* ViewBinding

## Description
This app uses NewsAPI to get various sources and each source can provide major headlines. It uses Retrofit 2 to fetch news sources and news headlines from the API and displays in a RecyclerView. It uses Room Persistence Library to provide offline functionality App first loads the data from DB and then checks for fresh data from API, API is only called if DB data is empty or expired The main aim of this sample app is show how to use the new Architecture Guidelines with Kotlin.

## Architecture 

![](https://miro.medium.com/max/700/1*3u5JnmqONR4UnwRE6tEV3Q.png)


### Screenshots
![news_1](https://user-images.githubusercontent.com/53175847/218965694-86827bb6-535e-499f-873c-db3071185f49.png) ![news_search](https://user-images.githubusercontent.com/53175847/218968949-333c3e25-3a80-4f87-85af-8c7e8565b883.png) ![news_3](https://user-images.githubusercontent.com/53175847/218968024-650a5f54-c2a4-4f0f-85f1-a583952eae14.png)
