package com.example.Curriculum

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.curriculum.R

class PostsAdapter(private val posts: ArrayList<String>) :
    RecyclerView.Adapter<PostsAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.title)
        val background: ImageView = itemView.findViewById(R.id.background)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.row_post, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = posts[position]
        val context = holder.itemView.context

        when (holder.title.text) {
            "Planet Kebab" -> holder.background.setBackgroundResource(R.drawable.kebab_img)
            "Clean Service" -> holder.background.setBackgroundResource(R.drawable.clean_service_img)
            "Pronto Pizzeria" -> holder.background.setBackgroundResource(R.drawable.pizza_delivery_img)
            "Eiscafè Venezia" -> holder.background.setBackgroundResource(R.drawable.ice_shop_img)
            "Ristorante Lafonte" -> holder.background.setBackgroundResource(R.drawable.restaurant_img)
            "Android Developer Junior" -> holder.background.setBackgroundResource(R.drawable.android_developer_img)
            "Diploma Perito Informatico" -> holder.background.setBackgroundResource(R.drawable.perito_informatico_img)
            "Italiano" -> holder.background.setBackgroundResource(R.drawable.italian_flag_img)
            "Inglese" -> holder.background.setBackgroundResource(R.drawable.english_flag_img)
            "Competenze digitali" -> holder.background.setBackgroundResource(R.drawable.competenze_digitali_img)
            "Competenze personali" -> holder.background.setBackgroundResource(R.drawable.competenze_personali_img)
            "IC3 Certification" -> holder.background.setBackgroundResource(R.drawable.ic3_certification_img)
            "MOS:Microsoft Office Specialist" -> holder.background.setBackgroundResource(R.drawable.mos_certification_img)
            "Certificato ECDL" -> holder.background.setBackgroundResource(R.drawable.ecdl_certification_img)
            "Hobby e Interessi" -> holder.background.setBackgroundResource(R.drawable.hobbies_img)
        }
        holder.itemView.setOnClickListener {
            when (holder.title.text) {
                "Planet Kebab" -> {
                    val title: String = holder.title.text.toString()
                    val image: Int = R.drawable.kebab_img
                    val description: String = context.getString(R.string.planet_kebab)
                    val intent = Intent(context, Description::class.java)
                    intent.putExtra("Title", title)
                    intent.putExtra("Description", description)
                    intent.putExtra("Image", image)
                    context.startActivity(intent)
                }
                "Clean Service" -> {
                    val title: String = holder.title.text.toString()
                    val image: Int = R.drawable.clean_service_img
                    val description: String = context.getString(R.string.clean_service)
                    val intent = Intent(context, Description::class.java)
                    intent.putExtra("Title", title)
                    intent.putExtra("Description", description)
                    intent.putExtra("Image", image)
                    context.startActivity(intent)
                }
                "Pronto Pizzeria" -> {
                    val title: String = holder.title.text.toString()
                    val image: Int = R.drawable.pizza_delivery_img
                    val description: String = context.getString(R.string.pronto_pizzeria)
                    val intent = Intent(context, Description::class.java)
                    intent.putExtra("Title", title)
                    intent.putExtra("Description", description)
                    intent.putExtra("Image", image)
                    context.startActivity(intent)
                }
                "Eiscafè Venezia" -> {
                    val title: String = holder.title.text.toString()
                    val image: Int = R.drawable.ice_shop_img
                    val description: String = context.getString(R.string.eiscafè_venezia)
                    val intent = Intent(context, Description::class.java)
                    intent.putExtra("Title", title)
                    intent.putExtra("Description", description)
                    intent.putExtra("Image", image)
                    context.startActivity(intent)
                }
                "Ristorante Lafonte" -> {
                    val title: String = holder.title.text.toString()
                    val image: Int = R.drawable.restaurant_img
                    val description: String = context.getString(R.string.ristorante_lafonte)
                    val intent = Intent(context, Description::class.java)
                    intent.putExtra("Title", title)
                    intent.putExtra("Description", description)
                    intent.putExtra("Image", image)
                    context.startActivity(intent)
                }
                "Competenze digitali" -> {
                    val title: String = holder.title.text.toString()
                    val image: Int = R.drawable.competenze_digitali_img
                    val description: String = context.getString(R.string.digital_competence)
                    val intent = Intent(context, Description::class.java)
                    intent.putExtra("Title", title)
                    intent.putExtra("Description", description)
                    intent.putExtra("Image", image)
                    context.startActivity(intent)
                }
                "Competenze personali" -> {
                    val title: String = holder.title.text.toString()
                    val image: Int = R.drawable.competenze_personali_img
                    val description: String = context.getString(R.string.personal_competence)
                    val intent = Intent(context, Description::class.java)
                    intent.putExtra("Title", title)
                    intent.putExtra("Description", description)
                    intent.putExtra("Image", image)
                    context.startActivity(intent)
                }
                "Hobby e Interessi" -> {
                    val title: String = holder.title.text.toString()
                    val image: Int = R.drawable.hobbies_img
                    val description: String = context.getString(R.string.hobby)
                    val intent = Intent(context, Description::class.java)
                    intent.putExtra("Title", title)
                    intent.putExtra("Description", description)
                    intent.putExtra("Image", image)
                    context.startActivity(intent)
                }
                "IC3 Certification" -> {
                    val title: String = holder.title.text.toString()
                    val image: Int = R.drawable.ic3_certification_img
                    val description: String = context.getString(R.string.ic3_certification)
                    val intent = Intent(context, Description::class.java)
                    intent.putExtra("Title", title)
                    intent.putExtra("Description", description)
                    intent.putExtra("Image", image)
                    context.startActivity(intent)
                }
                "MOS:Microsoft Office Specialist" -> {
                    val title: String = holder.title.text.toString()
                    val image: Int = R.drawable.mos_certification_img
                    val description: String = context.getString(R.string.mos_certification)
                    val intent = Intent(context, Description::class.java)
                    intent.putExtra("Title", title)
                    intent.putExtra("Description", description)
                    intent.putExtra("Image", image)
                    context.startActivity(intent)
                }
                "Certificato ECDL" -> {
                    val title: String = holder.title.text.toString()
                    val image: Int = R.drawable.ecdl_certification_img
                    val description: String = context.getString(R.string.ecdl_certification)
                    val intent = Intent(context, Description::class.java)
                    intent.putExtra("Title", title)
                    intent.putExtra("Description", description)
                    intent.putExtra("Image", image)
                    context.startActivity(intent)
                }
                "Italiano" -> Toast.makeText(context, "Madrelingua", Toast.LENGTH_SHORT).show()
                "Inglese" -> {
                    val title: String = holder.title.text.toString()
                    val image: Int = R.drawable.english_flag_img
                    val description: String = context.getString(R.string.english)
                    val intent = Intent(context, Description::class.java)
                    intent.putExtra("Title", title)
                    intent.putExtra("Description", description)
                    intent.putExtra("Image", image)
                    context.startActivity(intent)
                }
                "Diploma Perito Informatico" -> {
                    val title: String = holder.title.text.toString()
                    val image: Int = R.drawable.perito_informatico_img
                    val description: String = context.getString(R.string.diploma)
                    val intent = Intent(context, Description::class.java)
                    intent.putExtra("Title", title)
                    intent.putExtra("Description", description)
                    intent.putExtra("Image", image)
                    context.startActivity(intent)
                }
                "Android Developer Junior" -> {
                    val title: String = holder.title.text.toString()
                    val image: Int = R.drawable.android_developer_img
                    val description: String = context.getString(R.string.mobile_developer)
                    val intent = Intent(context, Description::class.java)
                    intent.putExtra("Title", title)
                    intent.putExtra("Description", description)
                    intent.putExtra("Image", image)
                    context.startActivity(intent)
                }
            }
        }
    }

    override fun getItemCount() = posts.size

}