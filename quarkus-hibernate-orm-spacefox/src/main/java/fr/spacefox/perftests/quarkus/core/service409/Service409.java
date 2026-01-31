package fr.spacefox.perftests.quarkus.core.service409;

import fr.spacefox.perftests.quarkus.core.port.data.Entity409DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service409.model.Model409;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service409 {

    private final Entity409DatasourcePort datasource;

    public Service409(Entity409DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model409 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
