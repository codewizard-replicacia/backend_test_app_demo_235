package test_app_demo.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import test_app_demo.model.BuildTool;
import test_app_demo.model.FrontendApp;
import test_app_demo.model.Architecture;
import test_app_demo.model.Server;
import test_app_demo.model.PackageManagement;
import test_app_demo.model.FrontendScreen;
import test_app_demo.model.Project;
import test_app_demo.model.complex.BasicDetails;
import test_app_demo.model.complex.AdvancedDetails;

@Entity(name = "FrontendAppMetaTags")
@Table(schema = "\"test_app_demo\"", name = "\"FrontendAppMetaTags\"")
@Data
public class FrontendAppMetaTags{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"AppId\"")
	private Long appId;

    
    @Column(name = "\"MetaTags\"")
    private Long metaTags;
}