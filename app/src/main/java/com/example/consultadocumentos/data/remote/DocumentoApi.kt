package com.example.consultadocumentos.data.remote

import com.example.consultadocumentos.data.dto.DocumentoDTO
import retrofit2.http.GET

interface DocumentoApi {
    @GET("documentos")
    suspend fun getDocumentos():List<DocumentoDTO>
}