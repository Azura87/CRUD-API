import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.apipbb.databinding.ActivityUpdateAddBinding
import com.example.apipbb.model.DataItem

@Suppress("SENSELESS_COMPARISON")
class UpdateAddActivity : AppCompatActivity() {
    private lateinit var presenter: Presenter2
    private lateinit var binding: ActivityUpdateAddBinding

    @SuppressLint("SeTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUpdateAddBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = Presenter2(this)
        val itemDataItem = intent.getSerializableExtra("dataItem")

        if (itemDataItem == null) {
            binding.btnAction.text = "Tambah"
            binding.btnAction.setOnClickListener() {
                Log.d("UpdateAddActivity", "Tambah button clicked")
                presenter.addData(
                    binding.etName.text.toString(),
                    binding.etPhone.text.toString(),
                    binding.etAddress.text.toString()
                )
            }
        } else if (itemDataItem != null) {
            binding.btnAction.text = "Update"
            val item = itemDataItem as DataItem?
            binding.etName.setText(item?.staffName.toString())
            binding.etPhone.setText(item?.staffHp.toString())
            binding.etAddress.setText(item?.staffAlamat.toString())
            binding.btnAction.setOnClickListener() {
                presenter.updateData(
                    item?.staffId ?: "",
                    binding.etName.text.toString(),
                    binding.etPhone.text.toString(),
                    binding.etAddress.text.toString()
                )
                finish()
            }
        }
    }

    fun successAdd(msg: String) {
        TODO("Not yet implemented")
    }

    fun onErrorAdd(msg: String) {
        TODO("Not yet implemented")
    }

    fun onSuccessGet(data: List<DataItem>) {
        TODO("Not yet implemented")
    }

    fun onFailedGet(msg: String) {
        TODO("Not yet implemented")
    }

    fun onSuccessUpdate(msg: String) {
        TODO("Not yet implemented")
    }

    fun onErrorUpdate(msg: String) {
        TODO("Not yet implemented")
    }

    fun onSuccessDelete(msg: String) {
        TODO("Not yet implemented")
    }

    fun onErrorDelete(msg: String) {
        TODO("Not yet implemented")
    }
}