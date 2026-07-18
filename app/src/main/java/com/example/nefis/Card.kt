package com.example.nefis

import android.net.Uri
import android.view.ViewGroup
import androidx.leanback.widget.ImageCardView
import androidx.leanback.widget.Presenter
import com.bumptech.glide.Glide

class Card: Presenter(){
    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        val card=ImageCardView(parent.context)
        card.isFocusable=true
        card.isFocusableInTouchMode=true

        return ViewHolder(card)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, item: Any?) {
        val video = item as Video
        val cardView = viewHolder.view as ImageCardView
        
        with(cardView) {
            titleText = video.title
            contentText = video.subtitle
            setMainImageDimensions(313, 176)
            
            // Limpiamos la imagen anterior antes de cargar la nueva para evitar confusiones de nombres
            mainImageView.setImageDrawable(null)
            
            val uri = Uri.parse("android.resource://${context.packageName}/${video.videoResId}")
            Glide.with(context)
                .asBitmap()
                .load(uri)
                // Captura el segundo 1 del video para que la portada coincida bien
                .frame(1000000)
                .placeholder(video.image)
                .error(video.image)
                .centerCrop()
                .into(mainImageView)
        }
    }

    override fun onUnbindViewHolder(viewHolder: ViewHolder) {
        val cardView = viewHolder.view as ImageCardView
        cardView.mainImage = null
    }

}