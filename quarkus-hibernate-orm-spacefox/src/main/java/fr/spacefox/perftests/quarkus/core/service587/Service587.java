package fr.spacefox.perftests.quarkus.core.service587;

import fr.spacefox.perftests.quarkus.core.port.data.Entity587DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service587.model.Model587;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service587 {

    private final Entity587DatasourcePort datasource;

    public Service587(Entity587DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model587 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
