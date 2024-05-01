/*
 * Copyright (C) 2022 Patrick Goldinger
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.patrickgold.florisboard.ime.media.emoji

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEmotions
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.EmojiFlags
import androidx.compose.material.icons.filled.EmojiFoodBeverage
import androidx.compose.material.icons.filled.EmojiNature
import androidx.compose.material.icons.filled.EmojiObjects
import androidx.compose.material.icons.filled.EmojiPeople
import androidx.compose.material.icons.filled.EmojiSymbols
import androidx.compose.material.icons.filled.EmojiTransportation
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.ui.graphics.vector.ImageVector
import dev.patrickgold.florisboard.R

enum class EmojiCategory(val id: String, @StringRes val stringRes: Int) {
    RECENTLY_USED("recently_used", R.string.emoji__category__recently_used),
    SMILEYS_EMOTION("smileys_emotion", R.string.emoji__category__smileys_emotion),
    PEOPLE_BODY("people_body", R.string.emoji__category__people_body),
    ANIMALS_NATURE("animals_nature", R.string.emoji__category__animals_nature),
    FOOD_DRINK("food_drink", R.string.emoji__category__food_drink),
    TRAVEL_PLACES("travel_places", R.string.emoji__category__travel_places),
    ACTIVITIES("activities", R.string.emoji__category__activities),
    OBJECTS("objects", R.string.emoji__category__objects),
    SYMBOLS("symbols", R.string.emoji__category__symbols),
    FLAGS("flags", R.string.emoji__category__flags);

    fun icon(): ImageVector {
        return when (this) {
            RECENTLY_USED -> Icons.Default.Schedule
            SMILEYS_EMOTION -> Icons.Default.EmojiEmotions
            PEOPLE_BODY -> Icons.Default.EmojiPeople
            ANIMALS_NATURE -> Icons.Default.EmojiNature
            FOOD_DRINK -> Icons.Default.EmojiFoodBeverage
            TRAVEL_PLACES -> Icons.Default.EmojiTransportation
            ACTIVITIES -> Icons.Default.EmojiEvents
            OBJECTS -> Icons.Default.EmojiObjects
            SYMBOLS -> Icons.Default.EmojiSymbols
            FLAGS -> Icons.Default.EmojiFlags
        }
    }
}
