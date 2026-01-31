package fr.spacefox.perftests.quarkus.core.service676;

import fr.spacefox.perftests.quarkus.core.port.data.Entity676DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service676.model.Model676;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service676 {

    private final Entity676DatasourcePort datasource;

    public Service676(Entity676DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model676 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
