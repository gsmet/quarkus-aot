package fr.spacefox.perftests.quarkus.core.service757;

import fr.spacefox.perftests.quarkus.core.port.data.Entity757DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service757.model.Model757;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service757 {

    private final Entity757DatasourcePort datasource;

    public Service757(Entity757DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model757 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
