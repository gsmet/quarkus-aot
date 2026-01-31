package fr.spacefox.perftests.quarkus.core.service844;

import fr.spacefox.perftests.quarkus.core.port.data.Entity844DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service844.model.Model844;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service844 {

    private final Entity844DatasourcePort datasource;

    public Service844(Entity844DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model844 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
