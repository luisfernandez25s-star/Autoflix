package com.example.nefis

import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.ui.PlayerView

class PlayActivity : FragmentActivity() {

    private var player: ExoPlayer? = null
    private lateinit var playerView: PlayerView

    companion object {
        const val MOVIE_EXTRA = "extra:movie"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        playerView = findViewById(R.id.playerView)
        playerView.requestFocus()
        val tvTitle = findViewById<TextView>(R.id.tvPlayerTitle)
        val tvDescription = findViewById<TextView>(R.id.tvPlayerDescription)
        val btnBack = findViewById<ImageButton>(R.id.btnBack)

        val video = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra(MOVIE_EXTRA, Video::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(MOVIE_EXTRA)
        }

        video?.let {
            tvTitle.text = it.title
            tvDescription.text = it.description
            initializePlayer(it.videoResId)
        }

        btnBack.setOnClickListener {
            finish()
        }
    }

    private fun initializePlayer(videoResId: Int) {
        player = ExoPlayer.Builder(this).build()
        playerView.player = player

        // Cargar video desde res/raw
        val uri = Uri.parse("android.resource://$packageName/$videoResId")
        val mediaItem = MediaItem.fromUri(uri)
        player?.setMediaItem(mediaItem)
        player?.prepare()
        player?.playWhenReady = true
    }

    override fun onStop() {
        super.onStop()
        releasePlayer()
    }

    override fun onDestroy() {
        super.onDestroy()
        releasePlayer()
    }

    private fun releasePlayer() {
        player?.release()
        player = null
    }
}
