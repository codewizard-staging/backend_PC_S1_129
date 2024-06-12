package com.app.PC_S1.function;

import com.app.PC_S1.model.Manager;
import com.app.PC_S1.model.Pet;
import com.app.PC_S1.model.PetCareCenter;
import com.app.PC_S1.model.PetOwner;
import com.app.PC_S1.model.Document;
import com.app.PC_S1.model.PetService;
import com.app.PC_S1.enums.PetServiceType;
import com.app.PC_S1.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.PC_S1.repository.PetServiceRepository;
import com.app.PC_S1.repository.PetOwnerRepository;
import com.app.PC_S1.repository.PetCareCenterRepository;
import com.app.PC_S1.repository.ManagerRepository;
import com.app.PC_S1.repository.DocumentRepository;
import com.app.PC_S1.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
