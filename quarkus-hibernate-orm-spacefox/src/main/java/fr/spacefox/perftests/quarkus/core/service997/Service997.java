package fr.spacefox.perftests.quarkus.core.service997;

import fr.spacefox.perftests.quarkus.core.port.data.Entity997DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service997.model.Model997;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service997 {

    private final Entity997DatasourcePort datasource;

    public Service997(Entity997DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model997 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
