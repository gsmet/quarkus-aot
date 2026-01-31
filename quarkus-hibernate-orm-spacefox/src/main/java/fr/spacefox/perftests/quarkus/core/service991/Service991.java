package fr.spacefox.perftests.quarkus.core.service991;

import fr.spacefox.perftests.quarkus.core.port.data.Entity991DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service991.model.Model991;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service991 {

    private final Entity991DatasourcePort datasource;

    public Service991(Entity991DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model991 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
