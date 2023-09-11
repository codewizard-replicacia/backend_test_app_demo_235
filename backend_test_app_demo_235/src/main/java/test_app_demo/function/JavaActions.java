package test_app_demo.function;

import test_app_demo.model.BuildTool;
import test_app_demo.model.FrontendApp;
import test_app_demo.model.Architecture;
import test_app_demo.model.Server;
import test_app_demo.model.PackageManagement;
import test_app_demo.model.FrontendScreen;
import test_app_demo.model.Project;




import test_app_demo.model.complex.BasicDetails;
import test_app_demo.model.complex.AdvancedDetails;
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
  