package com.example.lazycolumnexample

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import com.techmania.lazycolumnexample.CountryModel

@Composable
fun retrieveCountries() : SnapshotStateList<CountryModel>{

    val countryList = remember {
        mutableStateListOf(

            CountryModel(1,"Argentina","Argentina, officially the Argentine Republic, is a South American country, known for its vast Pampas grasslands and the Andes Mountains. The capital is Buenos Aires, the official language is Spanish, and the currency is the Argentine peso.",R.drawable.argentina),
            CountryModel(2,"Brazil","Brazil, officially known as the Federal Republic of Brazil, is the largest country in South America and the fifth largest in the world. It’s known for its vast Amazon River basin, diverse culture, and love for soccer. The capital is Brasilia, the official language is Portuguese, and the currency is the Real.",R.drawable.brazil),
            CountryModel(3,"Bulgaria","Bulgaria, officially the Republic of Bulgaria, is a country in Southeast Europe, located on the eastern portion of the Balkan Peninsula. The capital is Sofia, the official language is Bulgarian, and the currency is the Lev." ,R.drawable.bulgaria),
            CountryModel(4,"France","France, officially known as the French Republic, is a country in northwestern Europe. It’s historically and culturally significant, with Paris as its capital. The official language is French, and the currency is the Euro.",R.drawable.france),
            CountryModel(5,"Germany","Germany, officially known as the Federal Republic of Germany, is a country in north-central Europe. The capital is Berlin, the official language is German, and the currency is the Euro.",R.drawable.germany),
            CountryModel(6,"Ireland","Germany, officially known as the Federal Republic of Germany, is a country in north-central Europe. The capital is Berlin, the official language is German, and the currency is the Euro.",R.drawable.ireland),
            CountryModel(7,"Italy","Italy, officially known as the Italian Republic, is a country in Southern and Western Europe. It’s known for its rich history, art, culture, and cuisine. The capital is Rome, the official language is Italian, and the currency is the Euro.",R.drawable.italy),
            CountryModel(8,"Netherlands","The Netherlands, also known as Holland, is a country located in northwestern Europe with overseas territories in the Caribbean. It’s known for its low-lying and remarkably flat topography, with large expanses of lakes, rivers, and canals. The capital is Amsterdam, the official language is Dutch, and the currency is the Euro.",R.drawable.netherlands),
            CountryModel(9,"Romania","Romania is a Central, Eastern, and Southeast European country known for its diverse geography and rich history. The capital is Bucharest, the official language is Romanian, and the currency is the Romanian Leu.",R.drawable.romania),
            CountryModel(10,"Slovakia","Slovakia, officially the Slovak Republic, is a landlocked country in Central Europe. The capital is Bratislava, the official language is Slovak, and the currency is the Euro.",R.drawable.slovakia),
            CountryModel(11,"Spain","Spain, officially the Kingdom of Spain, is a country in Southwestern Europe. It’s known for its diverse culture and rich history. The capital is Madrid, the official language is Spanish, and the currency is the Euro.",R.drawable.spain),
            CountryModel(12,"Turkey","Turkey, officially the Republic of Turkey, is a transcontinental country located at the juncture of Southeast Europe and West Asia. The capital is Ankara, the official language is Turkish, and the currency is the Turkish Lira.",R.drawable.turkey)

        )
    }

    return countryList

}