package org.example.project

import Country
import kotlinx.serialization.Serializable

@Serializable
internal val countries = arrayListOf<Country>(
    Country("Argentina", "AR", "🇦🇷"),
    Country("United States", "US", "🇺🇸"),
    Country("Canada", "CA", "🇨🇦"),
    Country("Germany", "DE", "🇩🇪"),
    Country("France", "FR", "🇫🇷"),
    Country("Japan", "JP", "🇯🇵"),
    Country("Australia", "AU", "🇦🇺"),
    Country("Brazil", "BR", "🇧🇷"),
    Country("India", "IN", "🇮🇳"),
    Country("United Kingdom", "GB", "🇬🇧"),
    Country("Mexico", "MX", "🇲🇽"),
    Country("South Africa", "ZA", "🇿🇦"),
    )