package fr.spacefox.perftests.quarkus.core.service34;

import fr.spacefox.perftests.quarkus.core.port.data.Entity34DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service34.model.Model34;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service34 {

    private final Entity34DatasourcePort datasource;

    public Service34(Entity34DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model34 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
