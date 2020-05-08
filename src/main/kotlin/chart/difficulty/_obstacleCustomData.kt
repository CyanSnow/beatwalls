package chart.difficulty

import com.google.gson.annotations.SerializedName

@Suppress("ClassName")
data class _obstacleCustomData(
    @SerializedName("_position") val _position: List<Double>? = null,
    @SerializedName("_scale") val _scale: List<Double>? = null,
    @SerializedName("_color") val _color: List<Double>? = null,
    @SerializedName("_rotation") val _rotation: Double? = null,
    @SerializedName("_localRotation") val _localRotation: List<Double>? = null,
    @SerializedName("track") var track: String? = null
)