package Components_pr11

data class AnalysisItem(
    val id: Int,
    val name: String,
    val day: Int,
    val price: Int
)

fun analysisGet(): List<AnalysisItem>{
    return listOf(
        AnalysisItem(1, "ПЦР-тест на определение РНК коронавируса стандартный", 2, 1800),
        AnalysisItem(2, "Клинический анализ крови с лейкоцитарной формулой", 1, 690),
        AnalysisItem(3, "Биохимический анализ крови, базовый", 1, 2440),
        AnalysisItem(4, "Биохимический анализ крови, базовый", 1, 2440),
        AnalysisItem(5, "СОЭ (венозная кровь)", 1, 240)
    )
}