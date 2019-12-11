package com.softhans.mylocalization;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * For string localization, always replace the hard core strings with a reference text in the strings.xml
         * Click on Edit Translation found in the actvity.xml --> preview section--> top right.
         * Click the add local icon and choose the language.
         * Input your translation.
         * Go back to the preview of the xml file and select your tranlated language to see changes
         * If you notice the strings folder now has new strings.xml for the new language
         */


        /**
         * For image localization, go to res -->New-->Android resource directory
         * Under resource type select drawable.
         * Under available qualifier, select locale and then the language
         * in the res folder a drawble for the new language created. You can see that by "reveal in finder"
         */


        /**
         * To localize app based on the version of device, create a new Android resource directory,
         * kepp the resource type to be value.--> Type the version of android you want to use.
         * You will get value-v24 for example. You copy can copy the string, color and style file into it
         * and edit to your taste.
         * Your xml preview screen however will choose the highest API level amongst those you choosed.
         * IF you choose a lower API, your preview will reflect the default values of your app
         */

        /**
         * For layout localization, use same procedure for image localization,
         * but choose layout as your resource type
         */

        /**
         * For time Factor, say day and night. Create a night layout,
         * change the background its xml file into a darker background.
         * When your night mode is on on your device, that is how your app will look like
         */

        /**
         * To localize your app in terms of shape, size and resolution. Do same as image localization
         * But in the resource type select layout and choose qualifier UI Mode.
         * choose the UI Mode you want
         * put and edit your countent as you want in your layout folder.
         */

        /**AVOID OVER LOCALIZING YOUR APPS
         * Localize only when you want to provide a good user experience. Keep it user friendly.
         */

        /**
         * To force layout localization...
         * after the -->super.onCreate(savedInstanceState);<-- of your activity (say "MainActivity.java)  type the code:
         * if(isLocalizationDisabled)
         *    setContentView(R.layout.activity_main_unlocalized);
         *
         *    else
         *       setContentView(R.layout.activity_main);
         */


        /**
         * To force translation:
         * Add the following method in your activity class and call it in onCreate as you called the layout localization
         *
         * private void setLanguageForApp(String language){
         *
         *     String languageToLoad  = language; //pass the language code as param
         *     Locale locale;
         *     if(languageToLoad.equals("not-set")){
         *         locale = Locale.getDefault();
         *     }
         *     else {
         *         locale = new Locale(languageToLoad);
         *     }
         *     Locale.setDefault(locale);
         *     Configuration config = new Configuration();
         *     config.locale = locale;
         *     getBaseContext().getResources().updateConfiguration(config,
         *             getBaseContext().getResources().getDisplayMetrics());
         * }
         *
         */
    }
}
