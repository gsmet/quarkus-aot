package fr.spacefox.perftests.quarkus.core.service207;

import fr.spacefox.perftests.quarkus.core.port.data.Entity207DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service207.model.Model207;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service207 {

    private final Entity207DatasourcePort datasource;

    public Service207(Entity207DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model207 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
