package fr.spacefox.perftests.quarkus.core.service797;

import fr.spacefox.perftests.quarkus.core.port.data.Entity797DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service797.model.Model797;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service797 {

    private final Entity797DatasourcePort datasource;

    public Service797(Entity797DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model797 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
