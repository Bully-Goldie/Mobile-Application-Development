package Components_pr11

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ViewModel : ViewModel() {
    private val _categories = MutableStateFlow(categoryGet())
    val categories = _categories.asStateFlow()
    private val _analysisItems = MutableStateFlow(analysisGet())
    val analysisItems = _analysisItems.asStateFlow()
}