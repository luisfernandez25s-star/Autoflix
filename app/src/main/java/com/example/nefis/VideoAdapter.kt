package com.example.nefis

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import android.net.Uri

class VideoAdapter(
    private val videos: List<Video>,
    private val onVideoClick: (Video) -> Unit
) : RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {

    class VideoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivThumbnail: ImageView = view.findViewById(R.id.ivThumbnail)
        val tvTitle: TextView = view.findViewById(R.id.tvVideoTitle)
        val tvDuration: TextView = view.findViewById(R.id.tvVideoDuration)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_video, parent, false)
        return VideoViewHolder(view)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val video = videos[position]
        
        // Carga la miniatura automáticamente desde el video en res/raw
        val uri = Uri.parse("android.resource://${holder.itemView.context.packageName}/${video.videoResId}")
        
        Glide.with(holder.itemView.context)
            .asBitmap()
            .load(uri)
            .placeholder(R.mipmap.ic_launcher)
            .into(holder.ivThumbnail)

        holder.tvTitle.text = video.title
        holder.tvDuration.text = video.duration
        holder.itemView.setOnClickListener { onVideoClick(video) }
    }

    override fun getItemCount(): Int = videos.size
}
