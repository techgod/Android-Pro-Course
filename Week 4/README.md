# Week 4 - Google APIs & Firebase

#### You've made it! The 4th & final week of our course. You've done some amazing stuff in the last 3 weeks and basically have all the knowledge to create basic apps. Let's have a look at some advanced concepts.

#### Link to this week's video : **to be inserted**


That can be added using APIs. API stands for Application Programming Interface. A 
good API makes it easier to develop a computer program by providing all the building blocks, which are then put together by the programmer. 

First lets have a look at using Google APIs.

**Suggested Reading:** [Activity Lifecycle](https://developer.android.com/guide/components/activities/activity-lifecycle)

Ok back to the onCreate() method.There are already a couple of stuff there. You'll also find an explanation to the above stuff in the link above..but lets not mess around with it much. One interesting line here though is *setContentView(R.layout.activity_main)* . *R.layout.activity_main* is nothing but the path of the XML layout file which you had last week. This is how the activity knows what layout to inflate.

Lets start off by trying to find a reference to one of our elements in the layouts. The general procedure is:
1) Create an object of the view class
2) initialize it to the view returned using the findViewById() method
3) Access the methods of the class through the object.

Example:
```java
Button bt;
bt= findViewById(R.id.button);
bt.setText("Click Me!")
```

Let's have a look at another important concept now...starting a new activity. For any useful app, you can't possibly fit the entire app on one screen.
To start a new activity, we use something called Intents. Intents carry information required for the transition of the activity. We can also pass extra information through intents. So through intents, our activities can even communicate with each other.

**STRONGLY Suggested Reading:** [Starting a New Activity](https://developer.android.com/training/basics/firstapp/starting-activity)

That's the basic crux of it. I'll be also be uploading the demo project I had created during the GD in the ***code*** folder.
Going through the given links and the demo code should give you a good undestanding of the whole concept. Have fun!

### Make sure you check the assignments in the 'assignments' folder and complete them before the deadline!
