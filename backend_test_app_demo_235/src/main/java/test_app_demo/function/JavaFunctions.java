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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import test_app_demo.repository.PackageManagementRepository;
import test_app_demo.repository.ProjectRepository;
import test_app_demo.repository.ArchitectureRepository;
import test_app_demo.repository.ServerRepository;
import test_app_demo.repository.FrontendScreenRepository;
import test_app_demo.repository.BuildToolRepository;
import test_app_demo.repository.FrontendAppRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
