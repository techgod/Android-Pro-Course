# Week 2 - Creating layouts using XML

#### A week down, 3 more to go! This week we learn about XML Layouts.

#### Link to this week's video : 


Before starting, I’d like to tell you the format this week’s content is a bit different from that of the last week. This week, I’ll be running over the entire contents of the week but not provide you with a detailed explanation for each part. 

Instead, I’ll be putting links to documents explaining the topic. The reason being, most of the links are straight from the official Android Developers website ( https://developer.android.com ) where you’ll find the most thorough explanation there is, better than what I can probably give. 

Also, I’d like you to get familiar with using the developer website as going forward, it’s going to be your most helpful tool! It has everything from beginner tutorials to documentation for the most complex classes, so when you’re stuck, it’s a good place to begin.

However, for someone just starting off, the site can get a bit overwhelming with some random terms everywhere. So, for now, I’ll be giving you direct links to the pages & sections which you should read. You are however welcome encouraged to explore beyond.


For literally every element you interact with in the app, it is defined in a language known as XML. XML stands for extensible markup language. Think of it similar to HTML. 

**Suggested Reading:** [Introduction to XML](https://www.w3schools.com/xml/xml_whatis.asp)

Have a look at this week’s video, I have given a basic explanation of how layouts work.
To summarize, layouts consists of two main parts, Views & ViewGroups. Views are what we see & interact with (e.g. buttons, textfields etc) whereas ViewGroups are containers which hold the views – deciding how they are arranged.

**Suggested Reading:** [Basic Overview of View and ViewGroups](https://developer.android.com/guide/topics/ui/declaring-layout)

The first step is to learn a few different views we can use. The most important ones are TextView, EditText, Button & ImageView. We’ll also be using some others like ImageButton, RadioButton, CheckBox occasionally depending on our use. 

Check out [this](https://www.formget.com/android-views/) useful list of views along with the code to implement them. Don’t worry if you don’t understand the code right now, we’ll be seeing that later. Make sure you explore the different attributes of these views though – width, height, text and check out the possible values.


Now that you have an idea of the views, lets take a look at ViewGroups. We’ll be learning about two types of ViewGroups this week, LinearLayout and RelativeLayout. Let’s start with LinearLayout.

[LinearLayout] (https://developer.android.com/guide/topics/ui/layout/linear) : This arranges views in a linear order, either horizontally or vertically. It’s probably the easiest to implement yet very powerful and is used even in complex layouts. Follow the link to learn more on Linear Layouts.

Check out the example code at the above link, you’ll see that there is an outer LinearLayout tag, inside which there are multiple views (3 EditText and a Button). The linear layout has its attribute set to vertical which means the views are arranged one below the other.

Understanding and even writing the code is important, but to start off we can make use of a super cool tool in Android Studio – Layout Editor! Using this, making layouts can be as easy as drag and drop. Check out [this](https://developer.android.com/studio/write/layout-editor) for how to use the Layout Editor.

LinearLayout is good and all, but let’s say we wanted text somewhere on the extreme top of the layout and then some at the extreme bottom. Linear Layout only allows us to place elements one below the other. For such a requirement, we can use a ViewGroup called RelativeLayout.

[RelativeLayout](https://developer.android.com/guide/topics/ui/layout/relative): Views are arranged relative to other views/elements. e.g. We can assign attributes to the view such as android:alignParentBottom”true” to move the view to the bottom of the screen. We can also set views in relation to other views, e.g. we can add an attribute like android:layout_toRightOf=”@id/welcometext” to a view to assign it to the right of a view with ID “welcometext”. Follow the above link for more on RelativeLayout.


Try making your own layouts now – your week 2 assignments will consist of creating layouts in XML.


One last thing. Did you know, the layouts you have created using the Layout Editor have generated XML code automatically? Just switch tabs from design to text at the bottom of the page. Try understanding the XML code and see how the attributes are defined. While creating complex nested layouts, the layout editor gets complex and you would have to edit attributes straight in the XML.

That’s it for this week. There’s a lot to self-learn this week, and I encourage you to explore the topics in more detail on your own. Your app now contains all the ingredients of a proper app such as text, images, buttons etc. But does your app perform any function? We’ll be looking at that next week.

### Make sure you check the assignments in the 'assignments' folder and complete them before the deadline!
