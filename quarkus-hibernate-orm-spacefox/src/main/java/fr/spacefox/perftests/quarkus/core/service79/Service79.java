package fr.spacefox.perftests.quarkus.core.service79;

import fr.spacefox.perftests.quarkus.core.port.data.Entity79DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service79.model.Model79;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service79 {

    private final Entity79DatasourcePort datasource;

    public Service79(Entity79DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model79 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
