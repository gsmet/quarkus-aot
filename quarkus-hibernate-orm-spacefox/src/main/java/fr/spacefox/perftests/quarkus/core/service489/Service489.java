package fr.spacefox.perftests.quarkus.core.service489;

import fr.spacefox.perftests.quarkus.core.port.data.Entity489DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service489.model.Model489;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service489 {

    private final Entity489DatasourcePort datasource;

    public Service489(Entity489DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model489 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
