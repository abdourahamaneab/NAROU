package com.example.test1_projet

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.test1_projet.Data.HotelsData
import com.example.test1_projet.Data.RestoPays
import com.example.test1_projet.adapter.MyhotelRecyclerViewAdapter
import com.example.test1_projet.adapter.MyrestoRecyclerViewAdapter
import com.example.test1_projet.placeholder.PlaceholderContent

/**
 * A fragment representing a list of Items.
 */
class restoFragment : Fragment() {

    private var columnCount = 1
    private val restos = RestoPays().getRestoByName("france")
    private lateinit var adapter: MyrestoRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_resto_list, container, false)

        adapter = MyrestoRecyclerViewAdapter(restos)

        val recyclerView = view.findViewById<RecyclerView>(R.id.list)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter

        return view
    }

    companion object {

        // TODO: Customize parameter argument names
        const val ARG_COLUMN_COUNT = "column-count"

        // TODO: Customize parameter initialization
        @JvmStatic
        fun newInstance(columnCount: Int) =
            restoFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLUMN_COUNT, columnCount)
                }
            }
    }
}