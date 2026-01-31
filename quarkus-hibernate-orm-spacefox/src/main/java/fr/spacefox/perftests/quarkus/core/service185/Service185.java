package fr.spacefox.perftests.quarkus.core.service185;

import fr.spacefox.perftests.quarkus.core.port.data.Entity185DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service185.model.Model185;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service185 {

    private final Entity185DatasourcePort datasource;

    public Service185(Entity185DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model185 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
