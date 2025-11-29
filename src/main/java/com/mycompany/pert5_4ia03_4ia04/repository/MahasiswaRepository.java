/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert5_4ia03_4ia04.repository;

import com.mycompany.pert5_4ia03_4ia04.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BARA
 */

@Repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Long> {

}
