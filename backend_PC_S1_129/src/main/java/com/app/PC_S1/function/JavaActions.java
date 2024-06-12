package com.app.PC_S1.function;

import com.app.PC_S1.model.Manager;
import com.app.PC_S1.model.Pet;
import com.app.PC_S1.model.PetCareCenter;
import com.app.PC_S1.model.PetOwner;
import com.app.PC_S1.model.Document;
import com.app.PC_S1.model.PetService;




import com.app.PC_S1.enums.PetServiceType;
import com.app.PC_S1.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  