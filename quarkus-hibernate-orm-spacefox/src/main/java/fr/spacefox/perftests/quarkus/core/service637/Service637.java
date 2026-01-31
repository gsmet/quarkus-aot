package fr.spacefox.perftests.quarkus.core.service637;

import fr.spacefox.perftests.quarkus.core.port.data.Entity637DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service637.model.Model637;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service637 {

    private final Entity637DatasourcePort datasource;

    public Service637(Entity637DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model637 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
