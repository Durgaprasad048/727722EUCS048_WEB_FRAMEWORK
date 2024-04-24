package com.example.day5cw3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day5cw3.model.durgaprasadLanguage;
import com.example.day5cw3.repository.durgaprasadLanguageRepo;

@Service
public class durgaprasadLanguageService {
    private durgaprasadLanguageRepo languageRepo;
    public durgaprasadLanguageService(durgaprasadLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(durgaprasadLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<durgaprasadLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,durgaprasadLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public durgaprasadLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
