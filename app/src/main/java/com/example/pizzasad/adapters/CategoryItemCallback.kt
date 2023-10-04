import androidx.recyclerview.widget.DiffUtil.ItemCallback
import com.example.pizzasad.model.Categories

class CategoryItemCallback : ItemCallback<Categories>() {
    override fun areItemsTheSame(oldItem: Categories, newItem: Categories): Boolean =
        oldItem.id == newItem.id
    override fun areContentsTheSame(oldItem: Categories, newItem: Categories): Boolean = oldItem == newItem}
