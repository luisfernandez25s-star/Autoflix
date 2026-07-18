package com.example.nefis

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.graphics.Bitmap
import android.net.Uri
import androidx.leanback.app.BackgroundManager
import androidx.leanback.app.BrowseSupportFragment
import androidx.leanback.widget.ArrayObjectAdapter
import androidx.leanback.widget.HeaderItem
import androidx.leanback.widget.ListRow
import androidx.leanback.widget.ListRowPresenter
import androidx.leanback.widget.OnItemViewClickedListener
import androidx.leanback.widget.OnItemViewSelectedListener
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import android.graphics.Color
import android.graphics.drawable.Drawable

class MainFragment: BrowseSupportFragment() {

    private lateinit var mBackgroundManager: BackgroundManager

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        prepareBackgroundManager()
        setupUIElements()
        loadRows()
        setupEventListeners()
        
        // Iniciamos la transición de entrada para asegurar que el contenido se muestre
        prepareEntranceTransition()
        view.postDelayed({ startEntranceTransition() }, 500)
    }

    private fun prepareBackgroundManager() {
        mBackgroundManager = BackgroundManager.getInstance(activity)
        mBackgroundManager.attach(requireActivity().window)
        // Fondo base para que no se vea "oscuro" o negro puro
        activity?.window?.decorView?.setBackgroundColor(Color.parseColor("#1C1C1C"))
    }

    private fun setupUIElements() {
        title = "AutoFlix"
        // ENABLED es el modo oficial de Android TV: el menú se encoge solo.
        headersState = HEADERS_ENABLED
        isHeadersTransitionOnBackEnabled = true
        // Menú transparente para que no parezca un cuadro gris tapando nada
        brandColor = Color.TRANSPARENT
        searchAffordanceColor = Color.parseColor("#FF8C00")
    }

    private fun loadRows() {
        val categoriesAdapter = ArrayObjectAdapter(ListRowPresenter())
        val repoCategories = VideoRepository.getCategories()

        repoCategories.forEachIndexed { index, category ->
            val listRowAdapter = ArrayObjectAdapter(Card())
            listRowAdapter.addAll(0, category.videos)
            val header = HeaderItem(index.toLong(), category.name)
            categoriesAdapter.add(ListRow(header, listRowAdapter))
        }

        adapter = categoriesAdapter
    }

    private fun setupEventListeners() {
        onItemViewClickedListener = OnItemViewClickedListener { _, item, _, _ ->
            if (item is Video) {
                val intent = Intent(requireActivity(), PlayActivity::class.java).apply {
                    putExtra(PlayActivity.MOVIE_EXTRA, item)
                }
                startActivity(intent)
            }
        }

        onItemViewSelectedListener = OnItemViewSelectedListener { _, item, _, _ ->
            if (item is Video) {
                updateBackground(item)
            }
        }
    }

    private fun updateBackground(video: Video) {
        val uri = Uri.parse("android.resource://${requireContext().packageName}/${video.videoResId}")
        Glide.with(requireContext())
            .asBitmap()
            .load(uri)
            .placeholder(video.image)
            .error(video.image)
            .centerCrop()
            .into(object : CustomTarget<Bitmap>() {
                override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                    mBackgroundManager.setBitmap(resource)
                }
                override fun onLoadCleared(placeholder: Drawable?) {
                    mBackgroundManager.drawable = null
                }
            })
    }
}
