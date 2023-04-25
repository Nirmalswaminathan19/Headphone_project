package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.HP_Model;

public interface headphonerepo extends JpaRepository<HP_Model, Integer> {

}
