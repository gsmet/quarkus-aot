package fr.spacefox.perftests.quarkus.core.service230;

import fr.spacefox.perftests.quarkus.core.port.data.Entity230DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service230.model.Model230;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service230 {

    private final Entity230DatasourcePort datasource;

    public Service230(Entity230DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model230 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
